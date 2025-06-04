package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBaseOnCondition {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String expectedTestId="tc_50";
		String data1="";
		String data2="";
		String data3="";
		boolean flag=false;
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\excel2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet2");
		int rowCount=sheet.getLastRowNum();
		for(int i=0; i<=rowCount;i++) {
			String data="";
			try {
			 data =sheet.getRow(i).getCell(0).toString();
			 if(data.equals(expectedTestId)) {
				 flag=true;
				 data1 =sheet.getRow(i).getCell(1).toString();
				 data2=sheet.getRow(i).getCell(2).toString();
				 data3 =sheet.getRow(i).getCell(3).toString();


			 }
			}
			catch(Exception e){}
				
			}
		
		if(flag==true) {
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}
		else {
			System.out.println(expectedTestId+"  test case id is not available");
		}

		}
			
		
	

}
