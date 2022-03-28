package com.helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagehelpers {
	
	
	 public static boolean isElementPresent(By element, WebDriver driver)
     {
         try
         {
             WebDriverWait waithelper = new WebDriverWait(driver, Duration.ofSeconds(10));
             if (waithelper.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed())
             {
                 return true;
             }
             return false;
         }
         catch (Exception e) {
        	 return false;
		}
        

     }
	 
	 public static boolean isElementPresent(WebElement element, WebDriver driver)
     {
         try
         {
             WebDriverWait waithelper = new WebDriverWait(driver, Duration.ofSeconds(10));
             if (waithelper.until(ExpectedConditions.visibilityOf(element)).isDisplayed())
             {
                 return true;
             }
             return false;
         }
         catch (Exception e) {
        	 return false;
		}
        

     }
	 
	 
	 public static void waitUntilElementDisappear(By searchElementBy, WebDriver driver)
     {
         try
         {
             for (int i = 0; i < 10; i++)
             {
                 if (false == isElementPresent(searchElementBy,driver))
                 {
                     break;
                 }

                 Thread.sleep(1000);
             }
         }
         catch (Exception ex)
         {
             //string test = ex.Message;
         }
     }
	
	public static void waitForPageLoad(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until((x)->{
			
			return((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			
		});
	}
	
	
	public static void waitForAjax(WebDriver driver, WebDriverWait wait)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		wait.until(x->js.executeScript("return jQuery.active").toString()=="0");	
	}

}
