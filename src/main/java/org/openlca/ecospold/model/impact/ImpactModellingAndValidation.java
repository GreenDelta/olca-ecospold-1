package org.openlca.ecospold.model.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IModellingAndValidation;
import org.openlca.ecospold.model.IRepresentativeness;
import org.openlca.ecospold.model.ISource;
import org.openlca.ecospold.model.IValidation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TModellingAndValidation", propOrder = { "source",
		"validation", "any" })
class ImpactModellingAndValidation implements Serializable,
		IModellingAndValidation {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ImpactSource.class)
	protected List<ISource> source;
	@XmlElement(type = ImpactValidation.class)
	protected IValidation validation;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

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

	@Override
	public IRepresentativeness getRepresentativeness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRepresentativeness(IRepresentativeness value) {
		// TODO Auto-generated method stub

	}

}
