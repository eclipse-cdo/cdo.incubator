/**
 * <copyright>
 *
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCL.java,v 1.2 2009-01-04 17:56:36 estepper Exp $
 */

package org.eclipse.emf.cdo.common.ocl;

import org.eclipse.emf.cdo.common.fake.CDOClass;
import org.eclipse.emf.cdo.common.fake.CDOClassifier;
import org.eclipse.emf.cdo.common.fake.CDOEnumLiteral;
import org.eclipse.emf.cdo.common.fake.CDOFeature;
import org.eclipse.emf.cdo.common.fake.CDOOperation;
import org.eclipse.emf.cdo.common.fake.CDOParameter;
import org.eclipse.emf.cdo.common.fake.CDORevision;
import org.eclipse.emf.cdo.common.model.CDOPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.helper.OCLHelper;

/**
 * Convenient subclass of the <code>OCL</code> fa&ccedil;ade that binds the
 * Ecore metamodel to the superclass's generic type parameters. This frees
 * client code from the long list of parameter substitutions. This subclass also
 * provides a shortcut to creating an <code>OCL</code> on the shared
 * {@link EcoreEnvironmentFactory} instance.
 * 
 * @author Christian W. Damus (cdamus)
 * 
 * @see EcoreEnvironmentFactory
 */
public class OCL
		extends
		org.eclipse.ocl.OCL<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> {

	/**
	 * Initializes me with an environment factory for the Ecore metamodel.
	 * 
	 * @param envFactory
	 *            my environment factory
	 */
	protected OCL(
			EnvironmentFactory<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> envFactory) {
		super(envFactory);
	}

	/**
	 * Initializes me with an initial environment for the Ecore metamodel.
	 * 
	 * @param env
	 *            my root environment
	 */
	protected OCL(
			Environment<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> env) {
		super(env);
	}

	/**
	 * Initializes me with an environment factory for the Ecore metamodel and a
	 * resource from which to load my root environment.
	 * 
	 * @param envFactory
	 *            my environment factory
	 * @param resource
	 *            my persisted root environment
	 */
	protected OCL(
			EnvironmentFactory<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> envFactory,
			Resource resource) {
		super(envFactory, resource);
	}

	/**
	 * Creates a new <code>OCL</code> using the shared Ecore environment factory
	 * instance.
	 * 
	 * @return the new <code>OCL</code>
	 */
	public static OCL newInstance() {
		return new OCL(EcoreEnvironmentFactory.INSTANCE);
	}

	/**
	 * Creates a new <code>OCL</code> using the specified Ecore environment
	 * factory.
	 * 
	 * @param envFactory
	 *            an environment factory for Ecore
	 * @return the new <code>OCL</code>
	 */
	public static OCL newInstance(
			EnvironmentFactory<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> envFactory) {

		return new OCL(envFactory);
	}

	/**
	 * Creates a new <code>OCL</code> using the specified initial Ecore
	 * environment.
	 * 
	 * @param env
	 *            an environment for Ecore
	 * @return the new <code>OCL</code>
	 */
	public static OCL newInstance(
			Environment<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> env) {

		return new OCL(env);
	}

	/**
	 * Creates a new <code>OCL</code> using the specified Ecore environment
	 * factory and a resource from which to load the initial environment.
	 * 
	 * @param envFactory
	 *            an environment factory for Ecore
	 * @param resource
	 *            the resource containing a persistent environment (which may be
	 *            empty for an initially empty environment)
	 * @return the new <code>OCL</code>
	 */
	public static OCL newInstance(
			EnvironmentFactory<CDOPackage, CDOClassifier, CDOOperation, CDOFeature, CDOEnumLiteral, CDOParameter, CDORevision, CallOperationAction, SendSignalAction, Constraint, CDOClass, CDORevision> envFactory,
			Resource resource) {

		return new OCL(envFactory, resource);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The return type is narrowed to the Ecore binding for the generic
	 * <tt>OCLHelper&lt;C,O,P,CT&gt;</tt> type.
	 * </p>
	 */
	@Override
	public Helper createOCLHelper() {
		return new OCLHelperImpl(super.createOCLHelper());
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The return type is narrowed to the Ecore binding for the generic
	 * <tt>Query&lt;C,CLS,E&gt;</tt> type.
	 * </p>
	 */
	@Override
	public Query createQuery(Constraint constraint) {
		return new QueryImpl(super.createQuery(constraint), this);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The return type is narrowed to the Ecore binding for the generic
	 * <tt>Query&lt;C,CLS,E&gt;</tt> type.
	 * </p>
	 */
	@Override
	public Query createQuery(
			org.eclipse.ocl.expressions.OCLExpression<CDOClassifier> query) {
		return new QueryImpl(super.createQuery(query), this);
	}

	/**
	 * Convenient interface aliasing the type parameter substitutions for the
	 * Ecore environment, for ease of typing.
	 * 
	 * @author Christian W. Damus (cdamus)
	 */
	public static interface Helper
			extends
			OCLHelper<CDOClassifier, CDOOperation, CDOFeature, Constraint> {

		/**
		 * {@inheritDoc}
		 * <p>
		 * The return type is narrowed to the Ecore binding for the generic
		 * <tt>OCLExpression&lt;C&gt;</tt> type.
		 * </p>
		 */
		OCLExpression createQuery(String expression)
				throws ParserException;

		/**
		 * {@inheritDoc}
		 * <p>
		 * The return type is narrowed to the Ecore binding for the generic
		 * <tt>OCLExpression&lt;PK,C,O,P,EL,PM,S,COA,SSA,CT,CLS,E&gt;</tt> type.
		 * </p>
		 */
		OCL getOCL();
	}

	/**
	 * Convenient interface aliasing the type parameter substitutions for the
	 * UML environment, for ease of typing.
	 * 
	 * @author Christian W. Damus (cdamus)
	 */
	public static interface Query
			extends org.eclipse.ocl.Query<CDOClassifier, CDOClass, CDORevision> {

		/**
		 * {@inheritDoc}
		 * <p>
		 * The return type is narrowed to the Ecore binding for the generic
		 * <tt>OCLExpression&lt;C&gt;</tt> type.
		 * </p>
		 */
		OCLExpression getExpression();

		/**
		 * <p>
		 * Obtains the {@link OCL} that created me.
		 * </p>
		 * 
		 * @return my originating <tt>OCL</tt> instance
		 */
		OCL getOCL();
	}
}
