package com.skf.testcases;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;

public class ReportFault extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  
  @Test
  public void verifyTurbinePopUp() throws IOException 
  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
	 config.load(fisco);
	 LoginPage loginPage = new LoginPage();
	 loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
	 TurbinePage turbinePage =new TurbinePage();
	 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
	 turbinePage.turbineDropdown().click();
	 turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
	 turbinePage.noptions().click();
	 ReportFaultPage reportFaultPage = new ReportFaultPage();
	 reportFaultPage.mapTurbine().click();
	 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
	 System.out.println(turbinePage.turbineNameOnHeaderPopUp().getText());
	 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
	 assertTrue(turbinePage.nextPlannedActionOnHeaderPopUp().isDisplayed());
	 assertTrue(turbinePage.indicatedFaultOnHeaderPopUp().isDisplayed());
	 assertTrue(turbinePage.previousActionTakenOnHeaderPopUp().isDisplayed());
	 assertTrue(turbinePage.reportFaultButtonOnHeaderPopUp().isDisplayed());
	 assertTrue(turbinePage.reportFeedbackButtonOnHeaderPop().isDisplayed());
	 assertTrue(turbinePage.closeButtonInTurbinePopUp().isDisplayed());
	 turbinePage.closeButtonInTurbinePopUp().click();
	 assertFalse(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
  }
  
  @Test
  public void verifyReportFaultPopUp() throws IOException, InterruptedException 
  {
	     fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		 TurbinePage turbinePage =new TurbinePage();
		 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		 turbinePage.turbineDropdown().click();
		 turbinePage.turbinedatafield().sendKeys("WO B2 15550821");
		 turbinePage.noptions().click();
		 ReportFaultPage reportFaultPage = new ReportFaultPage();
		 reportFaultPage.mapTurbine().click();
		 assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		 turbinePage.reportFaultButtonOnHeaderPopUp().click();
		 assertTrue(reportFaultPage.reportFaultCloseButton().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultClearAllLink().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultRegionFilter().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultRegionTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultCountryFilter().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultCountryTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultOwnerFilter().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultOwnerTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultWindFarmFilter().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultWindFarmTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultTurbineFilter().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultTurbineTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultAssetFilter().isDisplayed());
		 reportFaultPage.reportFaultAssetFilter().click();
		 reportFaultPage.reportFaultAssetFirstValue().click();	 
		 Thread.sleep(15000);
		 assertTrue(reportFaultPage.reportFaultAssetTickMark().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.reportFaultClearAllLink().click();
		 assertTrue(reportFaultPage.reportFaultRegionFilter().isDisplayed());
		 reportFaultPage.countryFilterNotPresent();
		 reportFaultPage.reportFaultRegionFilter().click();
		 reportFaultPage.reportFaultRegionFirstValue().click();
		 assertTrue(reportFaultPage.reportFaultRegionTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultCountryFilter().isDisplayed());
		 reportFaultPage.reportFaultCountryFilter().click();
		 reportFaultPage.reportFaultCountryFirstValue().click();
		 assertTrue(reportFaultPage.reportFaultCountryTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultOwnerFilter().isDisplayed());
		 reportFaultPage.reportFaultOwnerFilter().click();
		 reportFaultPage.reportFaultOwnerFirstValue().click();
		 assertTrue(reportFaultPage.reportFaultOwnerTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultWindFarmFilter().isDisplayed());
		 reportFaultPage.reportFaultWindFarmFilter().click();
		 reportFaultPage.reportFaultWindFarmFirstValue().click();
		 assertTrue(reportFaultPage.reportFaultWindFarmTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultTurbineFilter().isDisplayed());
		 reportFaultPage.reportFaultTurbineFilter().click();
		 Thread.sleep(2000);
		 reportFaultPage.reportFaultTurbineFirstValue().click();
		 Thread.sleep(10000);
		 assertTrue(reportFaultPage.reportFaultTurbineTickMark().isDisplayed());
		 assertTrue(reportFaultPage.reportFaultAssetFilter().isDisplayed());
		 reportFaultPage.reportFaultCloseButton().click();
		 assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
  }
  @Test
  public void verifyLeftAndRightClick() throws IOException, InterruptedException
  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		 TurbinePage turbinePage =new TurbinePage();
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
		 assertTrue(reportFaultPage.eventTable().isDisplayed());
		 assertEquals("Date",reportFaultPage.eventTableDateHeader().getText());
		 assertEquals("Indicated fault",reportFaultPage.eventTableIndicatedFaultHeader().getText());
		 assertEquals("Event",reportFaultPage.eventTableEventHeader().getText());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 reportFaultPage.leftSignOnReportFault().click();
		 assertFalse(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.leftSignOnReportFault().click();
		 assertTrue(reportFaultPage.reportFaultFilterLabel().isDisplayed());
		 reportFaultPage.rightSignOnReportFault().click();
		 assertFalse(reportFaultPage.eventDropDown().isDisplayed()); 
		 reportFaultPage.rightSignOnReportFault().click();
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 
  }
  
    @AfterMethod()
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
