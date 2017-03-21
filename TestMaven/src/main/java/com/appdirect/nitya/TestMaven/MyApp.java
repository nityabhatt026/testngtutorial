package com.appdirect.nitya.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyApp {
	
	 public static void main( String[] args ){
	ChromeDriver driver;
	System.setProperty("webdriver.chrome.driver","chromedriver");
    driver= new	ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.manage().window().maximize();
    WebElement element = driver.findElement(By.id("lst-ib"));
    element.sendKeys("Meaning of Nitya");
    driver.findElement(By.id("_fZl")).click();
	 }
}
