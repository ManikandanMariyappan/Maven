package com.ddframwork;

import java.io.IOException;

import com.baseclass.HelperClassWriteExisting;

public class addDateExistingLocation extends HelperClassWriteExisting {
	
	public static void main(String[] args) throws IOException {
		
		
		addExistingFiles("Products", "Data", 0, 1, "Horliks");
		
		addExistingFiles("Products", "Data", 2, 1, "Complan");
		
		addExistingFiles("Products", "Data", 3, 1, "Boost");
		
	}

}
