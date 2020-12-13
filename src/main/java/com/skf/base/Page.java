package com.skf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;



public class Page {

	String path = System.getProperty("user.dir");
	public static WebDriver driver = null;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fisco;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public String ExpectedUserNamePlaceHolder = "Username";
	public String ExpectedPassWordPlaceHolder = "Password";


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
			ChromeOptions options= this.chromeOptionsForChrome();
			driver = new ChromeDriver(options);
			
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


	public ChromeOptions chromeOptionsForChrome() 
	{
		try
		{
			try {
				fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
				config.load(fisco);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1 );
			prefs.put("download.prompt_for_download", "false");
			String downloadFilesLocation = System.getProperty("user.dir") + config.getProperty("downloadpath");
			System.out.println("downloadFilesLocation is"+downloadFilesLocation);
			new File(downloadFilesLocation).mkdirs();
			prefs.put("download.default_directory",downloadFilesLocation);
			options.setExperimentalOption("prefs", prefs);
			return options;
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			return null;
		}
	}

}
