package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.NewUserRegistration;

public class NewUR {

	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="file:///E:/New_Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		driver.get(url);
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		NewUserRegistration lp= new NewUserRegistration(driver);
		lp.registerUser();
		
		
	}
}
