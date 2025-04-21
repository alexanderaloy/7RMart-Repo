package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import pages7R.ManageNewsCategoryPage7R;
import pages7R.SubCategoryPages7R;

public class SubCategoryTest7R extends BaseClass{
public String username = "admin";
public String password = "admin";
@Test
public void subcategorySelection() {
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
SubCategoryPages7R subcategorypage = new SubCategoryPages7R(driver);
subcategorypage.isSubCategorySelected();
}
@Test
public void subcategoryListAddition() {
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
SubCategoryPages7R subcategorypage = new SubCategoryPages7R(driver);
subcategorypage.isSubCategorySelected(); 
subcategorypage.isSubcategoryListButtonSelected();
subcategorypage.iscategoryDropdownSelected();
subcategorypage.enterSubCategoryDataField();
subcategorypage.chooseFileSubcategory();
subcategorypage.isPageSaved();
}
@Test
public void subcategoryListDelete() {
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserName(username);
loginpage.enterPassword(password);
loginpage.clickSignIn();
SubCategoryPages7R subcategorypage = new SubCategoryPages7R(driver);
subcategorypage.isSubCategorySelected();
subcategorypage.isCategoryFieldDeleted();
boolean checkalert = subcategorypage.isAlertDisplayed();
Assert.assertTrue(checkalert,"Subcategory field delete operation is failed");
}
}
