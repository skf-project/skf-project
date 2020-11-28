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
	
	public WebElement errorMsgEventCaseReportPositionIsRequired() {
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
}
