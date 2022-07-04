package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("F:\\\\velocity\\\\5ThMarchB.xlsx");
		Sheet mysheeet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	    //reading whole now
		
		//static coding
		for(int i=0;i<=2;i++)
		{
			String value = mysheeet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
		int lastrownum = mysheeet.getLastRowNum();
		int totalrowcount = lastrownum;
		
		int lastcellnum = mysheeet.getRow(0).getLastCellNum()-1;
		int totalcellcount = lastcellnum;
		
		for(int i=0;i<=totalcellcount;i++)//dynamic coding
		{
			String value = mysheeet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
	}

}
