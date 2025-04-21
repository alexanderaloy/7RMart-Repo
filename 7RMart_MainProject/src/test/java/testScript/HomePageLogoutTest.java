package testScript;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import pages7R.HomePageLogoutPage;

public class HomePageLogoutTest extends BaseClass{
@Test
public void pageLogout() {
String username = "admin";
String password = "admin";
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
HomePageLogoutPage pagelogout = new HomePageLogoutPage(driver);
pagelogout.isUserLoginSelected();
pagelogout.isLogoutButtonSelected();
boolean pagestatusfinalcheck = pagelogout.isPageLoggedOut();
Assert.assertTrue(pagestatusfinalcheck,"page failed to logout");
}
}
