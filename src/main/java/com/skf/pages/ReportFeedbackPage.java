package com.skf.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Date;
import com.skf.base.Page;

public class ReportFeedbackPage extends Page{

	public WebElement reportFeedbackHeader()
	{
		return driver.findElement(By.cssSelector(".Modal-module_fullscreen__a107r.Modal-module_modal__3brV3.ReportCommonModal_modal__3buIO .Modal-module_title__3abYu"));
	}
	
   public WebElement reportFeedbackCloseButton() {
	  return driver.findElement(By.cssSelector(".Modal-module_fullscreen__a107r.Modal-module_modal__3brV3.ReportCommonModal_modal__3buIO .Modal-module_close__gwtTs"));
}
   public WebElement IndicatedFaultDropDown() {
	   return driver.findElement(By.cssSelector(".ReportCommonModal_contentSection__2vkAq > div:nth-of-type(2) > .SelectInput-module_selectInput__UIzeo.css-14jk2my-container.react-select--is-disabled > .css-1fhf3k1-control.react-select__control.react-select__control--is-disabled"));
   }
   
   public WebElement indicationResultLabel()
   {
	   return driver.findElement(By.xpath("//b[normalize-space()='Indication result']"));
   }
   public WebElement positiveButton()
   {
	   return driver.findElement(By.xpath("//button[normalize-space()='Positive']"));
   }
   public WebElement negativeButton()
   {
	   return driver.findElement(By.xpath("//button[normalize-space()='Negative']"));
   }
   
   public WebElement dateCompletedLabel()
   {
	   return driver.findElement(By.xpath("//b[normalize-space()='Date completed']"));
   }
   public WebElement dateCompletedTextBox()
   {
	   return driver.findElement(By.xpath("//input[@class=\" DatePicker-module_datePicker__1-nEf\"]"));
   }
  
   public WebElement submitEventFeedbackButton()
   {
	   return driver.findElement(By.xpath("//button[normalize-space()='Submit event feedback']"));
   }
   
   public WebElement calenderDatePicker()
   {
	   return driver.findElement(By.cssSelector(".react-datepicker__month-container"));
   }
    
   public WebElement previousMonthButton()
   {
	   return driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
   }
   
   public WebElement nextMonthButton()
   {
	   return driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next"));
   }
   public String currentDate() {
	    
	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   Date date=new Date();
	   String date1= dateFormat.format(date);
	   return date1;
   }
   public WebElement workOrderDropdown() {
	   return driver.findElement(By.cssSelector(".Accordion-module_accordion__3OskD.Accordion-module_collapsed__260n_.ReportFeedbackModal_workOrderAccordion__BFUBx"));
   }
   
   public WebElement actionTakenLabel()
   {
	   return driver.findElement(By.xpath("//b[normalize-space()='Action taken']"));
   }
   public WebElement actiontakenDropDown()
   {
	   return driver.findElement(By.cssSelector(".ReportCommonModal_rightSide__11K4N.ReportCommonModal_side__3XyYr .css-yk16xz-control.react-select__control > .css-1hwfws3.react-select__value-container > .css-1wa3eu0-placeholder.react-select__placeholder"));
   }
   
   public WebElement feedbackActionRequiredErrorMsg() {
	   return driver.findElement(By.xpath("//div[contains(text(),\"Feedback Action taken is required in all work orders\")]"));
   }
   
   public WebElement indicationResultRequiredErrorMsg() {
	   return driver.findElement(By.xpath("//div[contains(text(),\"Event Case Feedback Indication Result is required\")]"));
   }
   
   public WebElement feedbackDateRequiredErrorMsg() {
	   return driver.findElement(By.xpath("//div[contains(text(),\"Feedback Date is required in all work orders\")]"));
   }
   public WebElement actionTakenValue()
   {
	   return driver.findElement(By.xpath("//div[@class=\"react-select__menu-list css-11unzgr\"]/div[1]"));
   }
   
   public WebElement eventCaseSavedSucessfullyMsg()
   {
	   return driver.findElement(By.cssSelector("#root > div:nth-child(2) > main > div > div.ToastCluster-module_cluster__uNs3D.ToastCluster-module_bottom__384-f > div > div"));
   }
}
