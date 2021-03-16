
package pagesFactory;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage_PF {
	
	
	@FindBy(id = "sign-username")
	WebElement txt_username;
	
	@FindBy(id = "sign-password")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement btn_sign_up_accept;
	
	WebDriver driver;
	public static String username;
	
	public RegisterPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String generateUsernameRandom() {
		int number_random = ThreadLocalRandom.current().nextInt();
		username = "admin"+number_random;
		return username;
	}
	
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public String extractUserNameByLogin() {
		username = txt_username.getText();
		return username;
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickSignUpAccept() {
		btn_sign_up_accept.click();
	}
	
	public void checkAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		alert.accept();
		Assert.assertEquals(msg, "Sign up successful.");
	}
	
}




