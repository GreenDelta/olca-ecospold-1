package org.openlca.ecospold.model;

import java.util.List;

public interface IReferenceFunction {

	List<String> getSynonym();

	boolean isDatasetRelatesToProduct();

	void setDatasetRelatesToProduct(boolean value);

	String getName();

	void setName(String value);

	String getLocalName();

	void setLocalName(String value);

	boolean isInfrastructureProcess();

	void setInfrastructureProcess(boolean value);

	double getAmount();

	void setAmount(double value);

	String getUnit();

	void setUnit(String value);

	String getCategory();

	void setCategory(String value);

	String getSubCategory();

	void setSubCategory(String value);

	String getLocalCategory();

	void setLocalCategory(String value);

	String getLocalSubCategory();

	void setLocalSubCategory(String value);

	String getIncludedProcesses();

	void setIncludedProcesses(String value);

	String getGeneralComment();

	void setGeneralComment(String value);

	boolean isInfrastructureIncluded();

	void setInfrastructureIncluded(Boolean value);

	String getCASNumber();

	void setCASNumber(String value);

	Long getStatisticalClassification();

	void setStatisticalClassification(Long value);

	String getFormula();

	void setFormula(String value);

}
