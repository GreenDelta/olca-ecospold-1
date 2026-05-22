package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IReferenceFunction;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReferenceFunction", propOrder = { "synonym" })
class ReferenceFunction implements IReferenceFunction {

	protected List<String> synonym;
	@XmlAttribute(name = "datasetRelatesToProduct", required = true)
	protected boolean datasetRelatesToProduct;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "localName", required = true)
	protected String localName;
	@XmlAttribute(name = "infrastructureProcess", required = true)
	protected boolean infrastructureProcess;
	@XmlAttribute(name = "amount", required = true)
	protected double amount;
	@XmlAttribute(name = "unit", required = true)
	protected String unit;
	@XmlAttribute(name = "category", required = true)
	protected String category;
	@XmlAttribute(name = "subCategory", required = true)
	protected String subCategory;
	@XmlAttribute(name = "localCategory", required = true)
	protected String localCategory;
	@XmlAttribute(name = "localSubCategory", required = true)
	protected String localSubCategory;
	@XmlAttribute(name = "includedProcesses")
	protected String includedProcesses;
	@XmlAttribute(name = "generalComment")
	protected String generalComment;
	@XmlAttribute(name = "infrastructureIncluded")
	protected Boolean infrastructureIncluded;
	@XmlAttribute(name = "CASNumber")
	protected String casNumber;
	@XmlAttribute(name = "statisticalClassification")
	protected Long statisticalClassification;
	@XmlAttribute(name = "formula")
	protected String formula;

	@Override
	public List<String> getSynonym() {
		if (synonym == null) {
			synonym = new ArrayList<>();
		}
		return this.synonym;
	}

	@Override
	public boolean isDatasetRelatesToProduct() {
		return datasetRelatesToProduct;
	}

	@Override
	public void setDatasetRelatesToProduct(boolean value) {
		this.datasetRelatesToProduct = value;
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
	public String getLocalName() {
		return localName;
	}

	@Override
	public void setLocalName(String value) {
		this.localName = value;
	}

	@Override
	public boolean isInfrastructureProcess() {
		return infrastructureProcess;
	}

	@Override
	public void setInfrastructureProcess(boolean value) {
		this.infrastructureProcess = value;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public void setAmount(double value) {
		this.amount = value;
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
	public String getIncludedProcesses() {
		return includedProcesses;
	}

	@Override
	public void setIncludedProcesses(String value) {
		this.includedProcesses = value;
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
	public boolean isInfrastructureIncluded() {
		if (infrastructureIncluded == null)
			return true;
		return infrastructureIncluded;
	}

	@Override
	public void setInfrastructureIncluded(Boolean value) {
		this.infrastructureIncluded = value;
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
	public Long getStatisticalClassification() {
		return statisticalClassification;
	}

	@Override
	public void setStatisticalClassification(Long value) {
		this.statisticalClassification = value;
	}

	@Override
	public String getFormula() {
		return formula;
	}

	@Override
	public void setFormula(String value) {
		this.formula = value;
	}

}
