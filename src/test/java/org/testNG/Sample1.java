package org.testNG;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	
	@Test
	
	public void tc0() {

		String s = "GOWTHAM";
		
		System.out.println(s);
		
		SoftAssert assert1 = new SoftAssert();
		
		assert1.assertEquals(s, "GOWTHAM");
		
		assert1.assertAll();
		
		System.out.println("assert failure");
	}
@Test

public void tc01() {
System.out.println("method2");

}
}
