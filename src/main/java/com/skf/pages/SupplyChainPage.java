package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class SupplyChainPage extends Page {

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
	
	public int notificationCount() {
		return driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/ul/div/div[2]/div")).size();
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
