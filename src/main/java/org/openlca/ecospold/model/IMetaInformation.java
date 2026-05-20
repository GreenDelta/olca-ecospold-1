package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import java.util.List;

public interface IMetaInformation {

	public abstract IProcessInformation getProcessInformation();

	public abstract void setProcessInformation(IProcessInformation value);

	public abstract IModellingAndValidation getModellingAndValidation();

	public abstract void setModellingAndValidation(IModellingAndValidation value);

	public abstract IAdministrativeInformation getAdministrativeInformation();

	public abstract void setAdministrativeInformation(
			IAdministrativeInformation value);

	public abstract List<Object> getAny();

}
