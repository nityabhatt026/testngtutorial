package com.appdirect.nitya.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	ChromeDriver driver;
    
	@Test
	@Parameters({"url"})
	public void openBrowser(String url) throws InterruptedException{
	Reporter.log("############");
	System.setProperty("webdriver.chrome.driver","resources/chromedriver");
	Reporter.log("Opening Chrome Browser");
    driver= new	ChromeDriver();
    Reporter.log("Opening Url");
    driver.get(url);
    Reporter.log("Selecting search bar");
    WebElement element = driver.findElement(By.id("lst-ib"));
    Reporter.log("Making Search");
    element.sendKeys("Meaning of Nitya");
    driver.findElement(By.id("_fZl")).click();
   // driver.close();
	}
}
