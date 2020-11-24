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
		return driver.findElement(
				By.cssSelector("[class='FarmChild-module_circle__2jw-1 FarmChild-module_unknown__2O--X']"));
	}

	public WebElement turbineNameOnHeaderPopUp() {
		return driver.findElement(By.cssSelector(
				".Modal-module_border__2Chp-.Modal-module_header__3mk20.Modal-module_row__2MZeo.undefined > .Modal-module_title__3abYu"));
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
		return driver
				.findElement(By.cssSelector(".UserItem-module_userItem__2LLsr > .UserItem-module_userName__3cQ3Y"));
	}

	public WebElement signOut() {
		return driver.findElement(By.xpath("//div[contains(text(),'Sign Out')]"));
	}

	public WebElement countryDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h > div:nth-of-type(2) [class='css-19bqh2r']"));
	}

	public WebElement countrySelectAllDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-4-option-0"));
	}

	public WebElement countrySelectFirstValueBEL() {
		return driver.findElement(By.cssSelector("#react-select-4-option-1"));
	}

	public WebElement clearAllLink() {
		return driver.findElement(
				By.cssSelector("#filtersSideBar > div > div > div.Filter-module_filterHeader__JueI_ > span"));
	}

	public WebElement countryTickMark() {
		return driver.findElement(By.cssSelector(
				"#filtersSideBar > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(2) > div.IconCheck-module_iconCheck__39ORN.IconCheck-module_iconCheck--circled__1_WLU.SelectInputMultiple-module_iconSelected__MKAgb > div"));
	}

	public WebElement countryTextDropdown() {
		return driver.findElement(By.xpath("//div[contains(text(),'Country')]"));
	}

	public WebElement countryNoOptionDropdownValue() {
		return driver.findElement(By.xpath("//div[contains(text(),'No options')]"));
	}

	public WebElement ownerDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h div:nth-of-type(3) [class='css-19bqh2r']"));
	}

	public WebElement ownerSelectAllDropdownValue() {
		return driver.findElement(By.cssSelector("#react-select-5-option-0"));
	}

	public WebElement ownerSelectFirstValue() {
		return driver.findElement(By.cssSelector("#react-select-5-option-1"));
	}

	public WebElement ownerTickMark() {
		return driver.findElement(By.cssSelector(
				"#filtersSideBar > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(3) > div.IconCheck-module_iconCheck__39ORN.IconCheck-module_iconCheck--circled__1_WLU.SelectInputMultiple-module_iconSelected__MKAgb"));
	}
	
	public WebElement searchWindFarmTextBox() {
		return driver.findElement(By.cssSelector("#windFarms > div.TurbineOverview_search__13wq7 > div > div > div > div.react-select__value-container.css-1hwfws3"));
	}
	
	public WebElement openEventLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/section[1]/div/div[1]/div/label"));
	}
	
	public WebElement workOrdersLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/section[1]/div/div[2]/div/label"));
	}

	public WebElement overdueLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/section[1]/div/div[3]/div/label"));
	}
	
	public WebElement filtersLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[1]/b"));
	}
	
	public WebElement searchLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"windFarms\"]/div[1]/span"));
	}
	
	public WebElement lastSubmitedEventReportsLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"eventReports\"]/span"));
	}
	
	public WebElement windFarmMapLabelText() {
		return driver.findElement(
				By.xpath("//*[@id=\"windFarms\"]/span"));
	}
	
	public WebElement regionDropdownFilter()
	{
		return driver.findElement(By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[1]/div[1]/div"));
	}
	
	public WebElement regionDropdownEUOption()
	{
		return driver.findElement(By.cssSelector("#react-select-3-option-0"));
	}
	
	public WebElement regiontickMark()
	{
		return driver.findElement(By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[1]/div[2]/div"));
	}
		
	public WebElement regionNoOptionDropdownValue() {
		return driver.findElement(
				By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[1]/div/div[2]/div/div"));
	}
	
	public WebElement windFarmDropdownFilter()
	{
		return driver.findElement(By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[4]/div/div/div[1]"));
	}
	
	public WebElement windFarmDropdownClerimoisOption()
	{
		return driver.findElement(By.cssSelector("#react-select-6-option-7"));
	}
	
	public WebElement windFarmSelectAllDropdownOption() {
		return driver.findElement(By.cssSelector("#react-select-6-option-0"));
	}
	
	public WebElement windFarmtickMark()
	{
		return driver.findElement(By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[4]/div[2]"));
	}
		
	public WebElement windFarmNoOptionDropdownValue() {
		return driver.findElement(
				By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[4]/div/div[2]/div/div"));
	}
	
	public WebElement windFarmSelectFirstValueArtois() {
		return driver.findElement(By.cssSelector("#react-select-6-option-1"));
	}
	
	public WebElement windFarmSelectFifthValueCalmont() {
		return driver.findElement(By.cssSelector("#react-select-6-option-5"));
	}
	
	public WebElement windFarmSearchDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"windFarms\"]//div[@class=\"react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer\"]"));
	}
	
	public WebElement windFarmSearchRecord() {
		return driver.findElement(By.xpath("//*[@class=\"react-select__menu-list css-11unzgr\"]//div[contains(text(),'WO B2 15550821')]"));
	}
	
	public WebElement windFarmSearchRecordOnMap() {
		return driver.findElement(By.cssSelector("div:nth-of-type(273) > .FarmChild-module_child__T4JfU > div"));
	}
	
	public WebElement windFarmSearchSeeAllSearchResult() {
		return driver.findElement(By.xpath("//*[@id=\"windFarms\"]//span[contains(text(),'See all search results')]"));
	}

}
