package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
public WebDriver driver;
@BeforeMethod
public void browserInitialization() {
driver = new ChromeDriver();
driver.get("https://groceryapp.uniqassosiates.com/admin");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
}
/*
@AfterMethod
public void driverQuitAndClose() {
//driver.quit();
driver.close();
}
*/
}
