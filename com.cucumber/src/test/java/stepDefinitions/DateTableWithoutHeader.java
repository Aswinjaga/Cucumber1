package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DateTableWithoutHeader {
	
	static WebDriver driver;
	@Given("^user you are in login page$")
	public void user_you_are_in_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
	   
	}

	@When("^you enter credentials below$")
	public void you_enter_credentials_below(DataTable datatable) throws Throwable {
		 List<String> credentials=datatable.asList(String.class);
		String userName= credentials.get(0);
		String passWord= credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	   
	}

	@When("^click the login boutton$")
	public void click_the_login_boutton() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}
}
