package com.ddframwork;

import java.io.IOException;

import com.baseclass.HelperClassDDFramework;

public class DDFrameworkRead extends HelperClassDDFramework{
	
	public static void main(String[] args) throws IOException {
		
		String data = readData("Data", 0, 1);
		
		System.out.println(data);
	}

}
