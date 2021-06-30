package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination{
	
	WebDriver driver;
	
	@Given("^Open flipkart page in chrome driver$")
	public void Open_flipkart_page_in_chrome_driver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/omkara/eclipse-workspace/CucumberJava/src/main/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.manage().window().maximize();
		driver.get("https://udemy.com");	
	}
	
	@When("^Log in using dummy username and password$")
	public void Log_in_using_dummy_username_and_password () throws Exception
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginButton();
		loginPage.typeUserName("omkarawasare91@gmail.com");
		loginPage.typePassword("Omkar@12345");
		loginPage.typeCourseInSearch("BDD with Cucumber");
		loginPage.clickOnLogin();
		
		
	}
	
	
	@Then("Verify u r navigated to home page after logging in")
	public void Verify_u_r_navigated_to_home_page_after_logging_in ()
	{
		
	}
	
	@And("Type the product name in search bar and select the product from search result")
	public void Type_the_product_name_in_search_bar_and_select_the_product_from_earch_result()
	{

	}
	
	@And("Select the first item from the result set")
	public void Select_the_first_item_from_the_result_set()
	{

	}
	
	@And("Click on Add to cart")
	public void Click_on_Add_to_cart()
	{

	}
	
	@And("Verify the product is added in the cart page")
	public void Verify_the_product_is_added_in_the_cart_page()
	{

	}
	
	
	
	

}
