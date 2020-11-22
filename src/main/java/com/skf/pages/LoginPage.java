package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class LoginPage extends Page {
	


	public void loginApp(String username, String password) {
		driver.findElement(By.xpath(
				"//div[@class='modal-dialog']/div[2]//form[@name='cognitoSignInForm']//input[@id='signInFormUsername']"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//div[@class='modal-dialog']/div[2]//form[@name='cognitoSignInForm']//input[@id='signInFormPassword']"))
				.sendKeys(password);
		driver.findElement(By.cssSelector(
				".background-customizable.modal-content.modal-content-desktop.visible-lg.visible-md form[name='cognitoSignInForm'] > input[name='signInSubmitButton']"))
				.click();
	}
	
	public WebElement incorrectandpasswordlabel()
	{
		return driver.findElement(By.xpath(
				"//div[@class='modal-body']/div[2]/div[2]/div[2]/div/form[@name='cognitoSignInForm']/p[@id='loginErrorMessage']"));
	}
	public WebElement forgotPasswordLink(){
		return driver.findElement(By.xpath("//div[@class='panel panel-left-border col-md-6 col-lg-6']//div//div//a[@class='redirect-customizable'][normalize-space()='Forgot your password?']"));
	}
    public WebElement forgotPasswordLabel() {
    	return driver.findElement(By.xpath("//h1[normalize-space()='Forgot your password?']"));
    }
    public WebElement forgotPasswordMessage() {
    	return driver.findElement(By.xpath("//span[contains(text(),'Enter your Username below and we will send a messa')]"));
    }
    public WebElement userNameTextBox() {
		return driver.findElement(By.xpath("//input[@id='username']"));
    	
    }
    public WebElement userNamePlaceholder() {
    	return driver.findElement(By.xpath("//input[@placeholder='Username']"));
    }
    public WebElement resetPasswordButton() {
    	return driver.findElement(By.xpath("//button[normalize-space()='Reset my password']"));
    }
}
