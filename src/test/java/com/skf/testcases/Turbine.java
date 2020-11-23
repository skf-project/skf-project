package com.skf.testcases;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class Turbine extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled = false)
	public void turbine() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.turbineDropdown().click();
		turbinePage.firstValueOfTurbineDropDown().click();
		turbinePage.filterLabel().click();
		turbinePage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.nextPlannedActionOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.indicatedFaultOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.previousActionTakenOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().isDisplayed();
		turbinePage.reportFeedbackButtonOnHeaderPop().isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", turbinePage.closeButtonOnHeaderPop());
		turbinePage.user().click();
		turbinePage.signOut().click();
	}

	@Test 
	public void countryFilterFuntionality() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.countryDropdown().click();
		assertTrue(turbinePage.countrySelectAllDropDownValue().isDisplayed());
		turbinePage.countrySelectFirstValueBEL().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.countryTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.countryDropdown().click();
		turbinePage.countrySelectAllDropDownValue().click();
		assertTrue(turbinePage.countryTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.countryDropdown().click();
		turbinePage.countrySelectAllDropDownValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		turbinePage.countrySelectFirstValueBEL().click();
		assertTrue(turbinePage.countryTickMark().isEnabled());
	}

	@Test 
	public void countryFilterTypingFuntionality() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.countryDropdown().click();
		utilities.javaScriptExecutorType("BEL");
		assertTrue(turbinePage.countrySelectFirstValueBEL().isDisplayed());
		utilities.javaScriptExecutorType("InvalidInput");
		assertTrue(turbinePage.countryNoOptionDropdownValue().isDisplayed());
	}

	@Test 
	public void ownerFilterFuntionality() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.ownerDropdown().click();
		assertTrue(turbinePage.ownerSelectAllDropdownValue().isDisplayed());
		turbinePage.ownerSelectFirstValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.ownerTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.ownerDropdown().click();
		turbinePage.ownerSelectAllDropdownValue().click();
		assertTrue(turbinePage.ownerTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.ownerDropdown().click();
		assertTrue(turbinePage.ownerSelectAllDropdownValue().isDisplayed());
		turbinePage.ownerSelectFirstValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.ownerTickMark().isEnabled());
	}	

	@Test 
	public void ownerFilterTypingFuntionality() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.ownerDropdown().click();
		utilities.javaScriptExecutorType("Boralex");
		assertTrue(turbinePage.ownerSelectFirstValue().isDisplayed());
		utilities.javaScriptExecutorType("InvalidInput");
		assertTrue(turbinePage.countryNoOptionDropdownValue().isDisplayed());
	}

	@Test 
	public void turbineOverviewUI() throws IOException{

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.openEventLabelText().isDisplayed());
		assertTrue(turbinePage.workOrdersLabelText().isDisplayed());
		assertTrue(turbinePage.overdueLabelText().isDisplayed());
		assertTrue(turbinePage.filtersLabelText().isDisplayed());
		assertTrue(turbinePage.searchLabelText().isDisplayed());	//Search label is wrong which is not checked here	
		assertTrue(turbinePage.lastSubmitedEventReportsLabelText().isDisplayed());
		assertTrue(turbinePage.windFarmMapLabelText().isDisplayed());

	}

	@Test 
	public void regionalFilter1() throws IOException{

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();		
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.regiontickMark().isEnabled());

	}

	@Test 
	public void regionalFilter2() throws IOException{

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		//2
		turbinePage.regionDropdownFilter().click();
		//3
		turbinePage.regionDropdownEUOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		//4
		turbinePage.clearAllLink().click();
		//assertFalse(turbinePage.clearAllLink().isDisplayed());
		//assertFalse(turbinePage.tickMark().isEnabled());
		//5
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		//assertTrue(turbinePage.tickMark().isEnabled());
		//6
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();
		//assertFalse(turbinePage.clearAllLink().isDisplayed());
		//assertFalse(turbinePage.tickMark().isEnabled());

	}

	@Test 
	public void regionalFilter3() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.regionDropdownFilter().click();
		utilities.javaScriptExecutorType("EU");
		
		assertTrue(turbinePage.regionDropdownEUOption().isDisplayed());
		turbinePage.regionDropdownEUOption().click();
		turbinePage.clearAllLink().click();
		turbinePage.regionDropdownFilter().click();
		utilities.javaScriptExecutorType("Asia");
		assertTrue(turbinePage.regionNoOptionDropdownValue().isDisplayed());
	}
	
	@Test 
	public void windFarmFilter1() throws IOException{

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmDropdownClerimoisOption().click();		
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.windFarmSelectAllDropdownOption().isDisplayed());

	}
	
	@Test 
	public void windFarmFilter2() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		//assertTrue(turbinePage.windFarmSelectAllDropdownOption().isDisplayed());
		//
		turbinePage.windFarmSelectFirstValueArtois().click();
		turbinePage.windFarmSelectFifthValueCalmont().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		//
		turbinePage.clearAllLink().click();
		//
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		//
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());

	}
	
	@Test 
	public void windFarmFilter3() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		utilities.javaScriptExecutorType("Clerimois");
		assertTrue(turbinePage.windFarmDropdownClerimoisOption().isDisplayed());
		turbinePage.windFarmDropdownClerimoisOption().click();
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		utilities.javaScriptExecutorType("Incorrect");
		assertTrue(turbinePage.windFarmNoOptionDropdownValue().isDisplayed());
	}
	
	@Test 
	public void windFarmFilter4() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		//
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();;
		//
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());		
		//
		turbinePage.clearAllLink().click();		
		//
		turbinePage.windFarmDropdownFilter().click();
		assertTrue(turbinePage.windFarmSelectAllDropdownOption().isDisplayed());

	}

	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}