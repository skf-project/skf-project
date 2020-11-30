package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class EventWorkAndOrderPage extends Page {

	public void javaScriptCLick(WebElement clickableElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", clickableElement);

	}

	public WebElement eventAndWorkOrdersTab() {
		return driver.findElement(By.cssSelector("li[class='Navigator-module_active__2Xh0l Navigator-module_selector__1JH3a undefined']"));
	}
	
	public WebElement eventAndWorkOrdersTabx() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/ul[1]/li[5]"));
	}

	public WebElement pageTittle() {
		return driver.findElement(By.cssSelector("div[class='Breadcrumb-module_breadcrumb__2Mkgj'] li"));
	}
	
	public String pageTittleText() {
		return driver.findElement(By.cssSelector("li:nth-child(1) > a")).getText();
	}
	
	public WebElement iFrame() {
		return driver.findElement(By.tagName("iframe"));
	}
	
	public WebElement powerBIReport() {
		return driver.findElement(By.cssSelector("li[class='Navigator-module_active__2Xh0l Navigator-module_selector__1JH3a undefined']"));
	}
	
	public WebElement closedStatus() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(3) [tabindex] [tabindex='0']:nth-of-type(2)"));
	}
	
	public WebElement openStatus() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(2) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern .parentGroup.treemapNode"));
	}
	
	public WebElement pendingStatus() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(1) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern .parentGroup.treemapNode"));
	}
	
	public WebElement blankStatus() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(5) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern  .treemap"));
	}
	
	public WebElement eventCreationDateFrom() {
		return driver.findElement(By.cssSelector("div:nth-of-type(1) > .date-slicer-input.hasDatepicker"));
	}
	
	public WebElement eventCreationDateTo() {
		return driver.findElement(By.cssSelector("div:nth-of-type(2) > .date-slicer-input.hasDatepicker"));
	}
	
	public WebElement DatePicker() {
		return driver.findElement(By.cssSelector("div#ui-datepicker-div"));
	}
	
	/*
	 * public WebElement eventCreationDateToDatePicker() { return
	 * driver.findElement(By.cssSelector("div#ui-datepicker-div")); }
	 */
}
