package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TakeExcelInputsForLoop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:/Sujan/Workouts/Sample Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		System.out.println(rowCount);
		for(int i=1; i<rowCount; i++) {
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data0);
		}
	}

}
