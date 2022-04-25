package Testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import Testing.EBill;

public class EBillTest {
	EBill e;
		
	@Test
	public void calculateBillAmountTest_15() {
		e=new EBill(15);
		assertEquals(39.00,e.calculateBillAmount(),0.01);	
	}
	
	@Test
	public void calculateBillAmountTest_67() {
		e=new EBill(67);
		assertEquals(185.25,e.calculateBillAmount(),0.01);
	}
	
	@Test
	public void calculateBillAmountTest_184() {
		e=new EBill(184);
		assertEquals(734.34,e.calculateBillAmount(),0.01);
	}
	
	@Test
	public void calculateBillAmountTest_596() {
		e=new EBill(596);
		assertEquals(3887.5,e.calculateBillAmount(),0.0);
	}
	
	@Test
	public void calculateBillAmountTest_0() {
		e=new EBill(0);
		assertEquals(0.0,e.calculateBillAmount(),0.0);
	}
}
