package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.ElementExisitsPage;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.ReportFeedbackPage;
import com.skf.pages.TurbinePage;

public class Test_wind_48 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyReportFeedbackEditable() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_48_login"), config.getProperty("test_wind_48_pass"));
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
			 assertEquals(turbinePage.reportFaultButtonOnHeaderPopUp().getAttribute("title"), "You are not authorized to view this content");
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
	  public void verifyAnalyticsInsights() throws Exception {
		  
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_48_login"), config.getProperty("test_wind_48_pass"));
			AnalyticsPage analyticsPage = new AnalyticsPage();
			TurbinePage turbinePage =new TurbinePage();
			assertTrue(turbinePage.filterLabel().isDisplayed());
			ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
			elemenetExixitsPage.isTurbineOverviewPresent();
			analyticsPage.analyticsLabel().click();
			assertTrue(analyticsPage.insightLabel().isDisplayed());
			
	}
	@AfterMethod
		public void tearDown() {
			Page.driver.close();
			driver=null;
			log.debug("Browser closed");
	}
}
