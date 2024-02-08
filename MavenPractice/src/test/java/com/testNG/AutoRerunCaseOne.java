package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoRerunCaseOne {
	
	@Test(retryAnalyzer = Failed.class)
	private void tc4() {
		
		System.out.println("TC 4");
		Assert.assertTrue(5<2, "Condition");
		System.out.println("Assert Passed");
		
	}
	
	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
		
		System.out.println("TC 2");
		Assert.assertTrue(5<4, "Condition");
		System.out.println("Assert Passed");
	}
	
	@Test
	private void tc1() {

		System.out.println("TC 1");
	}
	
	@Test
	private void tc3() {

		System.out.println("TC 3");
		Assert.assertTrue(4<5, "Condition");
		System.out.println("Assert Passed");
	}

}
