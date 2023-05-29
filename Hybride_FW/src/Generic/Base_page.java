package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_page {
	public WebDriver driver;//declare globally to use in pom script(super.(driver))
	public Base_page(WebDriver driver)//declare locally to pass inside initelements
	{
		PageFactory.initElements(driver,this);
	}

}
