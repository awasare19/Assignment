package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Add to cart')]")
	private WebElement addToCart;
	@FindBy(xpath = "//button[@data-purpose='go-to-cart-button']")
	private WebElement goToCart;
	@FindBy(css = "a[data-purpose='cart-icon']")
	private WebElement cartIcon;
	@FindBy(xpath = "//a[@data-purpose='shopping-course-card-title']")
	private WebElement titleInCart;
	@FindBy(xpath = "//*[contains(@data-purpose,'remove')]")
	private WebElement removeCourse;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CartPage addCourseInCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
		return this;
	}

	public CartPage clickOnGoToCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(goToCart)).click();
		return this;
	}

	public CartPage clickOnCartIcon() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
		return this;
	}

	public String getTitleInCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String title = wait.until(ExpectedConditions.elementToBeClickable(titleInCart)).getText();
		return title;

	}

	public CartPage clickRemoveCourse() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(removeCourse)).getText();
		return this;

	}
}
