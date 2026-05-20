package org.openlca.ecospold.model.process;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

@XmlRegistry
class ObjectFactory {

	private final static QName _EcoSpold_QNAME = new QName(
			"http://www.EcoInvent.org/EcoSpold01", "ecoSpold");

	ObjectFactory() {
	}

	public ProcessEcoSpold createEcoSpold() {
		return new ProcessEcoSpold();
	}

	public DataEntryBy createDataEntryBy() {
		return new DataEntryBy();
	}

	public ModellingAndValidation createModellingAndValidation() {
		return new ModellingAndValidation();
	}

	public Allocation createAllocation() {
		return new Allocation();
	}

	public Technology createTechnology() {
		return new Technology();
	}

	public Person createPerson() {
		return new Person();
	}

	public Exchange createExchange() {
		return new Exchange();
	}

	public ReferenceFunction createReferenceFunction() {
		return new ReferenceFunction();
	}

	public ProcessInformation createProcessInformation() {
		return new ProcessInformation();
	}

	public Validation createValidation() {
		return new Validation();
	}

	public AdministrativeInformation createAdministrativeInformation() {
		return new AdministrativeInformation();
	}

	public DataGeneratorAndPublication createDataGeneratorAndPublication() {
		return new DataGeneratorAndPublication();
	}

	public DataSet createDataSet() {
		return new DataSet();
	}

	public DataSetInformation createDataSetInformation() {
		return new DataSetInformation();
	}

	public Source createSource() {
		return new Source();
	}

	public MetaInformation createMetaInformation() {
		return new MetaInformation();
	}

	public TimePeriod createTimePeriod() {
		return new TimePeriod();
	}

	public Representativeness createRepresentativeness() {
		return new Representativeness();
	}

	public Geography createGeography() {
		return new Geography();
	}

	public FlowData createFlowData() {
		return new FlowData();
	}

	@XmlElementDecl(namespace = "http://www.EcoInvent.org/EcoSpold01", name = "ecoSpold")
	public JAXBElement<ProcessEcoSpold> createEcoSpold(ProcessEcoSpold value) {
		return new JAXBElement<>(_EcoSpold_QNAME, ProcessEcoSpold.class, null, value);
	}

}
