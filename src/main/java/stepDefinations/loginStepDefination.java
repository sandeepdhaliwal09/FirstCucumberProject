//package stepDefinations;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class loginStepDefination {
//	
//	WebDriver driver;
//	
//	
// @Given ("^user is already on Login Page$")
//	public void user_is_already_on_login_page() {
//	 System.setProperty("webdriver.gecko.driver", "/Users/sandeepdhaliwal/Desktop/QA/SeleniumJars/geckodriver");
//	 driver = new FirefoxDriver () ;
//	 
//	 driver.get("https://ui.cogmento.com/");
//		
//	}
//	@When ("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//
////	 //1. \"([^\"]*)\"
////	 //2. \"(.*)\"
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username , String password) { 
//	    driver.findElement(By.name("email")).sendKeys(username);
//	    driver.findElement(By.name("password")).sendKeys(password);
//	}
//	
//	@Then("^user clicks on login button$")
//	 public void user_clicks_on_login_button() {
//	 WebElement loginBtn =
//	 driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	   
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	    }
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() throws InterruptedException  {
//		Thread.sleep(4000);
//		
//		Actions action = new Actions(driver); 
//		action.moveToElement(driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]"))).build().perform();
//		driver.findElement(By.linkText("Contacts")).click();
//		driver.findElement(By.linkText("Create")).click();
//		
//	}
//	
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) throws InterruptedException{
//		Thread.sleep(3000);
//		driver.findElement(By.name("first_name")).sendKeys(firstname);
//	 driver.findElement(By.name("last_name")).sendKeys(lastname);
//	 driver.findElement(By.name("position")).sendKeys(position);
//		 driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//	    
//	}
//
//	
//	@Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit(); }
//
//}
