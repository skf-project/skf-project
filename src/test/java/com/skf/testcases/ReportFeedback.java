package com.skf.testcases;

import static org.testng.Assert.assertEquals;
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
import com.skf.pages.ReportFaultPage;
import com.skf.pages.ReportFeedbackPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class ReportFeedback extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  @Test
  public void reportFeedbackMandatoryValidation() throws IOException, Exception
  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		 TurbinePage turbinePage =new TurbinePage();
		 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		 assertTrue(turbinePage.filterLabel().isDisplayed());
		 turbinePage.turbineDropdown().click();
		 turbinePage.turbinedatafield().sendKeys("NE M3 15560350 S");
		 turbinePage.noptions().click();
		 ReportFaultPage reportFaultPage = new ReportFaultPage();
		 reportFaultPage.mapTurbine().click();
		 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		 turbinePage.reportFeedbackButtonOnHeaderPop().click();
		 ReportFeedbackPage reportFeedbackPage = new ReportFeedbackPage();
		 assertTrue(reportFeedbackPage.reportFeedbackHeader().isDisplayed());
		 assertTrue(reportFeedbackPage.reportFeedbackCloseButton().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.reportFaultAssetFilter().click();
		 reportFaultPage.reportFaultAssetFirstValue().click();
		 Thread.sleep(15000);
		 Robot robot = new Robot();
		 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 reportFaultPage.eventDropDown().click();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 assertTrue(reportFaultPage.indicatedFaultLabel().isDisplayed());
		 reportFeedbackPage.submitEventFeedbackButton().click();
		 assertTrue(reportFeedbackPage.indicationResultRequiredErrorMsg().isDisplayed());
		 assertTrue(reportFeedbackPage.feedbackActionRequiredErrorMsg().isDisplayed());
		 assertTrue(reportFeedbackPage.feedbackDateRequiredErrorMsg().isDisplayed());
		 reportFeedbackPage.workOrderDropdown().click();
		 assertTrue(reportFaultPage.workOrderRecommendedLabel().isDisplayed());
		 assertTrue(reportFaultPage.workOrderCommentLabel().isDisplayed());
		 assertTrue(reportFaultPage.workOrderRequestDateLabel().isDisplayed());
		 assertTrue(reportFeedbackPage.actionTakenLabel().isDisplayed());
		 reportFeedbackPage.actiontakenDropDown().click();
		 robot.keyPress(KeyEvent.VK_TAB);
		 String actionTaken =reportFeedbackPage.actiontakenDropDown().getText();
		 CommonUtilities utilities = new CommonUtilities();
		 reportFeedbackPage.actiontakenDropDown().click();
		 utilities.javaScriptExecutorType(actionTaken);
		 robot.keyPress(KeyEvent.VK_TAB);
  }
  @Test
  public void verifyReportFeedback() throws IOException, AWTException, Exception {
	  
	     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		 TurbinePage turbinePage =new TurbinePage();
		 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		 assertTrue(turbinePage.filterLabel().isDisplayed());
		 turbinePage.turbineDropdown().click();
		 turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		 turbinePage.noptions().click();
		 ReportFaultPage reportFaultPage = new ReportFaultPage();
		 reportFaultPage.mapTurbine().click();
		 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		 turbinePage.reportFeedbackButtonOnHeaderPop().click();
		 ReportFeedbackPage reportFeedbackPage = new ReportFeedbackPage();
		 assertTrue(reportFeedbackPage.reportFeedbackHeader().isDisplayed());
		 assertTrue(reportFeedbackPage.reportFeedbackCloseButton().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.reportFaultAssetFilter().click();
		 reportFaultPage.reportFaultAssetFirstValue().click();
		 Thread.sleep(15000);
		 Robot robot = new Robot();
		 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 reportFaultPage.eventDropDown().click();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 assertTrue(reportFaultPage.indicatedFaultLabel().isDisplayed());
		 //assertFalse(reportFeedbackPage.IndicatedFaultDropDown().isEnabled());
		 assertTrue(reportFaultPage.positionLabel().isDisplayed());
		 assertTrue(reportFaultPage.severityLabel().isDisplayed());
		 assertTrue(reportFaultPage.descriptionLabel().isDisplayed());
		 assertTrue(reportFeedbackPage.indicationResultLabel().isDisplayed());
		 assertTrue(reportFeedbackPage.positiveButton().isDisplayed());
		 assertTrue(reportFeedbackPage.negativeButton().isDisplayed());
		 assertTrue(reportFeedbackPage.dateCompletedLabel().isDisplayed());
		 assertTrue(reportFaultPage.commentLabel().isDisplayed());
		 assertTrue(reportFaultPage.workOrdersLabel().isDisplayed());
		 assertTrue(reportFeedbackPage.dateCompletedTextBox().isDisplayed());
		 assertTrue(reportFeedbackPage.submitEventFeedbackButton().isDisplayed());
		 reportFeedbackPage.positiveButton().click();
		 reportFeedbackPage.negativeButton().click();
		 reportFeedbackPage.dateCompletedTextBox().click();
		 assertTrue(reportFeedbackPage.calenderDatePicker().isDisplayed());
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 String DateInTextbox = reportFeedbackPage.dateCompletedTextBox().getAttribute("value");
		 assertEquals(DateInTextbox,reportFeedbackPage.currentDate());
		 reportFeedbackPage.submitEventFeedbackButton().click();
		 Thread.sleep(10000);
		 assertTrue(reportFeedbackPage.eventCaseSavedSucessfullyMsg().isDisplayed());
		
		 
  }
  
  @AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
