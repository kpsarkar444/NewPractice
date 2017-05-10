package com.Selenium.com.newPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstTest1 
{
	@Test
	public void WindowHandling()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> itr= set.iterator();
		 String parent= itr.next();
		 String child=itr.next();
		 driver.switchTo().window(child);
		 WebElement we = driver.findElement(By.xpath("//select[@name='airlinePreference']"));
		Select sel= new Select(we);
		if(sel.isMultiple())
		{
			sel.selectByVisibleText("Indigo");
		}
		else
		{
			System.out.println("DID not found any value");
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		driver.switchTo().window(parent);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	
	
	
	
	
	
	
	}

}
