package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import mainsourcepackage.BaseClass;

public class TestClass1 extends BaseClass{
	@Test
	public void testMethod() throws InterruptedException {
		System.out.println("Start.1..");
	}
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("Start.2..");
	}
	
}
