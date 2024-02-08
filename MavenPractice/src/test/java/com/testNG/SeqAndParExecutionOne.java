package com.testNG;

import org.testng.annotations.Test;

public class SeqAndParExecutionOne {
	
	@Test
	private void tc6() {
		long id = Thread.currentThread().getId();
		System.out.println("TC 6 Current Tread "+id);
	}
	@Test
	private void tc3() {
		long id = Thread.currentThread().getId();
		System.out.println(" TC 3 Current Tread "+id);
	}
	@Test
	private void tc1() {
		long id = Thread.currentThread().getId();
		System.out.println(" TC 1 Current Tread "+id);
	}
	@Test
	private void tc4() {
		long id = Thread.currentThread().getId();
		System.out.println("TC 4 Current Tread "+id);
	}

}
