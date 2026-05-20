package org.openlca.ecospold.model;

import java.util.List;

public interface IAllocation {

	public abstract List<Integer> getReferenceToInputOutput();

	public abstract int getReferenceToCoProduct();

	public abstract void setReferenceToCoProduct(int value);

	public abstract int getAllocationMethod();

	public abstract void setAllocationMethod(Integer value);

	public abstract float getFraction();

	public abstract void setFraction(float value);

	public abstract String getExplanations();

	public abstract void setExplanations(String value);

}
