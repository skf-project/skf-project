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
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class EventSection extends Page {
	
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	@Test(enabled = true)
	public void eventDropdownFunctionality() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault=new ReportFaultPage();
		turbinePage.windFarmSearchDropdown().click();
		turbinePage.windFarmSearchSeeAllSearchResult().click();
		utilities.javaScriptExecutorType("WO B2 15550821");
		turbinePage.windFarmSearchRecord().click();
		Thread.sleep(3000);
		assertTrue(turbinePage.windFarmSearchRecordOnMap().isDisplayed());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", turbinePage.windFarmSearchRecordOnMap());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButton().click();
		assertTrue(reportFault.reportHeaderLabel().isDisplayed());
		reportFault.assetsDropDown().click();
		reportFault.assetsFirstDropDownValue().click();
		reportFault.eventDropDown().click();
		Thread.sleep(3000);
		utilities.javaScriptExecutorType("New event");
		reportFault.eventDropDownValueNewEvent().click();
		Thread.sleep(5000);
	}
	
	@AfterMethod(enabled=true)
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
