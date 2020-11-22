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

	public WebElement usernameTextBox() {
		return driver.findElement(By.xpath(
				"//div[@class='modal-dialog']/div[2]//form[@name='cognitoSignInForm']//input[@id='signInFormUsername']"));
	}

	public WebElement passwordTextBox() {
		return driver.findElement(By.xpath(
				"//div[@class='modal-dialog']/div[2]//form[@name='cognitoSignInForm']//input[@id='signInFormPassword']"));
	}

	public WebElement signInButton() {
		return driver.findElement(By.cssSelector(
				".background-customizable.modal-content.modal-content-desktop.visible-lg.visible-md form[name='cognitoSignInForm'] > input[name='signInSubmitButton']"));
	}
	
	public WebElement forgotYourPasswordLink() {
		return driver.findElement(By.cssSelector(
				"[class='panel panel-left-border col-md-6 col-lg-6'] .redirect-customizable"));
	}
	
	public WebElement corporateLoginSKFButton() {
		return driver.findElement(By.cssSelector(
				".background-customizable.modal-content.modal-content-desktop.visible-lg.visible-md > .modal-body form[name='loginWithIdentityProvider']  input[value='SKF']"));
	}
	
	public WebElement signwithUsernamePasswordLabel() {
		return driver.findElement(By.cssSelector(
				".background-customizable.modal-content.modal-content-desktop.visible-lg.visible-md .textDescription-customizable"));
	}

	public WebElement incorrectandpasswordlabel() {
		return driver.findElement(By.xpath(
				"//div[@class='modal-body']/div[2]/div[2]/div[2]/div/form[@name='cognitoSignInForm']/p[@id='loginErrorMessage']"));
	}
}
