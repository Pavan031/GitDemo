package testDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemoday4 {
	
	@Test
	public void WebloginHomeLoan() {
		
		//selenium
		System.out.println("WebLoginHomePersonal loan");
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
