package org.openlca.ecospold;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openlca.ecospold.io.DataSet;
import org.openlca.ecospold.io.DataSetType;
import org.openlca.ecospold.io.EcoSpold;

import java.nio.file.Files;

public class WriteReadTest {

	@Test
	public void testProcess() throws Exception {
		with(DataSetType.PROCESS.getFactory());
	}

	@Test
	public void testImpactMethod() throws Exception {
		with(DataSetType.IMPACT_METHOD.getFactory());
	}

	private void with(IEcoSpoldFactory factory) throws Exception {
		var ds = factory.createDataSet();
		var wrapper = new DataSet(ds, factory);
		var ref = factory.createReferenceFunction();
		ref.setName("a test");
		wrapper.setReferenceFunction(ref);
		var spold = factory.createEcoSpold();
		spold.getDataset().add(ds);

		var file = Files.createTempFile(
			"_olca_test", ".xml").toFile();
		EcoSpold.write(file, spold);

		var name = EcoSpold.read(file)
			.orElseThrow()
			.getDataset()
			.get(0)
			.getMetaInformation()
			.getProcessInformation()
			.getReferenceFunction()
			.getName();
		assertEquals("a test", name);

		Files.delete(file.toPath());
	}
}
