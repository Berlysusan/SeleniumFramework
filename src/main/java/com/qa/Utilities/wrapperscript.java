package com.qa.Utilities;

import org.openqa.selenium.WebDriver;

public class wrapperscript {
	
	private final WebDriver driver;
	private final ExtentUtility report;

	
	public wrapperscript(WebDriver driver,ExtentUtility report) {
		this.driver=driver;
		this.report=report;
		
		
	}

	public ExtentUtility getReport() {
		return report;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	

}
