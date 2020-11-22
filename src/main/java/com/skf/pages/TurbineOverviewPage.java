package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class TurbineOverviewPage extends Page {
	
	public WebElement turbineoverviewlabel()
	{
		return driver.findElement(By.xpath("//div[@class='Breadcrumb-module_breadcrumb__2Mkgj']//a[contains(text(),'Turbine overview')]"));
	}
	
	public WebElement firstValueOfTurbineDropDown() {
		return driver.findElement(By.cssSelector("#react-select-7-option-0"));

	}
	public WebElement secondValueOfTurbineDropDown() {
		return driver.findElement(By.cssSelector("#react-select-7-option-1"));

	}
	public WebElement thirdValueOfTurbineDropDown() {
		return driver.findElement(By.cssSelector("#react-select-7-option-2"));

	}
	public WebElement clearall() {
		return driver.findElement(By.xpath("//span[@Class='Filter-module_clear__gbgFq']"));
	}
	
    public WebElement tick()
    {
    	return driver.findElement(By.xpath("//*[@id=\"react-select-7-option-1\"]/div"));
    }
    public boolean isclearallpresent()
    {
    	try {
    		clearall();
    		return true;
    	}
    	catch(org.openqa.selenium.NoSuchElementException e) {
    		return false;
    	}
    }
    public WebElement noptions() {
		
    	return driver.findElement(By.xpath("//*[@id=\"filtersSideBar\"]/div/div/div[2]/div[5]/div/div[2]/div/div"));
    	
    }
    public WebElement turbinedatafield() {
		return driver.findElement(By.xpath("//*[@id=\"react-select-7-input\"]"));
    	
    }
    public WebElement eventworkorder(){
		return driver.findElement(By.xpath("//li[5]"));
    	
    }
    
    public WebElement eventworkorderlabel() {
    	return driver.findElement(By.xpath("//div[@class='Breadcrumb-module_breadcrumb__2Mkgj']//a[contains(text(),'Event & Work Orders')]"));
    }
    
    public WebElement skflink() {
    	return driver.findElement(By.cssSelector("#root > div:nth-child(2) > div.Navigator-module_navigator__1WRTE.undefined > div > ul > li.Navigator-module_logo__1bP1h"));
    }
    
}

