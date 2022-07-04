package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueandAssertfalse {
	
	SoftAssert soft=new SoftAssert();
	
	
  @Test
  public void myMethod() {
	  
	  boolean a = true;
	  boolean b = false;
	  
	  soft.assertTrue(a,"value is false tc is failed");
	  
	  soft.assertFalse(b,"value is true tc is failed");
	  
  }
}
