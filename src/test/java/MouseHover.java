import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
@Test
    public void Hover (){

        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/menu/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement mainitem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        actions.moveToElement(mainitem2).perform();

    }
}
