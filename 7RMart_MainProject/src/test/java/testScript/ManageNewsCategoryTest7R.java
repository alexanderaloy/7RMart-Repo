package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import pages7R.ManageNewsCategoryPage7R;
import utilities.ExcelUtilities7R;

public class ManageNewsCategoryTest7R extends BaseClass{
@Test
public void manageCategoryAddList() throws IOException{
String username = ExcelUtilities7R.getStringData(1, 0, "loginpage");
String password = ExcelUtilities7R.getStringData(1, 1, "loginpage");
String Category = "cars";
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();

ManageNewsCategoryPage7R managenewspage = new ManageNewsCategoryPage7R(driver);
managenewspage.isManageCategorySelected();
managenewspage.isNewButtonSelected();
managenewspage.enterCategoryData(Category);
managenewspage.iselementdoubleclickselected();
managenewspage.fileSelection();
managenewspage.saveFile();
boolean checkalertfinalstatus = managenewspage.alertCheck();
Assert.assertTrue(checkalertfinalstatus, "category test failed for some reason");
}

@Test
public void manageCategoryDeleteList() throws IOException{
	String username = ExcelUtilities7R.getStringData(1, 0, "loginpage");
	String password = ExcelUtilities7R.getStringData(1, 1, "loginpage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(username);
	loginpage.enterPassword(password);
	loginpage.clickSignIn();

	ManageNewsCategoryPage7R managenewspage = new ManageNewsCategoryPage7R(driver);
	managenewspage.isManageCategorySelected();
	managenewspage.deleteList();
	boolean checkalertfinalstatus = managenewspage.alertCheck();
	Assert.assertTrue(checkalertfinalstatus, "category test failed for some reason");
}
}
