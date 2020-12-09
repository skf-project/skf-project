package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.ElementExisitsPage;
import com.skf.pages.LoginPage;
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;

public class Test_wind_4 extends Page{
	
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  @Test
  public void verifyAnalyticsReliability() throws Exception {
	  
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("test_wind_4_login"), config.getProperty("test_wind_4_pass"));
		TurbinePage turbinePage = new TurbinePage();
		ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
		AnalyticsPage analyticsPage = new AnalyticsPage();
		elemenetExixitsPage.isTurbineOverviewPresent();
		elemenetExixitsPage.isEventWorkOrderPresent();
		elemenetExixitsPage.isAnalyticsPresent();
		elemenetExixitsPage.isAnalyticsAiPresent();
		elemenetExixitsPage.isAnalyticsInsightsPresent();
		elemenetExixitsPage.isAnalyticsSensorRollerPresent();
		elemenetExixitsPage.isAnalyticsSkfPresent();
		assertTrue();
		
  }
}
