package testDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemoday2 {
	
	@Test(groups=("Smoke"))
	public void ploan() {
		
		System.out.println("Good");
		
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute First");
		System.out.println("Aruna");
		System.out.println("Janardhan");
		System.out.println("Im very good boy");
	}

}
