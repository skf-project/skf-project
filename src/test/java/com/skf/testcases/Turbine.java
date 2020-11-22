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
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
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

	@Test(enabled = false)
	public void countryFilterFuntionality() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
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
		CommonUtilities utilities= new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.countryDropdown().click();
		utilities.javaScriptExecutorType("BEL");
		assertTrue(turbinePage.countrySelectFirstValueBEL().isDisplayed());
		utilities.javaScriptExecutorType("InvalidInput");
		assertTrue(turbinePage.countryNoOptionDropdownValue().isDisplayed());
		Thread.sleep(5000);

	}
	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}