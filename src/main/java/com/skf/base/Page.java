package com.skf.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Page {

	String path = System.getProperty("user.dir");
	public static WebDriver driver = null;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fisco;
	public static Logger log = Logger.getLogger("devpinoyLogger");


	@BeforeMethod
	public void setUp() {
		if (driver == null) {

			try {
				fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.debug("Config file loaded");

			System.setProperty("webdriver.chrome.driver",
					path + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			try {
				config.load(fisco);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.debug("URL " + config.getProperty("url") + " Open");
			driver.get(config.getProperty("url"));
			log.debug("Maximize Browser");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("waitTime")),
					TimeUnit.SECONDS);
			Reporter.log("Browser launch Successfully");

		}
	}
	

}
