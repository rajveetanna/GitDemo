package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test(enabled=false)
	public void SecondTest()
	{
		System.out.println("Bye");
	}
	
	@Test
	public void ThirdTest()
	{
		System.out.println("Hello Third Test");
		Assert.assertTrue(false);
	}

}
