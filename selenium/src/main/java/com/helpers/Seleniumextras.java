package com.helpers;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumextras {

	private  WebDriver driver;
	private  WebDriverWait wait;

	public Seleniumextras(WebDriver driver, WebDriverWait wait ) {
		this.driver = driver ;
		this.wait = wait;
	}

	public void sendKeys(By loctor, String input) throws Exception {
		try {
			driver.findElement(loctor).sendKeys(input);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	public void clear(By loctor) throws Exception {
		try {
			driver.findElement(loctor).clear();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	public void click(By loctor) throws Exception {
		try {
			driver.findElement(loctor).click();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	public String getAttribute(By loctor, String attValue) throws Exception {
		String value = "";

		try {
			value = driver.findElement(loctor).getAttribute(attValue);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		return value;
	}

}
