package org.openlca.ecospold.model;

import java.util.List;

public interface IReferenceFunction {

	public abstract List<String> getSynonym();

	public abstract boolean isDatasetRelatesToProduct();

	public abstract void setDatasetRelatesToProduct(boolean value);

	public abstract String getName();

	public abstract void setName(String value);

	public abstract String getLocalName();

	public abstract void setLocalName(String value);

	public abstract boolean isInfrastructureProcess();

	public abstract void setInfrastructureProcess(boolean value);

	public abstract double getAmount();

	public abstract void setAmount(double value);

	public abstract String getUnit();

	public abstract void setUnit(String value);

	public abstract String getCategory();

	public abstract void setCategory(String value);

	public abstract String getSubCategory();

	public abstract void setSubCategory(String value);

	public abstract String getLocalCategory();

	public abstract void setLocalCategory(String value);

	public abstract String getLocalSubCategory();

	public abstract void setLocalSubCategory(String value);

	public abstract String getIncludedProcesses();

	public abstract void setIncludedProcesses(String value);

	public abstract String getGeneralComment();

	public abstract void setGeneralComment(String value);

	public abstract boolean isInfrastructureIncluded();

	public abstract void setInfrastructureIncluded(Boolean value);

	public abstract String getCASNumber();

	public abstract void setCASNumber(String value);

	public abstract Long getStatisticalClassification();

	public abstract void setStatisticalClassification(Long value);

	public abstract String getFormula();

	public abstract void setFormula(String value);

}
