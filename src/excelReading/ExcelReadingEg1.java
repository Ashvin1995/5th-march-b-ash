package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myfile=new File("F:\\velocity\\5ThMarchB.xlsx");
		
		String name1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name1);
		

		double value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value2);
	
		System.out.println(WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue());
		
		String text = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(text);
	}

}
