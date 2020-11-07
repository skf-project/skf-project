package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;

public class Turbine extends Page {

	@Test
	public void turbine() {

		LoginPage loginPage = new LoginPage();
		TurbinePage turbinePage= loginPage.loginApp("test_Wind_1", "2D.tu68D2");
        //waitForElement(turbinePage.filterLabel());
		turbinePage.turbineDropdown().click();
		turbinePage.firstValueOfTurbineDropDown().click();
		turbinePage.filterLabel().click();
		turbinePage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.nextPlannedActionOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.indicatedFaultOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.previousActionTakenOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().isDisplayed();
		turbinePage.reportFeedbackButtonOnHeaderPop().isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", turbinePage.closeButtonOnHeaderPop());
		//turbinePage.closeButtonOnHeaderPop().click();

	}
}
