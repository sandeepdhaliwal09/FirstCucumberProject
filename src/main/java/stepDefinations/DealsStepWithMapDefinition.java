package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepWithMapDefinition {
	WebDriver driver;
	
	
	 @Given ("^user is already on Login Page$")
		public void user_is_already_on_login_page() {
		 System.setProperty("webdriver.gecko.driver", "/Users/sandeepdhaliwal/Desktop/QA/SeleniumJars/geckodriver");
		 driver = new FirefoxDriver () ;
		 
		 driver.get("https://ui.cogmento.com/");
	 }
	 
	 @When ("^title of login page is Free CRM$")
		public void title_of_login_page_is_Free_CRM() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Cogmento CRM", title);
		}
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
	 driver.findElement(By.name("email")).sendKeys(data.get("username"));
	 driver.findElement(By.name("password")).sendKeys(data.get("password"));
	 }
	 }
	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	 
	 @Then("^user is on home page$")
		public void user_is_on_home_page(){
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Cogmento CRM", title);
		    }
	 
	 @Then("^user moves to new deal page$")
		public void user_moves_to_new_deal_page() throws InterruptedException  {
			Thread.sleep(4000);
			
			Actions action = new Actions(driver); 
			
			WebElement deals = driver.findElement(By.linkText("Deals"));
			
			action.moveToElement(deals).build().perform();
			deals.click();
			driver.findElement(By.linkText("Create")).click();
	 }
			
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData) throws InterruptedException{
		 
		 for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
		 
		 
		 driver.findElement(By.name("title")).sendKeys(data.get("title"));
		 driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		 driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		 driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		 
		 
	 }
			
	 }	
		 

		 @Then("^Close the browser$")
		 public void close_the_browser() {
		    driver.quit();
		 }
}
