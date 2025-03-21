package generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	//get data from property class
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\GorakhApplication\\VTiger\\Configration\\CommonFile");
		Properties pObj=new Properties();	
		pObj.load(fis);
		String value=pObj.getProperty(key);
		return value;
	}
	 public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
	
		 FileInputStream fis2 = new FileInputStream("C:\\Users\\Admin\\Desktop\\abc.xlsx");
			Workbook wb = WorkbookFactory.create(fis2);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			return cell.getStringCellValue();
	 }

}
