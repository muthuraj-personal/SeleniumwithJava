package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.base.Initiate;
import com.config.Readconfig;

public class Mastertest {
	
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeSuite
	public void initiate()
	{
		Readconfig getCredential = new Readconfig();
		driver = Initiate.browserLaunch(getCredential.getBrowserName());
		wait = Initiate.wait(driver);
	}
	
	@AfterSuite
	public void terminate()
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
