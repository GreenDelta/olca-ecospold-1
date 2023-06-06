package org.openlca.ecospold.internal.process;

import org.openlca.ecospold.*;

public class ProcessFactory implements IEcoSpoldFactory {

	private ObjectFactory objectFactory = new ObjectFactory();

	public final static ProcessFactory INSTANCE = new ProcessFactory();

	@Override
	public IEcoSpold createEcoSpold() {
		return objectFactory.createEcoSpold();
	}

	@Override
	public IDataEntryBy createDataEntryBy() {
		return objectFactory.createDataEntryBy();
	}

	@Override
	public IModellingAndValidation createModellingAndValidation() {
		return objectFactory.createModellingAndValidation();
	}

	@Override
	public IAllocation createAllocation() {
		return objectFactory.createAllocation();
	}

	@Override
	public ITechnology createTechnology() {
		return objectFactory.createTechnology();
	}

	@Override
	public IPerson createPerson() {
		return objectFactory.createPerson();
	}

	@Override
	public IExchange createExchange() {
		return objectFactory.createExchange();
	}

	@Override
	public IReferenceFunction createReferenceFunction() {
		return objectFactory.createReferenceFunction();
	}

	@Override
	public IProcessInformation createProcessInformation() {
		return objectFactory.createProcessInformation();
	}

	@Override
	public IValidation createValidation() {
		return objectFactory.createValidation();
	}

	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		return objectFactory.createAdministrativeInformation();
	}

	@Override
	public IDataGeneratorAndPublication createDataGeneratorAndPublication() {
		return objectFactory.createDataGeneratorAndPublication();
	}

	@Override
	public IDataSet createDataSet() {
		return objectFactory.createDataSet();
	}

	@Override
	public IDataSetInformation createDataSetInformation() {
		return objectFactory.createDataSetInformation();
	}

	@Override
	public ISource createSource() {
		return objectFactory.createSource();
	}

	@Override
	public IMetaInformation createMetaInformation() {
		return objectFactory.createMetaInformation();
	}

	@Override
	public ITimePeriod createTimePeriod() {
		return objectFactory.createTimePeriod();
	}

	@Override
	public IRepresentativeness createRepresentativeness() {
		return objectFactory.createRepresentativeness();
	}

	@Override
	public IGeography createGeography() {
		return objectFactory.createGeography();
	}

	@Override
	public IFlowData createFlowData() {
		return objectFactory.createFlowData();
	}

	@Override
	public ICountryCode getCountryCode(String code) {
		if (code == null)
			return null;
		for (CountryCode countryCode : CountryCode.values()) {
			if (countryCode.name().equalsIgnoreCase(code))
				return countryCode;
		}
		return null;
	}

	@Override
	public ILanguageCode getLanguageCode(String code) {
		return LanguageCode.fromValue(code);
	}

}
