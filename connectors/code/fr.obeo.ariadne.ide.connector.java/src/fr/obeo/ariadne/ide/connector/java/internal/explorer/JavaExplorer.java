/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.ariadne.ide.connector.java.internal.explorer;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.java.internal.utils.AriadneJavaConnectorMessage;
import fr.obeo.ariadne.ide.connector.java.internal.utils.IAriadneJavaConnectorConstants;
import fr.obeo.ariadne.model.code.Annotation;
import fr.obeo.ariadne.model.code.AnnotationField;
import fr.obeo.ariadne.model.code.Classifier;
import fr.obeo.ariadne.model.code.ClassifierKind;
import fr.obeo.ariadne.model.code.ClasspathEntry;
import fr.obeo.ariadne.model.code.CodeFactory;
import fr.obeo.ariadne.model.code.Component;
import fr.obeo.ariadne.model.code.Constructor;
import fr.obeo.ariadne.model.code.Field;
import fr.obeo.ariadne.model.code.Operation;
import fr.obeo.ariadne.model.code.Parameter;
import fr.obeo.ariadne.model.code.Type;
import fr.obeo.ariadne.model.code.TypesContainer;
import fr.obeo.ariadne.model.code.VisibilityKind;
import fr.obeo.ariadne.model.common.IAriadneModelCommonConstants;
import fr.obeo.ariadne.model.core.CoreFactory;
import fr.obeo.ariadne.model.core.Property;
import fr.obeo.ariadne.model.core.Version;
import fr.obeo.ariadne.model.core.VersionedDependency;
import fr.obeo.ariadne.model.core.VersionedElement;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.Repository;
import fr.obeo.ariadne.model.scm.ResourceChange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.history.IFileHistory;
import org.eclipse.team.core.history.IFileHistoryProvider;
import org.eclipse.team.core.history.IFileRevision;

