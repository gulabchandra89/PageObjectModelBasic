package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;


import base.Page;

public class Utility extends Page{
	public static String screenshotPath;
	public static String screenshotName;
	public static void captureScreenshot() throws IOException
	{
		File filesrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime d = LocalDateTime.now(); 
		screenshotName=d.toString().replace('/', '_').replace(':', '_').replace(' ', '_')+".jpg";;
		FileUtils.copyFile(filesrcFile, new File(System.getProperty("user.dir")+"\\target\\"+screenshotName));
		
	}

	@DataProvider(name="CommonDP")
	public Object[][] getDataExcel(Method m) {
		String sheetNameString = m.getName();
		
		int rows = excelReader.getRowCount(sheetNameString);
		int cols = excelReader.getColCount(sheetNameString);

		Object[][] data = new Object[rows][1];
		
		for (int rowNum = 1; rowNum <= rows; rowNum++) {
			
			 Hashtable<Object, Object> table = 
	                 new Hashtable<Object, Object>();
			
			for (int colNum = 0; colNum < cols; colNum++) {
				//data[rowNum - 1][colNum] = excelReader.getCellData(sheetNameString, rowNum, colNum);
				table.put(excelReader.getCellData(sheetNameString, 0, colNum), excelReader.getCellData(sheetNameString, rowNum, colNum));
				
				data[rowNum - 1][0]=table;
				//System.out.println(data[rowNum - 1][colNum]);
				
				
			}  
			
			
		}

		return data;

	}

	public static boolean isSuiteRunnable(String testName, ExcelReader reader)
	{
		String sheetName= "test_suite";
		int rows= reader.getRowCount("test_suite");
		for(int rNum=1;rNum<=rows;rNum++)
		{int i=0;
		String testcase= (String) reader.getCellData(sheetName, rNum, i);
		if(testcase.equalsIgnoreCase(testName))
		{
			++i;
			String runmode= (String) reader.getCellData(sheetName, rNum, i);
			
			if(runmode.equalsIgnoreCase("Y"))
			{
				return true;
				
				
			}
			else return false;
			
		}
			
			
		}
		
		return false;	
	}
	
	
}
