package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelUtilities;
import pages7R.LoginPage;
import utilities.ExcelUtilities7R;

public class LoginTest extends BaseClass{
@Test(dataProvider="LoginProvider")
public void loginTestWithValidCredentials(String username,String password) throws IOException {	
//String username ="admin";
//String password ="admin";
//String username = ExcelUtilities7R.getStringData(1, 0, "loginpage");
//String password = ExcelUtilities7R.getStringData(1,1,"loginpage");
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
boolean isloaded = loginpage.isHomePageDashboardLoaded();
Assert.assertTrue(isloaded,"Home page not loaded when user is entering valid credentials");
}
public void verifyTheUserIsNotAbleToLoginWithIncorrectPassword() throws IOException {
String username = ExcelUtilities.getStringData(2,0,"loginpage");
String password = ExcelUtilities.getStringData(2,1,"loginpage");
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
boolean checkalert = loginpage.isAlertDisplayed();
Assert.assertTrue(checkalert,"login failed Alert warning is not shown");
}
@Test
public void verifyTheUserIsNotAbleToLoginWithIncorrectUsername()throws IOException {
String username = ExcelUtilities.getStringData(3,0,"loginpage");
String password = ExcelUtilities.getStringData(3,1,"loginpage");
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
boolean checkalert = loginpage.isAlertDisplayed();
Assert.assertTrue(checkalert,"login failed Alert warning is not shown");
}
@Test()
public void verifyTheUserIsNotAbleToLoginWithIncorrectUsernameAndPassword() throws IOException{
String username = ExcelUtilities.getStringData(3,0,"loginpage");
String password = ExcelUtilities.getStringData(3,1,"loginpage");	
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
boolean checkalert = loginpage.isAlertDisplayed();
Assert.assertTrue(checkalert,"login failed Alert warning is not shown");


}
@DataProvider(name="LoginProvider")
public Object[][] getDataFromTestData() throws IOException{
	return new Object[][] {{ExcelUtilities7R.getStringData(1, 0,"loginpage"),ExcelUtilities7R.getStringData(1,1,"loginpage")}};

}
}
