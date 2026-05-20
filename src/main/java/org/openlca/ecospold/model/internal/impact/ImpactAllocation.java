package org.openlca.ecospold.model.internal.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IAllocation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAllocation", propOrder = { "referenceToInputOutput" })
class ImpactAllocation implements Serializable, IAllocation {

	private final static long serialVersionUID = 1L;
	@XmlElement(type = Integer.class)
	protected List<Integer> referenceToInputOutput;
	@XmlAttribute(name = "referenceToCoProduct", required = true)
	protected int referenceToCoProduct;
	@XmlAttribute(name = "allocationMethod")
	protected Integer allocationMethod;
	@XmlAttribute(name = "fraction", required = true)
	protected float fraction;
	@XmlAttribute(name = "explanations")
	protected String explanations;

	@Override
	public List<Integer> getReferenceToInputOutput() {
		if (referenceToInputOutput == null) {
			referenceToInputOutput = new ArrayList<>();
		}
		return this.referenceToInputOutput;
	}

	@Override
	public int getReferenceToCoProduct() {
		return referenceToCoProduct;
	}

	@Override
	public void setReferenceToCoProduct(int value) {
		this.referenceToCoProduct = value;
	}

	@Override
	public int getAllocationMethod() {
		if (allocationMethod == null)
			return -1;
		return allocationMethod;
	}

	@Override
	public void setAllocationMethod(Integer value) {
		this.allocationMethod = value;
	}

	@Override
	public float getFraction() {
		return fraction;
	}

	@Override
	public void setFraction(float value) {
		this.fraction = value;
	}

	@Override
	public String getExplanations() {
		return explanations;
	}

	@Override
	public void setExplanations(String value) {
		this.explanations = value;
	}

}
