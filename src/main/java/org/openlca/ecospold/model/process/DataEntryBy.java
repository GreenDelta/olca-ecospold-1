
package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.openlca.ecospold.model.IDataEntryBy;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataEntryBy")
class DataEntryBy implements IDataEntryBy {

	@XmlAttribute(name = "person", required = true)
	protected int person;
	@XmlAttribute(name = "qualityNetwork")
	protected Long qualityNetwork;

	@Override
	public int getPerson() {
		return person;
	}

	@Override
	public void setPerson(int value) {
		this.person = value;
	}

	@Override
	public Long getQualityNetwork() {
		return qualityNetwork;
	}

	@Override
	public void setQualityNetwork(Long value) {
		this.qualityNetwork = value;
	}

}
