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
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;

public class Test_wind_13 extends Page{
  
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	
  @Test
  public void verifyReportFaultEditable() throws Exception {
	  
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("test_wind_13_login"), config.getProperty("test_wind_13_pass"));
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
		 turbinePage.reportFaultButtonOnHeaderPopUp().click(); 
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.reportFaultAssetFilter().click();
		 reportFaultPage.reportFaultAssetFirstValue().click();
		 Thread.sleep(15000);
		 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
  }
  @Test
  public void verifyReportFeedbackEditable() throws Exception
  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("test_wind_13_login"), config.getProperty("test_wind_13_pass"));
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
		loginPage.loginApp(config.getProperty("test_wind_13_login"), config.getProperty("test_wind_13_pass"));
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
		loginPage.loginApp(config.getProperty("test_wind_13_login"), config.getProperty("test_wind_13_pass"));
		TurbinePage turbinePage = new TurbinePage();
		SupplyChainPage supplychain = new SupplyChainPage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.supplyChainHeaderButton().click();
		assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
  }
  
  @AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
}
}
