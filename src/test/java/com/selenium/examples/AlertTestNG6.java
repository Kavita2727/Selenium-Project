package com.selenium.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTestNG6 {
	
static WebDriver driver;
	
	
	@Test
	public void alertHandling() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
			
		        
		        // Alert Message handling
		                    		
		        driver.get("http://demo.guru99.com/test/delete_customer.php");			
		                            		
		     	      	
		        driver.findElement(By.name("cusid")).sendKeys("53920");					
		        driver.findElement(By.name("submit")).submit();			
		        		
		        // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();		
		    }	


}
