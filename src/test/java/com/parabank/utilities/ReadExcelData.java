package com.parabank.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {

	 public static XSSFWorkbook workbook;
	 public static XSSFSheet worksheet;
	 public static DataFormatter formatter= new DataFormatter();
	 public static String file_location = System.getProperty("user.dir")+"\\TestData\\CustomerDetails.xlsx";
	 static String sheetName= "Customer";
	
	 public static Object[][] readExcel() throws IOException, InvalidFormatException
	 {
		workbook = new XSSFWorkbook (new File(file_location)); 
		worksheet=workbook.getSheet(sheetName);
		XSSFRow Row=worksheet.getRow(0);
		   
		     int RowNum = worksheet.getPhysicalNumberOfRows();
		     int ColNum= Row.getLastCellNum();  
		     
		     Object Data[][]= new Object[RowNum-1][ColNum];
		     
		     for(int i=0; i<RowNum-1; i++)
		     {  
		          XSSFRow row= worksheet.getRow(i+1);
		     
		          for (int j=0; j<ColNum; j++)
		          {
		        	  if(row==null)
		        		  Data[i][j]= "";
		        	  else 
		        	  {
		        		  XSSFCell cell= row.getCell(j);
		        		  if(cell==null)
		        			  Data[i][j]= ""; 
		        		  else
		        		  {
		        			  String value=formatter.formatCellValue(cell);
		        			  Data[i][j]=value;
		        		  }
		        	  }
		          }
		     }
		 
		     return Data;
	}
}


