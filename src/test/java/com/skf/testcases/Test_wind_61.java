package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;

public class Test_wind_61 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyTurbineOverview() throws Exception {
		  
		     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fisco);
			 LoginPage loginPage = new LoginPage();
			 loginPage.loginApp(config.getProperty("test_wind_61_login"), config.getProperty("test_wind_61_pass"));
			 TurbinePage turbinePage =new TurbinePage();
			 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
			 assertTrue(turbinePage.filterLabel().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("ART2_U001");
			 assertTrue(turbinePage.noptions().isDisplayed());
			 turbinePage.turbineDropdown().click();
			 turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
			 turbinePage.noptions().click();
			 ReportFaultPage reportFaultPage = new ReportFaultPage();
			 reportFaultPage.mapTurbine().click();
			 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
			 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
			 assertEquals(turbinePage.reportFeedbackButtonOnHeaderPop().getAttribute("title"), "You are not authorized to view this content");
			 turbinePage.reportFaultButtonOnHeaderPopUp().click(); 
			 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
			 reportFaultPage.reportFaultAssetFilter().click();
			 reportFaultPage.reportFaultAssetFirstValue().click();
			 Thread.sleep(15000);
			 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
			 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		
	}
	 @AfterMethod
		public void tearDown() {
		  Page.driver.close();
		   driver=null;
		   log.debug("Browser closed");
	}
}
