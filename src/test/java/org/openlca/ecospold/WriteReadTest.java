package org.openlca.ecospold;

import org.junit.Test;
import org.openlca.ecospold.io.DataSet;
import org.openlca.ecospold.io.DataSetType;
import org.openlca.ecospold.io.EcoSpold;

import java.io.File;

public class WriteReadTest {

	@Test
	public void testProcess() {
		var target = new File("target/p.xml");
		var factory = DataSetType.PROCESS.getFactory();
		var ds = factory.createDataSet();
		var wrapper = new DataSet(ds, factory);
		var ref = factory.createReferenceFunction();
		ref.setName("a test");
		wrapper.setReferenceFunction(ref);
		var spold = factory.createEcoSpold();
		spold.getDataset().add(ds);
		EcoSpold.write(target, spold);
	}



}
