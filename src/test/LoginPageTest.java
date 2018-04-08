package test;

import or.HomePageElements;
import or.LoginPageElements;
import or.UserPageElements;








import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;








import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;
import core.ActionDriver;
import core.OpenAndCloseBrowser;

public class LoginPageTest extends OpenAndCloseBrowser{
	
	@BeforeMethod
	public void openBrowser(){
		ActionDriver browser = new ActionDriver(driver);
		browser.navigateTo("https://www.meritnation.com");
	}
    
	
	
	public void VerifyUser() throws Exception{
	/*	ActionDriver loginPage = new ActionDriver(driver);
		loginPage.navigateTo("https://www.meritnation.com");
		loginPage.click(HomePageElements.loginLink);
		loginPage.type(LoginPageElements.getUsername, "sunaina@test.com");
		loginPage.type(LoginPageElements.getPassword, "12345678");
		loginPage.click(LoginPageElements.loginBtn);
		
		assert loginPage.isElementPresent(UserPageElements.subjects):"Expected: failed";
		*/
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginLink();
		UserPage userPage = loginPage.signIn("sunaina@test.com", "12345678");
		assert userPage.isSubjectPresent():"Expected : failed";
		
	/*	HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginLink();
		UserPage userPage = loginPage.getUsername("").getPassword("").clickLoginBtn();
		assert userPage.isSubjectPresent():"Expected : failed";*/
		
	}
	
		


}