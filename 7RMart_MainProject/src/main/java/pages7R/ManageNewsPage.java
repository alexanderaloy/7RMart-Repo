package pages7R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.Constants;
import Utilities.WaitUtilities;

public class ManageNewsPage {
WebDriver driver;
public ManageNewsPage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
@FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordfield;
@FindBy(xpath="//button[text()='Sign In']")private WebElement signinbuttonfield;
@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[9]")private WebElement managenewsselection;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")private WebElement newfieldselection;
@FindBy(xpath="//textarea[@id='news']")private WebElement dataspaceselection;
@FindBy(xpath="//button[text()='Save']")private WebElement savefeature;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement failedcasealertcheck;

public void enterUserName(String username) {
usernamefield.sendKeys(username);
}
public void enterPassword(String password) {
passwordfield.sendKeys(password);
}
public void clickSignIn() {
WaitUtilities waitutilities = new WaitUtilities(); 
waitutilities.waitForElementToBeClickable(driver,signinbuttonfield);
signinbuttonfield.click();
}
public void isManageNewsSelected()
{
managenewsselection.click();
}
public void isNewFieldSelected() 
{
newfieldselection.click();	
}
public void isDataFieldSelected(String NewsButtonFieldData) 
{
dataspaceselection.sendKeys(NewsButtonFieldData);
}
public void enableSave() 
{
savefeature.click();	
}
public boolean isAlertDisplayed() {
return failedcasealertcheck.isDisplayed();	
}
}
