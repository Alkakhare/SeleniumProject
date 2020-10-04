import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLoginFunctionality {

    LoginPage loginPage =new LoginPage();
    WebDriver driver;

    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }

    public void userLogin (){
        loginPage.enterUsername(driver,"user1");
        loginPage.enterPassword(driver,"test1");
        loginPage.clickLoginBtn(driver);
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    @Test
    public void ClickRegistrationLink(){
        loginPage.clickRegistrationLink(driver);
    }
}
