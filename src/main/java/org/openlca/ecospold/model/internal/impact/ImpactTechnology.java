
package org.openlca.ecospold.model.internal.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.ITechnology;

import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTechnology")
class ImpactTechnology
    implements Serializable, ITechnology
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "text")
    protected String text;

    @Override
	public String getText() {
        return text;
    }

    @Override
	public void setText(String value) {
        this.text = value;
    }

}
