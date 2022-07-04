package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
   File myfile=new File("F:\\\\\\\\velocity\\\\\\\\5ThMarchB.xlsx");
   Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
   int totalrowcount = sheet.getLastRowNum();
   int totalcellcount = sheet.getRow(totalrowcount).getLastCellNum()-1;
   
   
   for(int i=0;i<=totalrowcount;i++)
   {
	   for(int j=0;j<=totalcellcount;j++)
	   {
		   
	   
   Cell cell = sheet.getRow(i).getCell(j);
   CellType type = cell.getCellType();
   
   if (type==CellType.STRING)
   {
	System.out.print(cell.getStringCellValue()+" ");
   }
   else if (type==CellType.BOOLEAN)
   {
	System.out.print(cell.getBooleanCellValue()+" ");
   }
   else if (type==CellType.NUMERIC) 
   {
	System.out.print(cell.getNumericCellValue()+" ");
    }
   
	   }
	   System.out.println();
   }
	}

}
