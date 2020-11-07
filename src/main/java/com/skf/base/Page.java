package com.skf.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentTest;

public class Page {

	String path = System.getProperty("user.dir");
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fisco;
	public static FileInputStream fisor;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	public static ExtentTest test;

	@BeforeSuite
	public void setUp() throws IOException {
		if (driver == null) {

			fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			log.debug("Config file loaded");

			System.setProperty("webdriver.chrome.driver",
					path + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			config.load(fisco);
			log.debug("URL " + config.getProperty("url") + " Open");
			driver.get(config.getProperty("url"));
			log.debug("Maximize Browser");
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(Integer.parseInt(config.getProperty("waitTime")),
					TimeUnit.SECONDS);
			Reporter.log("Browser launch Successfully");

		}

	}

	@AfterSuite
	public void teardown() {
		driver.quit();
		driver=null;
		log.debug("Close Browser");
	}

}
