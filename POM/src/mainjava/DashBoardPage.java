package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest{
	
	// All the locators of page //
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement txtDashboard;
	
	
	
	
	// Initialization of locators/variables //
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	// Methods required to perform test steps //
  public String getDashBoardPageTitle() {
	return txtDashboard.getText();
	  
  }
}
