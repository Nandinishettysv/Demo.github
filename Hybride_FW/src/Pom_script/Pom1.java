package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.Base_page;

public class Pom1 extends Base_page {
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement submit;
	public Pom1(WebDriver driver)
	{
		super(driver);//constructor chaining
	}
	public void user(String s1)
	{
		username.sendKeys(s1);	
	}
	public void pass(String s2)
	{
		password.sendKeys(s2);	
	}
	public void login()
	{
		username.click();	
	}
}
