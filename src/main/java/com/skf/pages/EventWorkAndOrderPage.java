package com.skf.pages;

import java.util.List;

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
	
	public String eventCreationDateFromText() {
		return driver.findElement(By.cssSelector("div:nth-of-type(1) > .date-slicer-input.hasDatepicker")).getText();
	}
	
	public WebElement eventCreationDateTo() {
		return driver.findElement(By.cssSelector("div:nth-of-type(2) > .date-slicer-input.hasDatepicker"));
	}
	
	public WebElement datePicker() {
		return driver.findElement(By.cssSelector("div#ui-datepicker-div"));
	}
	
	
	public WebElement clickOnDate2() {
		return driver.findElement(By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(2) > .ui-state-default"));
	}
	

	public WebElement indicatedFaultsScroller() {
		return driver.findElement(By.xpath("//div[@class=\"scroll-element scroll-y scroll-scrolly_visible\"]/div/div[3]"));
	} 
	
	public WebElement severityRoller() {
		return driver.findElement(By.xpath("//div[@class=\"slicerContainer isMultiSelectEnabled\"]/div[@class=\"slicerBody\"]/div[@class=\"scroll-wrapper scrollbar-inner\"]/div[3]/div/div[3]"));
	}
	
	public WebElement leftScroller() {
		return driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-lower backgroundToSolidBackgroundColor highContrastSelectedBorderColor\"]"));
	}
	
	public WebElement rightScroller()
	{
		return driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-upper backgroundToSolidBackgroundColor highContrastSelectedBorderColor\"]"));
	}
	
	public List<WebElement> eventCreationdateTextbox(){
		return driver.findElements(By.cssSelector("input[class=\"date-slicer-input hasDatepicker enable-hover\"]"));
	}
	
	public WebElement severitySearchTextBox() {
		return driver.findElement(By.cssSelector("div:nth-child(40) > div.slicer-dropdown-content > div > div.searchHeader.collapsed > input"));
	}
	
	public WebElement selectedDate() {
		return driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-active\"]"));
	}
	


	public WebElement eventworkOrderLink() {
		return driver.findElement(By.linkText("Event & Work Orders"));
		
	}
	
	public void clickeventworkOrderLink() {
		 javaScriptCLick(this.eventworkOrderLink());
		
	}
	
	public void getDropDownValues() {
		
		List<WebElement> listofDropDown = driver.findElements(By.xpath("//div[@class=\"slicer-dropdown-menu\"]"));
		
		for (WebElement webElement : listofDropDown) {
			System.out.println("Clicked ELement"+webElement);
			webElement.click();
			List<WebElement> drpValues = driver.findElements(By.xpath("//div[@class=\"slicerCheckbox\"]"));
			for (WebElement webElement2 : drpValues) {
				String value = webElement2.getText();
				System.out.println("Clicked ELement"+value);	
			}
		}
		
		
	}
	
}
