package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read total sheet
		
		File myfile=new File("F:\\\\velocity\\\\5ThMarchB.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		//read total sheet using static coding
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
			String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
			}
			System.out.println();
		}
		
		//read total sheet using dynamic coding
		
		int lastrownum = mysheet.getLastRowNum();
		int totalrowcount = lastrownum;
		System.out.println(totalrowcount);
		
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
		int totalcellcount = lastcellnum-1;
		System.out.println(totalcellcount);
		
		for(int i=0;i<=totalrowcount;i++)
		{
			for(int j=0;j<=totalcellcount;j++)
			{
			String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
