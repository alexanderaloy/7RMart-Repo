package pages7R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage7R {

public WebDriver driver;
public AdminUsersPage7R(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}

//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminuserselement;
@FindBy(xpath="//a[@href=\"javascript:void(0)\" and @onclick='click_button(1)']")private WebElement newbuttonselection;
@FindBy(xpath="//input[@id='username']")private WebElement adminusernamefield;
@FindBy(xpath="//input[@id='password']")private WebElement adminpasswordfield;
@FindBy(xpath="//select[@id='user_type']")private WebElement dropdown;
@FindBy(xpath="//button[@type='submit'  and @name='Create']")private WebElement save;
@FindBy(xpath="//i[@class='icon fas fa-check']")private WebElement pagealert;

/*
public void isAdminUserTabSelected(){
adminuserselement.click();
}
*/

public AdminUsersPage7R isNewButtonSelected(){
newbuttonselection.click();
return this;
}
public AdminUsersPage7R enterAdminUserName(String adminusername){
adminusernamefield.sendKeys(adminusername);
return this;
}
public AdminUsersPage7R enterAdminPassword(String adminpassword){
adminpasswordfield.sendKeys(adminpassword);
return this;
}
public AdminUsersPage7R isDropDownValueSelected() {	
Select select = new Select(dropdown);
select.selectByValue("partner");	
return this;
}
public AdminUsersPage7R submitSave() {
save.click();
return this;
}
public boolean alertCheck() {
return pagealert.isDisplayed();
}

}










//chaining of methods -> 
//chaining of pages -> randu thavana driver pass cheyunundu -> athu ozhuvakkam ella paginteyum more info home paginakathottu add cheythu
//page class -> methods declared