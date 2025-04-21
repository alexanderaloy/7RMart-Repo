package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import pages7R.ManageContactPage;

public class ManageContactTest extends BaseClass{
@Test
public void managecontact() throws InterruptedException {
String username = "admin";
String password = "admin";
String phonenum = "9847355664";
String emaildata = "alxaloy@gmail.com";
String address = "puthenveedu Kollam";
String timeperiod = "8:00 am to 8:00 pm";
String deliverycharge = "50";

LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();

ManageContactPage managecontact = new ManageContactPage(driver);
managecontact.loginButton();
managecontact.enterContacts(username, emaildata, address, deliverycharge, deliverycharge);
boolean s = managecontact.isAlertLoaded();
Assert.assertTrue(s,"page not working");
/*
managecontact.isManageContactInfoSelected();
managecontact.isManageContactActionElementSelected();
//managecontact.ispageinfocleared();
managecontact.isManagePhoneFieldSelected(phonenum);
managecontact.isManageEmailFieldSelected(emaildata);
managecontact.isManageAddressFieldSelected(address);
managecontact.isManageDeliveryTimeFieldSelected(timeperiod);
managecontact.isManageDeliveryChargeFieldSelected(deliverycharge);
managecontact.isUpdateFieldSelected();
*/

}
}
