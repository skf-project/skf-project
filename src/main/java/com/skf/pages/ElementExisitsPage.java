package com.skf.pages;

import com.skf.base.Page;

public class ElementExisitsPage extends Page{
	
	public boolean isTurbineOverviewPresent() {
		TurbinePage turbinePage = new TurbinePage();
		try {
			turbinePage.turbineoverviewlabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public boolean isEventWorkOrderPresent() {
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		try {
			eventWorkAndOrderPage.eventAndWorkOrdersTabx();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public boolean isSupplyChainPresent() {
		TurbinePage turbinePage = new TurbinePage();
		try {
			turbinePage.supplyChainHeaderButton();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean isAnalyticsPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.analyticsLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	public boolean isAnalyticsInsightsPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.insightLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	public boolean isAnalyticsReliabilityPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.reliabilityLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	public boolean isAnalyticsSensorRollerPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.sensorRollerLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	public boolean isAnalyticsSkfPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.skfLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
	public boolean isAnalyticsAiPresent() {
		AnalyticsPage analyticsPage = new AnalyticsPage();
		try {
			analyticsPage.aiLabel();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
}
}
