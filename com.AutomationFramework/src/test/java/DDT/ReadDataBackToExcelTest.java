package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBackToExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\excel2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet2");
		Row row=sheet.getRow(1);
		Cell cell=row.createCell(4);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\excel2.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("exicuted");
	}

}
