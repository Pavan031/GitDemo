package testDemo;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDemoday1 {
	
  @AfterTest
  public void lastExecution() {
	  
	  System.out.println("I will execute Last");
	  System.out.println("vamshi");
	  System.out.println("Sridhar");
	  System.out.println("Pavan");
	  
  }
  
  @AfterSuite
  public void Afsuite() {
	  
	  System.out.println("Im Last");
  }	

  @Test
  public void demo() {
	  
	  System.out.println("Hello");
  }
  
  @Test
  public void demo2() {
	  
	  System.out.println("Pavan");
  }
}
