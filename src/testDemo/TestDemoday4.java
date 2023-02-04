package testDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemoday4 {
	
	@Parameters({"URL", "APIkey/userName"})
	@Test
	public void WebloginHomeLoan(String urlName, String key) {
		
		//selenium
		System.out.println("WebLoginHomePersonal loan");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	@Test(groups=("Smoke"))
	public void MobileloginHomeLoan() {
		
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void ApiloginHomeLoan() {
		
		//Rest API
		System.out.println("APILoginHome");
	}

}
