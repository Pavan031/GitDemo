package testDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemoday2 {
	
	@Test(groups=("Smoke"))
	public void ploan() {
		
		System.out.println("Good");
		System.out.println("Good and Bad");
		System.out.println("Annam pavan kalyan");
		System.out.println("Annam gangamani");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute First");
	}

}
