package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkout_Page {
	WebDriver driver;
	public Checkout_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	@BeforeTest
	public void YourInformation() {
		//Verify Title
		WebElement title=driver.findElement(By.xpath("//div[@class='header_secondary_container']/child::span[1]"));
		System.out.println(title.isDisplayed()+"    "+title.getText());
		
		//Verify Firstname
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		System.out.println(Firstname.isDisplayed());
		Firstname.sendKeys("Pooja");
		
		//Verify Lastname
		WebElement Lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		System.out.println(Lastname.isDisplayed());
		Lastname.sendKeys("Gaikwad");
		
		//Verify Postalcode
		WebElement Postalcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		System.out.println(Postalcode.isDisplayed());
		Postalcode.sendKeys("415116");
		
		//Verify Continue Button
		WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
		System.out.println(Continue.isDisplayed());
		Continue.click();
	}
  @Test
  public void CheckoutOverview() {
	  //Checkout Details
	  
	  WebElement PaymentInfo=driver.findElement(By.xpath("//div[@class='summary_info'][1]/child::div[1]"));
	  System.out.println(PaymentInfo.getText());
	  WebElement Paysummary=driver.findElement(By.xpath("//div[@class='summary_info'][1]/child::div[2]"));
	  System.out.println(Paysummary.getText());
	  
	  WebElement ShippingInfo=driver.findElement(By.xpath("//div[@class='summary_info'][1]/child::div[3]"));
	  System.out.println(ShippingInfo.getText());
	  WebElement Shipsummary=driver.findElement(By.xpath("//div[@class='summary_info'][1]/child::div[4]"));
	  System.out.println(Shipsummary.getText());
	  
	  WebElement PriceTotal=driver.findElement(By.xpath("//div[@class='summary_info'][1]/child::div[5]"));
	  System.out.println(PriceTotal.getText());
	  WebElement Itemtotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label'][1]"));
	  System.out.println(Itemtotal.getText());
	  WebElement Tax=driver.findElement(By.xpath("//div[@class='summary_tax_label'][1]"));
	  System.out.println(Tax.getText());
	  
	  WebElement Total=driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label'][1]"));
	  System.out.println(Total.getText());  
	  
	  //Finish Button
	  WebElement FinishBtn=driver.findElement(By.xpath("//button[@id='finish'][1]"));
	  System.out.println(FinishBtn.isDisplayed());
	  FinishBtn.click();
	  System.out.println("_____Clicked on FINISH BUTTON____");
  }
  
  @AfterTest
  public void CheckoutComplete() {
	  //Checkout Message
	  WebElement OrderMsg=driver.findElement(By.xpath("//div[@id='checkout_complete_container']/child::h2[1]"));
	  System.out.println(OrderMsg.getText());
	  System.out.println(OrderMsg.isDisplayed());
	  
	  WebElement SummaryMsg=driver.findElement(By.xpath("//div[@id='checkout_complete_container']/child::div[1]"));
	  System.out.println(SummaryMsg.getText());
	  
	  //Back to Home
	  WebElement BacktoHome=driver.findElement(By.xpath("//button[@id='back-to-products'][1]"));
	  BacktoHome.click();
	  System.out.println("___Clicked on BACK TO HOME___");
  }
}
