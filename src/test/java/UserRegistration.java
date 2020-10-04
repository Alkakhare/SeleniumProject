import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class UserRegistration {
@Test
    public void Registration() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://demo.guru99.com/test/newtours/register.php");
        Driver.manage().window().maximize();
        WebElement FN = Driver.findElement(By.cssSelector("input[name ='firstName']"));
        FN.sendKeys("Testuser");
        Thread.sleep(3000);
        WebElement LN = Driver.findElement(By.cssSelector("input[name ='lastName']"));
        LN.sendKeys("Test");
        WebElement phone= Driver.findElement(By.cssSelector("input[name ='phone']"));
        phone.sendKeys("8787876543");
        WebElement email = Driver.findElement(By.cssSelector("input[id='userName']"));
        email.sendKeys("www@gmail.com");
        WebElement Adrs = Driver.findElement(By.cssSelector("input[name='address1']"));
        Adrs.sendKeys("Sector 100");
        WebElement city = Driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Noida");
        WebElement state =Driver.findElement(By.cssSelector("input[name='state']"));
        state.sendKeys("UP");
        WebElement code =Driver.findElement(By.cssSelector("input[name='postalCode']"));
        code.sendKeys("123123");
    Select drpCountry = new Select(Driver.findElement(By.name("country")));
    drpCountry.selectByVisibleText("ANTARCTICA");
    WebElement UN = Driver.findElement(By.cssSelector("input[name='email']"));
        UN.sendKeys("testuser1");
        WebElement pswd =Driver.findElement(By.cssSelector("input[name='password']"));
        pswd.sendKeys("test1");
        WebElement CPW =Driver.findElement(By.cssSelector("input[name='confirmPassword']"));
        CPW.sendKeys("test1");
        WebElement submit =Driver.findElement(By.cssSelector("input[name='submit']"));
        submit.click();



    }
}
