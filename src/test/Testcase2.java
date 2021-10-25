package test;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass {
	
	@Test(groups= {"sanity"},description = "This is credit card Test",dependsOnMethods="CCTest")
	public void CreditCardTest() {
		System.out.println("Inside Creditcard Test");
	}
	
	@Test(groups= {"sanity"},description = "This is credit card Test")
	public void CCTest() {
		System.out.println("Inside CC Test");
	}


}
