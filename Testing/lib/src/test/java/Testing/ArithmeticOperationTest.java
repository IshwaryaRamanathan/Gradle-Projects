package Testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import Testing.ArithmeticOperation;

public class ArithmeticOperationTest {
	ArithmeticOperation obj;
	
	@Test
	public void addTest() {
		obj=new ArithmeticOperation(10,20);
		assertEquals(30,obj.add());
	}
}
