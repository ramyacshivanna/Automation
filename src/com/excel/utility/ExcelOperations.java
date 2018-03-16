package com.excel.utility;
import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader=new Xls_Reader("C:/Users/ramyacs/Documents/Eclipse_Workspace/Automation/src/com/testdata/HalfEbayTestdata.xlsx");
		
		//it creates one more sheet  only if that does not exists.	
		reader.addSheet("HomePage");
		if(!reader.isSheetExist("HomePage"))
		{
			reader.addSheet("HomePage");
		}
		
		//reader.addHyperLink(sheetName, screenShotColName, testCaseName, index, url, message);
		
		int colCount=reader.getColumnCount("RegTestData");
		System.out.println("Total columns in RegTestData sheet: " +colCount);
		
		
	}

}
