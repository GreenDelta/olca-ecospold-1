package org.openlca.ecospold.model.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IAdministrativeInformation;
import org.openlca.ecospold.model.IDataEntryBy;
import org.openlca.ecospold.model.IDataGeneratorAndPublication;
import org.openlca.ecospold.model.IPerson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdministrativeInformation", propOrder = { "dataEntryBy",
		"dataGeneratorAndPublication", "person", "any" })
class ImpactAdministrativeInformation implements Serializable,
		IAdministrativeInformation {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ImpactDataEntryBy.class)
	protected IDataEntryBy dataEntryBy;
	@XmlElement(required = true, type = ImpactDataGeneratorAndPublication.class)
	protected IDataGeneratorAndPublication dataGeneratorAndPublication;
	@XmlElement(required = true, type = ImpactPerson.class)
	protected List<IPerson> person;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@Override
	public IDataEntryBy getDataEntryBy() {
		return dataEntryBy;
	}

	@Override
	public void setDataEntryBy(IDataEntryBy value) {
		this.dataEntryBy = value;
	}

	@Override
	public IDataGeneratorAndPublication getDataGeneratorAndPublication() {
		return dataGeneratorAndPublication;
	}

	@Override
	public void setDataGeneratorAndPublication(
			IDataGeneratorAndPublication value) {
		this.dataGeneratorAndPublication = value;
	}

	@Override
	public List<IPerson> getPersons() {
		if (person == null) {
			person = new ArrayList<>();
		}
		return this.person;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
