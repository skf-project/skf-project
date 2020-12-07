package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;

public class Test_wind_9 extends Page {
	
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  @Test
  public void verifyReportFaultEditable() throws Exception {
	  
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		 config.load(fisco);
		 LoginPage loginPage = new LoginPage();
		 loginPage.loginApp(config.getProperty("test_wind_9_login"), config.getProperty("test_wind_9_pass"));
		 TurbinePage turbinePage =new TurbinePage();
		 assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
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
		 reportFaultPage.eventDropDown().click();
		 assertTrue(reportFaultPage.eventDropDownFirstValue().isDisplayed());
		 assertTrue(reportFaultPage.eventDropDownValueNewEvent().isDisplayed());
		 reportFaultPage.eventDropDownFirstValue().click();
		 assertEquals("Indicated fault",reportFaultPage.indicatedFaultLabel().getText());
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
}
