/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
org.eclipse.emf.cdo.dawn.examples.acore.diagram.AClassAggregationClassesFigure = function()
{
	org.eclipse.emf.cdo.dawn.web.basic.DawnConnectionFigure.call(this);

	this
			.setTargetDecorator(new org.eclipse.emf.cdo.dawn.examples.acore.diagram.AClassAggregationClassesFigureTargetDecorator());

}

org.eclipse.emf.cdo.dawn.examples.acore.diagram.AClassAggregationClassesFigure.prototype = new org.eclipse.emf.cdo.dawn.web.basic.DawnConnectionFigure();
