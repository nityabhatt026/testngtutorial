package testngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTestng {
	ChromeDriver driver;
	@Test(priority=1)
	public void refBrowser(){
	System.setProperty("webdriver.chrome.driver","/Users/nitya.bhatt/Downloads/chromedriver");
	}
	
	@Test(priority=2)
	public void openBrowser(){
    driver= new	ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.manage().window().maximize();
	}
	
	@Test(priority=3)
	public void testElement(){
    
    WebElement element = driver.findElement(By.id("lst-ib"));
    element.sendKeys("Meaning of Nitya");
    driver.findElement(By.id("_fZl")).click();
	}
}
