package com.qa.pageBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.Utilities.ExtentUtility;
import com.qa.Utilities.Settings;
import com.qa.Utilities.TestReuse;
import com.qa.Utilities.wrapperscript;

public class BasePage  extends TestReuse{
	protected wrapperscript script;
	protected WebDriver driver;
	protected ExtentUtility report;
	protected Properties properties;
	
	

	public BasePage(wrapperscript script){
		super();
		properties=Settings.getInstance();
		this.script=script;
		//this.report=script.getReport();
		//this.driver=script.getDriver();
	
	  
		
		
	}

	public void test(){
		
	
	}
	
	/*	public  BasePage(){
			try {
				 prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
						+ "/qa/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} */
			
		

	//}
}
