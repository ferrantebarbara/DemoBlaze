package pagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	

	@FindBy(id = "loginusername")
	WebElement txt_username;
	
	@FindBy(id = "loginpassword")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement btn_sign_in_accept;
	
	WebDriver driver;
	
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickSignInAccept() {
		btn_sign_in_accept.click();
	}
	
	
	
	
	
	
	
	
	
	
}
