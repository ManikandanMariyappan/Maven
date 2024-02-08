package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsPractice {
	
	@BeforeClass
	public void openWeb() {
		
		System.out.println("Initiated");
	}
	
	@AfterClass
	public void closeWeb() {
		
		System.out.println("Finished");
	}
	
	@BeforeMethod
	 public void getStartTime() {

		System.out.println("TC Started");
	}
	
	@AfterMethod
	public void getEndTime() {

		System.out.println("TC Ended");
	}
	
	@Test
	public void tc03() {
		
		System.out.println("TC3 Working");
	}
	
	@Test
	public void tc01() {
		
		System.out.println("TC1 Working");
	}
	@Test
	public void tc04() {

		System.out.println("TC4 Working");
	}
	
	@Test
	public void tc02() {
		
		System.out.println("TC2 Working");
	}
	
	@Test
	public void tc05() {
		
		System.out.println("TC05 Working");
	}

}
