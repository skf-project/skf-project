package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;

public class Login extends Page {
	
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test
	public void validLogin() throws IOException {
		fisco = new FileInputStream(path+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		TurbinePage turbinePage= loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		assertTrue(turbinePage.filterLabel().isDisplayed());
		log.debug("Login Successfull");
	}
	
	@Test
	public void invalidUserLogin() throws IOException {
		fisco = new FileInputStream(path+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("invalidUsername"), config.getProperty("validPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}
	
	@Test
	public void invalidPasswordLogin() throws IOException {
		fisco = new FileInputStream(path+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("invalidPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}
	
	@Test
	public void invalidUsernameInvalidPasswordLogin() throws IOException {
		fisco = new FileInputStream(path+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("invalidUsername"), config.getProperty("invalidPassword"));
		assertTrue(loginPage.incorrectandpasswordlabel().isDisplayed());
		log.debug("Login Failed");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		driver=null;
		log.debug("Browser closed");
	}
}
