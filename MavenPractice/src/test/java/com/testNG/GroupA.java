package com.testNG;

import org.testng.annotations.Test;

public class GroupA {
	
	@Test(groups = {"super", "unit"}) //OR Operator
	private void tc61() {
		
		System.out.println("TC 61");
	}
	
	@Test(groups = {"smoke, super"}) //AND Operator
	private void tc91() {
		
		System.out.println("TC 91");
	}
	
	@Test(groups = {"smoke", "super"})
	private void tc31() {
		
		System.out.println("TC 31");
	}
	
	@Test(groups = "sanity")
	private void tc21() {
		
		System.out.println("TC 21");
	}
	
	@Test(groups = "unit")
	private void tc81() {
		
		System.out.println("TC 81");
	}
}
