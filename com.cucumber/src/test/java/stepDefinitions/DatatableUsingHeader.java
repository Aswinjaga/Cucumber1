package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatatableUsingHeader {
	WebDriver driver;
	@Given("^you are in login page$")
	public void you_are_in_login_page() throws Throwable {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
	}

	@When("^enter credentials below$")
	public void enter_credentials_below(DataTable datatable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 List<Map<String, String>> date=datatable.asMaps(String.class, String.class);
		String user= date.get(0).get("userName");
		String pass= date.get(0).get("passWord");
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		 
	}

	@When("^click  login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	@When("^click  login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}



}
