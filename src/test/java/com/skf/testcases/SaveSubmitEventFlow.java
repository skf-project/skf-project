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

public class SaveSubmitEventFlow extends Page {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled = true)
	public void saveEventFuntionality() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault = new ReportFaultPage();
		Robot robot = new Robot();

		turbinePage.windFarmSearchDropdown().click();
		turbinePage.windFarmSearchSeeAllSearchResult().click();
		utilities.javaScriptExecutorType("VAS1 - Turbine");
		turbinePage.windFarmSearchRecordVASTurbine().click();
		Thread.sleep(3000);
		assertTrue(turbinePage.windFarmSearchRecordOnMapVAS1().isDisplayed());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", turbinePage.windFarmSearchRecordOnMapVAS1());
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
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.positionDropdown().click();
		reportFault.positionDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		reportFault.addButtonLabel().click();
		reportFault.workOrderDeleteIcon().click();
		assertTrue(reportFault.workOrderCancelDeleteIcon().isDisplayed());
		reportFault.workOrderApproveDeleteIcon().click();
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
		reportFault.saveButton().click();
		assertTrue(reportFault.errorMsgEventCaseReport().isDisplayed());
		assertTrue(reportFault.errorMsgEventCaseReport().getText().contains("Event Case saved Successfully"));

	}
	
	@Test(enabled = true)
	public void submitEventFuntionality() throws InterruptedException, IOException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		ReportFaultPage reportFault = new ReportFaultPage();
		Robot robot = new Robot();

		turbinePage.windFarmSearchDropdown().click();
		turbinePage.windFarmSearchSeeAllSearchResult().click();
		utilities.javaScriptExecutorType("VAS1 - Turbine");
		turbinePage.windFarmSearchRecordVASTurbine().click();
		Thread.sleep(3000);
		assertTrue(turbinePage.windFarmSearchRecordOnMapVAS1().isDisplayed());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", turbinePage.windFarmSearchRecordOnMapVAS1());
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
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.positionDropdown().click();
		reportFault.positionDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		reportFault.addButtonLabel().click();
		reportFault.workOrderDeleteIcon().click();
		assertTrue(reportFault.workOrderCancelDeleteIcon().isDisplayed());
		reportFault.workOrderApproveDeleteIcon().click();
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
		Thread.sleep(2000);
		reportFault.submitEventButton().click();
		Thread.sleep(15000);
		assertTrue(reportFault.errorMsgEventCaseReport().isDisplayed());
		assertTrue(reportFault.errorMsgEventCaseReport().getText().contains("Event Case saved Successfully"));
	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}
