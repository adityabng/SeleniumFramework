package pages;

import or.LoginPageElements;
import or.UserPageElements;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;

public class UserPage extends ActionDriver {

	public UserPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementPresent(UserPageElements.subjects)){
			throw new Exception("User is not on UserPage and is on "+getTitle());
		}
	}
	
	
	public boolean isSubjectPresent(){
		return isElementPresent(UserPageElements.subjects);
	}
	

}
