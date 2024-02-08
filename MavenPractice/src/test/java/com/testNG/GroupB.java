package com.testNG;

import org.testng.annotations.Test;

public class GroupB {
	
	@Test
	private void tc6() {
		
		System.out.println("TC 6");
	}
	
	@Test(groups = "sanity")
	private void tc9() {
		
		System.out.println("TC 9");
	}
	
	@Test(groups = "smoke")
	private void tc3() {
		
		System.out.println("TC 3");
	}
	
	@Test(groups = "smoke")
	private void tc2() {
		
		System.out.println("TC 2");
	}
	
	@Test(groups = "unit")
	private void tc8() {
		
		System.out.println("TC 8");
	}
}
