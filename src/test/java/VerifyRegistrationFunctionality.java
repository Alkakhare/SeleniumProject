import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyRegistrationFunctionality {
    RegistrationPage registrationPage =new RegistrationPage();
    LoginPage loginPage =new LoginPage();
    WebDriver driver;

    @BeforeClass
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void registerUser() throws InterruptedException {
        loginPage.clickRegistrationLink(driver);
        Thread.sleep(2000);
        registrationPage.enterFirstName(driver,"john");
        Thread.sleep(1000);
        registrationPage.enterLastName(driver,"Snow");
        registrationPage.enterAddress(driver,"Sector100");
        registrationPage.enterCity(driver,"Noida");
        registrationPage.enterState(driver,"UP");
        registrationPage.enterZipCode(driver,"485001");
        registrationPage.enterPhoneNumber(driver,"8787651234");
        registrationPage.enterSSN(driver,"123");
        registrationPage.enterUserName(driver,"TestUser");
        registrationPage.enterPasswordName(driver,"Test");
        registrationPage.enterConfirmpassword(driver,"Test");
        Thread.sleep(1000);
        registrationPage.clickRegisterBtn(driver);

    }
}
