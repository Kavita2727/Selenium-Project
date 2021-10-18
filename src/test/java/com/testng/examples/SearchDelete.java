package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchDelete {

	public static WebDriver driver;
	String baseURL = "https://www.google.com";
	
	@BeforeTest
	
	public void user_search_Google_webapp() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\kavitad\\eclipse-selenium\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	
	}
	
	
	/*
	 * public void user_log_for_a() throws InterruptedException { WebElement
	 * username=driver.findElement(By.id("Email")); username.clear();
	 * username.sendKeys("admin@yourstore.com"); Thread.sleep(3000); WebElement
	 * password = driver.findElement(By.id("Password")); password.clear();
	 * password.sendKeys("admin"); }
	 */
	
	@Test(priority=1)
	public void click_on_logs_button() {
	WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	login.click();
	}
	
	
	@Test(priority=2)
	public void search_product() throws Throwable {
	WebElement catalog = driver.findElement(By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
	catalog.click();
	Thread.sleep(2000);
	
	
	
	WebElement product = driver.findElement(By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/p[1]"));
	product.click();
	Thread.sleep(2000);
	
	
	
	WebElement productname = driver.findElement(By.name("SearchProductName"));
	productname.sendKeys("Build Your own Computer");
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.id("search-products"));
	search.click();
	Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void delete_product() throws Throwable {
	WebElement click_product = driver.findElement(By.name("checkbox_products"));
	click_product.click();
	Thread.sleep(2000);
	
	
	
	WebElement click_delete = driver.findElement(By.id("delete-selected"));
	click_delete.click();
	Thread.sleep(2000);
	WebElement click_confirm = driver.findElement(By.id("delete-selected-action-confirmation-submit-button"));
	click_confirm.click();
	Thread.sleep(2000);
	}
	
	
	@Test(priority=4)
	public void close_brows() throws Throwable {
	driver.quit();
	}
	
	
	
}