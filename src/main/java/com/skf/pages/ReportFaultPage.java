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
	
	public WebElement customerEventIdLabel() {
		return driver.findElement(By.xpath("//div[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]/div[contains(text(),\"Custom event id\")]"));
	}
	
	public WebElement indicatedFaultLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Indicated fault\")]"));
	}
	
	public WebElement positionLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Position\")]"));
	}
	
	public WebElement severityLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Severity\")]"));
	}
	
	public WebElement commentLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Comment\")]"));
	}
	public WebElement workOrdersLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"WORK ORDERS\")]"));
	}
	
	public WebElement addButtonLabel() {
		return driver.findElement(By.xpath("//*[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]//div[contains(text(),\"Add\")]"));
	}
	
	public WebElement approveLabel() {
		return driver.findElement(By.xpath("//div[contains(text(),\"Approved\")]"));
	}
	public WebElement mapTurbine() {
		 return driver.findElement(By.xpath("//*[@id=\"Map-module_map__utoEh\"]/div/div/div[1]/div[3]/div/div[3]/div[2]/div/div"));
	}
	public WebElement reportFaultTurbineNameHeaderPopUp()
	{
		return driver.findElement(By.xpath("div[class='Modal-module_modal__3brV3 Modal-module_fullscreen__a107r ReportCommonModal_modal__3buIO'] a[class='Modal-module_title__3abYu']"));
	}
	public WebElement reportFaultClearAllLink() {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[1]/span"));
	}
	
	public WebElement reportFaultFilterLabel()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[1]/b"));
	}
	public WebElement reportFaultRegionFilter() {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[1]/div[1]/div"));
	}
	public WebElement reportFaultRegionFirstValue() 
	{
		return driver.findElement(By.xpath("//*[@id=\"react-select-8-option-0\"]"));
	}
	public WebElement reportFaultRegionTickMark()
	{
		return driver.findElement(By.xpath("//body/div[@id='root']/div/main/div/div/div/div/div/div/div/section/div/div/div/div/div[1]/div[2]"));
	}
	public WebElement reportFaultCountryFilter() {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[2]/div[1]/div"));
	}
	public WebElement reportFaultCountryFirstValue()
	{
		return driver.findElement(By.xpath("//*[@id=\"react-select-9-option-1\"]"));
	}
	public WebElement reportFaultCountryTickMark() 
	{
		return driver.findElement(By.xpath("//body/div[@id='root']/div/main/div/div/div/div/div/div/div/section/div/div/div/div/div[2]/div[2]"));
	}
	public WebElement reportFaultOwnerFilter()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[3]/div[1]/div"));
	}
	public WebElement reportFaultOwnerFirstValue()
	{
		return driver.findElement(By.xpath("//*[@id=\"react-select-10-option-0\"]"));
	}
	public WebElement reportFaultOwnerTickMark()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[3]/div[2]"));
	}
	public WebElement reportFaultWindFarmFilter()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[4]/div[1]/div"));
	}
	public WebElement reportFaultWindFarmFirstValue()
	{
		return driver.findElement(By.xpath("//*[@id=\"react-select-11-option-0\"]"));
	}
	public WebElement reportFaultWindFarmTickMark()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[4]/div[2]"));
	}
	
	public WebElement reportFaultTurbineFilter()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[5]/div[1]/div"));
	}
	public WebElement reportFaultTurbineFirstValue()
	{
		return driver.findElement(By.xpath("//*[@id=\"react-select-12-option-0\"]"));
	}
	public WebElement reportFaultTurbineTickMark()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[5]/div[2]"));
	}
	
	public WebElement reportFaultAssetFilter()
	{
		return driver.findElement(By.xpath("//body/div[@id='root']/div/main/div/div/div/div/div/div/div/section/div/div/div/div/div[6]/div[1]/div[1]"));
	}
	public WebElement reportFaultAssetFirstValue() {
		return driver.findElement(By.xpath("//*[@id=\"react-select-13-option-0\"]"));
	}
	public WebElement reportFaultAssetTickMark() {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[6]/div[2]"));
	}
	public WebElement reportFaultAssetTextBox() {
		return driver.findElement(By.xpath("//div[@class='ReportCommonModal_contentSection__2vkAq']//div//div[@class='']//div[@class='Filter-module_filterSelectors__23t1h']//div//div[@class='react-select__value-container css-1hwfws3']//div[@class='react-select__input']"));
	}
	 public boolean countryFilterNotPresent()
	    {
	    	try {
	    		reportFaultCountryFilter();
	    		return true;
	    	}
	    	catch(org.openqa.selenium.NoSuchElementException e) {
	    		return false;
	    	}
	    }
}
