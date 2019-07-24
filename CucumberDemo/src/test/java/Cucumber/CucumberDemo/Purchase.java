package Cucumber.CucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchase {

	public static WebDriver driver;
	Actions action;
	
	@Given("Login to TestMe App with location {string} and url {string}")
	public void login_to_TestMe_App_with_location_and_url(String string, String string2) {
		System.setProperty("webdriver.chrome.driver",string );
		
		driver=new ChromeDriver();
		
		driver.get(string2);
		driver.manage().window().maximize();
		System.out.println("Launch Chome to TestMe");

	}

	@When("I click on SignIn")
	public void i_click_on_SignIn() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I Login with userName {string} and password {string}")
	public void i_Login_with_userName_and_password(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();

	}

	@When("I click on All Categories")
	public void i_click_on_All_Categories() {
		action=new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("Categories"))).build().perform();
	}

	@When("I click on Electronics")
	public void i_click_on_Electronics() {
		action.moveToElement(driver.findElement(By.xpath(".//span[text()='Electronics']"))).click().build().perform();
	}

	@When("I click on HeadPhone")
	public void i_click_on_HeadPhone() throws InterruptedException {
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath(".//span[contains(text(),\"Head\")]"))).click().build().perform();
	}

	@When("I click on Add to cart")
	public void i_click_on_Add_to_cart() {
		driver.findElement(By.partialLinkText("cart")).click();
	}

	@When("I click on cart to proceed to checkout")
	public void i_click_on_cart_to_proceed_to_checkout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Cart")).click();
	}

	@When("I click on Checkout")
	public void i_click_on_Checkout() {
		driver.findElement(By.partialLinkText("Check")).click();
	}

	@When("I click on proceed to payment button to move to payment page")
	public void i_click_on_proceed_to_payment_button_to_move_to_payment_page() throws InterruptedException {
		driver.findElement(By.xpath(".//input[@value='Proceed to Pay']")).click();
		
		Thread.sleep(2000);

	}

	@When("I select the Bank")
	public void i_select_the_Bank() {
		driver.findElement(By.xpath(".//label[text()=\"UCO Bank\"]")).click(); 
	}

	@When("I click on continue")
	public void i_click_on_continue() {
		driver.findElement(By.xpath(".//a[@id=\"btn\"]")).click();
	}

	@When("I login with username {string}")
	public void i_login_with_username(String string) {
		driver.findElement(By.name("username")).sendKeys(string);
		
		
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("I click on Login")
	public void i_click_on_Login() {
		driver.findElement(By.xpath(".//input[@value=\"LOGIN\"]")).click();
	}

	@When("I provide Transaction password {string}")
	public void i_provide_Transaction_password(String string) throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//input[@value=\"PASSWORD\"]")).sendKeys(string);
		driver.findElement(By.xpath(".//input[@value=\"PayNow\"]")).click();
	}

	@When("I complete my purchase")
	public void i_complete_my_purchase() {
	  
	}

	@When("I click on Signout")
	public void i_click_on_Signout() {
	  driver.findElement(By.partialLinkText("SignOut")).click();
	}

//	@When("I Navigate To Electronics")
//	public void i_Navigate_To_Electronics() throws InterruptedException {
//		System.out.println("Electronics");
//		
//		Actions action=new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.partialLinkText("Categories"))).build().perform();
//		action.moveToElement(driver.findElement(By.xpath(".//span[text()='Electronics']"))).click().build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(driver.findElement(By.xpath(".//span[contains(text(),\"Head\")]"))).click().build().perform();
//		
//		
//		
//
//	}
//
//	@When("Click on HeadPhone and Add to Cart")
//	public void click_on_HeadPhone_and_Add_to_Cart() throws InterruptedException {
//		System.out.println("Add to cart");
//		
//		driver.findElement(By.partialLinkText("cart")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("Cart")).click();
//		driver.findElement(By.partialLinkText("Check")).click();
//		
//	    
//	}
//
//	@Then("the Payment Page is Appeared")
//	public void the_Payment_Page_is_Appeared() throws InterruptedException {
//	   System.out.println("Payment Page");
//	   
//	   driver.findElement(By.xpath(".//input[@value='Proceed to Pay']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//label[text()=\"HDFC Bank\"]")).click(); 
//		
//		driver.findElement(By.xpath(".//a[@id=\"btn\"]")).click();
//		
//		driver.findElement(By.name("username")).sendKeys("123457");
//		driver.findElement(By.name("password")).sendKeys("Pass@457");
//		driver.findElement(By.xpath(".//input[@value=\"LOGIN\"]")).click();
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath(".//input[@value=\"PASSWORD\"]")).sendKeys("Trans@457");
//		driver.findElement(By.xpath(".//input[@value=\"PayNow\"]")).click();
//		
//		driver.get("http://192.168.40.4:8083/TestMeApp1");
//	    driver.quit();
//	    
//	}

	
}
