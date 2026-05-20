package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import java.util.List;

public interface IAdministrativeInformation {

	public abstract IDataEntryBy getDataEntryBy();

	public abstract void setDataEntryBy(IDataEntryBy value);

	public abstract IDataGeneratorAndPublication getDataGeneratorAndPublication();

	public abstract void setDataGeneratorAndPublication(
			IDataGeneratorAndPublication value);

	public abstract List<IPerson> getPersons();

	public abstract List<Object> getAny();

}
