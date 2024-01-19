package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Final_Test {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//LOGIN PAGE
		Login_Page Lp=new Login_Page(driver);
		Lp.LaunchBrowser();
		Lp.Login();
		Lp.Submit();
		
		//HOME PAGE
		Home_Page Hp=new Home_Page(driver);
		Hp.Headings();
		Hp.ProductsPage();
		Hp.Item();
		
		//PRODUCT PAGE
		Products_Page Pp=new Products_Page(driver);
		Pp.Itemname();
		Pp.ItemDes();
		Pp.Price();
		Pp.CartButton();
		Pp.BackButton();
		
		//CART PAGE
		Cart_Page Cp=new Cart_Page(driver);
		Cp.Cart();
		Cp.YourCart();
		Cp.ContinueShopping();
		Cp.Checkout();
		
		//CHECKOUT PAGE
		Checkout_Page Chp=new Checkout_Page(driver);
		Chp.YourInformation();
		Chp.CheckoutOverview();
		Chp.CheckoutComplete();
		
		//OTHER OPTIONS
		Other_Functions Of=new Other_Functions(driver);
		Of.Filters_menu();
		Of.Options_menu();
	}

}
