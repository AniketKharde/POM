package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;


public class LoginPage extends BaseTest  {

	// All the locators of page //
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement txtLoginPage;
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement passWord;
	
	@FindBy(tagName = "button")
	WebElement clickButton;
	
	
	// Initialization of locators/variables //
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	// Methods required to perform test steps //
	 
	/**
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to get the Title of build
	 * @return : String
	 */
	public String getBuildTitle() {
		return driver.getTitle();		  
	  }
	
	/**
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to verify Title of login page
	 * @return : String
	 */
	public String getPageTitle() {
		return txtLoginPage.getText();
	}
	
	/**
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to verify current Url of page
	 * @return : String
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
		/**
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to set username value
	 */
	public void setUsername(String usrname) {
		userName.sendKeys(usrname);
	}
	
	/**
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to set password value
	 */
	public void setPassword(String pass) {
		passWord.sendKeys(pass);
	}
	
	/**
	 * @return 
	 * @Author : Aniket Kharde
	 * @Date : 04-Feb-2023
	 * @Description : This test method used to click login button
	 */
	public void clickLoginButton() {
		clickButton.click();
		
	}
	
}
