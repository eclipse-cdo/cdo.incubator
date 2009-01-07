/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
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
 * $Id: QueryImpl.java,v 1.3 2009-01-07 07:21:34 estepper Exp $
 */

package org.eclipse.emf.cdo.common.ocl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.cdo.common.model.CDOClass;
import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.Query;

/**
 * Implementation of the {@link OCL.Query} convenience interface.
 * 
 * @author Christian W. Damus (cdamus)
 */
class QueryImpl
		implements OCL.Query {

	private final Query<CDOClassifier, CDOClass, CDORevision> delegate;

	private final OCL ocl;

	QueryImpl(Query<CDOClassifier, CDOClass, CDORevision> delegate, OCL ocl) {
		this.delegate = delegate;
		this.ocl = ocl;
	}

	public OCL getOCL() {
		return ocl;
	}

	public boolean check(List<?> objects) {
		return delegate.check(objects);
	}

	public boolean check(Object obj) {
		return delegate.check(obj);
	}

	public Object evaluate() {
		return delegate.evaluate();
	}

	public List<?> evaluate(List<?> objects) {
		return delegate.evaluate(objects);
	}

	public Object evaluate(Object obj) {
		return delegate.evaluate(obj);
	}

	public EvaluationEnvironment<CDOClassifier, ?, ?, CDOClass, CDORevision> getEvaluationEnvironment() {
		return delegate.getEvaluationEnvironment();
	}

	public OCLExpression getExpression() {
		return (OCLExpression) delegate.getExpression();
	}

	public Map<CDOClass, ? extends Set<? extends CDORevision>> getExtentMap() {
		return delegate.getExtentMap();
	}

	public String queryText() {
		return delegate.queryText();
	}

	public <T> List<T> reject(List<T> objects) {
		return delegate.reject(objects);
	}

	public CDOClassifier resultType() {
		return delegate.resultType();
	}

	public <T> List<T> select(List<T> objects) {
		return delegate.select(objects);
	}

}
