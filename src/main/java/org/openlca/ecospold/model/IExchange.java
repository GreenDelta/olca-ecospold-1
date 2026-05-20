package org.openlca.ecospold.model;

public interface IExchange {

	Integer getInputGroup();

	void setInputGroup(Integer value);

	Integer getOutputGroup();

	void setOutputGroup(Integer value);

	int getNumber();

	void setNumber(int value);

	String getCategory();

	void setCategory(String value);

	String getSubCategory();

	void setSubCategory(String value);

	String getLocalCategory();

	void setLocalCategory(String value);

	String getLocalSubCategory();

	void setLocalSubCategory(String value);

	String getCASNumber();

	void setCASNumber(String value);

	String getName();

	void setName(String value);

	String getLocation();

	void setLocation(String value);

	String getUnit();

	void setUnit(String value);

	double getMeanValue();

	void setMeanValue(double value);

	Integer getUncertaintyType();

	void setUncertaintyType(Integer value);

	Double getStandardDeviation95();

	void setStandardDeviation95(Double value);

	String getFormula();

	void setFormula(String value);

	Integer getReferenceToSource();

	void setReferenceToSource(Integer value);

	String getPageNumbers();

	void setPageNumbers(String value);

	String getGeneralComment();

	void setGeneralComment(String value);

	String getLocalName();

	void setLocalName(String value);

	Boolean isInfrastructureProcess();

	void setInfrastructureProcess(Boolean value);

	Double getMinValue();

	void setMinValue(Double value);

	Double getMaxValue();

	void setMaxValue(Double value);

	Double getMostLikelyValue();

	void setMostLikelyValue(Double value);

	/**
	 * Returns true if this exchange is an elementary flow. An exchange
	 * describes an elementary flow if it has an input group or output group
	 * with value 4. Additionally exchanges with no input group AND no output
	 * group (impact assessment factors) are recognised as elementary flows.
	 */
	default boolean isElementaryFlow() {
		var inGroup = getInputGroup();
		var outGroup = getOutputGroup();
		if (inGroup == null && outGroup == null)
			return true;
		return (inGroup != null && inGroup == 4)
				|| (outGroup != null && outGroup == 4);
	}

}
