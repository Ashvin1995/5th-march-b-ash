package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUSe {
	@Test()
	  public void A() {
		  Reporter.log("method A is running", true);
	  }
	   
	  @Test(timeOut = 1000)
	  public void B() throws InterruptedException {
		  Reporter.log("method B is running", true);
		  Thread.sleep(1200);
	  }
	  
	  @Test
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
