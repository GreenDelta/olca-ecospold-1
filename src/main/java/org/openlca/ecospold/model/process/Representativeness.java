
package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IRepresentativeness;

import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRepresentativeness")
class Representativeness
    implements Serializable, IRepresentativeness
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "percent")
    protected Float percent;
    @XmlAttribute(name = "productionVolume")
    protected String productionVolume;
    @XmlAttribute(name = "samplingProcedure")
    protected String samplingProcedure;
    @XmlAttribute(name = "extrapolations")
    protected String extrapolations;
    @XmlAttribute(name = "uncertaintyAdjustments")
    protected String uncertaintyAdjustments;

    @Override
	public Float getPercent() {
        return percent;
    }

    @Override
	public void setPercent(Float value) {
        this.percent = value;
    }

    @Override
	public String getProductionVolume() {
        return productionVolume;
    }

    @Override
	public void setProductionVolume(String value) {
        this.productionVolume = value;
    }

    @Override
	public String getSamplingProcedure() {
        return samplingProcedure;
    }

    @Override
	public void setSamplingProcedure(String value) {
        this.samplingProcedure = value;
    }

    @Override
	public String getExtrapolations() {
        return extrapolations;
    }

    @Override
	public void setExtrapolations(String value) {
        this.extrapolations = value;
    }

    @Override
	public String getUncertaintyAdjustments() {
        return uncertaintyAdjustments;
    }

    @Override
	public void setUncertaintyAdjustments(String value) {
        this.uncertaintyAdjustments = value;
    }

}
