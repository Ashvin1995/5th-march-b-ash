package testNGlistener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNGlistener.Listener.class)
public class Pune {
  @Test
  public void swarget() 
  {
	  Assert.fail();
	  Reporter.log("swarget is running",true);
	  
  }
  
  
  @Test
  public void shivajinagar()
  {
	  Reporter.log("shivajinagar is running", true);
  }
  
  
}
