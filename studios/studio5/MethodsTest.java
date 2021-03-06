package studio5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {

	@Test
	public void testSum() {
		//
		// Try something simple
		//
		assertEquals(-8, Methods.sum(-4, -4));
		//
		// Try something fancier
		//
		for (int i=0; i < 10; ++i) {
			assertEquals(i+i, Methods.sum(i, i));
		}
	}
	
	@Test
	public void thisTestShouldFail() {
		assertEquals(1, Methods.mpy(1,1));
		assertEquals(10, Methods.mpy(2, 5));
	}
	
	@Test
	public void testPig() {
		assertEquals("omputercay", Methods.pig("computer"));
		assertEquals("unfay", Methods.pig("fun"));
	}
	
	@Test
	public void testArraySum() {
		assertEquals(6.0, Methods.sumArray(new double[] { 1, 2, 3}), 0.1);
	}
	
	@Test
	public void testAvg3() {
		assertEquals(2.0, Methods.avg3(1,2,3), 0.1);		
	}
	
	@Test
	public void testAverage() {
		assertEquals(0.5, Methods.average(new double[] { 0, 1 }), 0.1);
	}

}
