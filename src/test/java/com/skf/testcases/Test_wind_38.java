package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.ReportFeedbackPage;
import com.skf.pages.TurbinePage;

public class Test_wind_38 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyReportFaultEditable() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_38_login"), config.getProperty("test_wind_38_pass"));
			 TurbinePage turbinePage =new TurbinePage();
			 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
			 assertTrue(turbinePage.noptions().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("ART1_U007");
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
			 reportFaultPage.eventDropDownValueNewEvent().click();
			 assertEquals("Indicated fault",reportFaultPage.indicatedFaultLabel().getText());
			 assertEquals("Position",reportFaultPage.positionLabel().getText());
			 assertEquals("Severity",reportFaultPage.severityLabel().getText());
			 assertEquals("Comment",reportFaultPage.commentLabel().getText());
			 assertEquals("WORK ORDERS",reportFaultPage.workOrdersLabel().getText());
			 assertEquals("Add",reportFaultPage.addButtonLabel().getText());
			 assertEquals("Approved",reportFaultPage.approveLabel().getText());
			 assertTrue(reportFaultPage.approveButton().isDisplayed());
			 assertTrue(reportFaultPage.saveButton().isDisplayed());
			 assertTrue(reportFaultPage.submitEventButton().isDisplayed());
	  }
	@Test
	  public void verifyReportFeedbackEditable() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_38_login"), config.getProperty("test_wind_38_pass"));
			 TurbinePage turbinePage =new TurbinePage();
			 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("ART1_U007");
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
			 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
			 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		  }
	  @Test
	  public void verifyEventAndWorkOrders() throws Exception
	  {
		    fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_38_login"), config.getProperty("test_wind_38_pass"));
			Thread.sleep(15000);
			EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
			eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
			assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
			assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
	  }
	  
	  @AfterMethod
		public void tearDown() {
			Page.driver.close();
			driver=null;
			log.debug("Browser closed");
	}
}
