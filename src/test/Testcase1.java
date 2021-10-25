package test;

import org.testng.annotations.Test;


public class Testcase1 extends Baseclass {
	
	
	@Test(priority=1,description = "This is Home loan Test")
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Case");
	}
	
	@Test(priority = 2,description = "This is Home loan 1 Test")
	public void HomeLoanTest1() {
		System.out.println("Inside Home Loan 1 Case");
	}
	@Test(priority=0,groups={"sanity"},description = "This is Car loan Test")
	public void CarLoanTest() {
		System.out.println("Inside Car Loan");
	}
	
	

}
