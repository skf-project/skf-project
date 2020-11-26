package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class ReportFaultPage extends Page {

	public WebElement reportHeaderLabel() {
		return driver.findElement(By.cssSelector(
				".Modal-module_fullscreen__a107r.Modal-module_modal__3brV3.ReportCommonModal_modal__3buIO .Modal-module_title__3abYu"));
	}

	public WebElement assetsDropDown() {
		return driver.findElement(By.cssSelector("div:nth-of-type(6) .react-select__dropdown-indicator"));
	}

	public WebElement assetsFirstDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-13-option-0"));
	}

	public WebElement eventDropDown() {
		return driver.findElement(By.cssSelector(
				".ReportCommonModal_rightSide__11K4N.ReportCommonModal_side__3XyYr .css-tlfecz-indicatorContainer.react-select__dropdown-indicator.react-select__indicator"));
	}

	public WebElement eventDropDownValueNewEvent() {
		return driver.findElement(By.cssSelector("#react-select-2-option-9"));
	}
}
