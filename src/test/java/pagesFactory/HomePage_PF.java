package pagesFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage_PF {

	@FindBy(id = "signin2")
	WebElement menu_sign_up;
	
	@FindBy(id = "login2")
	WebElement menu_log_in;
	
	@FindBy(id = "nameofuser")
	WebElement name_user;
	
	@FindBy(id = "logout2")
	WebElement menu_log_out;
	
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement option_laptops;
	
	@FindBy(xpath = "//div[@id='tbodyid']/div[1]/div[1]/a[1]")
	WebElement laptop;
	
	@FindBy(xpath = "//div[@id='tbodyid']/div[1]/div[1]/div[1]/h4/a")
	WebElement name_laptop;
	
	@FindBy(xpath = "//div[@id='tbodyid']/div[1]/div[1]/div[1]/h5")
	WebElement price_laptop;
	
	@FindBy(className = "name")
	WebElement name_laptop_selected;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement price_laptop_selected;
	
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement btn_add_to_cart;
	
	@FindBy(id = "cartur")
	WebElement menu_cart;
	
	
	
	RegisterPage_PF register;
	WebDriver driver;
	public static String name,price;
	
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignUp() {
		menu_sign_up.click();
	}
	
	public void clickLogIn() {
		menu_log_in.click();
	}
	
	public void validateUserLogin() throws InterruptedException {
		Thread.sleep(2000);
		String msg = name_user.getText();
		register = new RegisterPage_PF(driver);
	    Assert.assertEquals(msg, "Welcome " + register.username);
	}
	
	public void clickLogOut() {
		menu_log_out.click();
	}
	
	public void validateUserLogOut() {
		menu_log_in.isDisplayed();
	}
	
	public void selectOptionLaptops() throws InterruptedException {
		option_laptops.click();
		Thread.sleep(1000);
	}
	
	public void extractNameAndPrice() {
		name = name_laptop.getText();
		price = price_laptop.getText();
	}
	
	public void selectLaptop() {
		laptop.click();
	}
	
	public void validateProductSelected() {
		String name_selected = name_laptop_selected.getText();
		assertEquals(name, name_selected);
		String price_selected = price_laptop_selected.getText();
		assertEquals(price+" *includes tax",price_selected);
	}
	
	public void clickAddToCart() {
		btn_add_to_cart.click();
	}
	
	public void checkAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		alert.accept();
		Assert.assertEquals(msg, "Product added");
	}
	
	public void clickCart() {
		menu_cart.click();
	}
	
	
	
	
	
	
	
	
}
