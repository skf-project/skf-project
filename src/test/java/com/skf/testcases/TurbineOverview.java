package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbineOverviewPage;
import com.skf.pages.TurbinePage;

public class TurbineOverview extends Page {
  @Test
  public void turbineoverview() throws Exception {
	  
	  LoginPage loginPage = new LoginPage();
	  loginPage.loginApp("test_Wind_1", "2D.tu68D2");
	  TurbinePage turbinePage = new TurbinePage();
	  TurbineOverviewPage turbineOverviewPage = new TurbineOverviewPage();
	  //Verify Turbine overview Label
	  assertTrue(turbineOverviewPage.turbineoverviewlabel().isDisplayed());
	  //Verify Clicking on turbine dropdown
	  turbinePage.turbineDropdown().click();
	  System.out.println(turbineOverviewPage.firstValueOfTurbineDropDown().getText());
	//Verify Clicking on Select all
	  turbineOverviewPage.firstValueOfTurbineDropDown().click();
	  System.out.println(turbineOverviewPage.firstValueOfTurbineDropDown().getText());
	  //Verify Clear all Displayed
	  assertTrue(turbineOverviewPage.clearall().isDisplayed());
	  System.out.println(turbineOverviewPage.isclearallpresent());
	  //Verify tick Displayed
	  assertTrue(turbineOverviewPage.tick().isDisplayed());
	  //Click On Clear all
	  turbineOverviewPage.clearall().click();
	  //Verify Clear all not present
	  System.out.println(turbineOverviewPage.isclearallpresent());
	//Verify Clicking on Turbine dropdown
	  turbinePage.turbineDropdown().click();
	//Verify 1st Value and 2nd Value Selected
	  turbineOverviewPage.secondValueOfTurbineDropDown().click();
	  turbineOverviewPage.thirdValueOfTurbineDropDown().click();
	//Verify Clearall Present
	  assertTrue(turbineOverviewPage.clearall().isDisplayed());
	//Click On Clear all
	  turbineOverviewPage.clearall().click();
	  //Verify Clear all not present
	 //System.out.println(turbineOverviewPage.isclearallpresent());
	 turbinePage.turbineDropdown().click();
	 turbineOverviewPage.turbinedatafield().sendKeys("BEL");
	 assertTrue(turbineOverviewPage.noptions().isDisplayed());
	 
	 turbineOverviewPage.eventworkorder().click();
	 assertTrue(turbineOverviewPage.eventworkorderlabel().isDisplayed());
	 turbineOverviewPage.skflink().click();
	 assertTrue(turbineOverviewPage.turbineoverviewlabel().isDisplayed());
}
  
}
