package org.openlca.ecospold.model;

public interface IRepresentativeness {

	Float getPercent();

	void setPercent(Float value);

	String getProductionVolume();

	void setProductionVolume(String value);

	String getSamplingProcedure();

	void setSamplingProcedure(String value);

	String getExtrapolations();

	void setExtrapolations(String value);

	String getUncertaintyAdjustments();

	void setUncertaintyAdjustments(String value);

}
