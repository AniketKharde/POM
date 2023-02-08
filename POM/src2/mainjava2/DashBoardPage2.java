package mainjava2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage2 extends BaseTest{
	
	// All the locators of page //
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement txtDashboard;
	
	@FindBy(css = ".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
	WebElement logoutDropDownClick;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutButtonClick;
	
	
	// Initialization of locators/variables //
	
	public DashBoardPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	// Methods required to perform test steps //
  /**
 * @Author : Aniket Kharde
 * @Date : 07-Feb-2023
 * @Description : This test method used to get Dashboard page title
 * @return String
 */
public String getDashBoardPageTitle() {
	return txtDashboard.getText();
  }
  
  
  /**
 * @Author : Aniket Kharde
 * @Date : 07-Feb-2023
 * @Description : This test method used to Logout 
 */
public void clickLogoutButton() {
	  logoutDropDownClick.click();
	  logoutButtonClick.click();
  }
}
