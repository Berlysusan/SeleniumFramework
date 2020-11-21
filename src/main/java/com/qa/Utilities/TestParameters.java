package com.qa.Utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;



public class TestParameters  {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static String TESTDATA_SHEET_PATH ="./src/main/java/com/qa/datatables/Scenario1.xlsx";
	
	/*public TestParameters()
	{
		super();
		this.driver=driver;
	}*/
	public static HSSFWorkbook wb;
	public static HSSFSheet ws;
	public int rowCount;
	public String className;
	public String sheetName;
	public String colName;
	public String value;
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*try {
			
			wb = (HSSFWorkbook) WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		ws = wb.getSheet(sheetName);
		Object[][] data = new Object[ws.getLastRowNum()][ws.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < ws.getLastRowNum(); i++) {
			for (int k = 0; k < ws.getRow(0).getLastCellNum(); k++) {
				data[i][k] = ws.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
}
