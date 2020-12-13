package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.ElementExisitsPage;
import com.skf.pages.LoginPage;

public class Test_wind_83 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyAnalyticsInsights() throws Exception {
		  
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_83_login"), config.getProperty("test_wind_83_pass"));
			AnalyticsPage analyticsPage = new AnalyticsPage();
			ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
			elemenetExixitsPage.isTurbineOverviewPresent();
			assertTrue(analyticsPage.insightLabel().isDisplayed());
			
	}
	@AfterMethod
		public void tearDown() {
			Page.driver.close();
			driver=null;
			log.debug("Browser closed");
	}
}
