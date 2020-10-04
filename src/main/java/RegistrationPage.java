import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private static String firstName_ID = "customer.firstName";
    private static String lastName_ID = "customer.lastName";
    private static String Address_ID ="customer.address.street";
    private static String city_ID = "customer.address.city";
    private static String state_ID = "customer.address.state";
    private static String Zipcode_ID = "customer.address.zipCode";
    private static String phone_ID = "customer.phoneNumber";
    private static String SSn_ID = "customer.ssn";
    private static String Uname_ID= "customer.username";
    private static String password_ID = "customer.password";
    private static String confirmPswrd_ID ="repeatedPassword";
    private static String Register_CSS ="input[value= 'Register']";

    public void enterFirstName(WebDriver driver,String firstName)
    {
        WebElement fnameEle = driver.findElement( By.id(firstName_ID) );
        fnameEle.sendKeys( firstName );
    }

    public void enterLastName(WebDriver driver,String lastName)
    {
        WebElement lnameEle = driver.findElement( By.id(lastName_ID) );
        lnameEle.sendKeys( lastName );
    }

    public void enterAddress (WebDriver driver,String Address_ID)
    {
        WebElement addrsEle = driver.findElement( By.id(Address_ID) );
        addrsEle.sendKeys( Address_ID );
    }

    public void enterCity (WebDriver driver,String city_ID)
    {
        WebElement cityEle = driver.findElement( By.id(city_ID) );
        cityEle.sendKeys( city_ID );
    }
    public void enterState (WebDriver driver,String state_ID)
    {
        WebElement stateEle = driver.findElement( By.id(state_ID) );
        stateEle.sendKeys( state_ID );
    }

    public void enterZipCode (WebDriver driver, String Zipcode_ID)
    {
        WebElement zipCodeEle = driver.findElement(By.id(Zipcode_ID));
        zipCodeEle.sendKeys(Zipcode_ID);
    }

    public void enterPhoneNumber (WebDriver driver,String phone_ID) {
        WebElement PhoneNoEle = driver.findElement(By.id(phone_ID));
        PhoneNoEle.sendKeys(phone_ID);
    }

    public void enterSSN (WebDriver driver,String SSn_ID)
    {
        WebElement ssnEle = driver.findElement(By.id(SSn_ID));
        ssnEle.sendKeys(SSn_ID);
    }
    public void enterUserName (WebDriver driver,String Uname_ID)
    {
        WebElement uNameEle = driver.findElement(By.id(Uname_ID));
        uNameEle.sendKeys(Uname_ID);
    }
    public void enterPasswordName (WebDriver driver,String password_ID)
    {
        WebElement passwordEle = driver.findElement(By.id(password_ID));
        passwordEle.sendKeys(password_ID);
    }

    public void enterConfirmpassword (WebDriver driver,String confirmPswrd_ID)
    {
        WebElement cnfrmPasswordEle = driver.findElement(By.id(confirmPswrd_ID));
        cnfrmPasswordEle.sendKeys(confirmPswrd_ID);
    }
    public void clickRegisterBtn (WebDriver driver)
    {
        WebElement clickRegistrationEle = driver.findElement(By.id(Register_CSS));
        clickRegistrationEle.click();
    }


}
