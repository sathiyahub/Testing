package com.qa.selenium1.Testngframework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
		
		public ReadExcelFile(String excelPath) {
			try {
				File src=new File(excelPath);
				FileInputStream sb=new FileInputStream(src);
				wb=new XSSFWorkbook(sb);	
				
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		}
		public String getData(int sheetnumber,int row, int col) {
			sheet=wb.getSheetAt(sheetnumber);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
			
			
		}
		public int getRowCount(int sheetIndex) {
			int row=wb.getSheetAt(sheetIndex).getLastRowNum(); 
			row=row+1;
			return row;
		}
	
	}


