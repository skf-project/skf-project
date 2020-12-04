package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class SupplyChainPage extends Page {

	public WebElement supplyChainLabel() {
		return driver.findElement(By.cssSelector(".Breadcrumb-module_breadcrumb__2Mkgj a"));
	}

	public WebElement turbineModelLabel() {
		return driver.findElement(By.cssSelector("h2[title='Turbine Model']"));
	}

	public WebElement assetLabel() {
		return driver.findElement(By.cssSelector("h2[title='Asset']"));
	}

	public WebElement positionLabel() {
		return driver.findElement(By.cssSelector("h2[title='Position']"));
	}

	public WebElement eventIDLabel() {
		return driver.findElement(By.cssSelector("h2[title='Event ID']"));
	}

	public WebElement availabilityStatusLabel() {
		return driver.findElement(By.cssSelector("div[title='Availability Status']  .preTextWithEllipsis"));
	}

	public WebElement nodeAvailabilityLabel() {
		return driver.findElement(By.cssSelector("div[title='Node Availability']  .preTextWithEllipsis"));
	}

	public WebElement productAvailabilityByEventLabel() {
		return driver.findElement(By.cssSelector("div[title='Product availability by event']  .preTextWithEllipsis"));
	}

	public WebElement bearingToBeReplacedAvailabilityLabel() {
		return driver
				.findElement(By.cssSelector("div[title='Bearings to be replaced availability']  .preTextWithEllipsis"));
	}

	public WebElement availabilityByWarehouseLabel() {
		return driver.findElement(By.cssSelector("div[title='Availability by Warehouse']  .preTextWithEllipsis"));
	}

	public WebElement turbineModelDropdown() {
		return driver.findElement(By.cssSelector(
				".droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern div[role='button'] > .chevron-down.dropdown-chevron.powervisuals-glyph"));
	}

	public WebElement turbineModelDropdownValueG87() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='G87']"));
	}

	public WebElement turbineModelDropdownValueG87CheckBox() {
		return driver.findElement(By.cssSelector("div:nth-of-type(2) > div[role='option']  .checkbox.glyphicon"));
	}

	public WebElement turbineIdDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(15) .powervisuals-glyph"));
	}

	public WebElement turbineIdDropdownValueBOU_U001() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='BOU_U001']"));
	}

	public WebElement turbineIdDropdownValueBOU_U001CheckBox() {
		return driver.findElement(By.cssSelector("[height='90'] .row:nth-of-type(1) .glyphicon"));
	}

	public WebElement assetDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(11) .powervisuals-glyph"));
	}

	public WebElement assetDropdownValueGearbox() {
		return driver.findElement(By.cssSelector("[title='Gearbox']"));
	}

	public WebElement assetDropdownValueGearboxCheckBox() {
		return driver.findElement(By.cssSelector(
				"div:nth-of-type(7) div[role='listbox'] > .scroll-wrapper.scrollbar-inner  .scrollRegion > div > div:nth-of-type(1) > div[role='option']  .checkbox.glyphicon"));
	}

	public WebElement positionDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(13) .powervisuals-glyph"));
	}

	public WebElement positionDropdownValueHIS_S_GS() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='HIS-S-GS']"));
	}

	public WebElement positionDropdownValueCheckboxHIS_S_GS() {
		return driver.findElement(By.cssSelector("[height='216'] .row:nth-of-type(1) .glyphicon"));
	}

	public WebElement eventIdDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(14) .powervisuals-glyph"));
	}

	public WebElement statusLabel1To5Days() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(1) .slicerText"));
	}
	
	public WebElement statusLabel5To10Days() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(2) .slicerText"));
	}
	
	public WebElement statusLabelAtMost1WorkDays() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(3) .slicerText"));
	}
	
	public WebElement statusLabelMoreThan10WorkDays() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(4) .slicerText"));
	}
	
	public WebElement statusLabelNoAvailability() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(5) .slicerText"));
	}
	
	public WebElement statusLabelNoDatesAreAvaiable() {
		return driver.findElement(By.cssSelector(".row .cell:nth-of-type(6) .slicerText"));
	}
	
	public WebElement nodeAssetModelLabel() {
		return driver.findElement(By.cssSelector("div[title='Asset Model']"));
	}
	
	public WebElement nodeBearingDesignationLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(1) [title='Bearing Designation']"));
	}
	
	public WebElement nodePositionLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(1) [title='Position']"));
	}
	
	public WebElement nodeLabel() {
		return driver.findElement(By.cssSelector("[title='Node']"));
	}
	
	public WebElement nodeQuantityLabel() {
		return driver.findElement(By.cssSelector("[title='Quantity']"));
	}
	
	public WebElement nodeLeadTimeLabel() {
		return driver.findElement(By.cssSelector("[title='Lead Time']"));
	}
	
	public WebElement nodeAvailableDateLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(1) [title='Available Date']"));
	}

	public WebElement nodeStatusLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(1) [title='Status']"));
	}
	
	public WebElement productEventIdLabel() {
		return driver.findElement(By.cssSelector("div[title='Event ID']"));
	}
	
	public WebElement productIndicatedFaultLabel() {
		return driver.findElement(By.cssSelector("div[title='Indicated Fault']"));
	}
	
	public WebElement productPositionLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(9) [title='Position']"));
	}
	
	public WebElement productBearingDesignationLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(9) [title='Bearing Designation']"));
	}
	
	public WebElement productAvailableDateLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(9) [title='Available Date']"));
	}
	
	public WebElement productStatusLabel() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(9) [title='Status']"));
	}
	
	public WebElement focusButton() {
		return driver.findElement(By.xpath("//button[@class=\"vcPopOutBtn\"]"));
	}
	
	public WebElement backToReportButton() {
		return driver.findElement(By.cssSelector("visual-container-pop-out-bar button[type='button']"));
	}
	
	public WebElement supplyChainTab() {
		return driver.findElement(By.cssSelector("ul > li:nth-of-type(7)"));
	} 
	
	public WebElement iFrame() {
		return driver.findElement(By.tagName("iframe"));
	}
	
	public WebElement eventId() {
		return driver.findElement(By.cssSelector("visual-container-repeat .visual-container-component:nth-of-type(14) .slicer-restatement"));
	}
	
	public WebElement eventId10523() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='10523']"));
	}
	
	public WebElement avaibilityStatus() {
		return driver.findElement(By.xpath("//div[@id='sandbox-host']/img"));
	}
	
	public WebElement verifyBearingsToBeReplacedAvailabilitySection() {
		return driver.findElement(By.cssSelector("visual-modern > .allow-deferred-rendering.visual.visual-GanttChartByMAQSoftware1448688115701"));
	}
	
	public WebElement categoryHierarchy() {
		return driver.findElement(By.cssSelector(".show > text[title='10523']"));
	}
	
	public WebElement avaibilityStatusiFrame1() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(2) > .bringToFront > .droppableElement.hideBorder.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern  iframe[name='visual-sandbox']"));
	}
	
	public WebElement avaibilityStatusiFrame2() {
		return driver.findElement(By.cssSelector(".droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  iframe[name='visual-sandbox']"));
	}
	
	public WebElement verifyBearingsToBeReplacedAvailabilitySectioniFrame() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(12) > .bringToFront > .droppableElement.hideBorder.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern  iframe[name='visual-sandbox']"));
	}
	
	public WebElement reportiFrame() {
		return driver.findElement(By.xpath("//*[@id=\"10fd9aa7-b752-4b93-bff1-b768101fd828\"]/iframe"));
	}
	
	public String eventIDSelectedValue() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(14) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern div[role='button'] > .slicer-restatement")).getText();
	}
	
	public WebElement quantity() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(5) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .value > tspan"));
	}
	
	public WebElement leadTime() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(6) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .value > tspan"));
	}
	
	public WebElement demandDate() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(7) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .value > tspan"));
	}
	
	public WebElement focusModeButton() {
		return driver.findElement(By.cssSelector("[aria-label='Focus mode']"));
	}
	
	public WebElement backToReportButton() {
		return driver.findElement(By.cssSelector("visual-container-pop-out-bar button[type='button']"));
	}
	
	public WebElement productAvaibilityByEvent() {
		return driver.findElement(By.cssSelector("div[title='Product availability by event']  .preTextWithEllipsis"));
	}
	
	public String quantityValue() {
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(5) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .value > tspan")).getText();
	}

}