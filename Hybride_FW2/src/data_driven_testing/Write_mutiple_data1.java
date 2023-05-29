package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_mutiple_data1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://106.51.87.42:9008/");
	List<WebElement> all_links = driver.findElements(By.xpath("//a"));
	int count = all_links.size();
	for(int i=0;i<count;i++)
	{
	Row r = sheet.createRow(i);
	Cell c = r.createCell(0);
	String txt = all_links.get(i).getText();
	c.setCellValue(txt);
	}
	FileOutputStream fos=new FileOutputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
	book.write(fos);
	}
	
	
	
}
