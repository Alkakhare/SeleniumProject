import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static String Username = "input[name='username']"; //setter
    private static String Password= "input[name='password']"; //setter
    private static String Login ="input[class='button']";
    private static String registrationlink = "//a[contains(text(),'Register')]";

    public void enterUsername(WebDriver driver,String username)
    {
        WebElement userIDEle = driver.findElement( By.cssSelector(Username) );
        userIDEle.sendKeys( username );
    }

    public void enterPassword(WebDriver driver,String Password)
    {
        WebElement pwsrdIDEle = driver.findElement( By.cssSelector(Password) );
        pwsrdIDEle.sendKeys( Password );
    }

    public void clickLoginBtn (WebDriver driver)
    {
        WebElement loginclick = driver.findElement( By.cssSelector(Login) );
        loginclick.click();
    }

    public void clickRegistrationLink (WebDriver driver)
    {
       WebElement clickRegistration = driver.findElement(By.xpath(registrationlink)) ;
       clickRegistration.click();
    }





}
