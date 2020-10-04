import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testdriver {
    @Test
    public void testurl() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        //driver.navigate().refresh();

        WebElement FNEle = driver.findElement(By.id("firstName"));
        FNEle.sendKeys("Eric");
        WebElement LNEle = driver.findElement(By.id("lastName"));
       LNEle.sendKeys("Shell");
        WebElement Email = driver.findElement(By.id("userEmail"));
       Email.sendKeys("FN.LS@google.com");
       Thread.sleep(3000);
       //WebElement gender =driver.findElement(By.id("gender-radio-1"));
       //gender.click();
       WebElement Mobile = driver.findElement(By.id("userNumber"));
       Mobile.sendKeys("1234567891");
       WebElement sub = driver.findElement(By.className("subjects-auto-complete__control css-yk16xz-control"));
       sub.sendKeys("Automation");
       //WebElement title = driver.findElement(By.cssSelector("div[class='practice-form-wrapper'] h5"));
        //String header =title.getText();
        //System.out.println(header);





    }
}