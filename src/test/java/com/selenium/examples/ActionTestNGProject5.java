
package com.selenium.examples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionTestNGProject5 {
static WebDriver driver;
@Test
public void action() {
String baseUrl = "http://www.facebook.com/";
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver(); driver.get(baseUrl);
WebElement txtUsername = driver.findElement(By.id("email")); Actions builder = new Actions(driver);
Action seriesOfActions = builder
.moveToElement(txtUsername)
.click()
.keyDown(txtUsername, Keys.SHIFT)
.sendKeys(txtUsername, "hello")
.keyUp(txtUsername, Keys.SHIFT)
.doubleClick(txtUsername)
.contextClick()
.build();
seriesOfActions.perform() ; }
}

