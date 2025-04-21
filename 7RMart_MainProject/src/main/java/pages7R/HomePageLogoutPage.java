package pages7R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;

public class HomePageLogoutPage {
public WebDriver driver;
public HomePageLogoutPage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="/html/body/div/nav/ul[2]/li/a")private WebElement selectuserlogin; // encaptulation used
@FindBy(xpath="/html/body/div/nav/ul[2]/li/div/a[2]")private WebElement selectlogoutbutton;
@FindBy(xpath="//*[@id=\"login-form\"]/div/div/p")private WebElement pagelogoutstatuscheck;

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminuserselement;
public AdminUsersPage7R isAdminUserTabSelected(){
adminuserselement.click();
return new AdminUsersPage7R(driver);
}


public void isUserLoginSelected() {
selectuserlogin.click();	
}
public void isLogoutButtonSelected() {
selectlogoutbutton.click();	
}
public boolean isPageLoggedOut() {
String str1 = pagelogoutstatuscheck.getText();
String str2 = "Sign in to start your session";
return str1.equals(str2);
}
}