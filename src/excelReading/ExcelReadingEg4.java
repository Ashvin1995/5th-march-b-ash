package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myfile=new File("F:\\\\\\\\velocity\\\\\\\\5ThMarchB.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");

		///i want to read one column 
		//static coding
		
		for(int i=0;i<=3;i++)
		{
			String value = mysheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		
		//dynamic coding
		
		int lastrownum = mysheet.getLastRowNum();
		int totalrowcount = lastrownum;
	    System.out.println(totalrowcount);
	    
	    short lastcellno = mysheet.getRow(0).getLastCellNum();
	    int totalcellcount = lastcellno-1;
	   System.out.println(totalcellcount);
	   
	   for(int i=0;i<=totalrowcount;i++)
	   {
		  System.out.println(mysheet.getRow(i).getCell(2).getStringCellValue());
	   }
	}

}
