package testScript;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages7R.AdminUsersPage7R;
import pages7R.HomePageLogoutPage;
import pages7R.LoginPage;
import utilities.ExcelUtilities7R;

public class AdminUsersTest7R extends BaseClass{
public AdminUsersPage7R adminuserspage7r;
public HomePageLogoutPage homepagelogoutpage;
@Test
public void adminusersverifyTheUserIsAccessThePage() throws IOException {
//String username = ExcelUtilities7R.getStringData(1,0,"loginpage");
//String password = ExcelUtilities7R.getStringData(1,1,"loginpage");
String username = "admin";
String password = "admin";
String adminusername = "adminuser";
String adminpassword = "adminpass";

LoginPage loginpage = new LoginPage(driver);
//loginpage.enterUserName(username).enterPassword(password);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
//homepagelogoutpage = loginpage.clickSignIn();
loginpage.clickSignIn();
//AdminUsersPage7R adminuserspage7r = new AdminUsersPage7R(driver);
//adminuserspage7r.isAdminUserTabSelected();
adminuserspage7r = homepagelogoutpage.isAdminUserTabSelected();
adminuserspage7r.isNewButtonSelected().enterAdminUserName(adminusername).enterAdminPassword(adminpassword).isDropDownValueSelected().submitSave();
//adminuserspage7r.enterAdminUserName(adminusername);
//adminuserspage7r.enterAdminPassword(adminpassword);
//adminuserspage7r.isDropDownValueSelected();
//adminuserspage7r.submitSave();
boolean verify = adminuserspage7r.alertCheck();
Assert.assertTrue(verify, "admin user page failed");
}
}
/*
public void adminUsersVerifyPageDelete() {
String 	
}

*/