package com.appdirect.nitya.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Arguments 
{
	WebDriver driver;
	WebElement element;
	public WebDriver setPath() throws IOException{
	Properties prop = new Properties();
		 try
		 {
			InputStream input = new FileInputStream(new File("resources/Value.properties"));
			prop.load(input);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
			String driverPath=System.setProperty(prop.getProperty("browserPath"),prop.getProperty("browserDriver"));
			System.out.println(prop.getProperty("browserPath"));
			System.out.println(prop.getProperty("browserDriver"));
			driver=new ChromeDriver();
			return driver;
		 }
			 public WebElement finder(String id){
			 element= driver.findElement(By.id(id));
			 return element;	 
		 }
}