/**
 * The Ariadne explorer dedicated to Java projects.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class JavaExplorer extends AbstractAriadneExplorer {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getName()
	 */
	@Override
	public String getName() {
		return AriadneJavaConnectorMessage.getString("JavaExplorer.Name"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getExplorerKind()
	 */
	@Override
	public String getExplorerKind() {
		return AbstractAriadneExplorer.CODE_EXPLORER_KIND;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		long start = System.currentTimeMillis();

		// Load the Java standard library in the resource set
		this.resourceSet.getResource(URI.createURI(IAriadneModelCommonConstants.JAVA_STANDARD_LIBRARY), true);

		List<Resource> resources = new ArrayList<>();
		for (IProject project : this.projects) {
			try {
				if (project.isAccessible() && project.hasNature(JavaCore.NATURE_ID)) {
					Component ariadneComponent = this.doExplore(project, monitor);
					// Save the data computed
					resources.add(ariadneComponent.eResource());
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		// Force the resolution of the proxies first

		for (Resource resource : resources) {
			try {
				HashMap<String, String> options = new HashMap<String, String>();
				resource.save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (Resource resource : resources) {
			resource.unload();
		}

		long end = System.currentTimeMillis();

		System.out.println("Time: " + (end - start) + "ms");

		return Status.OK_STATUS;
	}

	/**
	 * Launches the exploration of the given Java project.
	 * 
	 * @param project
	 *            The Java project to explore
	 * @param monitor
	 *            The progress monitor
	 * @return The Component representing the Java project.
	 */
	public Component doExplore(IProject project, IProgressMonitor monitor) {
		Component ariadneComponent = this.getOrCreateComponent(project);
		IJavaProject iJavaProject = JavaCore.create(project);
		try {
			IClasspathEntry[] rawClasspath = iJavaProject.getRawClasspath();
			for (IClasspathEntry iClasspathEntry : rawClasspath) {
				// We have the source folders of the project.
				IPath inputFolderPath = iClasspathEntry.getPath();
				IPath outputFolderPath = iClasspathEntry.getOutputLocation();

				if (outputFolderPath == null) {
					outputFolderPath = iJavaProject.getOutputLocation();
				}

				// Create the classpath entry
				ClasspathEntry classpathEntry = CodeFactory.eINSTANCE.createClasspathEntry();
				classpathEntry.setInputFolder(inputFolderPath.toString());
				classpathEntry.setOutputFolder(outputFolderPath.toString());
				ariadneComponent.getClasspathEntries().add(classpathEntry);

				int entryKind = iClasspathEntry.getEntryKind();
				if (IClasspathEntry.CPE_SOURCE == entryKind) {
					// Explore its content located in its input folder
					this.exploreClasspathEntry(iJavaProject, iClasspathEntry, classpathEntry, monitor);
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}

		return ariadneComponent;
	}

	/**
	 * Gets or creates the Ariadne component matching the given Java project.
	 * 
	 * @param project
	 *            The Java project
	 * @return The Ariadne component representing the Java project
	 */
	private Component getOrCreateComponent(IProject project) {
		Component component = null;

		List<Component> components = this.ariadneProject.getComponents();
		for (Component aComponent : components) {
			if (project.getName().equals(aComponent.getIdentifier())) {
				component = aComponent;
			}
		}

		if (component == null) {
			component = CodeFactory.eINSTANCE.createComponent();
			component.setIdentifier(project.getName());
			this.ariadneProject.getComponents().add(component);
		}
		return component;
	}

	/**
	 * Explores the given classpath entry of the given Java project in order to populate the Ariadne classpath
	 * entry.
	 * 
	 * @param iJavaProject
	 *            The Java project analyzed
	 * @param iClasspathEntry
	 *            The classpath entry of the project currently analyzed
	 * @param classpathEntry
	 *            The Ariadne classpath entry
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreClasspathEntry(IJavaProject iJavaProject, IClasspathEntry iClasspathEntry,
			ClasspathEntry classpathEntry, IProgressMonitor monitor) {
		try {
			IPackageFragmentRoot[] packageFragmentRoots = iJavaProject
					.findPackageFragmentRoots(iClasspathEntry);
			for (IPackageFragmentRoot iPackageFragmentRoot : packageFragmentRoots) {
				IJavaElement[] iJavaElements = iPackageFragmentRoot.getChildren();
				for (IJavaElement iJavaElement : iJavaElements) {
					if (iJavaElement instanceof IPackageFragment) {
						IPackageFragment iPackageFragment = (IPackageFragment)iJavaElement;
						this.explorePackage(classpathEntry, iPackageFragment, monitor);
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Explores the given package located in the given classpath entry of the currently analyzed Java project
	 * in order to extract Ariadne concept.
	 * 
	 * @param classpathEntry
	 *            The classpath entry
	 * @param iPackageFragment
	 *            The package
	 * @param monitor
	 *            The progress monitor
	 */
	private void explorePackage(ClasspathEntry classpathEntry, IPackageFragment iPackageFragment,
			IProgressMonitor monitor) {
		try {
			// Find or create matching types container
			TypesContainer typesContainer = null;
			List<TypesContainer> typesContainers = classpathEntry.getTypesContainers();
			for (TypesContainer aTypesContainer : typesContainers) {
				if (aTypesContainer.getName().equals(iPackageFragment.getElementName())) {
					typesContainer = aTypesContainer;
					break;
				}
			}

			if (typesContainer == null) {
				typesContainer = CodeFactory.eINSTANCE.createTypesContainer();
				typesContainer.setName(iPackageFragment.getElementName());
				classpathEntry.getTypesContainers().add(typesContainer);
			}

			String attachedJavadoc = iPackageFragment.getAttachedJavadoc(monitor);
			typesContainer.setDescription(attachedJavadoc);

			if (iPackageFragment.getKind() == IPackageFragmentRoot.K_BINARY) {
				IClassFile[] classFiles = iPackageFragment.getClassFiles();
				for (IClassFile iClassFile : classFiles) {
					this.exploreType(iClassFile.getType(), typesContainer, monitor);
				}
			} else if (iPackageFragment.getKind() == IPackageFragmentRoot.K_SOURCE) {
				ICompilationUnit[] compilationUnits = iPackageFragment.getCompilationUnits();
				for (ICompilationUnit iCompilationUnit : compilationUnits) {
					IType[] allTypes = iCompilationUnit.getAllTypes();
					for (IType iType : allTypes) {
						Type type = this.exploreType(iType, typesContainer, monitor);

						IResource resource = iType.getResource();
						IProject project = resource.getProject();

						if (RepositoryProvider.isShared(project)) {
							RepositoryProvider provider = RepositoryProvider.getProvider(project);
							IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();
							IFileHistory fileHistory = fileHistoryProvider.getFileHistoryFor(resource,
									IFileHistoryProvider.NONE, monitor);
							IFileRevision[] fileRevisions = fileHistory.getFileRevisions();
							for (IFileRevision iFileRevision : fileRevisions) {
								String identifier = iFileRevision.getContentIdentifier();

								List<Repository> repositories = this.ariadneProject.getRepositories();
								for (Repository repository : repositories) {
									List<Commit> commits = repository.getCommits();
									for (Commit commit : commits) {
										if (commit.getId().equals(identifier)) {
											// Link the commit to the type created
											List<ResourceChange> resourceChanges = commit
													.getResourceChanges();
											for (ResourceChange resourceChange : resourceChanges) {
												if (resourceChange.getPath().equals(
														iFileRevision.getURI().toString())
														|| resourceChange.getPath().endsWith(
																resource.getFullPath().toString())) {
													resourceChange.setVersionedElement(type);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Explores the given type located and create the matching type in the given Ariadne types container. This
	 * operation will delegate the rest of the analysis to either exploreAnnotation if the type currently
	 * analyzed is a Java annotation or exploreClassifier for enumerations, interfaces or classes.
	 * 
	 * @param iType
	 *            The Java type currently analyzed
	 * @param typesContainer
	 *            The Ariadne types container where the Ariadne type matching the Java type will be created
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne type created
	 */
	private Type exploreType(IType iType, TypesContainer typesContainer, IProgressMonitor monitor) {
		Type type = null;
		try {
			int flags = iType.getFlags();
			if (Flags.isAnnotation(flags)) {
				type = this.exploreAnnotation(iType, typesContainer, monitor);
			} else {
				type = this.exploreClassifier(iType, typesContainer, monitor);
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}

		return type;
	}

	/**
	 * Explores the Java type representing an annotation and create the matching Ariadne annotation in the
	 * given Ariadne types container.
	 * 
	 * @param iType
	 *            The Java annotation
	 * @param typesContainer
	 *            The Ariadne types container
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne annotation created
	 */
	private Annotation exploreAnnotation(IType iType, TypesContainer typesContainer, IProgressMonitor monitor) {
		Annotation annotation = null;
		try {
			List<Type> types = typesContainer.getTypes();
			for (Type aType : types) {
				if (aType instanceof Annotation
						&& aType.getQualifiedName().equals(iType.getFullyQualifiedParameterizedName())) {
					annotation = (Annotation)aType;
				}
			}

			if (annotation == null) {
				annotation = CodeFactory.eINSTANCE.createAnnotation();
				annotation.setQualifiedName(iType.getFullyQualifiedParameterizedName());
			}

			if (annotation != null) {
				typesContainer.getTypes().add(annotation);

				String javadoc = this.getJavadoc(iType, monitor);
				annotation.setDescription(javadoc);
				annotation.setVersion(this.getVersionFromJavadoc(javadoc));

				int flags = iType.getFlags();

				if (Flags.isDeprecated(flags)) {
					// Add the property "Deprecated"
					this.addDeprecatedProperty(annotation);
				}
				annotation.setVisibility(this.getVisibility(iType, false));

				// Explore the fields
				IField[] fields = iType.getFields();
				for (IField iField : fields) {
					this.exploreField(iField, annotation, monitor);
				}

				// Set up the annotations dependencies
				IAnnotation[] annotations = iType.getAnnotations();
				for (IAnnotation iAnnotation : annotations) {
					Annotation ariadneAnnotation = this.getOrCreateAnnotation(iAnnotation);
					if (ariadneAnnotation != null) {
						annotation.getAnnotations().add(ariadneAnnotation);
					}
				}

				// Set up the reference dependencies (import)
				ICompilationUnit compilationUnit = iType.getCompilationUnit();
				if (compilationUnit != null) {
					IImportDeclaration[] imports = compilationUnit.getImports();
					for (IImportDeclaration iImportDeclaration : imports) {
						if (!iImportDeclaration.getElementName().endsWith("*")) { //$NON-NLS-1$
							Classifier classifier = this.getOrCreateClassifier(iImportDeclaration
									.getElementName());
							if (classifier != null) {
								VersionedDependency versionedDependency = CoreFactory.eINSTANCE
										.createVersionedDependency();
								versionedDependency.setVersionedElement(classifier);
								annotation.getVersionedDependencies().add(versionedDependency);
							}
						} else {
							// TODO Support "*" import
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return annotation;
	}

	/**
	 * Finds an Ariadne annotation matching the given Java annotation in the resource set or creates an EMF
	 * proxy representing this annotation.
	 * 
	 * @param iJavaAnnotation
	 *            The Java annotation
	 * @return An Ariadne annotation representing this Java annotation.
	 */
	private Annotation getOrCreateAnnotation(IAnnotation iJavaAnnotation) {
		Annotation ariadneAnnotation = null;

		// Look for the matching annotation in the resource set
		// TreeIterator<Notifier> allContents = this.resourceSet.getAllContents();
		//
		// boolean found = false;
		// while (allContents.hasNext() && !found) {
		// Notifier next = allContents.next();
		// if (next instanceof Annotation) {
		// Annotation anAnnotation = (Annotation)next;
		// if (anAnnotation.getQualifiedName().equals(iJavaAnnotation.getElementName())) {
		// ariadneAnnotation = anAnnotation;
		// found = true;
		// }
		// }
		// }

		// TODO Support proxies
		// Annotation anAnnotation = CodeFactory.eINSTANCE.createAnnotation();
		// if (anAnnotation instanceof InternalEObject) {
		// InternalEObject internalEObject = (InternalEObject)anAnnotation;
		// String uri = IAriadneCodeModelConstants.ANNOTATION_URI_PREFIX
		// + iAnnotation.getElementName();
		// internalEObject.eSetProxyURI(URI.createURI(uri));
		// }

		return ariadneAnnotation;
	}

	/**
	 * Adds the deprecated property to the given element.
	 * 
	 * @param versionedElement
	 *            The Ariadne element
	 */
	private void addDeprecatedProperty(VersionedElement versionedElement) {
		// Add the property "Deprecated"
		Resource propertiesResource = this.resourceSet.getResource(URI
				.createURI(IAriadneModelCommonConstants.PROPERTIES_MODEL_PATH), true);
		List<EObject> contents = propertiesResource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof Property
					&& IAriadneModelCommonConstants.DEPRECATED_PROPERTY.equals(((Property)eObject).getName())) {
				Property deprecated = (Property)eObject;
				versionedElement.getProperties().add(deprecated);
			}
		}

		// TODO Support proxies
		// Annotation annotationDeprecated = CodeFactory.eINSTANCE.createAnnotation();
		// if (annotationDeprecated instanceof InternalEObject) {
		// InternalEObject internalEObject = (InternalEObject)annotationDeprecated;
		//
		// String uri = IAriadneCodeModelConstants.ANNOTATION_URI_PREFIX
		// + IAriadneJavaConnectorConstants.DEPRECATED_ANNOTATION;
		// internalEObject.eSetProxyURI(URI.createURI(uri));
		// }
		//
		// if (versionedElement instanceof Type) {
		// Type type = (Type)versionedElement;
		// type.getAnnotations().add(annotationDeprecated);
		// } else if (versionedElement instanceof Operation) {
		// Operation operation = (Operation)versionedElement;
		// operation.getAnnotations().add(annotationDeprecated);
		// } else if (versionedElement instanceof Field) {
		// Field field = (Field)versionedElement;
		// field.getAnnotations().add(annotationDeprecated);
		// } else if (versionedElement instanceof Parameter) {
		// Parameter parameter = (Parameter)versionedElement;
		// parameter.getAnnotations().add(annotationDeprecated);
		// } else if (versionedElement instanceof Constructor) {
		// Constructor constructor = (Constructor)versionedElement;
		// constructor.getAnnotations().add(annotationDeprecated);
		// }
	}

	/**
	 * Explores the fields of the given Java annotation and create the matching annotation fields in the given
	 * Ariadne annotation.
	 * 
	 * @param iField
	 *            The field of the annotation
	 * @param annotation
	 *            The Ariadne annotation where the fields must be created
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreField(IField iField, Annotation annotation, IProgressMonitor monitor) {
		AnnotationField field = null;
		List<AnnotationField> fields = annotation.getAnnotationFields();
		for (AnnotationField aField : fields) {
			if (aField.getQualifiedName().equals(this.getQualifiedName(iField, false))) {
				field = aField;
			}
		}

		if (field == null) {
			field = CodeFactory.eINSTANCE.createAnnotationField();
			field.setQualifiedName(this.getQualifiedName(iField, false));
			field.setName(iField.getElementName());
			annotation.getAnnotationFields().add(field);
		}
	}

	/**
	 * Explores the Java type representing a classifier (enumeration, interface, class) and create the
	 * matching Ariadne classifier in the given types container.
	 * 
	 * @param iType
	 *            The Java class, enumeration or interface
	 * @param typesContainer
	 *            The Ariadne types container
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne classifier created
	 */
	private Classifier exploreClassifier(IType iType, TypesContainer typesContainer, IProgressMonitor monitor) {
		Classifier classifier = null;
		try {
			List<Type> types = typesContainer.getTypes();
			for (Type aType : types) {
				if (aType instanceof Classifier
						&& aType.getQualifiedName().equals(iType.getFullyQualifiedParameterizedName())) {
					classifier = (Classifier)aType;
				}
			}

			if (classifier == null) {
				classifier = CodeFactory.eINSTANCE.createClassifier();
				classifier.setName(iType.getElementName());
				classifier.setQualifiedName(iType.getFullyQualifiedParameterizedName());
			}

			if (classifier != null) {
				typesContainer.getTypes().add(classifier);

				String javadoc = this.getJavadoc(iType, monitor);
				classifier.setDescription(javadoc);
				classifier.setVersion(this.getVersionFromJavadoc(javadoc));

				int flags = iType.getFlags();
				if (Flags.isInterface(flags)) {
					classifier.setKind(ClassifierKind.INTERFACE);
				} else if (Flags.isEnum(flags)) {
					classifier.setKind(ClassifierKind.ENUMERATION);
				} else {
					classifier.setKind(ClassifierKind.CLASS);
				}

				if (Flags.isDeprecated(flags)) {
					// Add the property "Deprecated"
					this.addDeprecatedProperty(classifier);
				}
				classifier.setFinal(Flags.isFinal(flags));
				classifier.setStatic(Flags.isStatic(flags));
				classifier.setVisibility(this.getVisibility(iType, false));

				// Explore the methods
				IMethod[] methods = iType.getMethods();
				for (IMethod iMethod : methods) {
					if (iMethod.isConstructor()) {
						this.exploreConstructor(iMethod, classifier, Flags.isInterface(flags), monitor);
					} else {
						this.exploreOperation(iMethod, classifier, Flags.isInterface(flags), monitor);
					}

				}

				// Explore the fields
				IField[] fields = iType.getFields();
				for (IField iField : fields) {
					this.exploreField(iField, classifier, Flags.isInterface(flags), monitor);
				}

				// Set up the annotations dependencies
				IAnnotation[] annotations = iType.getAnnotations();
				for (IAnnotation iAnnotation : annotations) {
					Annotation ariadneAnnotation = this.getOrCreateAnnotation(iAnnotation);
					if (ariadneAnnotation != null) {
						classifier.getAnnotations().add(ariadneAnnotation);
					}
				}

				// Set up the reference dependencies (import)
				ICompilationUnit compilationUnit = iType.getCompilationUnit();
				if (compilationUnit != null) {
					IImportDeclaration[] imports = compilationUnit.getImports();
					for (IImportDeclaration iImportDeclaration : imports) {
						if (!iImportDeclaration.getElementName().endsWith("*")) { //$NON-NLS-1$
							Classifier ariadneClassifier = this.getOrCreateClassifier(iImportDeclaration
									.getElementName());
							if (ariadneClassifier != null) {
								VersionedDependency versionedDependency = CoreFactory.eINSTANCE
										.createVersionedDependency();
								versionedDependency.setVersionedElement(ariadneClassifier);
								classifier.getVersionedDependencies().add(versionedDependency);
							}
						} else {
							// TODO Support "*" import
						}
					}
				}

				// Set up the inhenritance dependencies
				String superclassName = iType.getSuperclassName();
				Classifier ariadneClassifier = this.getOrCreateClassifier(superclassName);
				if (ariadneClassifier != null) {
					classifier.getSuperTypes().add(ariadneClassifier);
				}

				String[] superInterfaceNames = iType.getSuperInterfaceNames();
				for (String superInterfaceName : superInterfaceNames) {
					ariadneClassifier = this.getOrCreateClassifier(superInterfaceName);
					if (ariadneClassifier != null) {
						classifier.getSuperTypes().add(ariadneClassifier);
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return classifier;
	}

	/**
	 * Returns the Ariadne classifier matching the given classifier name or an EMF proxy if none could be
	 * found.
	 * 
	 * @param classifierName
	 *            The name of the classifier that we are looking for
	 * @return The Ariadne classifier or an EMF proxy.
	 */
	private Classifier getOrCreateClassifier(String classifierName) {
		Classifier classifier = null;

		// If type is a primitive type, let's use the primitive types of the Java Code Model.

		// Look for the matching annotation in the resource set
		// TreeIterator<Notifier> allContents = this.resourceSet.getAllContents();
		//
		// boolean found = false;
		// while (allContents.hasNext() && !found) {
		// Notifier next = allContents.next();
		// if (next instanceof Classifier) {
		// Classifier aClassifier = (Classifier)next;
		// if (aClassifier.getQualifiedName().equals(classifierName)) {
		// classifier = aClassifier;
		// found = true;
		// }
		// }
		// }

		// TODO Support EMF proxies
		// aClassifier = CodeFactory.eINSTANCE.createClassifier();
		// if (aClassifier instanceof InternalEObject) {
		// InternalEObject internalEObject = (InternalEObject)aClassifier;
		// String uri = IAriadneCodeModelConstants.CLASSIFIER_URI_PREFIX + superInterfaceName;
		// internalEObject.eSetProxyURI(URI.createURI(uri));
		// }

		return classifier;
	}

	/**
	 * Returns the Javadoc of the given Java member.
	 * 
	 * @param iMember
	 *            The member
	 * @param monitor
	 *            The progress monitor
	 * @return The Javadoc of the given Java member.
	 */
	private String getJavadoc(IMember iMember, IProgressMonitor monitor) {
		String documentation = ""; //$NON-NLS-1$
		try {
			if (iMember.getJavadocRange() != null) {
				documentation = iMember.getOpenable().getBuffer().getText(
						iMember.getJavadocRange().getOffset(), iMember.getJavadocRange().getLength());
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return documentation;
	}

	/**
	 * Returns the version from the given Javadoc.
	 * 
	 * @param javadoc
	 *            The javadoc
	 * @return The version from the given Javadoc.
	 */
	private Version getVersionFromJavadoc(String javadoc) {
		Version version = CoreFactory.eINSTANCE.createVersion();

		int index = javadoc.indexOf(IAriadneJavaConnectorConstants.AT_SINCE);
		if (index != -1) {
			// Check for a possible version
			int start = index + IAriadneJavaConnectorConstants.AT_SINCE.length();

			int end = javadoc.indexOf("\n", index); //$NON-NLS-1$
			if (end == -1) {
				end = javadoc.indexOf("\r\n", index); //$NON-NLS-1$
				if (end == -1) {
					end = javadoc.indexOf("\r", index); //$NON-NLS-1$
				}
			}

			if (end != -1) {
				// Parse the version number
				String possibleVersion = javadoc.substring(start, end).trim();
				StringTokenizer tokenizer = new StringTokenizer(possibleVersion, "."); //$NON-NLS-1$
				if (tokenizer.hasMoreTokens()) {
					String nextToken = tokenizer.nextToken();
					try {
						int parseInt = Integer.parseInt(nextToken);
						version.setMajor(parseInt);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}
				if (tokenizer.hasMoreTokens()) {
					String nextToken = tokenizer.nextToken();
					try {
						int parseInt = Integer.parseInt(nextToken);
						version.setMinor(parseInt);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}
				if (tokenizer.hasMoreTokens()) {
					String nextToken = tokenizer.nextToken();
					try {
						int parseInt = Integer.parseInt(nextToken);
						version.setPatch(parseInt);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return version;
	}

	/**
	 * Returns the visibility of the given member. If it is located within an interface, the lack of
	 * visibility should be treated as public and not package.
	 * 
	 * @param iMember
	 *            The member
	 * @param isInInterface
	 *            Indicates if the given member is located in an interface
	 * @return The visibility of the given member
	 */
	private VisibilityKind getVisibility(IMember iMember, boolean isInInterface) {
		VisibilityKind visibility = VisibilityKind.PUBLIC;
		try {
			int flags = iMember.getFlags();
			if (Flags.isPublic(flags)) {
				visibility = VisibilityKind.PUBLIC;
			} else if (Flags.isPackageDefault(flags)) {
				if (isInInterface) {
					visibility = VisibilityKind.PUBLIC;
				} else {
					visibility = VisibilityKind.PACKAGE;
				}
			} else if (Flags.isProtected(flags)) {
				visibility = VisibilityKind.PROTECTED;
			} else if (Flags.isPrivate(flags)) {
				visibility = VisibilityKind.PRIVATE;
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return visibility;
	}

	/**
	 * Explores the given Java constructor and create a matching Ariadne constructor in the given Ariadne
	 * classifier.
	 * 
	 * @param iMethod
	 *            The Java method to analyzed
	 * @param classifier
	 *            The Ariadne classifier
	 * @param isInterface
	 *            Indicates if the Java classifier containing the method is an interface
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreConstructor(IMethod iMethod, Classifier classifier, boolean isInterface,
			IProgressMonitor monitor) {
		Constructor constructor = null;
		for (Constructor aConstructor : classifier.getConstructors()) {
			if (aConstructor.getQualifiedName().equals(this.getQualifiedName(iMethod, isInterface))) {
				constructor = aConstructor;
			}
		}

		if (constructor == null) {
			constructor = CodeFactory.eINSTANCE.createConstructor();
			constructor.setQualifiedName(this.getQualifiedName(iMethod, isInterface));
			constructor.setName(iMethod.getElementName());
		}

		if (constructor != null) {
			String javadoc = this.getJavadoc(iMethod, monitor);
			constructor.setDescription(javadoc);
			constructor.setVersion(this.getVersionFromJavadoc(javadoc));
			constructor.setVisibility(this.getVisibility(iMethod, isInterface));

			try {
				int flags = iMethod.getFlags();

				constructor.setFinal(Flags.isFinal(flags));
				constructor.setStatic(Flags.isStatic(flags));
				if (Flags.isDeprecated(flags)) {
					// Add the property "Deprecated"
					this.addDeprecatedProperty(constructor);
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}

			try {
				// Explore parameters
				ILocalVariable[] parameters = iMethod.getParameters();
				// If we don't have any parameters yet, we create them
				if (parameters.length > 0 && constructor.getParameters().size() == 0) {
					for (ILocalVariable iLocalVariable : parameters) {
						String typeSignature = iLocalVariable.getTypeSignature();

						Parameter parameter = CodeFactory.eINSTANCE.createParameter();
						parameter.setQualifiedName(Signature.toString(typeSignature));
						parameter.setFinal(Flags.isFinal(iLocalVariable.getFlags()));
						if (Flags.isDeprecated(iLocalVariable.getFlags())) {
							// Add the property "Deprecated"
							this.addDeprecatedProperty(parameter);
						}
						constructor.getParameters().add(parameter);

						// Set the typing dependency
						String signature = Signature.toString(iLocalVariable.getTypeSignature());
						Classifier ariadneClassifier = this.getOrCreateClassifier(signature);
						if (ariadneClassifier != null) {
							parameter.getTypes().add(ariadneClassifier);
						}
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Explores the given Java method and create a matching Ariadne operation in the given Ariadne classifier.
	 * 
	 * @param iMethod
	 *            The Java method to analyzed
	 * @param classifier
	 *            The Ariadne classifier
	 * @param isInterface
	 *            Indicates if the Java classifier containing the method is an interface
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreOperation(IMethod iMethod, Classifier classifier, boolean isInterface,
			IProgressMonitor monitor) {
		Operation operation = null;
		List<Operation> operations = classifier.getOperations();
		for (Operation anOperation : operations) {
			if (anOperation.getQualifiedName().equals(this.getQualifiedName(iMethod, isInterface))) {
				operation = anOperation;
			}
		}

		if (operation == null) {
			operation = CodeFactory.eINSTANCE.createOperation();
			operation.setQualifiedName(this.getQualifiedName(iMethod, isInterface));
			operation.setName(iMethod.getElementName());
			classifier.getOperations().add(operation);
		}

		if (operation != null) {
			String javadoc = this.getJavadoc(iMethod, monitor);
			operation.setDescription(javadoc);
			operation.setVersion(this.getVersionFromJavadoc(javadoc));
			operation.setVisibility(this.getVisibility(iMethod, isInterface));

			try {
				int flags = iMethod.getFlags();

				operation.setFinal(Flags.isFinal(flags));
				operation.setStatic(Flags.isStatic(flags));
				if (Flags.isDeprecated(flags)) {
					// Add the property "Deprecated"
					this.addDeprecatedProperty(operation);
				}

				// Set the return type
				String returnType = Signature.toString(iMethod.getReturnType());
				Classifier ariadneClassifier = this.getOrCreateClassifier(returnType);
				if (ariadneClassifier != null) {
					operation.getReturnTypes().add(ariadneClassifier);
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}

			try {
				// Explore parameters
				ILocalVariable[] parameters = iMethod.getParameters();
				// If we don't have any parameters yet, we create them
				if (parameters.length > 0 && operation.getParameters().size() == 0) {
					for (ILocalVariable iLocalVariable : parameters) {
						String typeSignature = iLocalVariable.getTypeSignature();

						Parameter parameter = CodeFactory.eINSTANCE.createParameter();
						parameter.setName(iLocalVariable.getElementName());
						parameter.setQualifiedName(Signature.toString(typeSignature) + ' '
								+ iLocalVariable.getElementName());
						parameter.setFinal(Flags.isFinal(iLocalVariable.getFlags()));
						if (Flags.isDeprecated(iLocalVariable.getFlags())) {
							// Add the property "Deprecated"
							this.addDeprecatedProperty(parameter);
						}
						operation.getParameters().add(parameter);

						// Set the typing dependency
						String signature = Signature.toString(iLocalVariable.getTypeSignature());
						Classifier ariadneClassifier = this.getOrCreateClassifier(signature);
						if (ariadneClassifier != null) {
							parameter.getTypes().add(ariadneClassifier);
						}
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Returns the qualified name of the given Java method.
	 * 
	 * @param iMethod
	 *            The Java method
	 * @param isInInterface
	 *            Indicates if the Java method is located in an interface
	 * @return The qualified name of the given Java method
	 */
	private String getQualifiedName(IMethod iMethod, boolean isInInterface) {
		try {
			String signatureBody = Signature.toString(iMethod.getSignature(), iMethod.getElementName(),
					iMethod.getParameterNames(), true, true);
			String signature = ""; //$NON-NLS-1$

			int flags = iMethod.getFlags();

			VisibilityKind visibility = this.getVisibility(iMethod, isInInterface);
			if (!visibility.equals(VisibilityKind.PACKAGE)) {
				signature = signature + visibility.getName().toLowerCase() + ' ';
			}
			if (Flags.isStatic(flags)) {
				signature = signature + IAriadneJavaConnectorConstants.STATIC + ' ';
			}
			if (Flags.isFinal(flags)) {
				signature = signature + IAriadneJavaConnectorConstants.FINAL + ' ';
			}
			signature = signature + signatureBody;
			return signature;
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Explores the given Java field and created a matching Ariadne field in the given Ariadne classifier.
	 * 
	 * @param iField
	 *            The Java field to analyze
	 * @param classifier
	 *            The Ariadne classifier
	 * @param isInInterface
	 *            Indicates if the given field is located in a Java interface
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreField(IField iField, Classifier classifier, boolean isInInterface,
			IProgressMonitor monitor) {
		Field field = null;
		List<Field> fields = classifier.getFields();
		for (Field aField : fields) {
			if (aField.getQualifiedName().equals(this.getQualifiedName(iField, isInInterface))) {
				field = aField;
			}
		}

		if (field == null) {
			field = CodeFactory.eINSTANCE.createField();
			field.setQualifiedName(this.getQualifiedName(iField, isInInterface));
			field.setName(iField.getElementName());
			classifier.getFields().add(field);
		}

		if (field != null) {
			String javadoc = this.getJavadoc(iField, monitor);
			field.setDescription(javadoc);
			field.setVersion(this.getVersionFromJavadoc(javadoc));
			field.setVisibility(this.getVisibility(iField, isInInterface));

			try {
				int flags = iField.getFlags();

				field.setFinal(Flags.isFinal(flags));
				field.setStatic(Flags.isStatic(flags));
				if (Flags.isDeprecated(flags)) {
					// Add the property "Deprecated"
					this.addDeprecatedProperty(field);
				}

				// Set the typing dependency
				String signature = Signature.toString(iField.getTypeSignature());
				Classifier ariadneClassifier = this.getOrCreateClassifier(signature);
				if (ariadneClassifier != null) {
					field.getTypes().add(ariadneClassifier);
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Computes the signature of the given field.
	 * 
	 * @param iField
	 *            The field which we are looking the signature for
	 * @param isInInterface
	 *            Indicates if we are in an interface (visibility optional)
	 * @return The signature of the field
	 */
	private String getQualifiedName(IField iField, boolean isInInterface) {
		try {
			String signatureBody = Signature.toString(iField.getTypeSignature()) + ' '
					+ iField.getElementName();
			String signature = ""; //$NON-NLS-1$

			int flags = iField.getFlags();

			VisibilityKind visibility = this.getVisibility(iField, isInInterface);
			if (!visibility.equals(VisibilityKind.PACKAGE)) {
				signature = signature + visibility.getName().toLowerCase() + ' ';
			}
			if (Flags.isStatic(flags)) {
				signature = signature + IAriadneJavaConnectorConstants.STATIC + ' ';
			}
			if (Flags.isFinal(flags)) {
				signature = signature + IAriadneJavaConnectorConstants.FINAL + ' ';
			}
			signature = signature + signatureBody;
			return signature;
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return ""; //$NON-NLS-1$
	}
}
