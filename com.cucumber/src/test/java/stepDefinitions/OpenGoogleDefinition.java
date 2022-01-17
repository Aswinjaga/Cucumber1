package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class OpenGoogleDefinition {
	WebDriver driver;
	
	@Given("^User is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("http://www.google.co.in");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@And("^enter the return key$")
	public void enter_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search result$")
	public void the_user_should_see_the_search_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	boolean status=	driver.findElement(By.partialLinkText("vijay")).isDisplayed();
	Assert.assertTrue(status);
	   
	}



}
