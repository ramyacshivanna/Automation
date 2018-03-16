package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			reader=new Xls_Reader("C:/Users/ramyacs/Documents/Eclipse_Workspace/Automation/src/com/testdata/HalfEbayTestdata.xlsx");
					
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
		for(int rowNum=2;rowNum<=reader.getRowCount("RegTestData");rowNum++)
		{
			String firstname=reader.getCellData("RegTestData", "firstname", rowNum);
			String lastname=reader.getCellData("RegTestData", "lastname", rowNum);
			String address1=reader.getCellData("RegTestData", "address1", rowNum);
			String address2=reader.getCellData("RegTestData", "address2", rowNum);
			String city=reader.getCellData("RegTestData", "city", rowNum);
			String state=reader.getCellData("RegTestData", "state", rowNum);
			String zipcode=reader.getCellData("RegTestData", "zipcode", rowNum);
			String emailaddress=reader.getCellData("RegTestData", "emailaddress", rowNum);
			
			//Object ob[]=new Object[];
			Object ob[]= {firstname,lastname,address1,address2,city,state,zipcode,emailaddress};
			myData.add(ob);
			
		}
		
		return myData;
	}

}
