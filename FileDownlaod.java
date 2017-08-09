package com.Selenium.com.newPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDownlaod 
{
	@Test
	public void FileDownload()
	{
		
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 0);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "file");
		
		
		WebDriver d =new FirefoxDriver(profile);
		d.get("https://drive.google.com/drive");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("proselenium1@gmail.com");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div[@id='identifierNext']")).click();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Abcd@123");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we =  d.findElement(By.xpath("//div[@id='passwordNext']"));
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions act= new Actions(d);
		act.moveToElement(we).click().perform();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement we1 = d.findElement(By.xpath("//div[@aria-label='Question.zip']"));
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		we1.click();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		act.contextClick(we1).perform();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		d.quit();
		
		
		
		
		
		
		
		
		
	}

}




it is done ..i will keep doing until i get it promis god.
