
package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.openlca.ecospold.model.IValidation;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TValidation")
class Validation implements IValidation {

	@XmlAttribute(name = "proofReadingDetails", required = true)
	protected String proofReadingDetails;
	@XmlAttribute(name = "proofReadingValidator", required = true)
	protected int proofReadingValidator;
	@XmlAttribute(name = "otherDetails")
	protected String otherDetails;

	@Override
	public String getProofReadingDetails() {
		return proofReadingDetails;
	}

	@Override
	public void setProofReadingDetails(String value) {
		this.proofReadingDetails = value;
	}

	@Override
	public int getProofReadingValidator() {
		return proofReadingValidator;
	}

	@Override
	public void setProofReadingValidator(int value) {
		this.proofReadingValidator = value;
	}

	@Override
	public String getOtherDetails() {
		return otherDetails;
	}

	@Override
	public void setOtherDetails(String value) {
		this.otherDetails = value;
	}

}
