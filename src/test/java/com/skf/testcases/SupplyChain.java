package com.skf.testcases;


import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

import com.skf.utilities.CommonUtilities;

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
		driver.switchTo().frame(supplyChainPage.iFrame());
		assertTrue(supplyChainPage.eventId().isDisplayed());
		supplyChainPage.eventId().click();
		assertTrue(supplyChainPage.eventId10523().isDisplayed());
		supplyChainPage.eventId10523().click();
		supplyChainPage.eventId().click();
		String eventIDSelectedValue = supplyChainPage.eventIDSelectedValue();
		driver.switchTo().frame(supplyChainPage.verifyBearingsToBeReplacedAvailabilitySectioniFrame());		
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

	@Test(enabled = true)
	public void supplyChainLabelVerification() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(supplychain.turbineModelLabel().isDisplayed());
		assertTrue(supplychain.turbineModelLabel().getText().contains("Turbine Model"));
		assertTrue(supplychain.assetLabel().getText().contains("Asset"));
		assertTrue(supplychain.positionLabel().getText().contains("Position"));
		assertTrue(supplychain.eventIDLabel().getText().contains("Event ID"));
		assertTrue(supplychain.availabilityStatusLabel().getText().contains("Availability Status"));
		assertTrue(supplychain.nodeAvailabilityLabel().getText().contains("Node Availability"));
		assertTrue(supplychain.productAvailabilityByEventLabel().getText().contains("Product availability by event"));
		assertTrue(supplychain.bearingToBeReplacedAvailabilityLabel().getText()
				.contains("Bearings to be replaced availability"));
		assertTrue(supplychain.availabilityByWarehouseLabel().getText().contains("Availability by Warehouse"));
	}

	@Test(enabled = true)
	public void dropDownValueSelection() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		CommonUtilities utilities = new CommonUtilities();
		Robot robot = new Robot();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		// Turbine Model Dropdown
		assertTrue(supplychain.turbineModelLabel().isDisplayed());
		supplychain.turbineModelDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.turbineModelDropdownValueG87().isDisplayed());
		assertTrue(supplychain.turbineModelDropdownValueG87().getText().contains("G87"));
		supplychain.turbineModelDropdownValueG87CheckBox().click();
		robot.keyPress(KeyEvent.VK_TAB);
		// Turbine ID Dropdown
		supplychain.turbineIdDropdown().click();
		assertTrue(supplychain.turbineIdDropdownValueBOU_U001().isDisplayed());
		assertTrue(supplychain.turbineIdDropdownValueBOU_U001().getText().contains("BOU_U001"));
		supplychain.turbineIdDropdownValueBOU_U001CheckBox().click();
		supplychain.turbineIdDropdown().click();
		// Asset Dropdown
		supplychain.assetDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.assetDropdownValueGearbox().isDisplayed());
		assertTrue(supplychain.assetDropdownValueGearbox().getText().contains("Gearbox"));
		utilities.javaScriptClick(supplychain.assetDropdownValueGearboxCheckBox());
		Thread.sleep(3000);
		supplychain.assetDropdown().click();
		// Position Dropdown
		supplychain.positionDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.positionDropdownValueHIS_S_GS().isDisplayed());
		assertTrue(supplychain.positionDropdownValueHIS_S_GS().getText().contains("HIS-S-GS"));
		utilities.javaScriptClick(supplychain.positionDropdownValueCheckboxHIS_S_GS());
		Thread.sleep(3000);
		supplychain.positionDropdown().click();
	}

	@Test(enabled = false)
	public void verifyAvailabilityStatus() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		// assertTrue(supplychain.turbineModelLabel().isDisplayed());
		assertTrue(supplychain.statusLabel1To5Days().getText().contains("1 to 5 days later than de"));
		assertTrue(supplychain.statusLabel5To10Days().getText().contains("5 to 10 days later than de"));
		assertTrue(supplychain.statusLabelAtMost1WorkDays().getText().contains("At most 1 work days later"));
		assertTrue(supplychain.statusLabelMoreThan10WorkDays().getText().contains("More than 10 work days"));
		assertTrue(supplychain.statusLabelNoAvailability().getText().contains("No availability - please"));
		assertTrue(supplychain.statusLabelNoDatesAreAvaiable().getText().contains("No dates are avaiable"));
	}

	@Test(enabled = true)
	public void verifyNodeAvailabilityLabels() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().isDisplayed());
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(supplychain.nodeAssetModelLabel().isDisplayed());
		assertTrue(supplychain.nodeAssetModelLabel().getText().contains("Asset Model"));
		assertTrue(supplychain.nodeBearingDesignationLabel().getText().contains("Bearing Designation"));
		assertTrue(supplychain.nodePositionLabel().getText().contains("Position"));
		assertTrue(supplychain.nodeLabel().getText().contains("Node"));
		assertTrue(supplychain.nodeQuantityLabel().getText().contains("Quantity"));
		assertTrue(supplychain.nodeLeadTimeLabel().getText().contains("Lead Time"));
		assertTrue(supplychain.nodeAvailableDateLabel().getText().contains("Available Date"));
		assertTrue(supplychain.nodeStatusLabel().getText().contains("Status"));
	}

	@Test(enabled = true)
	public void verifyProductAvailabilityLabels() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().isDisplayed());
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(supplychain.productEventIdLabel().isDisplayed());
		assertTrue(supplychain.productEventIdLabel().getText().contains("Event ID"));
		assertTrue(supplychain.productIndicatedFaultLabel().getText().contains("Indicated Fault"));
		assertTrue(supplychain.productPositionLabel().getText().contains("Position"));
		assertTrue(supplychain.productBearingDesignationLabel().getText().contains("Bearing Designation"));
		assertTrue(supplychain.productAvailableDateLabel().getText().contains("Available Date"));
		assertTrue(supplychain.productStatusLabel().getText().contains("Status"));
	}

	@Test(enabled = true)
	public void verifyFocusMode() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().isDisplayed());
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(supplychain.productEventIdLabel().isDisplayed());
		Actions act = new Actions(driver);
		act.moveByOffset(1190, 254).click().build().perform();
		supplychain.focusButton().click();
		Thread.sleep(3000);
		supplychain.backToReportButton().click();
		Thread.sleep(3000);
		assertTrue(supplychain.productEventIdLabel().isDisplayed());
	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}

}
