package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestGrouping {
  @Test(groups = "sanity")
  public void myMethod1() {
	  Reporter.log("my method1 sanity is running");
  }
  
  @Test
  public void myMethod2() {
	  Reporter.log("my method2 is running");
  }
  
  @Test(groups = "sanity")
  public void myMethod3() {
	  Reporter.log("my method3 sanity is running");
  }
  
  @Test
  public void myMethod4() {
	  Reporter.log("my method4 is running");
  }
  
  @Test(groups = "regression")
  public void myMethod5() {
	  Reporter.log("my method5 regression is running");
  }
}
