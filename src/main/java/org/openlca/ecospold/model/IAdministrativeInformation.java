package org.openlca.ecospold.model;
import java.util.List;

public interface IAdministrativeInformation {

	IDataEntryBy getDataEntryBy();

	void setDataEntryBy(IDataEntryBy value);

	IDataGeneratorAndPublication getDataGeneratorAndPublication();

	void setDataGeneratorAndPublication(IDataGeneratorAndPublication value);

	List<IPerson> getPersons();

	List<Object> getAny();

}
