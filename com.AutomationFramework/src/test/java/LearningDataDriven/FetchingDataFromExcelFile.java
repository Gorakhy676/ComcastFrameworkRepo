package LearningDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {
	static String excelpath="C:\\Users\\Admin\\Desktop\\PracticeData.xlsx";
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Data");
		Row row=sheet.getRow(1);
		Cell browser=row.getCell(0);
		System.out.println(browser);
		Cell url=row.getCell(1);
		System.out.println(url);
		
		String data = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}

}
