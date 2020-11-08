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

}
