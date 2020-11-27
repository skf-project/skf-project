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

public class CancelFlow extends Page {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled = true)
	public void cancelFlowFuntionality() throws InterruptedException, IOException, AWTException {
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
		reportFault.indicatedFaultDropdownFirstValue().click();
		reportFault.positionDropdown().click();
		reportFault.positionDropdownFirstValue().click();
		reportFault.severityDropDown().click();
		reportFault.severityDropdownTenthValue().click();
		reportFault.eventCommentTextBox().sendKeys("Test123$");
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		JavascriptExecutor jsec = (JavascriptExecutor) driver;
		jsec.executeScript("arguments[0].click()", turbinePage.closeButtonOnHeaderPop());
		turbinePage.reportFaultButton().click();
		assertTrue(reportFault.reportHeaderLabel().isDisplayed());
	}

	@Test(enabled = true)
	public void saveButtonFuntionalityAndErrorMessage() throws InterruptedException, IOException, AWTException {
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
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		assertTrue(reportFault.saveButton().isEnabled());
		reportFault.saveButton().click();
		assertTrue(reportFault.errorMsgEventCaseReportPositionIsRequired().isDisplayed());
		reportFault.errorMsgEventCaseReportPositionIsRequired().getText()
				.contains("Event Case Report Position is required");

	}

	@Test(enabled = true)
	public void submitEventButtonFuntionalityAndErrorMessages() throws InterruptedException, IOException, AWTException {
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
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		assertTrue(reportFault.saveButton().isEnabled());
		reportFault.approveButton().click();
		reportFault.submitEventButton().click();
		assertTrue(reportFault.errorMsgEventCaseReportSeverityIsRequired().isDisplayed());
		assertTrue(reportFault.errorMsgEventCaseReportIndicatedFaultIsRequired().isDisplayed());
		assertTrue(reportFault.errorMsgEventCaseReportPositionIsRequired1().isDisplayed());
		assertTrue(reportFault.errorMsgEventCaseReportPositionIsRequired1().getText()
				.contains("Event Case Report Position is required"));
		assertTrue(reportFault.errorMsgEventCaseReportSeverityIsRequired().getText()
				.contains("Event Case Report Severity is required"));
		assertTrue(reportFault.errorMsgEventCaseReportIndicatedFaultIsRequired().getText()
				.contains("Event Case Report Indicated Fault is required"));

	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}
