package colin.calculation;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import colin.models.test.CompleteTestCase;
import colin.test.CsvTestLoader;

public class CalculationTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		try {
			CsvTestLoader c = new CsvTestLoader();
			Stack<CompleteTestCase> test = c.getTestCases();
			for(CompleteTestCase t:test){
				t.getData();
				t.getTest();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	

}
