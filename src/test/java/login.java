import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
@Test
    public void LoginPanel() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/s/44");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.switchTo().frame("preview-frame");
        WebElement uname = driver.findElement(By.cssSelector("input[id='txtUsername']"));
        uname.sendKeys("opensourcecms");
        WebElement pswrd = driver.findElement(By.id("txtPassword"));
        pswrd.sendKeys("opensourcecms");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();

    }
}


