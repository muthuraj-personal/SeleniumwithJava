package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.config.Readconfig;
import com.functionalities.Login_Imp;

public class Logintest extends Mastertest {
	
	private Login_Imp login;
	private Readconfig getCredential;
	
	@BeforeClass
	public void beforeTest()
	{
		login = new Login_Imp(driver, wait);
	    getCredential = new Readconfig();
	}
	
	@Test(priority = 1)
	public void withoutUsername() throws Exception
	{
		login.applicationLogin("", getCredential.getPassword());
	}
	
	@Test(priority = 2)
	public void withoutPassword() throws Exception
	{
		login.applicationLogin(getCredential.getUserName(), "");
	}
	
	@Test(priority = 3)
	public void invalidUsername() throws Exception
	{
		login.applicationLogin("ad", getCredential.getPassword());
	}
	
	@Test(priority = 3)
	public void invalidPassword() throws Exception
	{
		login.applicationLogin(getCredential.getUserName(), "ad");
	}
	
	
	@Test(priority = 3)
	public void validPassword() throws Exception
	{
		login.applicationLogin(getCredential.getUserName(), "ad");
	}

}
