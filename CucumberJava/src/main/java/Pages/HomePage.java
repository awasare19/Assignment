package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	@FindBy(css = "input[type='text']")
	private WebElement search;
	@FindBy(css = "svg[aria-label='Submit search']")
	private WebElement submitSearch;
	@FindBy(xpath = "//*[contains(text(),'Selenium WebDriver with Java -Basics to Advanced+Frameworks')]")
	private WebElement seleniumCourse;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage typeCourseInSearch(String course) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys(course);
		return this;
	}

	public HomePage clickSubmitSearch() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(submitSearch)).click();
		return this;
	}

	public HomePage selectSeleniumCourse() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(seleniumCourse)).click();
		return this;
	}
}
