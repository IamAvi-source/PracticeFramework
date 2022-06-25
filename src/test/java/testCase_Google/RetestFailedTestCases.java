package testCase_Google;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RetestFailedTestCases {
	
	
	@Test
	public void hi()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void hello()
	{
		Assert.assertEquals(true, true);
	}

}
