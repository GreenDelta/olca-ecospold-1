package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IModellingAndValidation;
import org.openlca.ecospold.model.IRepresentativeness;
import org.openlca.ecospold.model.ISource;
import org.openlca.ecospold.model.IValidation;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TModellingAndValidation", propOrder = { "representativeness",
		"source", "validation", "any" })
class ModellingAndValidation implements IModellingAndValidation {

	@XmlElement(required = true, type = Representativeness.class)
	protected IRepresentativeness representativeness;
	@XmlElement(required = true, type = Source.class)
	protected List<ISource> source;
	@XmlElement(type = Validation.class)
	protected IValidation validation;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@Override
	public IRepresentativeness getRepresentativeness() {
		return representativeness;
	}

	@Override
	public void setRepresentativeness(IRepresentativeness value) {
		this.representativeness = value;
	}

	@Override
	public List<ISource> getSources() {
		if (source == null) {
			source = new ArrayList<>();
		}
		return this.source;
	}

	@Override
	public IValidation getValidation() {
		return validation;
	}

	@Override
	public void setValidation(IValidation value) {
		this.validation = value;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
