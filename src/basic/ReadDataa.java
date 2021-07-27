package basic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataa {
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("E:\\RAESHMA\\QSPIDER\\Seleniumclass\\seleDemo.xlsx");//mentioning the path of the File
		Workbook wb=WorkbookFactory.create(fis);//To load the excel file
		Sheet sh=wb.getSheet("Sheet1");//Loading sheet of the excel File
		int roWCount=sh.getPhysicalNumberOfRows();//to get the Row Count
		int ColCount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<roWCount;i++)
		{
			for(int j=0;j<ColCount;j++)
			{
				Cell cl=sh.getRow(i).getCell(j);
				System.out.println(cl);
			}
		}
		
	}
	public static String readCell(String path,String sheetName,int row,int col) throws Exception
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Cell cl=sh.getRow(row).getCell(col);
		return cl.toString();
	}

}
