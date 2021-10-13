package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGProject2 {

	@Test
	public void dropdown() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		Thread.sleep(3000);
		driver.close();


	}

}
