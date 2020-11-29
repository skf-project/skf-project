package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;

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
		 assertTrue(reportFaultPage.saveButton().isDisplayed());
		 assertTrue(reportFaultPage.submitEventButton().isDisplayed());
		 
  }
}
