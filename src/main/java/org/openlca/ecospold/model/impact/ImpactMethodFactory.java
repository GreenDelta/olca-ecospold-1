package org.openlca.ecospold.model.impact;

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

	private final ObjectFactory f = new ObjectFactory();

	@Override
	public IEcoSpold createEcoSpold() {
		return f.createImpactEcoSpold();
	}

	@Override
	public IDataEntryBy createDataEntryBy() {
		return f.createImpactDataEntryBy();
	}

	@Override
	public IModellingAndValidation createModellingAndValidation() {
		return f.createImpactModellingAndValidation();
	}

	@Override
	public IAllocation createAllocation() {
		return f.createImpactAllocation();
	}

	@Override
	public ITechnology createTechnology() {
		return f.createImpactTechnology();
	}

	@Override
	public IPerson createPerson() {
		return f.createImpactPerson();
	}

	@Override
	public IExchange createExchange() {
		return f.createImpactFactor();
	}

	@Override
	public IReferenceFunction createReferenceFunction() {
		return f.createImpactReferenceFunction();
	}

	@Override
	public IProcessInformation createProcessInformation() {
		return f.createImpactProcessInformation();
	}

	@Override
	public IValidation createValidation() {
		return f.createImpactValidation();
	}

	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		return f.createImpactAdministrativeInformation();
	}

	@Override
	public IDataGeneratorAndPublication createDataGeneratorAndPublication() {
		return f.createImpactDataGeneratorAndPublication();
	}

	@Override
	public IDataSet createDataSet() {
		return f.createImpactDataSet();
	}

	@Override
	public IDataSetInformation createDataSetInformation() {
		return f.createImpactDataSetInformation();
	}

	@Override
	public ISource createSource() {
		return f.createImpactSource();
	}

	@Override
	public IMetaInformation createMetaInformation() {
		return f.createImpactMetaInformation();
	}

	@Override
	public ITimePeriod createTimePeriod() {
		return f.createImpactTimePeriod();
	}

	@Override
	public IRepresentativeness createRepresentativeness() {
		return f.createImpactRepresentativeness();
	}

	@Override
	public IGeography createGeography() {
		return f.createImpactGeography();
	}

	@Override
	public IFlowData createFlowData() {
		return f.createImpactFactors();
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
