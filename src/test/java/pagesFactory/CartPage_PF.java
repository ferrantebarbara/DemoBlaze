package pagesFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage_PF {

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr/td[2]")
	WebElement title_table;
	
	@FindBy(xpath = "//tbody[@id='tbodyid']/tr/td[3]")
	WebElement price_table;
	
	WebDriver driver;
	HomePage_PF home;
	
	public CartPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateCart() {
		String table_title = title_table.getText();
		assertEquals(home.name, table_title);
		String table_price = price_table.getText();
		assertEquals(home.price,"$"+table_price);
	}

}
