package com.functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.Readconfig;
import com.helpers.Seleniumextras;
import com.pages.Loginpages;

public class Login_Imp {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Seleniumextras login;
	private Readconfig getCredential;
	
	public Login_Imp(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait= wait;
		login = new Seleniumextras(driver, wait);
		getCredential = new Readconfig();
	}
	
	
	public void applicationLogin(String username, String password) throws Exception
	{
		driver.get(getCredential.getUrl());
		login.clear(Loginpages.TXTUSERNAME);
		login.sendKeys(Loginpages.TXTUSERNAME, username);
		
		login.clear(Loginpages.TXTPASSWORD);
		login.sendKeys(Loginpages.TXTPASSWORD, password);
		login.click(Loginpages.BTNLOGIN);
	}

}
