package testNGlistener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNGlistener.Listener.class)
public class Mumbai {
	
  @Test
  public void sanpada() 
  {
	  Reporter.log("sanpada is running",true);
  }
  
  @Test
  public void ghansoli()
  {
	  Reporter.log("ghansoli is running", true);
  }
  
  
}
