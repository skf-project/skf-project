package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;

public class Login extends Page {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test
	public void validLogin() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage= new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		assertTrue(turbinePage.user().isDisplayed());
		log.debug("Login Successfull");
		turbinePage.user().click();
		turbinePage.signOut().click();
	}

	@Test
	public void invalidUserLogin() throws IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("invalidUsername"), config.getProperty("validPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}

	@Test
	public void invalidPasswordLogin() throws IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("invalidPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}

	@Test
	public void invalidUsernameInvalidPasswordLogin() throws IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("invalidUsername"), config.getProperty("invalidPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}
	
	@Test
	public void verifyLoginPageComponent() throws IOException {
		LoginPage loginPage = new LoginPage();
		assertTrue(loginPage.usernameTextBox().isDisplayed());
		assertTrue(loginPage.passwordTextBox().isDisplayed());
		assertTrue(loginPage.signInButton().isDisplayed());
		assertTrue(loginPage.forgotYourPasswordLink().isDisplayed());
		assertTrue(loginPage.corporateLoginSKFButton().isDisplayed());
		String label=loginPage.signwithUsernamePasswordLabel().getText();
		assertTrue(label.equalsIgnoreCase("Sign in with your username and password"));
		log.debug("Login component verified");
	}
	@Test
	public void forgotYourPasswordVerify() throws IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.forgotYourPasswordLink().click();
		assertTrue(loginPage.forgotPasswordLabel().isDisplayed());
		assertTrue(loginPage.forgotPasswordMessage().isDisplayed());
		assertTrue(loginPage.userNameTextBox().isEnabled());
		assertTrue(loginPage.resetPasswordButton().isDisplayed());
	}
	
	@Test
	public void checkingPlaceHolder() throws IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		assertEquals(ExpectedUserNamePlaceHolder, loginPage.userNamePlaceHolder());
		assertEquals(ExpectedPassWordPlaceHolder, loginPage.passWordPlaceHolder());
		log.debug("PlaceHolder Passed");
	}
	
	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
