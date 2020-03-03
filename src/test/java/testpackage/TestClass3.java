package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import mainsourcepackage.BaseClass;

public class TestClass3 extends BaseClass{
	@Test
	public void testMethod31() throws InterruptedException {
		System.out.println("Start.31..");
	}

	
	@Test
	public void testMethod32() throws InterruptedException {
		System.out.println("Start.32..");
	}

	@Test
	public void testMethod33() throws InterruptedException {
		System.out.println("Start.33..");
	}

}
