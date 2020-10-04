import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
@Test
    public void DropDown (){

    System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
    WebDriver Driver = new ChromeDriver();
    Driver.get("http://demo.guru99.com/test/newtours/register.php");
    Driver.manage().window().maximize();
    Select drpCountry = new Select(Driver.findElement(By.name("country")));
    drpCountry.selectByVisibleText("ANTARCTICA");






}



}


