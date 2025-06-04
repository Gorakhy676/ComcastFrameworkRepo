package LearningDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingIplDataFromExcelFile {
	static String excelpath="./src/main/resources/Team.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("IPLData");
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=2;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
	}

}
