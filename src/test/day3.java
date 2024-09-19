package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(groups= {"Smoke"})
	public void WebHomeLoan()
	{
		// Selenium
		System.out.println("WEB HOME LOGIN");
	}
	
	@Parameters({"URL","APIKey/Username"})
	@Test
	public void MobileHomeLoan(String urlname, String apiname)
	{
		// Appium
		System.out.println("MOBILE HOME LOGIN");
		System.out.println(urlname);
		System.out.println(apiname);
	}
	
	@Test
	public void APIHomeLoan()
	{
		// REST API
		System.out.println("API HOME LOGIN");
	}

}
