package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample {
	
	@BeforeClass
	public static void beforeAllTC() {
		
		System.out.println("Strated First");

	}
	
	@AfterClass
	public static void afterAllTC1() {

		System.out.println("Finally Ends");
	}
	
	@Before
	public void beforeTC1() {
		
		System.out.println("Strats Before Start");
	}
	
	@After
	public void afterTC1() {
		
		System.out.println("Test Case Ended");
	}
	
	@Test
	public void TC1() {
		
		System.out.println("TC1 Started");
	}
	
	@Test
	public void TC2() {
		
		System.out.println("TC2 Started");
	}
	
	@Test
	public void TC3() {
		
		System.out.println("TC3 Started");
	}
}
