package com.jbk;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	//WebDriver driver=null;
  @Test
  public void Firstf() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		String url="file:///E:/New_Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		driver.get(url);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		String actualUrl = "file:///E:/New_Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html";

		String expectedUrl = driver.getCurrentUrl();

		System.out.println("Executing FirstTest....");
		
		AssertJUnit.assertEquals(expectedUrl, actualUrl);
		
		
	  
  }
}
