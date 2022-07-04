package SoftAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
	
	SoftAssert soft=new SoftAssert();
	
	
  @Test
  public void mymethod() {
	  String a="ashvin";
	  String b="ashvin";
	  String c="indrajit";
	  
	  soft.assertEquals(a,c, "value isnt matching tc is failed");
	  
	  soft.assertNotEquals(a,c, "value is matching tc is failed");
	  Reporter.log("value isnt matching tc is passed",true);
	  
	  soft.assertAll();
	  
	  
  }
}
