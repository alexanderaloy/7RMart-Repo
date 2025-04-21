package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant7R.Constants7R;



public class ExcelUtilities7R {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static String getStringData(int i, int j, String sheet) throws IOException {
			String filepath = Constants7R.EXCELTESTDATAREADFILE;
			f = new FileInputStream(filepath);
			wb = new XSSFWorkbook(f);
			sh = wb.getSheet(sheet);
			Row r = sh.getRow(i);
			Cell c = r.getCell(j);
			return c.getStringCellValue();
		}
	public static String getIntegerData(int i, int j, String sheet) throws IOException {
			String filepath = Constants7R.EXCELTESTDATAREADFILE;
			f = new FileInputStream(filepath);
			wb = new XSSFWorkbook(f);
			sh = wb.getSheet(sheet);
			Row r = sh.getRow(i);
			Cell c = r.getCell(j);
			int x = (int) c.getNumericCellValue();
			return String.valueOf(x);
}
}