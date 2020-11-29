package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class NotificationPage extends Page {

	public WebElement bellIcon() {
		return driver.findElement(By.cssSelector("#root > div:nth-child(2) > div.Navigator-module_navigator__1WRTE.undefined > div > ul > li:nth-child(9)"));
	}

	public WebElement filterHeader() {
		return driver.findElement(By.cssSelector("div[class='Filter-module_filterHeader__JueI_'] b"));
	}

	public WebElement notificationModal() {
		return driver.findElement(By.cssSelector("div[class='NotificationModal-module_modal__1a76E NotificationWrapper_modal__17zyo']"));
	}

	public WebElement notificationOnNotificationModal() {
		return driver.findElement(By.cssSelector("div[class='NotificationModal-module_modal__1a76E NotificationWrapper_modal__17zyo']"));
	}

	public WebElement notificationCloseIcon() {
		return driver.findElement(By.cssSelector("div[class='NotificationModal-module_modal__1a76E NotificationWrapper_modal__17zyo'] div:nth-child(1) div:nth-child(1) div:nth-child(2)"));
	}

	public WebElement firstValueOfNotification() {
		return driver.findElement(By.cssSelector("div[class='NotificationModal-module_content__3Cwv4'] div:nth-child(2) div:nth-child(1) div:nth-child(1)"));
	}

	public WebElement resetPasswordButton() {
		return driver.findElement(By.xpath("//button[normalize-space()='Reset my password']"));
	}

	public static String firstNotificationText() {
		return driver.findElement(By.cssSelector("div[class='NotificationModal-module_content__3Cwv4'] div:nth-child(2) div:nth-child(1) div:nth-child(1)")).getText();
	}
	
	public WebElement popUpHeader() {
		return driver.findElement(By.cssSelector("a[class='Modal-module_title__3abYu']"));
	}

	public String popUpHeaderText() {
		return driver.findElement(By.cssSelector("a[class='Modal-module_title__3abYu']")).getText();
	}

	public String turbineName() {
		StringBuilder notificationText = new StringBuilder(firstNotificationText());
		String turbineNumber = "";
		if (notificationText != null && notificationText.indexOf("Turbine ") != -1) {
			notificationText = notificationText.replace(notificationText.indexOf("Turbine "), "Turbine ".length(), "");
			String t1 = notificationText.substring(0, notificationText.indexOf(" "));
			turbineNumber=t1;
		}
		return turbineNumber;
	} 
	
	public int notificationCount() {
		return driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/ul/div/div[2]/div")).size();
	}
}
