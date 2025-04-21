package pages7R;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageContactPage {
	/*
public WebDriver driver;
public ManageContactPage(WebDriver driver) { 
this.driver = driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[5]")private WebElement managecontactinfoelement;
@FindBy(xpath="//i[@class='fas fa-edit']")private WebElement actionelement;
@FindBy(xpath="//input[@id='phone' and @class='form-control']")private WebElement phonefieldelement;
@FindBy(xpath="//input[@id='email' and @class='form-control']")private WebElement emailfieldelement;
@FindBy(xpath="(//textarea[@id='content' and @class='form-control'])[1]")private WebElement addressfieldelement;
@FindBy(xpath="(//textarea[@id='content' and @class='form-control'])[2]")private WebElement deliverytimefieldelement;
@FindBy(xpath="//input[@id='del_limit' and @name='del_limit']")private WebElement deliverychargeelement;
@FindBy(xpath="//button[@name='Update']")private WebElement updateelement;

public void isManageContactInfoSelected() {
managecontactinfoelement.click();
}

public void isManageContactActionElementSelected() {
actionelement.click();
}

public void ispageinfocleared() {
phonefieldelement.clear();
emailfieldelement.clear();
addressfieldelement.clear();
deliverytimefieldelement.clear();
deliverychargeelement.clear();
}

public void isManagePhoneFieldSelected(String phonenum) {
phonefieldelement.clear();
phonefieldelement.sendKeys(phonenum);	
}

public void isManageEmailFieldSelected(String emaildata) {	
emailfieldelement.clear();
emailfieldelement.sendKeys(emaildata);	
}

public void isManageAddressFieldSelected(String address) {
addressfieldelement.clear();
addressfieldelement.sendKeys(address);	
}

public void isManageDeliveryTimeFieldSelected(String timeperiod) {
deliverytimefieldelement.clear();
deliverytimefieldelement.sendKeys(timeperiod);	
}
public void isManageDeliveryChargeFieldSelected(String deliverycharge) {
deliverychargeelement.clear();
deliverychargeelement.sendKeys(deliverycharge);
}

public void isUpdateFieldSelected() throws InterruptedException {
//Thread.sleep(5000);
updateelement.click();
}
*/
	
public WebDriver driver;  // globally
	
	public ManageContactPage(WebDriver driver) //constructor
	{
		this.driver=driver;
		PageFactory.initElements( driver,this); //webelements initialize cheyan
	}
	
	@FindBy(xpath="(//a[text()='More info '])[5]")private WebElement moreInfo;
	@FindBy(xpath="//a[@role='button']")private WebElement action_button;	
	@FindBy(xpath="//input[@id='phone']")private WebElement phone_field;
	@FindBy(xpath="//input[@id='email']")private WebElement email_field ;
	@FindBy(xpath="(//textarea[@id='content'])[1]")private WebElement address_field ;
	@FindBy(xpath="(//textarea[@id='content'])[2]")private WebElement deliveryTime_field;
	@FindBy(xpath="//input[@id='del_limit']")private WebElement deliveryCharge_field;
	@FindBy(xpath="//button[@name='Update']")private WebElement update_button;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert_button;
	

	public void loginButton()
	{	
		moreInfo.click();
		action_button.click();
	}
	
	public void enterContacts(String name,String email,String address,String deliveryTime,String deliveryCharge)
	{
	phone_field.clear();
	phone_field.sendKeys(name);
	email_field.clear();
	email_field.sendKeys(email);
	address_field.clear();
	address_field.sendKeys(address);
	deliveryTime_field.clear();
	deliveryTime_field.sendKeys(deliveryTime);
	deliveryCharge_field.clear();
	deliveryCharge_field.sendKeys(deliveryCharge);
	update_button.click();	
	}
	
	public boolean isAlertLoaded()
	{
		return alert_button.isDisplayed();
	}
}
