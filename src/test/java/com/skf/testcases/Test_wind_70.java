package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.ElementExisitsPage;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.SupplyChainPage;
import com.skf.pages.TurbinePage;

public class Test_wind_70 extends Page{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	@Test
	  public void verifyEventAndWorkOrders() throws Exception
	  {
		    fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisco);
			LoginPage loginPage = new LoginPage();
			loginPage.loginApp(config.getProperty("test_wind_70_login"), config.getProperty("test_wind_70_pass"));
			Thread.sleep(15000);
			EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
			eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
			assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
			assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
	  }
	@Test
	  public void verifySupplyChain() throws Exception {
				fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
				config.load(fisco);
				LoginPage loginPage = new LoginPage();
				loginPage.loginApp(config.getProperty("test_wind_70_login"), config.getProperty("test_wind_70_pass"));
				TurbinePage turbinePage = new TurbinePage();
				ElementExisitsPage elemenetExixitsPage = new ElementExisitsPage();
				elemenetExixitsPage.isTurbineOverviewPresent();
				SupplyChainPage supplychain = new SupplyChainPage();
				turbinePage.supplyChainHeaderButton().click();
				assertTrue(supplychain.supplyChainLabel().getText().contains("Supply Chain"));
	  }
	  
	  @AfterMethod
		public void tearDown() {
			Page.driver.close();
			driver=null;
			log.debug("Browser closed");
	}
}
