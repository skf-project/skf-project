package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;



public class ExistingEvent extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	
	
	
  @Test
  public void verifyExistingEvent() throws IOException, InterruptedException {
	  
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
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 reportFaultPage.eventDropDown().click();
		 assertTrue(reportFaultPage.eventDropDownFirstValue().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDownValueNewEvent().isDisplayed());
		 reportFaultPage.eventDropDownFirstValue().click();
		 assertEquals("Indicated fault",reportFaultPage.indicatedFaultLabel().getText());
		 //assertTrue(reportFaultPage.indicatedFaultDropdown().isDisplayed());
		 assertEquals("Position",reportFaultPage.positionLabel().getText());
		 assertTrue(reportFaultPage.positionDropdown().isDisplayed());
		 assertEquals("Severity",reportFaultPage.severityLabel().getText());
		 assertTrue(reportFaultPage.severityDropDown().isDisplayed());
		 assertEquals("Images",reportFaultPage.imagesLabel().getText());
		 assertTrue(reportFaultPage.uploadImageButton().isDisplayed());
		 assertEquals("Description",reportFaultPage.descriptionLabel().getText());
		 assertTrue(reportFaultPage.descriptionTextBox().isDisplayed());
		 assertEquals("Comment",reportFaultPage.commentLabel().getText());
		 assertTrue(reportFaultPage.eventCommentTextBox().isDisplayed());
		 assertEquals("WORK ORDERS",reportFaultPage.workOrdersLabel().getText());
		 assertEquals("Add",reportFaultPage.addButtonLabel().getText());
		 assertEquals("Product availability",reportFaultPage.productavailabilityLabel().getText());
		 assertEquals("No dates are available", reportFaultPage.NoDatesAreAvailableLabel().getText());
		 assertEquals("Approved",reportFaultPage.approveLabel().getText());
		 assertTrue(reportFaultPage.approveButton().isDisplayed());
		 assertTrue(reportFaultPage.saveButton().isDisplayed());
		 assertTrue(reportFaultPage.submitEventButton().isDisplayed());
		 
  }
  @Test
  public void existingEventSave() throws IOException, InterruptedException, AWTException
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
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 reportFaultPage.eventDropDown().click();
		 reportFaultPage.eventDropDownFirstValue().click();
		 String PositionValue=reportFaultPage.reportFaultPositionValue().getText();
		 CommonUtilities utilities = new CommonUtilities();
		 reportFaultPage.positionDropdown().click();
		 utilities.javaScriptExecutorType(PositionValue);
		 reportFaultPage.positionDropdownFirstValue().click();
		 reportFaultPage.saveButton().click();
		 assertTrue(reportFaultPage.errorMsgPositionIsRequired().isDisplayed());
		 reportFaultPage.positionDropdown().click();
		 reportFaultPage.positionDropdownFirstValue().click();
		 reportFaultPage.saveButton().click();
		 assertTrue(reportFaultPage.sucessMsgEventSaved().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
		 
  }
      @Test
      public void existingEventSubmit() throws IOException, InterruptedException, AWTException
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
 		 assertTrue(reportFaultPage.eventDropDown().isDisplayed());
 		 reportFaultPage.eventDropDown().click();
 		 reportFaultPage.eventDropDownFirstValue().click();
 		 CommonUtilities utilities = new CommonUtilities();
 		 String IndicatedFaultValue=reportFaultPage.reportFaultIndicatedFaultValue().getText();
		 reportFaultPage.reportFaultIndicatedFaultValue().click();
		 utilities.javaScriptExecutorType(IndicatedFaultValue);
		 reportFaultPage.indicatedFaultDropdownFirstValue().click();
		 String PositionValue=reportFaultPage.reportFaultPositionValue().getText();
		 reportFaultPage.positionDropdown().click();
		 utilities.javaScriptExecutorType(PositionValue);
		 reportFaultPage.positionDropdownFirstValue().click();
		 String SeverityValue=reportFaultPage.reportFaultSeverityValue().getText();
		 reportFaultPage.severityDropDown().click();
		 utilities.javaScriptExecutorType(SeverityValue);
		 reportFaultPage.severityDropdownFirstValue().click();
		 reportFaultPage.approveButton().click();
		 reportFaultPage.submitEventButton().click();
		 assertTrue(reportFaultPage.errorMsgEventCaseReportIndicatedFaultIsRequired().isDisplayed());
		 assertTrue(reportFaultPage.errorMsgEventCaseReportPositionIsRequired1().isDisplayed());
		 assertTrue(reportFaultPage.errorMsgEventCaseReportSeverityIsRequired().isDisplayed());
		 
    	  
      }
  @AfterMethod()
 	public void tearDown() {
 		Page.driver.close();
 		driver=null;
 		log.debug("Browser closed");
 	}
}
