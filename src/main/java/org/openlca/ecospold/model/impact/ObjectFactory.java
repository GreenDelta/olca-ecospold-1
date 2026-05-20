package org.openlca.ecospold.model.impact;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

@XmlRegistry
class ObjectFactory {

	private final static QName _EcoSpold_QNAME = new QName(
			"http://www.EcoInvent.org/EcoSpold01Impact", "ecoSpold");

	ObjectFactory() {
	}

	public ImpactEcoSpold createImpactEcoSpold() {
		return new ImpactEcoSpold();
	}

	public ImpactDataEntryBy createImpactDataEntryBy() {
		return new ImpactDataEntryBy();
	}

	public ImpactModellingAndValidation createImpactModellingAndValidation() {
		return new ImpactModellingAndValidation();
	}

	public ImpactAllocation createImpactAllocation() {
		return new ImpactAllocation();
	}

	public ImpactTechnology createImpactTechnology() {
		return new ImpactTechnology();
	}

	public ImpactPerson createImpactPerson() {
		return new ImpactPerson();
	}

	public ImpactFactor createImpactFactor() {
		return new ImpactFactor();
	}

	public ImpactReferenceFunction createImpactReferenceFunction() {
		return new ImpactReferenceFunction();
	}

	public ImpactProcessInformation createImpactProcessInformation() {
		return new ImpactProcessInformation();
	}

	public ImpactValidation createImpactValidation() {
		return new ImpactValidation();
	}

	public ImpactAdministrativeInformation createImpactAdministrativeInformation() {
		return new ImpactAdministrativeInformation();
	}

	public ImpactDataGeneratorAndPublication createImpactDataGeneratorAndPublication() {
		return new ImpactDataGeneratorAndPublication();
	}

	public ImpactDataSet createImpactDataSet() {
		return new ImpactDataSet();
	}

	public ImpactDataSetInformation createImpactDataSetInformation() {
		return new ImpactDataSetInformation();
	}

	public ImpactSource createImpactSource() {
		return new ImpactSource();
	}

	public ImpactMetaInformation createImpactMetaInformation() {
		return new ImpactMetaInformation();
	}

	public ImpactTimePeriod createImpactTimePeriod() {
		return new ImpactTimePeriod();
	}

	public ImpactRepresentativeness createImpactRepresentativeness() {
		return new ImpactRepresentativeness();
	}

	public ImpactGeography createImpactGeography() {
		return new ImpactGeography();
	}

	public ImpactFactors createImpactFactors() {
		return new ImpactFactors();
	}

	@XmlElementDecl(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", name = "ecoSpold")
	public JAXBElement<ImpactEcoSpold> createEcoSpold(ImpactEcoSpold value) {
		return new JAXBElement<>(_EcoSpold_QNAME, ImpactEcoSpold.class, null,
				value);
	}

}
