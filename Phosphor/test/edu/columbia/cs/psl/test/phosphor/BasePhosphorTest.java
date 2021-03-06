package edu.columbia.cs.psl.test.phosphor;

import edu.columbia.cs.psl.phosphor.PreMain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class BasePhosphorTest {
	@Before
	public void clearErrorFlag(){
		PreMain.INSTRUMENTATION_EXCEPTION_OCURRED = false;
	}
	@After
	public void checkForError(){
		if(PreMain.INSTRUMENTATION_EXCEPTION_OCURRED)
			Assert.fail("Instrumentation error occurred");
	}
}
