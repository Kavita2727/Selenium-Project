package com.selenium.examples;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaucedemoExample {
	
	@Test
	
	public void logintest() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		Thread.sleep(3000);
		String pageTitle=driver.getTitle();
		Assert.assertEquals("Swag Labs", pageTitle);
		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		Thread.sleep(1000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Kamatchi");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("P");
		Thread.sleep(2000);
		
		driver.findElement(By.name("zip")).sendKeys("625001");
		Thread.sleep(2000);
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		Thread.sleep(3000);
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(3000);
		WebElement backhome = driver.findElement(By.id("back-to-products"));
		backhome.click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();

		driver.findElement(By.id("logout_sidebar_link")).click();

		


		driver.close();

}
}
