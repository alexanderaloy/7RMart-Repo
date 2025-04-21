package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.ManageNewsPage;
import Utilities.ExcelUtilities;
import constant7R.Constants7R;

public class ManageNewsTest extends BaseClass{
@Test
public void manageNewsverifyTheUserIsAccessManageNewsTab() throws IOException {
String username = ExcelUtilities.getStringData(1,0,"loginpage");
String password = ExcelUtilities.getStringData(1,1,"loginpage");
String NewsButtonFieldData = Constants7R.MANAGENEWSMESSAGE;
String AlertStatusMessage = Constants7R.MANAGENEWSALERTMESSAGE;
ManageNewsPage managenewspage = new ManageNewsPage(driver);
managenewspage.enterUserName(username);
managenewspage.enterPassword(password);
managenewspage.clickSignIn();
managenewspage.isManageNewsSelected();
managenewspage.isNewFieldSelected();
managenewspage.isDataFieldSelected(NewsButtonFieldData);
managenewspage.enableSave();
boolean checkalert = managenewspage.isAlertDisplayed();
Assert.assertTrue(checkalert,Constants7R.MANAGENEWSALERTMESSAGE);
}
}
