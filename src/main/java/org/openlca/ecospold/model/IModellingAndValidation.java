package org.openlca.ecospold.model;

import java.util.List;

public interface IModellingAndValidation {

	IRepresentativeness getRepresentativeness();

	void setRepresentativeness(IRepresentativeness value);

	List<ISource> getSources();

	IValidation getValidation();

	void setValidation(IValidation value);

	List<Object> getAny();

}
