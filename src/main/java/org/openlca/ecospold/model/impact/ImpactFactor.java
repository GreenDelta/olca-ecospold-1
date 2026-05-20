package org.openlca.ecospold.model.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IExchange;

import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TExchange", propOrder = {"inputGroup", "outputGroup"})
class ImpactFactor implements Serializable, IExchange {

	private final static long serialVersionUID = 1L;
	protected Integer inputGroup;
	protected Integer outputGroup;
	@XmlAttribute(name = "number", required = true)
	protected int number;
	@XmlAttribute(name = "category")
	protected String category;
	@XmlAttribute(name = "subCategory")
	protected String subCategory;
	@XmlAttribute(name = "localCategory")
	protected String localCategory;
	@XmlAttribute(name = "localSubCategory")
	protected String localSubCategory;
	@XmlAttribute(name = "CASNumber")
	protected String casNumber;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "location")
	protected String location;
	@XmlAttribute(name = "unit", required = true)
	protected String unit;
	@XmlAttribute(name = "meanValue", required = true)
	protected double meanValue;
	@XmlAttribute(name = "uncertaintyType")
	protected Integer uncertaintyType;
	@XmlAttribute(name = "standardDeviation95")
	protected Double standardDeviation95;
	@XmlAttribute(name = "formula")
	protected String formula;
	@XmlAttribute(name = "referenceToSource")
	protected Integer referenceToSource;
	@XmlAttribute(name = "pageNumbers")
	protected String pageNumbers;
	@XmlAttribute(name = "generalComment")
	protected String generalComment;
	@XmlAttribute(name = "localName")
	protected String localName;
	@XmlAttribute(name = "infrastructureProcess")
	protected Boolean infrastructureProcess;
	@XmlAttribute(name = "minValue")
	protected Double minValue;
	@XmlAttribute(name = "maxValue")
	protected Double maxValue;
	@XmlAttribute(name = "mostLikelyValue")
	protected Double mostLikelyValue;

	@Override
	public String getCASNumber() {
		return casNumber;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public String getFormula() {
		return formula;
	}

	@Override
	public String getGeneralComment() {
		return generalComment;
	}

	@Override
	public Integer getInputGroup() {
		return inputGroup;
	}

	@Override
	public String getLocalCategory() {
		return localCategory;
	}

	@Override
	public String getLocalName() {
		return localName;
	}

	@Override
	public String getLocalSubCategory() {
		return localSubCategory;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public Double getMaxValue() {
		return maxValue;
	}

	@Override
	public double getMeanValue() {
		return meanValue;
	}

	@Override
	public Double getMinValue() {
		return minValue;
	}

	@Override
	public Double getMostLikelyValue() {
		return mostLikelyValue;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public Integer getOutputGroup() {
		return outputGroup;
	}

	@Override
	public String getPageNumbers() {
		return pageNumbers;
	}

	@Override
	public Integer getReferenceToSource() {
		return referenceToSource;
	}

	@Override
	public Double getStandardDeviation95() {
		return standardDeviation95;
	}

	@Override
	public String getSubCategory() {
		return subCategory;
	}

	@Override
	public Integer getUncertaintyType() {
		return uncertaintyType;
	}

	@Override
	public String getUnit() {
		return unit;
	}

	@Override
	public Boolean isInfrastructureProcess() {
		return infrastructureProcess;
	}

	@Override
	public void setCASNumber(final String value) {
		this.casNumber = value;
	}

	@Override
	public void setCategory(final String value) {
		this.category = value;
	}

	@Override
	public void setFormula(final String value) {
		this.formula = value;
	}

	@Override
	public void setGeneralComment(final String value) {
		this.generalComment = value;
	}

	@Override
	public void setInfrastructureProcess(final Boolean value) {
		this.infrastructureProcess = value;
	}

	@Override
	public void setInputGroup(final Integer value) {
		this.inputGroup = value;
	}

	@Override
	public void setLocalCategory(final String value) {
		this.localCategory = value;
	}

	@Override
	public void setLocalName(final String value) {
		this.localName = value;
	}

	@Override
	public void setLocalSubCategory(final String value) {
		this.localSubCategory = value;
	}

	@Override
	public void setLocation(final String value) {
		this.location = value;
	}

	@Override
	public void setMaxValue(final Double value) {
		this.maxValue = value;
	}

	@Override
	public void setMeanValue(final double value) {
		this.meanValue = value;
	}

	@Override
	public void setMinValue(final Double value) {
		this.minValue = value;
	}

	@Override
	public void setMostLikelyValue(final Double value) {
		this.mostLikelyValue = value;
	}

	@Override
	public void setName(final String value) {
		this.name = value;
	}

	@Override
	public void setNumber(final int value) {
		this.number = value;
	}

	@Override
	public void setOutputGroup(final Integer value) {
		this.outputGroup = value;
	}

	@Override
	public void setPageNumbers(final String value) {
		this.pageNumbers = value;
	}

	@Override
	public void setReferenceToSource(final Integer value) {
		this.referenceToSource = value;
	}

	@Override
	public void setStandardDeviation95(final Double value) {
		this.standardDeviation95 = value;
	}

	@Override
	public void setSubCategory(final String value) {
		this.subCategory = value;
	}

	@Override
	public void setUncertaintyType(final Integer value) {
		this.uncertaintyType = value;
	}

	@Override
	public void setUnit(final String value) {
		this.unit = value;
	}
}
