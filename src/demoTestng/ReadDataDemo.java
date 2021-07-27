package demoTestng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataDemo {
	@DataProvider
	public static String[][] read() throws Exception
	{
		String st[][];
		String path="E:\\RAESHMA\\QSPIDER\\Seleniumclass\\seleDemo.xlsx";
		FileInputStream fis=new FileInputStream(path);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet("Sheet1");
				int roWCount=sh.getPhysicalNumberOfRows();
				int ColCount=sh.getRow(0).getLastCellNum();
				st=new String[roWCount-1][ColCount];
				for(int i=1;i<roWCount;i++)//i=1 if excel sheet has heading
				{
					for(int j=0;j<ColCount;j++)
					{
						Cell cl=sh.getRow(i).getCell(j);
						st[i-1][j]=cl.toString();
					}
				}
				return st;		
	}
}
