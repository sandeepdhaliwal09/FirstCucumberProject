//package stepDefinations;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepDefination {
//	WebDriver driver;
//	
//	
//	 @Given ("^user is already on Login Page$")
//		public void user_is_already_on_login_page() {
//		 System.setProperty("webdriver.gecko.driver", "/Users/sandeepdhaliwal/Desktop/QA/SeleniumJars/geckodriver");
//		 driver = new FirefoxDriver () ;
//		 
//		 driver.get("https://ui.cogmento.com/");
//	 }
//	 
//	 @When ("^title of login page is Free CRM$")
//		public void title_of_login_page_is_Free_CRM() {
//			String title = driver.getTitle();
//			System.out.println(title);
//			Assert.assertEquals("Cogmento CRM", title);
//		}
//	 
//	 @Then("^user enters username and password$")
//	 public void user_enters_username_and_password(DataTable credentials){
//		List<List<String>> data = credentials.raw();
//	 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	 }
//	 
//	 @Then("^user clicks on login button$")
//	 public void user_clicks_on_login_button() {
//	 WebElement loginBtn =
//	 driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	 
//	 @Then("^user is on home page$")
//		public void user_is_on_home_page(){
//			String title = driver.getTitle();
//			System.out.println(title);
//			Assert.assertEquals("Cogmento CRM", title);
//		    }
//	 
//	 @Then("^user moves to new deal page$")
//		public void user_moves_to_new_deal_page() throws InterruptedException  {
//			Thread.sleep(4000);
//			
//			Actions action = new Actions(driver); 
//			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.linkText("Deals")).click();
//			driver.findElement(By.linkText("Create")).click();
//	 }
//			
//	 @Then("^user enters deal details$")
//	 public void user_enters_contacts_details(DataTable dealData){
//		 List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//	 }
//			
//			@Then("^Close the browser$")
//			 public void close_the_browser(){
//				 driver.quit(); }
//		 
//    //span[contains(text(),'Deals')]
//}
