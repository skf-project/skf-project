package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class TurbinePage extends Page {

	public void javaScriptCLick(WebElement clickableElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", clickableElement);
		
	}
	
	public WebElement turbineDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h div:nth-of-type(5) [class='css-19bqh2r']"));
	}

	public WebElement firstValueOfTurbineDropDown() {
		return driver.findElement(By.cssSelector("#react-select-7-option-1"));

	}
	
	public WebElement filterLabel() {
		return driver.findElement(By.xpath("//section[@id='filtersSideBar']//b[.='Filters']"));

	}
	
	public WebElement mapTurbine() {
		return driver.findElement(By.cssSelector("[class='FarmChild-module_circle__2jw-1 FarmChild-module_unknown__2O--X']"));
	}
	
	public WebElement turbineNameOnHeaderPopUp() {
		return driver.findElement(By.cssSelector(".Modal-module_border__2Chp-.Modal-module_header__3mk20.Modal-module_row__2MZeo.undefined > .Modal-module_title__3abYu"));
	}
	
	public WebElement currentStatusOnHeaderPopUp() {
		return driver.findElement(By.xpath("//label[contains(text(),'Current status')]"));
	}
	
	public WebElement nextPlannedActionOnHeaderPopUp() {
		return driver.findElement(By.xpath("//label[contains(text(),'Next planned action')]"));
	}
	
	public WebElement indicatedFaultOnHeaderPopUp() {
		return driver.findElement(By.xpath("//label[contains(text(),'Indicated fault')]"));
	}
	
	public WebElement previousActionTakenOnHeaderPopUp() {
		return driver.findElement(By.xpath("//label[contains(text(),'Previous action taken')]"));
	}
	
	public WebElement reportFaultButtonOnHeaderPopUp() {
		return driver.findElement(By.xpath("//button[contains(text(),'Report fault')]"));
	}
	
	public WebElement reportFeedbackButtonOnHeaderPop() {
		return driver.findElement(By.xpath("//button[contains(text(),'Report feedback')]"));
	}
	
	public WebElement closeButtonOnHeaderPop() {
		return driver.findElement(By.xpath("//a[@class='Modal-module_close__gwtTs']"));
	}
	
	public WebElement user() {
		return driver.findElement(By.cssSelector(".UserItem-module_userItem__2LLsr > .UserItem-module_userName__3cQ3Y"));
	}
	
	public WebElement signOut() {
		return driver.findElement(By.xpath("//div[contains(text(),'Sign Out')]"));
	}
	
	public WebElement countryDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h > div:nth-of-type(2) [class='css-19bqh2r']"));
	}
	
	public WebElement countrySelectAllDropDownValue() {
		return driver.findElement(
				By.cssSelector("#react-select-4-option-0"));
	}
	
	public WebElement countrySelectFirstValueBEL() {
		return driver.findElement(
				By.cssSelector("#react-select-4-option-1"));
	}
	
	public WebElement clearAllLink() {
		return driver.findElement(
				By.cssSelector("#filtersSideBar > div > div > div.Filter-module_filterHeader__JueI_ > span"));
	}
	
	public WebElement countryTickMark() {
		return driver.findElement(
				By.cssSelector("#filtersSideBar > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(2) > div.IconCheck-module_iconCheck__39ORN.IconCheck-module_iconCheck--circled__1_WLU.SelectInputMultiple-module_iconSelected__MKAgb > div"));
	}
	public WebElement countryTextDropdown() {
		return driver.findElement(
				By.xpath("//div[contains(text(),'Country')]"));
	}
	
	public WebElement countryNoOptionDropdownValue() {
		return driver.findElement(
				By.xpath("//div[contains(text(),'No options')]"));
	}
	

}
