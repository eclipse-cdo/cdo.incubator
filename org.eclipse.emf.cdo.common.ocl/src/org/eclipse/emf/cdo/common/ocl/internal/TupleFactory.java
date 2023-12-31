/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 182994
 *
 * </copyright>
 *
 * $Id: TupleFactory.java,v 1.4 2009-01-07 07:21:34 estepper Exp $
 */

package org.eclipse.emf.cdo.common.ocl.internal;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.common.model.CDOOperation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.ocl.types.TupleType;
import org.eclipse.ocl.util.CollectionUtil;
import org.eclipse.ocl.util.ObjectUtil;
import org.eclipse.ocl.util.Tuple;

/**
 * A specialized factory that creates tuple instances implementing value
 * equality.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TupleFactory
		extends EFactoryImpl {

	@Override
	protected EObject basicCreate(EClass eClass) {
		TupleInstance result = new TupleInstance();
		result.eSetClass(eClass);
		return result;
	}

	private static final class TupleInstance
			extends DynamicEObjectImpl
			implements Tuple<CDOOperation, CDOFeature> {

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof TupleInstance)) {
				return false;
			}

			TupleInstance other = (TupleInstance) o;
			EClass otherType = other.eClass();

			EList<EStructuralFeature> myFeatures = eClass()
				.getEStructuralFeatures();
			EList<EStructuralFeature> otherFeatures = otherType
				.getEStructuralFeatures();

			if (myFeatures.size() != otherFeatures.size()) {
				return false;
			}

			Iterator<EStructuralFeature> iter = myFeatures.iterator();

			boolean result = true; // assume equality unless ...

			while (result && iter.hasNext()) {
				EStructuralFeature next = iter.next();

				Object myValue = eGet(next);

				EStructuralFeature otherNext = otherType
					.getEStructuralFeature(next.getName());
				if (otherNext == null) {
					result = false;
				} else {
					Object otherValue = other.eGet(next);

					result = ObjectUtil.equal(myValue, otherValue);
				}
			}

			return result;
		}

		@Override
		public int hashCode() {
			int result = 0;

			for (EStructuralFeature next : eClass().getEStructuralFeatures()) {
				Object myValue = eGet(next);

				result = 31 * result + ObjectUtil.hashCode(myValue);
			}

			return result;
		}

		public TupleType<CDOOperation, CDOFeature> getTupleType() {
			return (org.eclipse.emf.cdo.common.ocl.TupleType) eClass();
		}

		public Object getValue(String partName) {
			return getValue(eClass().getEStructuralFeature(partName));
		}

		public Object getValue(CDOFeature part) {
			return eGet(part);
		}

		@Override
		public String toString() {
			StringBuilder result = new StringBuilder();
			result.append("Tuple{"); //$NON-NLS-1$

			for (Iterator<CDOFeature> iter = getTupleType().oclProperties()
				.iterator(); iter.hasNext();) {

				CDOFeature p = iter.next();

				result.append(p.getName());
				result.append(" = "); //$NON-NLS-1$
				result.append(toString(getValue(p)));

				if (iter.hasNext()) {
					result.append(", "); //$NON-NLS-1$
				}
			}

			result.append("}"); //$NON-NLS-1$
			return result.toString();
		}

		private String toString(Object o) {
			if (o instanceof String) {
				return "'" + (String) o + "'"; //$NON-NLS-1$ //$NON-NLS-2$
			} else if (o instanceof Collection) {
				return CollectionUtil.toString((Collection<?>) o);
			} else if (o == null) {
				return "null"; //$NON-NLS-1$
			} else {
				return o.toString();
			}
		}
	}
}
