package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
    File myfile=new File("F:\\velocity\\5ThMarchB.xlsx");
    
    Workbook book = WorkbookFactory.create(myfile);
    Sheet sheet = book.getSheet("Sheet3");
    Row row = sheet.getRow(0);
    Cell cell = row.getCell(2);
    CellType type = cell.getCellType();
    System.out.println(type);
    String value = cell.getStringCellValue();
    System.out.println(value);

	}

}
