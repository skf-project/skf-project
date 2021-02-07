package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
	public void eventDropdownFunctionalityandLabels() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault = new ReportFaultPage();
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
		// Verify the event section label
		assertTrue(reportFault.customerEventIdLabel().isDisplayed());
		assertTrue(reportFault.indicatedFaultLabel().isDisplayed());
		assertTrue(reportFault.positionLabel().isDisplayed());
		assertTrue(reportFault.severityLabel().isDisplayed());
		assertTrue(reportFault.workOrdersLabel().isDisplayed());
		assertTrue(reportFault.addButtonLabel().isDisplayed());
		assertTrue(reportFault.approveLabel().isDisplayed());
	}

	@Test(enabled = true)
	public void eventComponentsAndWorkOrderComponent() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault = new ReportFaultPage();
		Robot robot = new Robot();
		Thread.sleep(10000);
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
		reportFault.customerIdRadioButton().click();
		assertTrue(reportFault.customerEventIdTextBoxPlaceholder().isDisplayed());
		robot.keyPress(KeyEvent.VK_TAB);
		utilities.javaScriptExecutorType("Event123");
		reportFault.indicatedFaultDropdown().click();
		Thread.sleep(2000);
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.positionDropdown().click();
		reportFault.positionDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		reportFault.addButtonLabel().click();
		//verify work order labels
		Thread.sleep(2000);
		assertTrue(reportFault.workOrderNewLabel().getText().contains("new"));
		assertTrue(reportFault.workOrderCustomerIdLabel().getText().contains("Custom work order id"));
		assertTrue(reportFault.workOrderRecommendedLabel().getText().contains("Recommended action"));
		assertTrue(reportFault.workOrderRequestDateLabel().getText().contains("Request date"));
		assertTrue(reportFault.workOrderCommentLabel().getText().contains("Comment"));
		assertTrue(reportFault.workOrderDeleteLabel().getText().contains("Delete"));
		reportFault.workOrderCustomerIdRadioButton().click();
		Thread.sleep(2000);
		reportFault.workOrderCustomerEventIdTextBox().sendKeys("Event111");
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		reportFault.workOrderRecommendedDrodown().click();
		utilities.javaScriptExecutorType("Check Bearing Clearance");
		reportFault.workOrderRecommendedDropDownValue().click();
		reportFault.workOrderCommentTextBox().sendKeys("Event 123");
	}
	
	@Test(enabled = true)
	public void eventButtonFuntionality() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault = new ReportFaultPage();
		Robot robot = new Robot();
		Thread.sleep(5000);
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
		reportFault.customerIdRadioButton().click();
		robot.keyPress(KeyEvent.VK_TAB);
		utilities.javaScriptExecutorType("Event123");
		reportFault.indicatedFaultDropdown().click();
		Thread.sleep(2000);
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.positionDropdown().click();
		reportFault.positionDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		Thread.sleep(2000);
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		reportFault.addButtonLabel().click();
		Thread.sleep(2000);
		reportFault.workOrderDeleteIcon().click();
		assertTrue(reportFault.workOrderCancelDeleteIcon().isDisplayed());
		reportFault.workOrderApproveDeleteIcon().click();
		Thread.sleep(2000);
		reportFault.addButtonLabel().click();
		reportFault.workOrderCustomerIdRadioButton().click();
		reportFault.workOrderCustomerEventIdTextBox().sendKeys("Event111");
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		reportFault.workOrderRecommendedDrodown().click();
		utilities.javaScriptExecutorType("Check Bearing Clearance");
		reportFault.workOrderRecommendedDropDownValue2().click();
		reportFault.workOrderCommentTextBox().sendKeys("Event 123");
		assertTrue(reportFault.saveButton().isEnabled());
		reportFault.approveButton().click();
		reportFault.submitEventButton().click();
	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}
