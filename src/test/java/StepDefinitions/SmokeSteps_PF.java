package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pagesFactory.CartPage_PF;
import pagesFactory.HomePage_PF;
import pagesFactory.LoginPage_PF;
import pagesFactory.RegisterPage_PF;


public class SmokeSteps_PF {
	
	WebDriver driver = null;
	RegisterPage_PF register;
	LoginPage_PF login;
	HomePage_PF home;
	CartPage_PF cart;
	
	@Before()
	public void setUp() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is :" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@After()
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	//*******************************************************************//
	//Scenario: Check sign up is successful
	//*******************************************************************//
	
	@Given("user enters the site")
	public void user_enters_the_site() {
		
		System.out.println("Inside Step - user enters the site");
				
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@And("user is on sign up page")
	public void user_is_on_sign_up_page() {
		
		System.out.println("Inside Step - user is on sign up page");
		home = new HomePage_PF(driver);

		home.clickSignUp();
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    
		System.out.println("Inside Step - user enters username and password");
		
		register = new RegisterPage_PF(driver);
		
		String username = register.generateUsernameRandom();
		register.enterUserName(username);
		register.enterPassword("admin123@");
	}
	
	@And("clicks on sign up button")
	public void clicks_on_sign_up_button() {
		
		System.out.println("Inside Step - clicks on sign up button");
		
		register.clickSignUpAccept();
		
	}
	
	@When("user is successfully registered")
	public void user_is_successfully_registered() throws InterruptedException {
	    
		System.out.println("Inside Step - user is successfully registered");
		register.checkAlert();
		
	}
	
	//*******************************************************************//
	//Scenario: Check that the login and logout is correct with valid user and password
	//*******************************************************************//
	@Given("user enters the site DemoBlaze")
	public void user_enters_the_site_DemoBlaze() {
		
		System.out.println("Inside Step - user enters the site");
				
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	

	@And("user is on log in page")
	public void user_is_on_log_in_page() {
	    System.out.println("Inside Step - user is on log in page");
	   
	    home = new HomePage_PF(driver);
	    home.clickLogIn();
	}
	
	@When("user enters username and password valid")
	public void user_enters_username_and_password_valid() {
	    System.out.println("Inside Step - user enters username and password valid");
	    
	    login = new LoginPage_PF(driver);
	    register = new RegisterPage_PF(driver);
	    login.enterUserName(register.username);
	    login.enterPassword("admin123@");
	    
	}

	@And("clicks on log in button")
	public void clicks_on_log_in_button() {
	    System.out.println("Inside Step - clicks on log in button");
	    
	    login.clickSignInAccept();
	}

	@And("user successfully logged in")
	public void user_successfully_logged_in() throws InterruptedException {
		System.out.println("Inside Step - user successfully logged in");
		
		home.validateUserLogin();
	}
	
	@And("clicks on log out button")
	public void clicks_on_log_out_button() {
		System.out.println("Inside Step - clicks on log out button");
		
		home.clickLogOut();
	}
	
	@Then("user is successfully log out")
	public void user_is_successfully_log_out() {
		System.out.println("Inside Step - user is successfully log out");
		
		home.validateUserLogOut();
	}
	
	//*******************************************************************//
	//Scenario: Add laptop to cart and validate
	//*******************************************************************//
	@Given("user enters the site Demo")
	public void user_enters_the_site_Demo() {
		System.out.println("Inside Step - user enters the site Demo");
		
		driver.navigate().to("https://www.demoblaze.com/index.html");

	}

	@And("user clicks on laptops")
	public void user_clicks_on_laptops() throws InterruptedException {
		System.out.println("Inside Step - user clicks on laptops");
		home = new HomePage_PF(driver);
		home.selectOptionLaptops();
	}

	@When("user selects one laptop")
	public void user_selects_one_laptop() {
		System.out.println("Inside Step - user selects one laptop");
		
		home.extractNameAndPrice();
		home.selectLaptop();
		
	}

	@And("validate name and price")
	public void validate_name_and_price() {
		System.out.println("Inside Step - validate name and price");
		
		home.validateProductSelected();
	}

	@And("click add to cart")
	public void click_add_to_cart() {
		System.out.println("Inside Step - click add to cart");
		
		home.clickAddToCart();
	}

	@And("validate product added")
	public void validate_product_added() {
		System.out.println("Inside Step - validate product added");
		
		home.checkAlert();

	}

	@And("click cart")
	public void click_cart() {
		System.out.println("Inside Step - click cart");
		
		home.clickCart();
	}

	@Then("validate product in cart")
	public void validate_product_in_cart() {
		System.out.println("Inside Step - validate product in cart");
		cart = new CartPage_PF(driver);
		cart.validateCart();
	}
	
	
	
	
	
	
	
}
