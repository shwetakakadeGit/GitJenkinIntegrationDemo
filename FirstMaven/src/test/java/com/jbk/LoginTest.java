package com.jbk;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver=null;
  @Test
  public void Loginf() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	   driver = new ChromeDriver();
		String url="file:///E:/New_Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		driver.get(url);
		
		String LoginText= driver.getTitle();
		
		System.out.println("Executing LoginTest....");
		AssertJUnit.assertEquals(LoginText, "JavaByKiran | Log in");
	  
  }
}
