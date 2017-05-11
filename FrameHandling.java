package com.Selenium.com.newPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandling 
{
	@Test
	public void FrameHandling() throws Exception
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.switchTo().frame("packageFrame");
		Thread.sleep(400);
		d.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		
		
		
		
		
	}

}
