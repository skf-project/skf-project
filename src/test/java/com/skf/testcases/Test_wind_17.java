package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.ReportFeedbackPage;
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class Test_wind_17 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyReportFeedbackEditable() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_17_login"), config.getProperty("test_wind_17_pass"));
			 TurbinePage turbinePage =new TurbinePage();
			 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("NE M3 15560350 S");
			 turbinePage.noptions().click();
			 ReportFaultPage reportFaultPage = new ReportFaultPage();
			 reportFaultPage.mapTurbine().click();
			 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
			 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
			 assertEquals(turbinePage.reportFaultButtonOnHeaderPopUp().getAttribute("title"), "You are not authorized to view this content");
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
	  public void verifyEventAndWorkOrders() throws Exception
	  {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_17_login"), config.getProperty("test_wind_17_pass"));
			EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
			TurbinePage turbinePage = new TurbinePage();
			assertTrue(turbinePage.filterLabel().isDisplayed());
			eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
			assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
			assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
			eventWorkAndOrderPage.pageTittle().click();
			assertEquals(eventWorkAndOrderPage.pageTittleText(),config.getProperty("eventAndWordOrderPageTittle"));
	  }
	  
	  @Test
	  public void verifySupplyChain() throws Exception {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_17_login"), config.getProperty("test_wind_17_pass"));
			TurbinePage turbinePage = new TurbinePage();
			SupplyChainPage supplychain = new SupplyChainPage();
			assertTrue(turbinePage.filterLabel().isDisplayed());
			turbinePage.supplyChainHeaderButton().click();
			assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
	  }
}
