
package org.openlca.ecospold.model.internal.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IGeography;

import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGeography")
class ImpactGeography
    implements Serializable, IGeography
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "location", required = true)
    protected String location;
    @XmlAttribute(name = "text")
    protected String text;

    @Override
	public String getLocation() {
        return location;
    }

    @Override
	public void setLocation(String value) {
        this.location = value;
    }

    @Override
	public String getText() {
        return text;
    }

    @Override
	public void setText(String value) {
        this.text = value;
    }

}
