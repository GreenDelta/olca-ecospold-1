
package org.openlca.ecospold.model.internal.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IDataEntryBy;

import java.io.Serializable;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataEntryBy")
class DataEntryBy
    implements Serializable, IDataEntryBy
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "person", required = true)
    protected int person;
    @XmlAttribute(name = "qualityNetwork")
    protected BigInteger qualityNetwork;

    @Override
	public int getPerson() {
        return person;
    }

    @Override
	public void setPerson(int value) {
        this.person = value;
    }

    @Override
	public BigInteger getQualityNetwork() {
        return qualityNetwork;
    }

    @Override
	public void setQualityNetwork(BigInteger value) {
        this.qualityNetwork = value;
    }

}
