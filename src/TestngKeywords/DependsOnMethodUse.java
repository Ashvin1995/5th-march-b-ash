package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test(dependsOnMethods = "B")
	  public void A() {
		  Reporter.log("method A is running", true);
	  }
	   
	  @Test
	  public void B() {
		  Reporter.log("method B is running", true);
	  }
	  
	  @Test(dependsOnMethods = "D")
	  public void C() {
		  Reporter.log("method C is running", true);
	  }
	  
	  @Test
	  public void D() {
		  Reporter.log("method D is running", true);
	  }
	  
	  @Test
	  public void E() {
		  Reporter.log("method E is running", true);
	  }
}
