package verificationusingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsandAssertNotEquals {
  @Test
  public void myMethod() {
	  String s = "ashvin";
	  String t="ashvin";
	  String u="nanded";
	  
//	  Assert.assertEquals(s,t,"string not matching tc is failed");
//	  Reporter.log("string matching test case passed", true);
//	  
	  Assert.assertNotEquals(s, u,"string is matching test case pased");
	  Reporter.log("string isnt matching tc failed",true);
	  
  }
}
