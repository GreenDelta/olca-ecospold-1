package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IDataSet;
import org.openlca.ecospold.model.IEcoSpold;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEcoSpold", propOrder = { "dataset", "any" })
public class ProcessEcoSpold implements Serializable, IEcoSpold {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = DataSet.class)
	protected List<IDataSet> dataset;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "validationId")
	protected BigInteger validationId;
	@XmlAttribute(name = "validationStatus")
	protected String validationStatus;

	@Override
	public List<IDataSet> getDataset() {
		if (dataset == null) {
			dataset = new ArrayList<>();
		}
		return this.dataset;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	@Override
	public BigInteger getValidationId() {
		return validationId;
	}

	@Override
	public void setValidationId(BigInteger value) {
		this.validationId = value;
	}

	@Override
	public String getValidationStatus() {
		return validationStatus;
	}

	@Override
	public void setValidationStatus(String value) {
		this.validationStatus = value;
	}

}
