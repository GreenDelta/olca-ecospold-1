package org.openlca.ecospold;

public interface IEcoSpoldFactory {

	IEcoSpold createEcoSpold();

	IDataEntryBy createDataEntryBy();

	IModellingAndValidation createModellingAndValidation();

	IAllocation createAllocation();

	ITechnology createTechnology();

	IPerson createPerson();

	IExchange createExchange();

	IReferenceFunction createReferenceFunction();

	IProcessInformation createProcessInformation();

	IValidation createValidation();

	IAdministrativeInformation createAdministrativeInformation();

	IDataGeneratorAndPublication createDataGeneratorAndPublication();

	IDataSet createDataSet();

	IDataSetInformation createDataSetInformation();

	ISource createSource();

	IMetaInformation createMetaInformation();

	ITimePeriod createTimePeriod();

	IRepresentativeness createRepresentativeness();

	IGeography createGeography();

	IFlowData createFlowData();

	/**
	 * Returns an instance of country code for the given string if this country
	 * code is defined. Otherwise, null is returned.
	 */
	ICountryCode getCountryCode(String code);

	/**
	 * Returns an instance of language code for the given string if this
	 * language code is defined. Otherwise null is returned.
	 */
	ILanguageCode getLanguageCode(String code);
}
