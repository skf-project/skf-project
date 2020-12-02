package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

	@Test(enabled=false)
	public void supplyChainLabelVerification() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage= new TurbinePage();
		SupplyChainPage supplychain=new SupplyChainPage();
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
		assertTrue(supplychain.bearingToBeReplacedAvailabilityLabel().getText().contains("Bearings to be replaced availability"));
		assertTrue(supplychain.availabilityByWarehouseLabel().getText().contains("Availability by Warehouse"));
	}
	
	@Test(enabled=true)
	public void dropDownValueSelection() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage= new TurbinePage();
		SupplyChainPage supplychain=new SupplyChainPage();
		CommonUtilities utilities=new CommonUtilities();
		Robot robot = new Robot();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		//Turbine Model Dropdown
		assertTrue(supplychain.turbineModelLabel().isDisplayed());
		supplychain.turbineModelDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.turbineModelDropdownValueG87().isDisplayed());
		assertTrue(supplychain.turbineModelDropdownValueG87().getText().contains("G87"));
		supplychain.turbineModelDropdownValueG87CheckBox().click();
		robot.keyPress(KeyEvent.VK_TAB);
		//Turbine ID Dropdown
		supplychain.turbineIdDropdown().click();
		assertTrue(supplychain.turbineIdDropdownValueBOU_U001().isDisplayed());
		assertTrue(supplychain.turbineIdDropdownValueBOU_U001().getText().contains("BOU_U001"));
		supplychain.turbineIdDropdownValueBOU_U001CheckBox().click();
		supplychain.turbineIdDropdown().click();
		//Asset Dropdown
		supplychain.assetDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.assetDropdownValueGearbox().isDisplayed());
		assertTrue(supplychain.assetDropdownValueGearbox().getText().contains("Gearbox"));
		utilities.javaScriptClick(supplychain.assetDropdownValueGearboxCheckBox());
		Thread.sleep(3000);
		supplychain.assetDropdown().click();
		//Position Dropdown
		supplychain.positionDropdown().click();
		Thread.sleep(3000);
		assertTrue(supplychain.positionDropdownValueHIS_S_GS().isDisplayed());
		assertTrue(supplychain.positionDropdownValueHIS_S_GS().getText().contains("HIS-S-GS"));
		utilities.javaScriptClick(supplychain.positionDropdownValueCheckboxHIS_S_GS());
		Thread.sleep(3000);
		supplychain.positionDropdown().click();	
		Thread.sleep(5000);
	}

	
	@AfterMethod(enabled=false)
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
