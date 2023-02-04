package testDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemoday3 {
	
	@BeforeClass
	public void Bfclass() {
		
		//selenium
		System.out.println("Before Executing all methods in class");
	}
	
	@AfterClass
	public void Afclass() {
		
		//selenium
		System.out.println("After Executing all methods in class");
	}
	
	@Test
	public void WebloginCarLoan() {
		
		//selenium
		System.out.println("WebLoginCar");
	}
	
	@BeforeMethod
	public void BfEveryTest() {
		
		//selenium
		System.out.println("I will execute before every test method in day3 class");
	}
	
	@AfterMethod
	public void AfEveryTest() {
		
		//selenium
		System.out.println("I will execute After every test method in day3 class");
	}
	
	@Test(groups=("Smoke"))
	public void MobileloginCarLoan() {
		
		//Appium
		System.out.println("MobileLoginCar");
		System.out.println("Good and Bad");
		System.out.println("Annam pavan kalyan");
		System.out.println("Annam gangamani");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		
		//Appium
		System.out.println("im number one");
	}
	
	@Test(enabled=false)
	public void MobilesiginCarLoan() {
		
		//Appium
		System.out.println("Mobile Signin");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String userName, String password) {
		
		//Appium
		System.out.println("Mobile Signout");
		System.out.println(userName);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutCarLoan"})
	public void ApiloginCarLoan() {
		
		//Rest API
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		// 1st Condition - username password - good credit history
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstSetUserName";
		data[0][1] = "firstPassword";
		//columns in the row are values for particular combination
		
		// 2nd set
		data[1][0] = "secondSetUserName";
		data[1][1] = "secondPassword";
		
		// 3rd set
		data[2][0] = "thirdSetUserName";
		data[2][1] = "thirdPassword";
		
		return data;
	}
	
	

}
