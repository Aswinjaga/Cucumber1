package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTablewithExampleKeyWord {
	
	WebDriver driver;
	@Given("^you are in login page of HRM$")
	public void you_are_in_login_page_of_HRM() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("^enter credentials username is\"([^\"]*)\" and passowrd \"([^\"]*)\"$")
	public void enter_credentials_username_is_and_passowrd(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	   
	}

	@When("^click  login button of HRM$")
	public void click_login_button_of_HRM() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

}
