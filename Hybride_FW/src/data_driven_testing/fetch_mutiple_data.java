package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_mutiple_data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		FileInputStream fis=new FileInputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(3);
		String value = cell.toString();
		System.out.println(value);
		Row row1 = sheet.getRow(2);
		Cell cell2= row1.getCell(4);
		String value1 = cell2.toString();
		System.out.println(value1);
		driver.findElement(By.id("email")).sendKeys(value);
		driver.findElement(By.id("pass")).sendKeys(value1);
		driver.findElement(By.name("login")).click();
	}
}
