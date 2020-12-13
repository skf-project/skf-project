package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class AnalyticsPage extends Page {

	public WebElement analyticsLabel() {
		return driver.findElement(By.xpath("//a[contains(text(),'Analytics')]"));
	}
	public WebElement insightLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Insights')]"));
	}
	
	public WebElement reliabilityLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Reliability')]"));
	}
	
	public WebElement sensorRollerLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Sensor roller')]"));
	}
	public WebElement skfLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'SKF')]"));
	}
	public WebElement aiLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'AI')]"));
	}
}
