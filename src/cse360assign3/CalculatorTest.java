package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/** CalculatorTest contains the JUnit tests for the Calculator.java
 *  
 *  @author[Tyler Wengrzyn]
 *  
 *  @version[2/19/16]
 *  
 *  */

public class CalculatorTest 
{
	
	/** myCalculator is the calculator being used to call the commands*/
	Calculator myCalculator = new Calculator();
	
	/** testCalculator checks that Calculator doesn't return a NULL value*/
	@Test
	public void testCalculator() 
	{
		assertNotNull(myCalculator);
	}
	
	/**testAdd tests the add command*/
	@Test
	public void testAdd() 
	{
		myCalculator.add(1);
		myCalculator.add(2);
		myCalculator.add(3);
		myCalculator.add(4);
		assertEquals(10, myCalculator.getTotal());
		fail("Not yet implemented");
	}
	
	/**testSubtract tests the subtract command*/
	@Test
	public void testSubtract() 
	{
		myCalculator.subtract(1);
		myCalculator.subtract(2);
		myCalculator.subtract(3);
		myCalculator.subtract(4);
		assertEquals(-10, myCalculator.getTotal());
		fail("Not yet implemented");
	}
	
	/**testMultiply tests the multiply command*/
	@Test
	public void testMultiply() 
	{
		myCalculator.add(1);
		myCalculator.multiply(2);
		myCalculator.multiply(3);
		myCalculator.multiply(4);
		assertEquals(24, myCalculator.getTotal());
		fail("Not yet implemented");
	}
	
	/**testDivide tests the divide command*/
	@Test
	public void testDivide() 
	{
		myCalculator.add(1);
		myCalculator.multiply(2);
		myCalculator.multiply(3);
		myCalculator.multiply(4);
		myCalculator.divide(6);
		assertEquals(4, myCalculator.getTotal());
		fail("Not yet implemented");
	}
	
	/**testGetHistory tests the getHistory command*/
	@Test
	public void testGetHistory() 
	{
		myCalculator.add(2);
		myCalculator.subtract(1);
		myCalculator.multiply(6);
		myCalculator.divide(3);
		assertEquals("0 + 2 - 1 * 6 / 3", myCalculator.getHistory());
		fail("Not yet implemented");
	}
	
	/**testGetTotal tests the getTotal command*/
	@Test
	public void testGetTotal() 
	{
		myCalculator.add(2);
		myCalculator.subtract(1);
		myCalculator.multiply(6);
		myCalculator.divide(3);
		assertEquals(2, myCalculator.getTotal());
		fail("Not yet implemented");
	}

}
