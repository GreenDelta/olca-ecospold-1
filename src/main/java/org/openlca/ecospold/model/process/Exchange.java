
package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.openlca.ecospold.model.IExchange;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TExchange", propOrder = {
	"inputGroup",
	"outputGroup"
})
class Exchange implements IExchange {

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
	public Integer getInputGroup() {
		return inputGroup;
	}

	@Override
	public void setInputGroup(Integer value) {
		this.inputGroup = value;
	}

	@Override
	public Integer getOutputGroup() {
		return outputGroup;
	}

	@Override
	public void setOutputGroup(Integer value) {
		this.outputGroup = value;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int value) {
		this.number = value;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public void setCategory(String value) {
		this.category = value;
	}

	@Override
	public String getSubCategory() {
		return subCategory;
	}

	@Override
	public void setSubCategory(String value) {
		this.subCategory = value;
	}

	@Override
	public String getLocalCategory() {
		return localCategory;
	}

	@Override
	public void setLocalCategory(String value) {
		this.localCategory = value;
	}

	@Override
	public String getLocalSubCategory() {
		return localSubCategory;
	}

	@Override
	public void setLocalSubCategory(String value) {
		this.localSubCategory = value;
	}

	@Override
	public String getCASNumber() {
		return casNumber;
	}

	@Override
	public void setCASNumber(String value) {
		this.casNumber = value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void setLocation(String value) {
		this.location = value;
	}

	@Override
	public String getUnit() {
		return unit;
	}

	@Override
	public void setUnit(String value) {
		this.unit = value;
	}

	@Override
	public double getMeanValue() {
		return meanValue;
	}

	@Override
	public void setMeanValue(double value) {
		this.meanValue = value;
	}

	@Override
	public Integer getUncertaintyType() {
		return uncertaintyType;
	}

	@Override
	public void setUncertaintyType(Integer value) {
		this.uncertaintyType = value;
	}

	@Override
	public Double getStandardDeviation95() {
		return standardDeviation95;
	}

	@Override
	public void setStandardDeviation95(Double value) {
		this.standardDeviation95 = value;
	}

	@Override
	public String getFormula() {
		return formula;
	}

	@Override
	public void setFormula(String value) {
		this.formula = value;
	}

	@Override
	public Integer getReferenceToSource() {
		return referenceToSource;
	}

	@Override
	public void setReferenceToSource(Integer value) {
		this.referenceToSource = value;
	}

	@Override
	public String getPageNumbers() {
		return pageNumbers;
	}

	@Override
	public void setPageNumbers(String value) {
		this.pageNumbers = value;
	}

	@Override
	public String getGeneralComment() {
		return generalComment;
	}

	@Override
	public void setGeneralComment(String value) {
		this.generalComment = value;
	}

	@Override
	public String getLocalName() {
		return localName;
	}

	@Override
	public void setLocalName(String value) {
		this.localName = value;
	}

	@Override
	public Boolean isInfrastructureProcess() {
		return infrastructureProcess;
	}

	@Override
	public void setInfrastructureProcess(Boolean value) {
		this.infrastructureProcess = value;
	}

	@Override
	public Double getMinValue() {
		return minValue;
	}

	@Override
	public void setMinValue(Double value) {
		this.minValue = value;
	}

	@Override
	public Double getMaxValue() {
		return maxValue;
	}

	@Override
	public void setMaxValue(Double value) {
		this.maxValue = value;
	}

	@Override
	public Double getMostLikelyValue() {
		return mostLikelyValue;
	}

	@Override
	public void setMostLikelyValue(Double value) {
		this.mostLikelyValue = value;
	}

}
