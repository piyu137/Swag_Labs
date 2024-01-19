package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_Page {
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By Logo=By.xpath("//div[@class='header_label'][1]/child::div[1]");
	By Products=By.xpath("//div[@class='header_secondary_container'][1]/child::span[1]");
	By Filters=By.xpath("//div[@class='right_component'][1]/descendant::select[1]");
	By Cart=By.xpath("//div[@class='shopping_cart_container'][1]/child::a[1]");
	By Item=By.xpath("//div[@class='inventory_list']/child::div[3]/child::div[2]/child::div/a[1]");
	
	public void Headings() throws InterruptedException {
	//Logo is Displayed	
	WebElement logo=driver.findElement(Logo);
	boolean AppLogo=logo.isDisplayed();
	System.out.println(logo.getText()+ "  " +AppLogo);
	
	//Cart Option is available
	WebElement cart=driver.findElement(Cart);
	boolean CartSymbol=cart.isDisplayed();
	System.out.println(cart.getText()+ "  " +CartSymbol);
	
	//Filters option is available
	WebElement filter=driver.findElement(Filters);
	boolean filterSymbol=filter.isDisplayed();
	System.out.println(filter.getText()+ "  " +filterSymbol);
	filter.click();
	Thread.sleep(2000);
	
	
	//Products Title is Displayed
	WebElement products=driver.findElement(Products);
	boolean productsTitle=products.isDisplayed();
	System.out.println(products.getText()+ "  " +productsTitle);
	}
	
	public void ProductsPage() throws InterruptedException {
	//Products List displayed for available products on Homepage
	List <WebElement> ProductTitle=driver.findElements(By.xpath("//div[@class='inventory_container']/child::div/child::div/child::div[2]/child::div/a/div"));
	System.out.println("Products Displayed are:  ");
	for(WebElement Items: ProductTitle) {
		System.out.println(Items.getText());
	}
	
	//Item name displayed
	WebElement Item=driver.findElement(By.xpath("//div[@class='inventory_item_label'][1]/child::a[1]/div[1]"));
	System.out.println("Particular item displayed is:  "+Item.getText());
	
	//Item description displayed
	WebElement ItemDescription=driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]"));
	System.out.println("Description for the product:  "+ItemDescription.getText());
	
	//Item Image is displayed
	WebElement ItemImg=driver.findElement(By.xpath("//div[@class='inventory_item_img'][1]/child::a/img[1]"));
	System.out.println(ItemImg.isDisplayed()+"     "+ItemImg.getAttribute("alt"));
	
	//Price for Item displayed
	WebElement PriceBar=driver.findElement(By.xpath("//div[@class='pricebar'][1]/child::div[1]"));
	System.out.println("Price for the product is:  "+PriceBar.getText());
	
	//Cart Button available
	WebElement CartBtn=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	System.out.println(CartBtn.getText()+ "     "+CartBtn.isDisplayed());
	CartBtn.click();
	Thread.sleep(2000);
	
	//Remove button Enabled
	WebElement RemoveBtn=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	System.out.println(RemoveBtn.getText()+ "     "+RemoveBtn.isDisplayed());
	RemoveBtn.click();
	Thread.sleep(2000);
	}
	
	
	 public void Item() throws InterruptedException {
	    	//Product Page for selected product
	    	Actions a=new Actions(driver);
	    	WebElement ItemSel=driver.findElement(Item);
	    	a.moveToElement(ItemSel);
	    	a.click().perform();
	    	System.out.println("____Clicked On Product____");
	    	Thread.sleep(2000);	
	    }
	
	
	

}
