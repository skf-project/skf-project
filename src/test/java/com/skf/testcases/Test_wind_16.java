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

public class Test_wind_16 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	
	
	@Test
	  public void verifyAnalyticsReliablityInsight() throws Exception
	  {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_16_login"), config.getProperty("test_wind_16_pass"));
			AnalyticsPage analyticsPage = new AnalyticsPage();
			analyticsPage.analyticsLabel().click();
			assertTrue(analyticsPage.analyticsLabel().isDisplayed());
			assertTrue(analyticsPage.reliabilityLabel().isDisplayed());
			assertTrue(analyticsPage.insightLabel().isDisplayed());
			ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
			elemenetExixitsPage.isAnalyticsAiPresent();
			
	  }
	  
        @AfterMethod
		public void tearDown() {
			Page.driver.close();
			driver=null;
			log.debug("Browser closed");
	}
}
