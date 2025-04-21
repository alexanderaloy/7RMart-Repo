package pages7R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class ManageNewsCategoryPage7R {
public WebDriver driver;
public ManageNewsCategoryPage7R(WebDriver driver) { //parameterized constructor method name will be capital letter / no void parameter
this.driver = driver;
PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//p[text()='Manage Category'])[1]") private WebElement managecategoryselection;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")private WebElement newbuttonselection;
@FindBy(xpath="//input[@id='category']")private WebElement categorydatafield;
@FindBy(xpath="(//span[text()='discount'])[1]")private WebElement doubleclickelementselection;
@FindBy(xpath="//button[text()='Save']")private WebElement choosefile;
@FindBy(xpath="//button[@fdprocessedid='bgjua8']")private WebElement savechoosedfile;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertstatuscheck;
@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")private WebElement deletelist;

public void isManageCategorySelected() {
managecategoryselection.click();
}
public void isNewButtonSelected() {
newbuttonselection.click();
}
public void enterCategoryData(String Category) {
categorydatafield.sendKeys(Category);
}
public void iselementdoubleclickselected() {
Actions actions = new Actions(driver);
actions.doubleClick(doubleclickelementselection).build().perform();
}
public void fileSelection(){
choosefile.sendKeys("D:\\Selenium Cource\\POLO GT.jpg");
}
public void saveFile(){
savechoosedfile.click();
}

public void deleteList(){
deletelist.click();

}
public boolean alertCheck(){
driver.switchTo().alert().accept();
return alertstatuscheck.isDisplayed();
}



}
