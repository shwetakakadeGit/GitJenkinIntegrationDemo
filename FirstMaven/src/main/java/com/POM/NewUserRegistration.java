package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserRegistration {
	WebDriver driver;
	
	public NewUserRegistration(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getUserName() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getUserMobile() {
		return driver.findElement(By.id("mobile"));
	}
	 public WebElement getUserEmail() {
		 return driver.findElement(By.id("email"));
	 }
	 
	 public WebElement getUserPassword() {
		 return driver.findElement(By.id("password"));
	 }
	 public void registerUser() {
			getUserName().sendKeys("ShwetaKakade");
			getUserMobile().sendKeys("123456");
			getUserEmail().sendKeys("kiran@gmail.com");
			getUserPassword().sendKeys("Shweta");
		}
	
}
