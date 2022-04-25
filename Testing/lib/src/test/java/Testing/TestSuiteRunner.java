package Testing;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//import Testing.ArithmeticOperation;


	@RunWith(Suite.class)
	@SuiteClasses({ArithmeticOperationTest.class,EBillTest.class})
	public class TestSuiteRunner {

	}
