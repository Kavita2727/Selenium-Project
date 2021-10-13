package com.selenium.examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //instance 
		
		driver.get("http://google.com");
		
		// Java script executor for alert
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello, do not close me')");
		Thread.sleep(3000);
		driver.quit();

	}

}
