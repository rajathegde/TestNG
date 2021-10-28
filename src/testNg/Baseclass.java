package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeTest (alwaysRun=true) //exec only once
	public void BeforeTest() {
		System.out.println("Inside BeforeTest");
	}
	
	@BeforeClass(alwaysRun=true)
	public void BeforeClassM() {
		System.out.println("Inside Before Class");
	}
	
	@BeforeMethod(alwaysRun=true) //exec each method
	public void setup() {
		System.out.println("Inside Setup");
	}
	
	@AfterMethod(alwaysRun=true)
	public void Teardown() {
		System.out.println("After Teardown");
	}
	
	@AfterClass(alwaysRun=true)
	public void AfterClassM() {
		System.out.println("Inside After Class");
	}
	
	@AfterTest(alwaysRun=true)
	public void AfterTest() {
		System.out.println("After Test Method");
	}

}
