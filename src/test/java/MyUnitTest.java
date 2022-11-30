
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyUnitTest {

	MyUnit myunit = new MyUnit();
	@Test
	public void testConcatenate()
	{
		
		String result = myunit.concatenate("Ankit", "Kumar");
		assertEquals("AnkitKumar", result);
	}
	
	@Test
	public void testAdd()
	{
		
		int result = myunit.add(12, 10);
		assertEquals(22, result);
	}
	
	@Test
	public void testSubtract()
	{
		
		int result = myunit.subtract(4,2);
		assertEquals(2, result);
	}
	
	@Test
	public void testDivide()
	{
		int a = 10,b=0;
		if(b==0)
		{
			
			try
			{
				throw new ArithmeticException("DIVIDE BY ZERO");
			}	
			catch(ArithmeticException e)
			{			
				System.out.println(e);
			}
		}
		else
		{
			int result = myunit.divide(a, b);
			System.out.println(result);			
			assertEquals(2,result);
		}
	}
	@Test
	public void validName()
	{
		String name = "Ankit";
		String result =myunit.getName(name);
		assertEquals(name, result);
	}
	
	@Test
	public void invalidName()
	{
		String name ="34uqnkam";
		String result = myunit.getName(name);
		assertEquals("Invalid Name", result);
	}
	
	@Test
	public void testDivideByZero()
	{
		System.out.println("hii");
		try
		{
			int result = myunit.divide(12,0);
			System.out.println(result);
//			assertThrows(ArithmeticException.e, null);
		}
		catch(ArithmeticException e)
		{}
	}

	@Test
	public void validFullName()
	{
		String fName = "ANKIT";
		String mName = "";
		String lName = "vishwakarma";
		String result = myunit.getFullName(fName, mName, lName);
		assertEquals(fName+" "+mName+" "+lName, result);
	}
	
	@Test
	public void invalidFullName()
	{
		String fName = "43763";
		String mName = "";
		String lName = "VISHW";
		String result = myunit.getFullName(fName, mName, lName);
		assertEquals("INVALID NAME", result);
	}
	@Test
	public void emptyName()
	{
		String fName = "";
		String mName = "";
		String lName = "";
		String result = myunit.getFullName(fName, mName, lName);
		assertEquals("EMPTY NAME", result);
	}
	@Test
	public void emptyFirstName()
	{
		String fName = "";
		String mName = "dSLKnlsd";
		String lName = "VSOBSKJ";
		String result = myunit.getFullName(fName, mName, lName);
		assertEquals("FIRST NAME MISSING", result);
	}
}
