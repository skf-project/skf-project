package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class TurbinePage extends Page {


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
	
	

}
