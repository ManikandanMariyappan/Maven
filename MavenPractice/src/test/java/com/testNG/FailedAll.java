package com.testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class FailedAll implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class t, Constructor tc, Method tm) {
		
		IRetryAnalyzer retry = a.getRetryAnalyzer();
		
		if (retry == null) {
			
			a.setRetryAnalyzer(Failed.class);
		}
	}
	
	
}