package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_script_excel {

	public static String fetch_data(String sh,int r,int c)
	{
		String value="";
		
		try {
		FileInputStream fis=new FileInputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sh);
		 Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		value= cell.toString();
	}
catch(Exception e)
		{
	System.out.println(e);
		}
		return value;
}

}
