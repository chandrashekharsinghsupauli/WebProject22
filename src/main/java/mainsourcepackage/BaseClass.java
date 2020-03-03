package mainsourcepackage;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeMethod
	public void beforeMethod(ITestResult testResult) {
		System.out.println("=============================");
System.out.println("BeforeMethod...");
		System.out.println(testResult.getMethod());
		System.out.println(getCurrentTestClassAndMethodName(testResult));
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		System.out.println("afterMethod...");
		System.out.println(testResult.getMethod());
		System.out.println(getCurrentTestClassAndMethodName(testResult));
		System.out.println("-----------------------------");
	}


	private String getCurrentTestClassAndMethodName(ITestResult testResult) {
		String strClassAndMethodName=testResult.getMethod().toString();
		String []strArray=strClassAndMethodName.split("\\(\\)");
		return strArray[0];
	}
}
