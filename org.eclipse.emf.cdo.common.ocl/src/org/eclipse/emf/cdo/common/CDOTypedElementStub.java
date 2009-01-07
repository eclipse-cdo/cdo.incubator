package org.eclipse.emf.cdo.common;

import java.io.IOException;

import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOPackageManager;
import org.eclipse.emf.cdo.spi.common.model.InternalCDOTypedElement;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public abstract class CDOTypedElementStub
		extends EObjectImpl
		implements InternalCDOTypedElement {

	private String name;

	private CDOClassifier type;

	private int lowerBound;

	private int upperBound;

	protected CDOTypedElementStub() {
		super();
	}

	public CDOClassifier getType() {
		return type;
	}

	public void setType(CDOClassifier type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	public boolean isRequired() {
		return lowerBound > 0;
	}

	public boolean isMany() {
		return upperBound > 1;
	}

	public CDOPackageManager getPackageManager() {
		throw new UnsupportedOperationException();
	}

	public String getQualifiedName() {
		throw new UnsupportedOperationException();
	}

	public Object getClientInfo() {
		throw new UnsupportedOperationException();
	}

	public void setClientInfo(Object clientInfo) {
		throw new UnsupportedOperationException();
	}

	public Object getServerInfo() {
		throw new UnsupportedOperationException();
	}

	public void setServerInfo(Object serverInfo) {
		throw new UnsupportedOperationException();
	}

	public void read(CDODataInput in, boolean proxy)
			throws IOException {
		throw new UnsupportedOperationException();
	}

	public void write(CDODataOutput out, boolean proxy)
			throws IOException {
		throw new UnsupportedOperationException();
	}
}
