package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TakeExcelInputs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:/Sujan/Workouts/Sample Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data0);

	}

}
