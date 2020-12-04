package com.skf.testcases;


import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;


public class SupplyChain extends Page {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	@Test 
	public void verifyDataInKpiSection() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		SupplyChainPage supplyChainPage = new SupplyChainPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		supplyChainPage.supplyChainTab().click();
		Thread.sleep(3000);
		driver.switchTo().frame(supplyChainPage.iFrame());
		assertTrue(supplyChainPage.eventId().isDisplayed());
		supplyChainPage.eventId().click();
		assertTrue(supplyChainPage.eventId10523().isDisplayed());
		supplyChainPage.eventId10523().click();
		supplyChainPage.eventId().click();
		Thread.sleep(3000);
		assertTrue(supplyChainPage.quantity().isDisplayed());
		assertEquals(supplyChainPage.quantity().getText() , config.getProperty("quantity"));
		assertTrue(supplyChainPage.leadTime().isDisplayed());
		assertEquals(supplyChainPage.leadTime().getText() , config.getProperty("leadTime"));
		assertTrue(supplyChainPage.demandDate().isDisplayed());
		assertEquals(supplyChainPage.demandDate().getText() , config.getProperty("demandDate"));
		driver.switchTo().frame(supplyChainPage.avaibilityStatusiFrame2());
		assertTrue(supplyChainPage.avaibilityStatus().isDisplayed());
		assertEquals(supplyChainPage.avaibilityStatus().getAttribute("src") , config.getProperty("indicAvaibilityStatus"));
	}
	
	@Test 
	public void verifyBearingsToBeReplacedAvailability() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		SupplyChainPage supplyChainPage = new SupplyChainPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		supplyChainPage.supplyChainTab().click();
		//Thread.sleep(3000);
		driver.switchTo().frame(supplyChainPage.iFrame());
		assertTrue(supplyChainPage.eventId().isDisplayed());
		supplyChainPage.eventId().click();
		assertTrue(supplyChainPage.eventId10523().isDisplayed());
		supplyChainPage.eventId10523().click();
		supplyChainPage.eventId().click();
		String eventIDSelectedValue = supplyChainPage.eventIDSelectedValue();
		driver.switchTo().frame(supplyChainPage.verifyBearingsToBeReplacedAvailabilitySectioniFrame());		
		//assertTrue(supplyChainPage.verifyBearingsToBeReplacedAvailabilitySection().isDisplayed());
		assertTrue(supplyChainPage.categoryHierarchy().isDisplayed());
		assertEquals(eventIDSelectedValue, supplyChainPage.categoryHierarchy().getText());		
	}
	
	@Test 
	public void validateFocusMode() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		SupplyChainPage supplyChainPage = new SupplyChainPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		supplyChainPage.supplyChainTab().click();
		driver.switchTo().frame(supplyChainPage.iFrame());
		
		Actions actions = new Actions(driver);
		actions.moveToElement(supplyChainPage.productAvaibilityByEvent()).perform();
		assertTrue(supplyChainPage.focusModeButton().isDisplayed());
		supplyChainPage.focusModeButton().click();
		Thread.sleep(3000);
		assertTrue(supplyChainPage.backToReportButton().isDisplayed());
		assertFalse(supplyChainPage.focusModeButton().isDisplayed());
		supplyChainPage.backToReportButton().click();
		assertTrue(supplyChainPage.focusModeButton().isDisplayed());	
	}
	
	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
