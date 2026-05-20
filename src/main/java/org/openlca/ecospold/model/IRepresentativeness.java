package org.openlca.ecospold.model;

public interface IRepresentativeness {

	public abstract Float getPercent();

	public abstract void setPercent(Float value);

	public abstract String getProductionVolume();

	public abstract void setProductionVolume(String value);

	public abstract String getSamplingProcedure();

	public abstract void setSamplingProcedure(String value);

	public abstract String getExtrapolations();

	public abstract void setExtrapolations(String value);

	public abstract String getUncertaintyAdjustments();

	public abstract void setUncertaintyAdjustments(String value);

}
