package pages7R;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) { //parameterized constructor method name will be capital letter / no void parameter
this.driver = driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
@FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordfield;
@FindBy(xpath="//button[text()='Sign In']")private WebElement signinbuttonfield;
@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboardtile;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement failedcasealertcheck;

public void enterUserName(String username) {
usernamefield.sendKeys(username);
}
public void enterPassword(String password) {
passwordfield.sendKeys(password);
}
public void clickSignIn() {
signinbuttonfield.click();	
}

/*
public LoginPage enterUserName(String username) {
usernamefield.sendKeys(username);
return this;
}
public LoginPage enterPassword(String password) {
passwordfield.sendKeys(password);
return this;
}
public HomePageLogoutPage clickSignIn() {
signinbuttonfield.click();	
return new HomePageLogoutPage(driver);
}
*/
public boolean isHomePageDashboardLoaded() {
return dashboardtile.isDisplayed();
}
public boolean isAlertDisplayed() {
return failedcasealertcheck.isDisplayed();
}
}

