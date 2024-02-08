package com.testNG;

import org.testng.annotations.Test;

public class SeqAndPaeExecutionTwo {

	@Test
	private void tc61() {
		long id = Thread.currentThread().getId();
		System.out.println("TC 61 Current Tread "+id);
	}
	@Test
	private void tc31() {
		long id = Thread.currentThread().getId();
		System.out.println(" TC 31 Current Tread "+id);
	}
	@Test
	private void tc11() {
		long id = Thread.currentThread().getId();
		System.out.println(" TC 11 Current Tread "+id);
	}
	@Test
	private void tc41() {
		long id = Thread.currentThread().getId();
		System.out.println("TC 41 Current Tread "+id);
	}
}
