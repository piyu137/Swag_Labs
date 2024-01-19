package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Page {
	WebDriver driver;
	
	public Cart_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	By Cart=By.xpath("//div[@id='shopping_cart_container']/child::a[1]");
	By YourCart=By.xpath("//div[@id='header_container']/child::div[2]/span[1]");
	By ContinueShopping=By.xpath("//button[@id='continue-shopping']");
	By Checkout=By.xpath("//button[@id='checkout']");
	
	
	//Clicking on Cart
	public void Cart() {
		WebElement CartBtn=driver.findElement(Cart);
	    System.out.println(CartBtn.isDisplayed());
	    CartBtn.click();
	    System.out.println("___Clicked CART BUTTON___");
	}
	//Your Cart Details
	public void YourCart() {
		WebElement YourCartTitle=driver.findElement(YourCart);
		System.out.println(YourCartTitle.isDisplayed());
		
		WebElement QtyLabel=driver.findElement(By.xpath("//div[@class='cart_list']/child::div[1]"));
		System.out.println(QtyLabel.isDisplayed()+"  "+QtyLabel.getText());
		
		WebElement DescLabel=driver.findElement(By.xpath("//div[@class='cart_list']/child::div[2]"));
		System.out.println(DescLabel.isDisplayed()+"    "+DescLabel.getText());
		
		WebElement CartItemname=driver.findElement(By.xpath("//div[@class='cart_item_label']/child::a/div[1]"));
		System.out.println("Cart Item NAME:  "+CartItemname.getText());
		
		WebElement CartItemDesc=driver.findElement(By.xpath("//div[@class='cart_item_label']/child::div[1]"));
		System.out.println("Cart Item DESCRIPTION:  "+CartItemDesc.getText());
		
		WebElement CartItemPrice=driver.findElement(By.xpath("//div[@class='cart_item_label']/child::div[2]/div[1]"));
		System.out.println("Cart Item PRICE:  "+CartItemPrice.getText());
		
		WebElement CartItemRemove=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
		System.out.println("Cart Item REMOVE BUTTON:  "+CartItemDesc.isDisplayed());
	}
	
	//Continue Shopping
	public void ContinueShopping() {
		WebElement ContinueBtn=driver.findElement(ContinueShopping);
		System.out.println(ContinueBtn.isDisplayed());
		ContinueBtn.click();
		System.out.println("__Clicked on CONTINUE SHOPPING BUTTON__");
	}
	//Checkout
	public void Checkout() {
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/child::a[1]")).click();
		WebElement CheckoutBtn=driver.findElement(Checkout);
		System.out.println(CheckoutBtn.isDisplayed());
		CheckoutBtn.click();
		System.out.println("___Clicked on CHECKOUT BUTTON___");
	}

}