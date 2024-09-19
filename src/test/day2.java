package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeClass()
	public void bfClass() {
		System.out.println("Before executing any methods in a class");
	}
	
	@AfterClass()
	public void afClass() {
		System.out.println("After executing all methods in a class");
	}

	@AfterTest()
	public void LastExecution() {
		System.out.println("I will execute last");
	}

	@Test(groups= {"Smoke"})
	public void WebCarLoan() {
		// Selenium
		System.out.println("WEB LOGIN");
	}

	@Test(timeOut=4000)
	public void MobileCarLoan() {
		// Appium
		System.out.println("MOBILE LOGIN");
	}

	@Parameters({"URL"})
	@Test
	public void MobileSignInCarLoan(String uname) {
		// Appium
		System.out.println("MOBILE SIGN IN LOGIN");
		System.out.println("Personal loan");
		System.out.println(uname);
	}

	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String username, String password) {
		// Appium
		System.out.println("MOBILE SIGN OUT LOGIN");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods= {"WebCarLoan"})
	public void APICarLoan() {
		// REST API
		System.out.println("API LOGIN");
	}

	@BeforeTest
	public void Prerequiste() {
		System.out.println("I will execute first");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("I will execute after suite");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I will execute before suite");
	}
	
	@BeforeMethod()
	public void bfMethod()
	{
		System.out.println("I will execute before every test method in day2 class");
	}
	
	@AfterMethod()
	public void afMethod()
	{
		System.out.println("I will execute after every test method in day2 class");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination ---> username password --> good credit history
		//2nd combinaiton ---> username password --> no credit history
		//3rd combinarion ---> fraudelent credit history
		
	//	Object[][] data = new Object[3][2];
		
		//1st set
//		data[0][0] = "firstsetusername";
//		data[0][1] = "firstpassword";
//		// Columns in the row are nothing but valuesfor that particular combination(row)
//		
//		//2nd set
//		data[1][0] = "secondsetusername";
//		data[1][1] = "secondpassword";
//		
//		//3rd set
//		data[2][0] = "thirdsetusername";
//		data[2][1] = "thirdpassword";
		
		return new Object[][] {{"firstsetusername","firstpassword"},
							   {"secondsetusername","secondpassword"}};
		
		
		//return data;
	}
	
}
