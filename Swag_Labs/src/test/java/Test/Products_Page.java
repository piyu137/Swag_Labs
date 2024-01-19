package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Products_Page {
	WebDriver driver;
	
	public Products_Page(WebDriver driver) {
		this.driver=driver;
	}
	By Itemname=By.xpath("//div[@class='inventory_details_desc_container'][1]/child::div[1]");
    By ItemDes=By.xpath("//div[@class='inventory_details_desc_container'][1]/child::div[2]");
    By Price=By.xpath("//div[@class='inventory_details_desc_container']/child::div[3]");
    By CartButton=By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    By BackButton=By.xpath("//button[@id='back-to-products']");
    //Product Name
    public void Itemname() {
    	WebElement Name=driver.findElement(Itemname);
    	System.out.println("Product Name:  "+Name.getText());
    }
   
    //Product description
    public void ItemDes() {
    	WebElement Description=driver.findElement(ItemDes);
    	System.out.println("Product Description:  "+Description.getText());
    }
    //Price Details
    public void Price() {
    	WebElement amount=driver.findElement(Price);
    	System.out.println("Price: "+amount.getText());
    }
    //Add to Cart Button
    public void CartButton() {
    	WebElement AddtoCart=driver.findElement(CartButton);
    	System.out.println(AddtoCart.isDisplayed());
    	AddtoCart.click();
    	System.out.println("___Product Added to CART___");
    }
    //Back to Products Button
    public void BackButton() {
    	WebElement BacktoProducts=driver.findElement(BackButton);
    	System.out.println(BacktoProducts.isDisplayed());
    	BacktoProducts.click();
    	System.out.println("__Clicked on BACK TO PRODUCTS___");
    }
}
