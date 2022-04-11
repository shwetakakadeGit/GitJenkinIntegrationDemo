package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.POM.LoginPage;

public class LoginTestPom {

	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakad\\OneDrive\\Desktop\\code\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/New_Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp= new LoginPage(driver);
		lp.loginToApplication();
	}
}
