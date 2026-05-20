package org.openlca.ecospold.model.internal.impact;

import org.openlca.ecospold.model.IAdministrativeInformation;
import org.openlca.ecospold.model.IAllocation;
import org.openlca.ecospold.model.ICountryCode;
import org.openlca.ecospold.model.IDataEntryBy;
import org.openlca.ecospold.model.IDataGeneratorAndPublication;
import org.openlca.ecospold.model.IDataSet;
import org.openlca.ecospold.model.IDataSetInformation;
import org.openlca.ecospold.model.IEcoSpold;
import org.openlca.ecospold.model.IEcoSpoldFactory;
import org.openlca.ecospold.model.IExchange;
import org.openlca.ecospold.model.IFlowData;
import org.openlca.ecospold.model.IGeography;
import org.openlca.ecospold.model.ILanguageCode;
import org.openlca.ecospold.model.IMetaInformation;
import org.openlca.ecospold.model.IModellingAndValidation;
import org.openlca.ecospold.model.IPerson;
import org.openlca.ecospold.model.IProcessInformation;
import org.openlca.ecospold.model.IReferenceFunction;
import org.openlca.ecospold.model.IRepresentativeness;
import org.openlca.ecospold.model.ISource;
import org.openlca.ecospold.model.ITechnology;
import org.openlca.ecospold.model.ITimePeriod;
import org.openlca.ecospold.model.IValidation;

public class ImpactMethodFactory implements IEcoSpoldFactory {

	private ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public IEcoSpold createEcoSpold() {
		return objectFactory.createImpactEcoSpold();
	}

	@Override
	public IDataEntryBy createDataEntryBy() {
		return objectFactory.createImpactDataEntryBy();
	}

	@Override
	public IModellingAndValidation createModellingAndValidation() {
		return objectFactory.createImpactModellingAndValidation();
	}

	@Override
	public IAllocation createAllocation() {
		return objectFactory.createImpactAllocation();
	}

	@Override
	public ITechnology createTechnology() {
		return objectFactory.createImpactTechnology();
	}

	@Override
	public IPerson createPerson() {
		return objectFactory.createImpactPerson();
	}

	@Override
	public IExchange createExchange() {
		return objectFactory.createImpactFactor();
	}

	@Override
	public IReferenceFunction createReferenceFunction() {
		return objectFactory.createImpactReferenceFunction();
	}

	@Override
	public IProcessInformation createProcessInformation() {
		return objectFactory.createImpactProcessInformation();
	}

	@Override
	public IValidation createValidation() {
		return objectFactory.createImpactValidation();
	}

	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		return objectFactory.createImpactAdministrativeInformation();
	}

	@Override
	public IDataGeneratorAndPublication createDataGeneratorAndPublication() {
		return objectFactory.createImpactDataGeneratorAndPublication();
	}

	@Override
	public IDataSet createDataSet() {
		return objectFactory.createImpactDataSet();
	}

	@Override
	public IDataSetInformation createDataSetInformation() {
		return objectFactory.createImpactDataSetInformation();
	}

	@Override
	public ISource createSource() {
		return objectFactory.createImpactSource();
	}

	@Override
	public IMetaInformation createMetaInformation() {
		return objectFactory.createImpactMetaInformation();
	}

	@Override
	public ITimePeriod createTimePeriod() {
		return objectFactory.createImpactTimePeriod();
	}

	@Override
	public IRepresentativeness createRepresentativeness() {
		return objectFactory.createImpactRepresentativeness();
	}

	@Override
	public IGeography createGeography() {
		return objectFactory.createImpactGeography();
	}

	@Override
	public IFlowData createFlowData() {
		return objectFactory.createImpactFactors();
	}

	@Override
	public ICountryCode getCountryCode(String code) {
		if (code == null)
			return null;
		for (ImpactCountryCode countryCode : ImpactCountryCode.values()) {
			if (countryCode.name().equalsIgnoreCase(code))
				return countryCode;
		}
		return null;
	}

	@Override
	public ILanguageCode getLanguageCode(String code) {
		return ImpactLanguageCode.fromValue(code);
	}

}
