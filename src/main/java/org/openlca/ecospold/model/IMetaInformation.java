package org.openlca.ecospold.model;

import java.util.List;

public interface IMetaInformation {

	IProcessInformation getProcessInformation();

	void setProcessInformation(IProcessInformation value);

	IModellingAndValidation getModellingAndValidation();

	void setModellingAndValidation(IModellingAndValidation value);

	IAdministrativeInformation getAdministrativeInformation();

	void setAdministrativeInformation(
			IAdministrativeInformation value);

	List<Object> getAny();

}
