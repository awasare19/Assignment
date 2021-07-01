package stepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.ConfigFileReader;
import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AssignmentStepDefination {

	WebDriver driver;
	ConfigFileReader configFileReader;

	@Given("^Open flipkart page in chrome driver$")
	public void Open_flipkart_page_in_chrome_driver() {
		configFileReader = new ConfigFileReader();
		String udemyUrl = configFileReader.getApplicationUrl();
		String driverPath = configFileReader.getDriverPath();
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(udemyUrl);
	}

	@When("^Log in using dummy username and password$")
	public void Log_in_using_dummy_username_and_password() throws Exception {
		configFileReader = new ConfigFileReader();
		String userName = configFileReader.getUserName();
		String password = configFileReader.getPassword();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginButton().typeUserName(userName);
		loginPage.typePassword(password);
		loginPage.clickOnLogin();
	}

	@Then("Verify u r navigated to home page after logging in")
	public void Verify_u_r_navigated_to_home_page_after_logging_in() {
		configFileReader = new ConfigFileReader();
		String actualTitle = driver.getTitle();
		String expectedTitle = configFileReader.getHomePageTitle();
		Assert.assertEquals("Home page title is not matching", actualTitle, expectedTitle);

	}

	@And("Type the product name in search bar and select the product from search result")
	public void Type_the_product_name_in_search_bar_and_select_the_product_from_earch_result() throws Exception {
		configFileReader = new ConfigFileReader();
		HomePage homePage = new HomePage(driver);
		String courseName = configFileReader.getCourseName();
		homePage.typeCourseInSearch(courseName);
		homePage.clickSubmitSearch();

	}

	@And("Select the first item from the result set")
	public void Select_the_first_item_from_the_result_set() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.selectSeleniumCourse();
	}

	@And("Click on Add to cart")
	public void Click_on_Add_to_cart() throws Exception {

		CartPage cart = new CartPage(driver);
		cart.addCourseInCart();

	}

	@And("Go to cart")
	public void Go_to_cart() throws Exception {
		CartPage cart = new CartPage(driver);
		cart.clickOnGoToCart();
	}

	@Then("Verify the product is added in the cart page")
	public void Verify_the_product_is_added_in_the_cart_page() throws Exception {
		CartPage cart = new CartPage(driver);
		configFileReader = new ConfigFileReader();
		String expectedCourse = configFileReader.getExpectedCourse();
		Assert.assertTrue("Course is not added to cart", cart.getTitleInCart().contains(expectedCourse));
		cart.clickRemoveCourse(); // For continuous running of test
		driver.close();
	}

}
