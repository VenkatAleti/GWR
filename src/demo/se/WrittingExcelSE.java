package demo.se;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingExcelSE {
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp info");
        Object Empdata[][] = {
        		{"EmpId","EmpName","Designation"},
        		{"101","Venkat","Analyst"},
        		{"102","LokeshY","TestLead"},
        		{"103","Arvind","Manager"}
        };
       /* int rows = Empdata.length;
        int cols = Empdata[0].length;
        System.out.println(rows);
        System.out.println(cols);
        for(int r=0;r<rows;r++) {
        	XSSFRow row = sheet.createRow(r);
        	for(int c=0;c<cols;c++) {
        		XSSFCell cell = row.createCell(c);
        		Object value = Empdata[r][c];
        		
        		if(value instanceof String)
        			cell.setCellValue((String)value);
        		if(value instanceof Integer)
        			cell.setCellValue((Integer)value);
        		if(value instanceof Boolean)
        			cell.setCellValue((Boolean)value);
        	}
        }*/
        int rowCount =0;
        for(Object emp[]:Empdata) {
        	XSSFRow row = sheet.createRow(rowCount++);
        			int columnCount =0;
        	for (Object value : emp) {
        		XSSFCell cell = row.createCell(columnCount++);
        				if(value instanceof String)
                			cell.setCellValue((String)value);
                		if(value instanceof Integer)
                			cell.setCellValue((Integer)value);
                		if(value instanceof Boolean)
                			cell.setCellValue((Boolean)value);
        	}
        }
String filepath = ".\\ExcelSheets\\EmpInfo.xlsx";
FileOutputStream outstream = new FileOutputStream(filepath);
workbook.write(outstream);
System.out.println("Successfull");
}
}