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
		return driver.findElement(
				By.xpath("//div[@class=\"react-select__menu-list css-11unzgr\"]/div[contains(text(),\"New event\")]"));
	}

	public WebElement customerEventIdLabel() {
		return driver.findElement(By.xpath(
				"//div[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]/div[contains(text(),\"Custom event id\")]"));
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
		return driver.findElement(By.xpath(
				"//*[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]//div[contains(text(),\"Add\")]"));
	}

	public WebElement approveLabel() {
		return driver.findElement(By.xpath("//div[contains(text(),\"Approved\")]"));
	}

	public WebElement mapTurbine() {
		 return driver.findElement(By.xpath("//*[@id=\"Map-module_map__utoEh\"]/div/div/div[1]/div[3]/div/div[3]/div[2]/div/div"));
	}
	public WebElement reportFaultCloseButton()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[3]/div/div/div/div[1]/a[2]"));
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
		return driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[1]"));
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
		return driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div"));
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
		return driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[4]/div/div[2]/div/div[1]"));
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
		return driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[1]/div[1]/div/div/div[2]/div[5]/div/div[2]/div/div[1]"));
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

	public WebElement customerIdRadioButton() {
		return driver.findElement(By.xpath(
				"//div[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]/div[@class=\"Checkbox-module_checkbox__3us_x \"]/div[1]"));
	}

	public WebElement customerEventIdTextBoxPlaceholder() {
		return driver.findElement(By.xpath(
				"//div[@class=\"ReportFaultModalRightSide_contentWithLabel__QGWRA\"]/div[@class=\"Checkbox-module_checkbox__3us_x \"]/div[1]"));
	}

	public WebElement indicatedFaultDropdown() {
		return driver.findElement(
				By.cssSelector(".ReportFaultModal_contentSection__3G4ZN div:nth-child(7) [class='css-19bqh2r']"));
	}

	public WebElement indicatedFaultDropdownFirstValue() {
		return driver.findElement(By.cssSelector("#react-select-3-option-0"));
	}

	public WebElement positionDropdown() {
		return driver.findElement(By.cssSelector(
				".ReportFaultModalRightSide_twoColumns6040__O5wS9 > div:nth-of-type(1) > .SelectInput-module_selectInput__UIzeo.css-2b097c-container > .css-yk16xz-control.react-select__control > .css-1wy0on6.react-select__indicators > .css-tlfecz-indicatorContainer.react-select__dropdown-indicator.react-select__indicator"));
	}

	public WebElement positionDropdownFirstValue() {
		return driver.findElement(By.cssSelector("#react-select-4-option-0"));
	}

	public WebElement severityDropDown() {
		return driver.findElement(By.cssSelector(
				".ReportFaultModalRightSide_twoColumns6040__O5wS9 > div:nth-of-type(2) > .SelectInput-module_selectInput__UIzeo.css-2b097c-container > .css-yk16xz-control.react-select__control > .css-1wy0on6.react-select__indicators > .css-tlfecz-indicatorContainer.react-select__dropdown-indicator.react-select__indicator"));
	}

	public WebElement severityDropdownTenthValue() {
		return driver.findElement(By.cssSelector("#react-select-5-option-9"));
	}

	public WebElement eventCommentTextBox() {
		return driver.findElement(By.cssSelector(".TextArea-module_textarea__3iKgr"));
	}

	public WebElement workOrderNewLabel() {
		return driver.findElement(By.xpath("//div[@class=\"Accordion-module_title__1wqfh\"]/label"));
	}

	public WebElement workOrderCustomerIdLabel() {
		return driver
				.findElement(By.cssSelector(".Accordion-module_content__3C_gH > .Checkbox-module_checkbox__3us_x"));
	}

	public WebElement workOrderRecommendedLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Recommended action\")]"));
	}

	public WebElement workOrderRequestDateLabel() {
		return driver.findElement(By.xpath("//b[contains(text(),\"Request date\")]"));
	}

	public WebElement workOrderCommentLabel() {
		return driver.findElement(By.cssSelector("p:nth-of-type(2) > b"));
	}

	public WebElement workOrderDeleteLabel() {
		return driver.findElement(By.cssSelector(".WorkOrderReportFault_content__1xyEe"));
	}

	public WebElement workOrderCustomerIdRadioButton() {
		return driver.findElement(By.cssSelector(
				".Accordion-module_content__3C_gH > .Checkbox-module_checkbox__3us_x > .Checkbox-module_circle__2QsVz"));
	}

	public WebElement workOrderCustomerEventIdTextBox() {
		return driver.findElement(By.cssSelector(".Accordion-module_content__3C_gH [type='string']"));
	}

	public WebElement workOrderRecommendedDrodown() {
		return driver.findElement(By.cssSelector(
				"#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_side__3XyYr.ReportCommonModal_rightSide__11K4N > div.ReportCommonModal_contentSection__2vkAq > div > div.Accordion-module_accordion__3OskD.ReportFaultModalRightSide_marginBottom__1koaD > div.Accordion-module_content__3C_gH > div:nth-child(5) > div > div > div.react-select__indicators.css-1wy0on6 > div"));
	}

	public WebElement workOrderRecommendedDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-6-option-0"));
	}

	public WebElement workOrderRecommendedDropDownValue2() {
		return driver.findElement(By.cssSelector("#react-select-7-option-0"));
	}

	public WebElement workOrderCommentTextBox() {
		return driver
				.findElement(By.cssSelector(".Accordion-module_content__3C_gH > .TextArea-module_textarea__3iKgr"));
	}

	public WebElement workOrderDeleteIcon() {
		return driver.findElement(By.cssSelector(
				"div:nth-of-type(6) > .Accordion-module_content__3C_gH > .WorkOrderReportFault_deleteLabelContainer__1lQcy > .DeleteLabel-module_deleteLabel__mtki9.WorkOrderReportFault_deleteLabel__2C_Kf > .WorkOrderReportFault_content__1xyEe"));
	}

	public WebElement workOrderCancelDeleteIcon() {
		return driver.findElement(By.cssSelector(".WorkOrderReportFault_deleteLabel__2C_Kf > button:nth-of-type(2)"));
	}

	public WebElement workOrderApproveDeleteIcon() {
		return driver.findElement(By.cssSelector(".WorkOrderReportFault_deleteLabel__2C_Kf > button:nth-of-type(1)"));
	}

	public WebElement saveButton() {
		return driver.findElement(By.xpath("//button[contains(text(),\"Save\")]"));
	}

	public WebElement approveButton() {
		return driver.findElement(By.cssSelector(
				".ReportFaultModal_contentSection__3G4ZN > .Checkbox-module_checkbox__3us_x > .Checkbox-module_circle__2QsVz"));
	}

	public WebElement submitEventButton() {
		return driver.findElement(By.xpath("//button[contains(text(),\"Submit event\")]"));
	}
	
	public WebElement errorMsgEventCaseReport() {
		return driver.findElement(By.xpath("//div[@class=\"Toast-module_toast__MVT2h Toast-module_danger__3HF4m \"]"));
	}
	
	public WebElement errorMsgEventCaseReportSeverityIsRequired() {
		return driver.findElement(By.xpath("//*[@class=\" ToastCluster-module_cluster__uNs3D ToastCluster-module_bottom__384-f\"]/div[1]/div[1]"));
	}

	public WebElement errorMsgEventCaseReportPositionIsRequired1() {
		return driver.findElement(By.xpath("//*[@class=\" ToastCluster-module_cluster__uNs3D ToastCluster-module_bottom__384-f\"]/div[2]/div[1]"));
	}
	
	public WebElement errorMsgEventCaseReportIndicatedFaultIsRequired() {
		return driver.findElement(By.xpath("//*[@class=\" ToastCluster-module_cluster__uNs3D ToastCluster-module_bottom__384-f\"]/div[3]/div[1]"));
	}
	public WebElement leftSignOnReportFault() {
		return driver.findElement(By.xpath("//section[contains(@class,'ReportCommonModal_side__3XyYr ReportCommonModal_leftSide__1L6tk')]//div[@class='ReportCommonModal_hideSection___ZL05']"));
		
	}
	public WebElement rightSignOnReportFault()
	{
		return driver.findElement(By.xpath("//section[contains(@class,'ReportCommonModal_side__3XyYr ReportCommonModal_rightSide__11K4N')]//div[@class='ReportCommonModal_hideSection___ZL05']"));
	}
	public WebElement eventTable()
	{
		return driver.findElement(By.xpath("//table[@role='table']"));
	}
	public WebElement eventTableDateHeader()
	{
		return driver.findElement(By.xpath("//table//tr/th[1]"));
	}
	public WebElement eventTableIndicatedFaultHeader()
	{
		return driver.findElement(By.xpath("//table//tr/th[2]"));
	}
	public WebElement eventTableEventHeader()
	{
		return driver.findElement(By.xpath("//table//tr/th[3]"));
	}
	
	public WebElement eventDropDownFirstValue()
	{
		return driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[3]/div/div/div/div[2]/div[2]/section[3]/div[2]/div/div/div/div[2]/div/div"));
	}
	public WebElement descriptionLabel()
	{
		return driver.findElement(By.xpath("//b[contains(text(),\"Description\")]"));
	}
	public WebElement imagesLabel()
	{
		return driver.findElement(By.xpath("//b[contains(text(),\"Images\")]"));
	}
	public WebElement productavailabilityLabel()
	{
		return driver.findElement(By.xpath("//b[contains(text(),\"Product availability\")]"));
	}
	public WebElement NoDatesAreAvailableLabel()
	{
		return driver.findElement(By.xpath("//label[contains(text(),\"No dates are available\")]"));
		
	}
	public WebElement uploadImageButton() 
	{
		return driver.findElement(By.xpath("//div[contains(@class,'file-drop-target')]//button[contains(@class,'')]"));
		
	}
	public WebElement descriptionTextBox()
	{
		return driver.findElement(By.xpath("//textarea[contains(@class,'TextArea-module_textarea__3iKgr TextArea-module_disabled__1IJEu')]"));
	}
}
