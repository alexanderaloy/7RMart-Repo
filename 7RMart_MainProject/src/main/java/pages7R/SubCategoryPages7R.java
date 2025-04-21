package pages7R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubCategoryPages7R {
WebDriver driver;
public SubCategoryPages7R(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category'])[2]")private WebElement subcategoryselection;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement subcategorylistbuttonselection;
@FindBy(xpath="//select[@id='cat_id']")private WebElement categorydropdownselection;
@FindBy(xpath="//input[@id='subcategory']")private WebElement subcategoryelementdatainput;
@FindBy(xpath="//input[@id='main_img']")private WebElement choosefileofsubcategory;
@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement pageSaved;
@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")private WebElement categoryFieldDeleted;
@FindBy(xpath="class=\"sidebar-mini layout-fixed sidebar-collapse\"")private WebElement alertStatusCheck;
public void isSubCategorySelected() {
subcategoryselection.click();	
}
public void isSubcategoryListButtonSelected() {
subcategorylistbuttonselection.click();	
}
public void iscategoryDropdownSelected() {
Select select = new Select(categorydropdownselection);
select.selectByIndex(3);
}
public void enterSubCategoryDataField() {
subcategoryelementdatainput.sendKeys("carrot");
}
public void chooseFileSubcategory() {
choosefileofsubcategory.sendKeys("D:\\Selenium Cource\\carrot.jpg");
}
public void isPageSaved() {
pageSaved.click();
}
public void isCategoryFieldDeleted() {
categoryFieldDeleted.click();
driver.switchTo().alert().accept();
}
public boolean isAlertDisplayed() {
return alertStatusCheck.isDisplayed();
}
}
