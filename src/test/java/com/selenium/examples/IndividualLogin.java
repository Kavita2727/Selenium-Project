package com.selenium.examples;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualLogin {
		
		@Test
 		public void logintest() throws InterruptedException, AWTException {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kavitad\\\\eclipse-selenium\\\\SeleniumProject\\\\drivers\\\\geckodriver.exe");
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

			if (driver.getPageSource().contains("SWAG LABS")) {
				System.out.println("Text is present");

			}
			else {
				System.out.println("Text is not present");
			}


			Thread.sleep(1000);
			
		WebElement addtocart = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		Thread.sleep(3000);
		WebElement icon = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link"));
		icon.click();
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.id("first-name"));
		FirstName.sendKeys("Spoorti");
		Thread.sleep(3000);
		WebElement LastName = driver.findElement(By.id("last-name"));
		LastName.sendKeys("Kumari");
		Thread.sleep(3000);
		WebElement Zip = driver.findElement(By.id("postal-code"));
		Zip.sendKeys("587101");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();
		Thread.sleep(3000);
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(3000);
		WebElement backhome = driver.findElement(By.tagName("button"));
		backhome.click();
		Thread.sleep(4000);
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(3000);
		
		driver.close();
		}
}
