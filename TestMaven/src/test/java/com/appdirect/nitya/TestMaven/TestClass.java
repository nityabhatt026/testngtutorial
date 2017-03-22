package com.appdirect.nitya.TestMaven;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

import com.appdirect.nitya.utils.Arguments;

public class TestClass {
	
	ChromeDriver driver;
    String url;
    String searchName;
    
	@Test
	public void openBrowser() throws Exception{
		Properties prop = new Properties();
		try
		{
		InputStream input = new FileInputStream(new File("resources/Value.properties"));
		prop.load(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        url=prop.getProperty("url");
		searchName=prop.getProperty("searchName");	
		Arguments obj=new Arguments();
		Reporter.log("Opening Chrome Browser");
		WebDriver driver= obj.setPath();
		Reporter.log("Opening Url");
	    driver.get(url);
	    WebElement element1 =obj.finder("lst-ib");
	    Reporter.log("Selecting search bar");
	    element1.sendKeys(searchName);
	    Reporter.log("Making Search");
	    WebElement element2=obj.finder("_fZl");
	    element2.click();   
	}
}
