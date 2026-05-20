package org.openlca.ecospold.model.internal.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IAdministrativeInformation;
import org.openlca.ecospold.model.IMetaInformation;
import org.openlca.ecospold.model.IModellingAndValidation;
import org.openlca.ecospold.model.IProcessInformation;
import org.w3c.dom.Element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMetaInformation", propOrder = { "processInformation",
		"modellingAndValidation", "administrativeInformation", "any" })
class MetaInformation implements Serializable, IMetaInformation {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ProcessInformation.class)
	protected IProcessInformation processInformation;
	@XmlElement(required = true, type = ModellingAndValidation.class)
	protected IModellingAndValidation modellingAndValidation;
	@XmlElement(required = true, type = AdministrativeInformation.class)
	protected IAdministrativeInformation administrativeInformation;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@Override
	public IProcessInformation getProcessInformation() {
		return processInformation;
	}

	@Override
	public void setProcessInformation(IProcessInformation value) {
		this.processInformation = value;
	}

	@Override
	public IModellingAndValidation getModellingAndValidation() {
		return modellingAndValidation;
	}

	@Override
	public void setModellingAndValidation(IModellingAndValidation value) {
		this.modellingAndValidation = value;
	}

	@Override
	public IAdministrativeInformation getAdministrativeInformation() {
		return administrativeInformation;
	}

	@Override
	public void setAdministrativeInformation(IAdministrativeInformation value) {
		this.administrativeInformation = value;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
