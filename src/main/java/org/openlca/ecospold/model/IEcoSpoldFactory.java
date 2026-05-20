package org.openlca.ecospold.model;

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

	ICountryCode getCountryCode(String code);

	ILanguageCode getLanguageCode(String code);
}
