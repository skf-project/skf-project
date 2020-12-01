package com.skf.testcases;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.NotificationPage;
import com.skf.pages.TurbinePage;

public class Notification extends Page {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	@Test
	public void notification1() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.bellIcon().isDisplayed());
		
	}
	
	@Test 
	public void notification2() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage= new TurbinePage();
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.filterHeader().isDisplayed());
		notificationPage.bellIcon().click();
		assertTrue(notificationPage.notificationOnNotificationModal().isDisplayed());
		turbinePage.filterLabel().click();
		assertFalse(notificationPage.notificationOnNotificationModal().isDisplayed());
	}
	
	@Test 
	public void notification3() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.filterHeader().isDisplayed());
		notificationPage.bellIcon().click();
		assertTrue(notificationPage.notificationModal().isDisplayed());
		notificationPage.bellIcon().click();
		assertFalse(notificationPage.notificationModal().isDisplayed());
	}
	
	@Test
	public void notification4() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.filterHeader().isDisplayed());
		notificationPage.bellIcon().click();
		assertTrue(notificationPage.notificationModal().isDisplayed());
		notificationPage.notificationCloseIcon().click();
		assertFalse(notificationPage.notificationModal().isDisplayed());
	}
	
	@Test
	public void notification5() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.filterHeader().isDisplayed());
		notificationPage.bellIcon().click();
		assertTrue(notificationPage.notificationModal().isDisplayed());
		assertEquals(notificationPage.notificationCount(),notificationPage.belliconCount());
		
	}
	
	@Test 
	public void notification6() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		NotificationPage notificationPage = new NotificationPage();
		assertTrue(notificationPage.filterHeader().isDisplayed());
		notificationPage.bellIcon().click();
		assertTrue(notificationPage.notificationModal().isDisplayed());
		notificationPage.firstValueOfNotification().click();
		assertTrue(notificationPage.popUpHeader().isDisplayed());
		assertTrue(notificationPage.popUpHeaderText().contains(notificationPage.turbineName()));
		
	}
	
	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
