package org.d;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\vignesh\\selinium\\gh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement id=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement button=driver.findElement(By.xpath("//button"));
		
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("argument[0].setAttribute('value','john')",id);
		
		
	
		
		
		
	}

}
