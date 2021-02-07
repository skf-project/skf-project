package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

import au.com.bytecode.opencsv.CSVReader;


public class EventWorkAndOrder extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	CommonUtilities objCommon = new CommonUtilities();
	List<WebElement> drpValues;
	String[] arrayofValues= new String[200];
	List<WebElement> listofDropDown ;
	Iterator<WebElement> itr;
	
	@Test (enabled = true)
	public void EventWorkAndOrderPageTitle() throws IOException, InterruptedException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
		eventWorkAndOrderPage.pageTittle().click();
		assertEquals(eventWorkAndOrderPage.pageTittleText(),config.getProperty("eventAndWordOrderPageTittle"));
	}
	
	@Test (enabled = true)
	public void statusFilters() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());	
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		driver.switchTo().frame(eventWorkAndOrderPage.iFrame());
		assertTrue(eventWorkAndOrderPage.closedStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.openStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pendingStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.blankStatus().isDisplayed());
		eventWorkAndOrderPage.closedStatus().click();
	}

	@Test (enabled = true)
	public void eventCreationDate() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());	
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		driver.switchTo().frame(eventWorkAndOrderPage.iFrame());
		assertTrue(eventWorkAndOrderPage.eventCreationDateFrom().isDisplayed());
		assertTrue(eventWorkAndOrderPage.eventCreationDateTo().isDisplayed());
		eventWorkAndOrderPage.eventCreationDateFrom().click();
		assertTrue(eventWorkAndOrderPage.datePicker().isDisplayed());
		eventWorkAndOrderPage.eventCreationDateTo().click();
		assertTrue(eventWorkAndOrderPage.datePicker().isDisplayed());		
		eventWorkAndOrderPage.eventCreationDateFrom().click();
		assertTrue(eventWorkAndOrderPage.datePicker().isDisplayed());
		eventWorkAndOrderPage.clickOnDate2().click();
	}

	@Test(enabled = true)
	public void companyDropdown() throws IOException, InterruptedException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		System.out.println("Clicked ELement");
		driver.switchTo().frame(0);
		Thread.sleep(10000);

		listofDropDown = driver.findElements(By.xpath("//i[@class='dropdown-chevron powervisuals-glyph chevron-down']"));
		System.out.println("Starts with"+listofDropDown.size());
		for (int i = 0; i < listofDropDown.size(); i++) {
			WebElement ele =listofDropDown.get(i);
			ele.click();
			Thread.sleep(3000);
			ele.click();
			Thread.sleep(3000);

			Actions act = new Actions(driver);
			act.moveToElement(ele);
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[aria-label=\"More options\"]>i")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("i[class=\"dropdown-icon itemIcon glyphicon pbi-glyph-export glyph-small\"")).click();
			Thread.sleep(3000);

			Set<String>handles =driver.getWindowHandles();
			System.out.println("Size is"+handles.size());
			driver.switchTo().activeElement();

			Select select = new Select(driver.findElement(By.xpath("//*[@id=\"formatSelect\"]")));
			select.selectByValue("1");
			Thread.sleep(3000);
			objCommon.javaScriptClick(driver.findElement(By.xpath("//button[@type=\"submit\"]")));
			Thread.sleep(15000);
		}
	}


	@Test(enabled = true)
	public void eventRoller() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);

		List<WebElement> listofDropDown = driver.findElements(By.xpath("//i[@class='dropdown-chevron powervisuals-glyph chevron-down']"));
		System.out.println("Starts with"+listofDropDown.size());
		WebElement indicatedFaultsDropdown = listofDropDown.get(1);
		indicatedFaultsDropdown.click();
		Thread.sleep(5000);
		listofDropDown = driver.findElements(By.xpath("//span[@class='slicerText']"));
		itr = listofDropDown.iterator();
		while(itr.hasNext()) {
			String drpValue = itr.next().getText();
			System.out.println("Element getText value is" +drpValue);

		}


		int rightxoffset = objeventworkorder.rightScroller().getLocation().getX();
		int leftxoffset =objeventworkorder.leftScroller().getLocation().getX(); int
		xoffset = (rightxoffset-leftxoffset);
		System.out.println("X offset is "+xoffset);
		act.dragAndDropBy(objeventworkorder.leftScroller(),xoffset,0).build().perform();
		Thread.sleep(5000); 
		int leftxoffset2=objeventworkorder.leftScroller().getLocation().getX();
		System.out.println("Second offset is "+leftxoffset2);
		act.dragAndDrop(objeventworkorder.leftScroller(),objeventworkorder.rightScroller()).build().perform(); 
		List<WebElement>dateElements = driver.findElements(By.xpath("//input[@class=\"date-slicer-input hasDatepicker enable-hover\"]"));
		String dateElement1= dateElements.get(0).getAttribute("aria-label");
		System.out.println("Value of Date is"+dateElement1);
		Assert.assertTrue(dateElement1.contains("\"5/1/2016\" and \"1/6/2021\""));

		dateElement1= dateElements.get(1).getAttribute("aria-label");
		System.out.println("Value of Date is"+dateElement1);
		Assert.assertTrue(dateElement1.contains("1/3/2021"));

	}

	@Test(enabled = true)
	public void indicatedFaultFilter() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		List<WebElement> listofDropDown = driver.findElements(By.xpath("//i[@class='dropdown-chevron powervisuals-glyph chevron-down']"));
		System.out.println("Starts with"+listofDropDown.size());
		WebElement indicatedFaultsDropdown = listofDropDown.get(3);
		indicatedFaultsDropdown.click();
		Thread.sleep(5000);
		listofDropDown = driver.findElements(By.xpath("//span[@class='slicerText']"));

		for (int i = 0; i < listofDropDown.size(); i++) {
			String[] expectedValue = {"Select all","(Blank)","","0","1","10","2","3","4","5","6","7"};
			String drpValue = listofDropDown.get(i).getText();
			Assert.assertTrue(drpValue.equalsIgnoreCase(expectedValue[i]));
			System.out.println("Value is"+drpValue);
		}
		int scrollbarYoffset = objeventworkorder.severityRoller().getLocation().getY();
		System.out.println("Value of Y offset is"+scrollbarYoffset+10);
		act.dragAndDropBy(objeventworkorder.indicatedFaultsScroller(), 0,scrollbarYoffset).build().perform(); Thread.sleep(5000);

		listofDropDown = driver.findElements(By.xpath("//span[@class='slicerText']"));

		for (int i = 0; i < listofDropDown.size(); i++) {
			String[] valuesAfterRoller = {"","0","1","10","2","3","4","5","6","7","8","9"};
			String drpValue = listofDropDown.get(i).getText();
			Assert.assertTrue(drpValue.equalsIgnoreCase(valuesAfterRoller[i]));
			System.out.println("Value is"+drpValue);
		}

	}

	@Test(enabled = true)
	public void defaultValuesofFilter()  throws IOException, InterruptedException 
	{
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		listofDropDown = driver.findElements(By.xpath("//div[contains(text(),'All')]"));
		itr = listofDropDown.iterator();
		while(itr.hasNext()) {
			Assert.assertTrue((itr.next().getText()).equals("All"));

		}

	}

	@Test(enabled = true)
	public void dataVerificationOnFilterSelection()  throws IOException, InterruptedException 
	{
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		listofDropDown = driver.findElements(By.xpath("//*[@class=\"parentGroup treemapNode setFocusRing\"]"));
		List<WebElement> openCount;
		for (int i = 0; i < listofDropDown.size(); i++) {
			System.out.println("Size is"+listofDropDown.size());
			if(i==1)
			{
				listofDropDown.get(i).click();
				Thread.sleep(5000);
				openCount = driver.findElements(By.xpath("//div[@title='Open']"));
				int size = openCount.size();
				Assert.assertNotEquals(size, 0);
				Assert.assertTrue((listofDropDown.get(i+1).getAttribute("aria-label").contains("0")));
				Assert.assertTrue((listofDropDown.get(i-1).getAttribute("aria-label").contains("0")));
				listofDropDown.get(i).click();
				Thread.sleep(5000);
			}
			else if(i==0){
				listofDropDown.get(i).click();

				Thread.sleep(5000);
				openCount = driver.findElements(By.xpath("//div[@title='Pending']"));
				int size = openCount.size();
				Assert.assertNotEquals(size, 0);
				Assert.assertTrue((listofDropDown.get(i+1).getAttribute("aria-label").contains("0")));
				Assert.assertTrue((listofDropDown.get(i+2).getAttribute("aria-label").contains("0")));
				listofDropDown.get(i).click();
			}
		}


	}


	@Test(enabled = true)
	public void dateRangeForEventDateScroller()  throws IOException, InterruptedException 
	{
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		List<WebElement> dateText= objeventworkorder.eventCreationdateTextbox();
		WebElement fromDate = dateText.get(0);
		WebElement toDate = dateText.get(1);

		//Provide the from date to event creation date
		fromDate.click();
		fromDate.sendKeys("12/12/2020");
		Thread.sleep(2000);
		fromDate.sendKeys(Keys.TAB);
		toDate.click();
		toDate.sendKeys("01/01/2021");
		Thread.sleep(2000);
		toDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);

		drpValues = driver.findElements(By.xpath("//div[@title=\"Open\"]"));
		Assert.assertTrue(drpValues.equals(3));

		drpValues = driver.findElements(By.xpath("//div[title=\"Closed\"]"));
		Assert.assertTrue(drpValues.equals(2));

	}


	@Test(enabled = true)
	public void severityMaxValueValidation()  throws IOException, InterruptedException 
	{
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		Thread.sleep(10000);
		EventWorkAndOrderPage objeventworkorder = new EventWorkAndOrderPage();
		objeventworkorder.clickeventworkOrderLink();
		Thread.sleep(20000);
		driver.switchTo().frame(0);

		listofDropDown = driver.findElements(By.xpath("//i[@class='dropdown-chevron powervisuals-glyph chevron-down']"));

		WebElement ele =listofDropDown.get(3);
		ele.click();
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.moveToElement(ele);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[aria-label=\"More options\"]>i")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i[class=\"dropdown-icon itemIcon glyphicon pbi-glyph-search glyph-small\"")).click();
		Thread.sleep(5000);
		act.doubleClick(ele).build().perform();
		Thread.sleep(2000);
		ele.click();
		WebElement seachTextBox = driver.findElement(By.cssSelector("div:nth-child(43) > div.slicer-dropdown-content > div > div.searchHeader.show > input"));
		objCommon.javaScriptClick(seachTextBox);
		seachTextBox.sendKeys("11");

		List<WebElement> searchResultList = driver.findElements(By.xpath("//span[@title=\"11\"]"));
		Assert.assertTrue(searchResultList.size()==0);

	}


	@Test(enabled = true)
	public void validateDropdownValues() throws Exception {
		CSVReader reader = new CSVReader(new FileReader(path+"\\src\\test\\resources\\pdfDownload\\Company.csv"));

		List<String[]> li=reader.readAll();
		System.out.println("Total rows which we have is "+li.size());

		// create Iterator reference
		Iterator<String[]>i1= li.iterator();

		// Iterate all values 
		while(i1.hasNext()){

			String[] str=i1.next();

			System.out.print(" Values are ");

			for(int i=0;i<str.length;i++)
			{

				System.out.print(" "+str[i]);

			}
			System.out.println("   ");
		}
	}

	@AfterMethod 
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}