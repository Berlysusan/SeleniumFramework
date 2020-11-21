package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qa.Utilities.*;
import com.qa.Utilities.TestReuse;
import com.qa.Utilities.wrapperscript;



public abstract class TestBase {
	
	protected wrapperscript script;
	protected ExtentUtility report;
	protected WebDriver driver;
	protected Properties properties;
	
	public TestBase(){
		
		properties=Settings.getInstance();
		
	}
	
	/*public String getProperties(String s){
		try {
			
			System.out.println("entered");
			properties = new Properties();
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/resourcesConfig/GlobalProperties.properties");
			properties.load(ip);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}return properties.getProperty(s);}
	*/
	public void initialize(wrapperscript scriptHelper)
	{
		this.script = scriptHelper;
		
	
		this.report = scriptHelper.getReport();
		this.driver = scriptHelper.getDriver();
		
		properties = Settings.getInstance();
	}
	@BeforeTest
	public abstract void setUp();
	@AfterTest
	public abstract void tearDown();
	
	@Test
	public abstract void testExecute();
	
	@AfterSuite
	public void test1(){
	}
	@BeforeSuite
	public void test2()
	{
	
	}}