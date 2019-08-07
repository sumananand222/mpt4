package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import beanRecipe.beanClass;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	private WebDriver driver;
	private beanClass bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	
	@Given("^User is on enquiry form page$")
	public void user_is_on_enquiry_form_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\Recipe\\Recipe_class_registration.html");
		bean = new beanClass(driver);	
		Thread.sleep(1000);
	}

	@When("^The page opens$")
	public void the_page_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^Title should be \"([^\"]*)\"$")
	public void title_should_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Cooking Class Enquiry Form";
		Assert.assertEquals(expectedTitle,actualTitle);
		Thread.sleep(1000);
		driver.close();
	}

	@Then("^it should check whether a text \"([^\"]*)\" is present or not$")
	public void it_should_check_whether_a_text_is_present_or_not(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.getPageSource().contains("Online Cooking School");
	}

	@When("^User clicks on hyperlink \"([^\"]*)\"$")
	public void user_clicks_on_hyperlink(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.linkText("Download our Recipe class Brochure")).click();
	}

	@Then("^New Window should appear with another html page$")
	public void new_Window_should_appear_with_another_html_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\Recipe\\msg.html");
	}

	@Given("^User is on msg page$")
	public void user_is_on_msg_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\Recipe\\msg.html");
		bean = new beanClass(driver);
	}

	@When("^Message page opens$")
	public void message_page_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@Then("^it should check whether a text2 \"([^\"]*)\" is present or not$")
	public void it_should_check_whether_a_text_is_present_or_not2(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.getPageSource().contains("Recipe class Brochure is sent to your registered mail id");
	}
	
	@When("^User clicks on hyperlink2 \"([^\"]*)\"$")
	public void user_clicks_on_hyperlink2(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.linkText("Go Back to Registration")).click();
	}
	
	@Then("^the enquiry page should come again$")
	public void the_enquiry_page_should_come_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\Recipe\\Recipe_class_registration.html");
	}

	@When("^User enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("");
		bean.setButton();
	}

	@Then("^Ask the user to enter valid first name$")
	public void ask_the_user_to_enter_valid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="First Name must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("");
		bean.setButton();
	}

	@Then("^Ask the user to enter valid last name$")
	public void ask_the_user_to_enter_valid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Last Name must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^User enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setEmail("");
		bean.setButton();
	}

	@Then("^Ask the user to enter valid email$")
	public void ask_the_user_to_enter_valid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Email must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters characters$")
	public void user_enters_characters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setEmail("arizusmani");
		bean.setMobile("ffjhhs");
		bean.setButton();
	}

	@Then("^Display message to enter numerics$")
	public void display_message_to_enter_numerics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter numeric value";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^User enters invalid mobile$")
	public void user_enters_invalid_mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setEmail("arizusmani");
		bean.setMobile("6576556");
		bean.setButton();
	}

	@Then("^Display message to enter (\\d+) digit mobile$")
	public void display_message_to_enter_digit_mobile(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter 10 digit Mobile number";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^User enters invalid enquiry$")
	public void user_enters_invalid_enquiry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setEmail("arizusmani");
		bean.setMobile("9876543210");
		bean.setCategory("Non-Veg");
		bean.setCity("Mumbai");
		bean.setTraining("In house training");
		bean.setDuration("6 months");
		bean.setEnquiry("");
		bean.setButton();
	}

	@Then("^Display message enter valid enquiry$")
	public void display_message_enter_valid_enquiry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//String exmessage="Enquiry details must be filled out";
		//String acmessage=driver.switchTo().alert().getText();
		//Assert.assertEquals(exmessage,acmessage);
		//driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setEmail("arizusmani");
		bean.setMobile("9876543210");
		bean.setCategory("Non-Veg");
		bean.setCity("Mumbai");
		bean.setTraining("In house training");
		bean.setDuration("6 months");
		bean.setEnquiry("How");
		bean.setButton();
	}

	@Then("^Message should come in alert box$")
	public void message_should_come_in_alert_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//String exmessage="Thank you for submitting the online recipe class Enquiry";
		//String acmessage=driver.switchTo().alert().getText();
		//Assert.assertEquals(exmessage,acmessage);
		//driver.switchTo().alert().accept();
		driver.close();	
	}

	@Then("^Text should come in new window$")
	public void text_should_come_in_new_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
        driver.close();
	}

}
