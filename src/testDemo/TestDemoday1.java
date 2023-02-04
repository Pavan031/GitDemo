package testDemo;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDemoday1 {
	
  @AfterTest
  public void lastExecution() {
	  
	  System.out.println("I will execute Last");
	  
	  
  }
  
  @AfterSuite
  public void Afsuite() {
	  
	  System.out.println("Im Last");
  }	

  @Test
  public void demo() {
	  
	  System.out.println("Hello");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void demo2() {
	  
	  System.out.println("Pavan");
  }
}
