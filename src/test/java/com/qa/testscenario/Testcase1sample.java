package com.qa.testscenario;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Utilities.ExtentUtility;
import com.qa.Utilities.Settings;
import com.qa.Utilities.wrapperscript;

import com.qa.pages.SamplePageBase;
import com.qa.testbase.TestBase;



public class Testcase1sample extends TestBase {
	
	protected wrapperscript script;
	



	@Override
	
	public void setUp(){
	
		
		System.out.println("setp");
   
	}

	
	@Override

	public void tearDown() {
		// TODO Auto-generated method stub
		System.out.println("tear down");
		
	}
    
	
	@Override

	public void testExecute() {
		// TODO Auto-generated method stub
		System.out.println("test excute");
		System.out.println("in test case page "+properties.getProperty("url"));
		SamplePageBase ss=new SamplePageBase(script);
		ss.samplemethod();
		
		
	}
	
	
	
}
