package com.qa.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;



public class Settings {

	
	protected ExtentUtility report;
	
	protected wrapperscript scriptHelper;
	protected WebDriver driver;
	//ReusableLibrary.driver = scriptHelper.getDriver();
private static Properties properties;
    
    static {
        Settings.properties = getProperties();
    }
    
    private Settings() {
    }
    
	 public static Properties getInstance() {
	        return Settings.properties;
	    }
	    
	 private static Properties  getProperties(){
		try {
			
			System.out.println("entered");
			properties = new Properties();
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/resourcesConfig/GlobalProperties.properties");
			properties.load(ip);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}return properties;
	 }
		 public Object clone() throws CloneNotSupportedException {
		        throw new CloneNotSupportedException();
		    }
	
			
}

