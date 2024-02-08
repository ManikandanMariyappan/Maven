package com.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderData {
	
	@DataProvider(name = "facebookdata")
	private Object[][] sampleData() {
		
		return new Object[][] {
			{"Preethi", "Password@124"},
			{"Subha", "Pass@124"},
			{"Esther", "Word@124"}
		};
	}
}
