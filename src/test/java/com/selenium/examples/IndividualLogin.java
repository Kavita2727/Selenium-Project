package com.selenium.examples;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualLogin {
	WebDriver driver;
	private static final Logger logger = LogManager.getLogger(IndividualLogin.class);

	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws Exception {
	// Check if parameter passed from TestNG is 'firefox'
	if (browser.equalsIgnoreCase("firefox")) {
	// create firefox instance
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	}



	// Check if parameter passed as 'chrome'
	else if (browser.equalsIgnoreCase("Chrome")) {
	// set path to chromedriver.exe
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();



	}



	else {
	// If no browser passed throw exception
	throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	/*
	 * public void setup() throws InterruptedException {
	 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * }
	 */
		@Test
 		public void logintest() throws InterruptedException, AWTException {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kavitad\\\\eclipse-selenium\\\\SeleniumProject\\\\drivers\\\\geckodriver.exe");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
			Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		Thread.sleep(1000);

			if (driver.getPageSource().contains("SWAG LABS")) {
				System.out.println("Text is present");

			}
			else {
				System.out.println("Text is not present");
			}


			Thread.sleep(1000);
			
		WebElement addtocart = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		Thread.sleep(1000);
		WebElement icon = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link"));
		icon.click();
		Thread.sleep(1000);
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		Thread.sleep(1000);
		WebElement FirstName = driver.findElement(By.id("first-name"));
		FirstName.sendKeys("Spoorti");
		Thread.sleep(1000);
		WebElement LastName = driver.findElement(By.id("last-name"));
		LastName.sendKeys("Kumari");
		Thread.sleep(1000);
		WebElement Zip = driver.findElement(By.id("postal-code"));
		Zip.sendKeys("587101");
		Thread.sleep(1000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("scrollBy(0,-400)");
		WebElement backhome = driver.findElement(By.tagName("button"));
		backhome.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(1000);
		
		}
		@AfterTest
		public void teardown() {
		driver.close();
		}
}
