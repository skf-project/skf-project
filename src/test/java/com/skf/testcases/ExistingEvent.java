package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class ExistingEvent extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test
	public void verifyExistingEvent() throws IOException, InterruptedException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		Thread.sleep(3000);
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		Thread.sleep(3000);
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFaultPage.eventDropDown().click();
		assertTrue(reportFaultPage.eventDropDownFirstValue().isDisplayed());
		assertTrue(reportFaultPage.eventDropDownValueNewEvent().isDisplayed());
		reportFaultPage.eventDropDownFirstValue().click();
		assertEquals("Indicated fault", reportFaultPage.indicatedFaultLabel().getText());
		// assertTrue(reportFaultPage.indicatedFaultDropdown().isDisplayed());
		assertEquals("Position", reportFaultPage.positionLabel().getText());
		assertTrue(reportFaultPage.positionDropdown().isDisplayed());
		assertEquals("Severity", reportFaultPage.severityLabel().getText());
		assertTrue(reportFaultPage.severityDropDown().isDisplayed());
		assertEquals("Images", reportFaultPage.imagesLabel().getText());
		assertTrue(reportFaultPage.uploadImageButton().isDisplayed());
		assertEquals("Description", reportFaultPage.descriptionLabel().getText());
		assertTrue(reportFaultPage.descriptionTextBox().isDisplayed());
		assertEquals("Comment", reportFaultPage.commentLabel().getText());
		assertTrue(reportFaultPage.eventCommentTextBox().isDisplayed());
		assertEquals("WORK ORDERS", reportFaultPage.workOrdersLabel().getText());
		assertEquals("Add", reportFaultPage.addButtonLabel().getText());
		assertEquals("Product availability", reportFaultPage.productavailabilityLabel().getText());
		assertEquals("No dates are available", reportFaultPage.NoDatesAreAvailableLabel().getText());
		assertEquals("Approved", reportFaultPage.approveLabel().getText());
		assertTrue(reportFaultPage.approveButton().isDisplayed());
		assertTrue(reportFaultPage.saveButton().isDisplayed());
		assertTrue(reportFaultPage.submitEventButton().isDisplayed());

	}

	@Test
	public void existingEventSave() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		Robot robot = new Robot();
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		ReportFaultPage reportFault = new ReportFaultPage();
		CommonUtilities utilities = new CommonUtilities();
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		Thread.sleep(10000);
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFault.eventDropDown().click();
		Thread.sleep(2000);
		utilities.javaScriptExecutorType("New event");
		reportFault.eventDropDownValueNewEvent().click();
		reportFault.customerIdRadioButton().click();
		robot.keyPress(KeyEvent.VK_TAB);
		utilities.javaScriptExecutorType("Event123" + rand_int1);
		reportFault.indicatedFaultDropdown().click();
		Thread.sleep(2000);
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		Thread.sleep(2000);
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		reportFaultPage.saveButton().click();
		assertTrue(reportFaultPage.errorMsgPositionIsRequired().isDisplayed());
		Thread.sleep(10000);
		reportFaultPage.positionDropdown().click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		reportFaultPage.saveButton().click();
		Thread.sleep(10000);
		assertTrue(reportFaultPage.sucessMsgEventSaved().isDisplayed());

	}

	@Test
	public void existingEventSubmit() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFaultPage.eventDropDown().click();
		reportFaultPage.eventDropDownFirstValue().click();
		CommonUtilities utilities = new CommonUtilities();
		Robot robot = new Robot();
		String IndicatedFaultValue = reportFaultPage.reportFaultIndicatedFaultValue().getText();
		reportFaultPage.reportFaultIndicatedFaultValue().click();
		utilities.javaScriptExecutorType(IndicatedFaultValue);
		reportFaultPage.indicatedFaultSearchedValue().click();
		String PositionValue = reportFaultPage.reportFaultPositionValue().getText();
		reportFaultPage.positionDropdown().click();
		utilities.javaScriptExecutorType(PositionValue);
		// robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		String SeverityValue = reportFaultPage.reportFaultSeverityValue().getText();
		reportFaultPage.severityDropDown().click();
		utilities.javaScriptExecutorType(SeverityValue);
		robot.keyPress(KeyEvent.VK_ENTER);
		// reportFaultPage.severityDropdownFirstValue().click();
		reportFaultPage.approveButton().click();
		reportFaultPage.submitEventButton().click();
		assertTrue(reportFaultPage.errorMsgEventCaseReportIndicatedFaultIsRequired().isDisplayed());
		assertTrue(reportFaultPage.errorMsgEventCaseReportPositionIsRequired1().isDisplayed());
		assertTrue(reportFaultPage.errorMsgEventCaseReportSeverityIsRequired().isDisplayed());

	}

	@Test
	public void existingEventSubmit1() throws IOException, InterruptedException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		Robot robot = new Robot();
		reportFaultPage.eventDropDown().click();
		reportFaultPage.eventDropDownFirstValue().click();
		CommonUtilities utilities = new CommonUtilities();
		String PositionValue = reportFaultPage.reportFaultPositionValue().getText();
		reportFaultPage.positionDropdown().click();
		utilities.javaScriptExecutorType(PositionValue);
		// robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		// reportFaultPage.positionDropdownFirstValue().click();
		String SeverityValue = reportFaultPage.reportFaultSeverityValue().getText();
		reportFaultPage.severityDropDown().click();
		utilities.javaScriptExecutorType(SeverityValue);
		robot.keyPress(KeyEvent.VK_ENTER);
		// reportFaultPage.severityDropdownFirstValue().click();
		reportFaultPage.approveButton().click();
		reportFaultPage.submitEventButton().click();
		assertTrue(reportFaultPage.errorMsgEventCaseReportPositionIsRequired1().isDisplayed());
		assertTrue(reportFaultPage.errorMsgEventCaseReportSeverityIsRequired().isDisplayed());
	}

	@Test
	public void existingEventSubmit2() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		Robot robot = new Robot();
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFaultPage.eventDropDown().click();
		reportFaultPage.eventDropDownFirstValue().click();
		CommonUtilities utilities = new CommonUtilities();
		String SeverityValue = reportFaultPage.reportFaultSeverityValue().getText();
		reportFaultPage.severityDropDown().click();
		utilities.javaScriptExecutorType(SeverityValue);
		robot.keyPress(KeyEvent.VK_ENTER);
		// reportFaultPage.severityDropdownFirstValue().click();
		reportFaultPage.approveButton().click();
		reportFaultPage.submitEventButton().click();
		assertTrue(reportFaultPage.errorMsgEventCaseReportSeverityIsRequired().isDisplayed());
	}

	 @Test(enabled=true)
	public void verifyUploadPositiveFile() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		Robot robot=new Robot();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFaultPage.eventDropDown().click();
		reportFaultPage.eventDropDownFirstValue().click();
		reportFaultPage.uploadImageButton().click();
		Thread.sleep(5000);
		utilities.javaScriptExecutorType(path + "\\src\\test\\resources\\files\\skf.jpg");
		robot.keyPress(KeyEvent.VK_ENTER);
		reportFaultPage.imageDeleteButton().isDisplayed();
	}

	 @Test
	public void existingEventSubmitFinal() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		Thread.sleep(5000);
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		turbinePage.noptions().click();
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		reportFaultPage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().click();
		assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		reportFaultPage.reportFaultAssetFilter().click();
		reportFaultPage.reportFaultAssetFirstValue().click();
		Thread.sleep(15000);
		assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		reportFaultPage.eventDropDown().click();
		reportFaultPage.eventDropDownFirstValue().click();
		String eventdropdownvalue = reportFaultPage.eventValue().getText();
		reportFaultPage.existingEventCommentBox().sendKeys("Test@123");
		assertTrue(reportFaultPage.addButtonLabel().isDisplayed());
		reportFaultPage.addButtonLabel().click();
		assertEquals("Delete", reportFaultPage.workOrderDeleteLabel().getText());
		assertTrue(reportFaultPage.workOrderCustomerIdRadioButton().isDisplayed());
		reportFaultPage.workOrderCustomerIdRadioButton().click();
		assertEquals("Custom work order id", reportFaultPage.workOrderCustomerIdLabel().getText());
		reportFaultPage.workOrderCustomerEventIdTextBox().sendKeys("Test726");
		assertEquals("Recommended action", reportFaultPage.workOrderRecommendedLabel().getText());
		reportFaultPage.workOrderRecommendedDrodown().click();
		reportFaultPage.workOrderRecommendedDropDownValue().click();
		assertEquals("Request date", reportFaultPage.workOrderRequestDateLabel().getText());
		assertTrue(reportFaultPage.workOrderCommentLabel().isDisplayed());
		reportFaultPage.workOrderCommentTextBox().sendKeys("testhjh");
		reportFaultPage.workOrderDeleteIcon().click();
		assertTrue(reportFaultPage.workOrderApproveDeleteIcon().isDisplayed());
		assertTrue(reportFaultPage.workOrderCancelDeleteIcon().isDisplayed());
		reportFaultPage.workOrderCancelDeleteIcon().click();
		assertTrue(reportFaultPage.workOrderDeleteIcon().isDisplayed());
		reportFaultPage.workOrderDeleteIcon().click();
		reportFaultPage.workOrderApproveDeleteIcon().click();
		assertTrue(reportFaultPage.saveButton().isEnabled());
		reportFaultPage.approveButton().click();
		assertTrue(reportFaultPage.submitEventButton().isEnabled());
		reportFaultPage.submitEventButton().click();
	}

	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}
