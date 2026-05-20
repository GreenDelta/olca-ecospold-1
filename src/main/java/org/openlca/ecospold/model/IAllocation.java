package org.openlca.ecospold.model;

import java.util.List;

public interface IAllocation {

	List<Integer> getReferenceToInputOutput();

	int getReferenceToCoProduct();

	void setReferenceToCoProduct(int value);

	int getAllocationMethod();

	void setAllocationMethod(Integer value);

	float getFraction();

	void setFraction(float value);

	String getExplanations();

	void setExplanations(String value);

}
