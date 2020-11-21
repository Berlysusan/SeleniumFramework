package com.qa.Utilities;



import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class ExtentUtility {
	
	public static ExtentTest test ;
	public static ExtentReports extent ;
	public static String reportFolder ="";
	static Map extentTestMap = new HashMap();
	
	
	 public synchronized static ExtentReports getReporter() {
	        if (extent == null) {
	        	SimpleDateFormat sdfDateReport = new SimpleDateFormat(
						"yyyy-MM-dd-HH-mm-ss");// dd/MM/yyyy
				Date now = new Date();
				//extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
				 reportFolder = "HtmlReport_" + sdfDateReport.format(now);
				 //("ReportGenerator/"+reportFolder+"/TestReport.html")
	        	String s=new File(System.getProperty("user.dir")+"/Report/"+reportFolder+"/TestReport.html").getPath();
				 extent = new ExtentReports(s, true,Locale.ENGLISH);
				 extent.addSystemInfo("Selenium Version", "3");
				 extent.addSystemInfo("Environment", "Production");
				 extent.assignProject("Disney Photo");
				 
			        
			        
	        }
	        
	        return extent;
	    }
	 public static synchronized ExtentTest getTest() {
	        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	    }

	    public static synchronized void endTest() {
	        extent.endTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
	    }

	    public static synchronized ExtentTest startTest(String testName) {
	        return startTest(testName, "");
	    }

	    public static synchronized ExtentTest startTest(String testName, String desc) {
	        ExtentTest test = extent.startTest(testName, desc);
	        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);

	        return test;
	    }
	
	
}
