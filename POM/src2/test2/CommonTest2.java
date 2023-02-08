package test2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest2 extends BaseTest2{

	@BeforeClass
	public void login() {
		loginpage.setUsername("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickLoginButton();
		String verifydashTitle = dashboardpage.getDashBoardPageTitle();
		Assert.assertEquals(verifydashTitle, "Dashboard");
  }
	
}
