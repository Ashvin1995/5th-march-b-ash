package xmlStudy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void myMethod1() {
	  Reporter.log("my method1 is running");
  }
  
  @Test
  public void myMethod2() {
	  Assert.fail();
	  Reporter.log("my method2 is running");
  }
  
  @Test
  public void myMethod3() {
	  Reporter.log("my method3 is running");
  }
  
  @Test
  public void myMethod4() {
	  Reporter.log("my method4 is running");
  }
  
  @Test
  public void myMethod5() {
	  Reporter.log("my method5 is running");
  }
}
