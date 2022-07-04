package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MytestGrouping2 {
  @Test(groups = "regression")
  public void myMethod6() {
	  Reporter.log("my method6 regression is running");
  }
  
  @Test(groups = "regression")
  public void myMethod7() {
	  Reporter.log("my method7 regression is running");
  }
  
  @Test(groups = "regression")
  public void myMethod8() {
	  Reporter.log("my method8 regression is running");
  }
  
  @Test(groups = "sanity")
  public void myMethod9() {
	  Reporter.log("my method9 sanity is running");
  }
  
  @Test
  public void myMethod10() {
	  Reporter.log("my method10 is running");
  }
}
