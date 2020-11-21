package com.qa.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Utilities.ExtentUtility;
import com.qa.Utilities.Settings;
import com.qa.Utilities.wrapperscript;
import com.qa.pageBase.BasePage;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class SamplePageBase extends BasePage{
	
  public SamplePageBase(wrapperscript script) 
	{
	super(script);
	
	}
	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	private WebElement contactsLabel;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="surname")
	private WebElement lastName;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	private WebElement test;
	
	// Initializing the Page Objects:
	/*public SamplePageBase() {
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	
	public void samplemethod()  {
		/*Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);*/

		System.out.println("inside mathod "+properties.getProperty("url"));
		
		
        ExtentUtility.extent=ExtentUtility.getReporter();
        ExtentUtility.test=ExtentUtility.extent.startTest("test");
        ExtentUtility.getTest();
        ExtentUtility.extent.endTest(ExtentUtility.getTest());
        ExtentUtility.getReporter().flush();
        
        
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String dept = dataTable.getData("General_Data", "department2"); 
		
		
	}
	
	

}
