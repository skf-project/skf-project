package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.ElementExisitsPage;
import com.skf.pages.LoginPage;

public class Test_wind_8 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	
	
  @Test
  public void verifyAnalyticsSKF() throws IOException {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("test_wind_8_login"), config.getProperty("test_wind_8_pass"));
		AnalyticsPage analyticsPage = new AnalyticsPage();
		ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
		elemenetExixitsPage.isTurbineOverviewPresent();
		elemenetExixitsPage.isEventWorkOrderPresent();
		elemenetExixitsPage.isAnalyticsPresent();
		elemenetExixitsPage.isAnalyticsAiPresent();
		elemenetExixitsPage.isAnalyticsInsightsPresent();
		elemenetExixitsPage.isAnalyticsSensorRollerPresent();
		elemenetExixitsPage.isAnalyticsReliabilityPresent();
		assertTrue(analyticsPage.skfLabel().isDisplayed());
		
}
@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
}
}
