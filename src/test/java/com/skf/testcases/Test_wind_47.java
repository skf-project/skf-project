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
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;

public class Test_wind_47 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	@Test
	  public void verifySupplyChain() throws Exception {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_47_login"), config.getProperty("test_wind_47_pass"));
			TurbinePage turbinePage = new TurbinePage();
			SupplyChainPage supplychain = new SupplyChainPage();
			turbinePage.supplyChainHeaderButton().click();
			assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
	  }
	  @Test
	  public void verifyAnalyticsReliablity() throws Exception
	  {
		  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_47_login"), config.getProperty("test_wind_47_pass"));
			AnalyticsPage analyticsPage = new AnalyticsPage();
			analyticsPage.analyticsLabel().click();
			assertTrue(analyticsPage.analyticsLabel().isDisplayed());
			assertTrue(analyticsPage.reliabilityLabel().isDisplayed());
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
