package Pom_script;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page;

public class Pom2 extends Base_page{
@FindBy(xpath="//input[@type='checkbox']")
private WebElement check1;
@find
	public Pom2(WebDriver driver)
	{
		super(driver);
	}
	public void checkbox1()
	{
		check1.click();
	}
	


}
