import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotLoginPage {

    private static String firstName_ID ="firstName";
    private static String lastName_ID ="lastName";
    private static String Address_ID= "address.street";
    private static String city_ID = "address.city";
    private static String state_ID ="address.state";
    private static String zipCode_ID = "address.zipCode";
    private static String ssn_ID ="address.zipCode";

    public void enterFirstName(WebDriver driver, String firstName_ID)
    {
        WebElement fnameEle = driver.findElement( By.id(firstName_ID) );
        fnameEle.sendKeys( firstName_ID );
    }
    public void enterLastName(WebDriver driver, String lastName_ID)
    {
        WebElement lnameEle = driver.findElement( By.id(lastName_ID) );
        lnameEle.sendKeys( lastName_ID );
    }
    public void enterAddress(WebDriver driver, String Address_ID)
    {
        WebElement address = driver.findElement( By.id(Address_ID) );
        address.sendKeys( Address_ID );
    }
    public void enterCity(WebDriver driver, String city_ID)
    {
        WebElement city = driver.findElement( By.id(city_ID) );
        city.sendKeys( city_ID );
    }
    public void enterState (WebDriver driver, String state_ID)
    {
        WebElement State = driver.findElement( By.id(state_ID) );
        State.sendKeys( state_ID );
    }
    public void enterzipCode (WebDriver driver, String zipCode_ID)
    {
        WebElement zipCode = driver.findElement( By.id(zipCode_ID) );
        zipCode.sendKeys( zipCode_ID );
    }
    public void enterssn (WebDriver driver, String ssn_ID)
    {
        WebElement ssn = driver.findElement( By.id(ssn_ID) );
        ssn.sendKeys( ssn_ID );
    }




}
