package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@data-purpose='header-login']") private WebElement loginButton;
	
    @FindBy(css="input[type='email']") private WebElement userName;

	@FindBy(css="input[type='password']") private WebElement password;
	
	@FindBy(css="input[type='submit']") private WebElement login;
	
	@FindBy(css="input[type='text']") private WebElement search;
	
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnLoginButton() throws Exception
	{
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(loginButton))
		 .click();
		return this;
	}
	
	public LoginPage typeUserName(String userId) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(userName));
		 
		 userName .sendKeys(userId);
		return null;
	}
	
	public LoginPage typePassword(String myPassword) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(password))
		 .sendKeys(myPassword);
		return null;
	}
	
	public LoginPage clickOnLogin() throws Exception
	{
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(login))
		 .click();
		return this;
	}
	
	public LoginPage typeCourseInSearch(String course) throws Exception
	{
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(search))
		 .sendKeys(course);
		return this;
	}
	
}
