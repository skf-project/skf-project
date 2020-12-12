package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;

public class Test_wind_102 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	
	  @Test
	  public void verifyTurbineOverview() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_102_login"), config.getProperty("test_wind_102_pass"));
			 TurbinePage turbinePage =new TurbinePage();
			 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("THO_U014");
			 turbinePage.noptions().click();
			 ReportFaultPage reportFaultPage = new ReportFaultPage();
			 reportFaultPage.mapTurbine().click();
			 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
			 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
			 assertEquals(turbinePage.reportFeedbackButtonOnHeaderPop().getAttribute("title"), "You are not authorized to view this content");
			 assertEquals(turbinePage.reportFaultButtonOnHeaderPopUp().getAttribute("title"), "You are not authorized to view this content");
	}
	  @Test
	  public void verifyAnalytics() throws Exception
	  {
		    fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_102_login"), config.getProperty("test_wind_102_pass"));
			TurbinePage turbinePage =new TurbinePage();
			assertTrue(turbinePage.filterLabel().isDisplayed());
			AnalyticsPage analyticsPage = new AnalyticsPage();
			analyticsPage.analyticsLabel().click();
			assertTrue(analyticsPage.analyticsLabel().isDisplayed());
			assertTrue(analyticsPage.reliabilityLabel().isDisplayed());
			assertTrue(analyticsPage.insightLabel().isDisplayed());
			assertTrue(analyticsPage.sensorRollerLabel().isDisplayed());
		
			
   }
	  @Test
	  public void verifyEventAndWorkOrders() throws Exception
	  {
		    fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_102_login"), config.getProperty("test_wind_102_pass"));
			Thread.sleep(15000);
			EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
			eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
			assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
			assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
	  }
	  @Test
	  public void verifySupplyChain() throws Exception {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_102_login"), config.getProperty("test_wind_102_pass"));
			TurbinePage turbinePage = new TurbinePage();
			Thread.sleep(15000);
			SupplyChainPage supplychain = new SupplyChainPage();
			assertTrue(turbinePage.supplyChainHeaderButton().isDisplayed());
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
