import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class DragAndDrop {

    public void Dragdrop (){

        System.setProperty("webdriver.chrome.driver","D:\\Maven\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
        WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));

        //Element(500) which need to drag.
        WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(DEBIT SIDE) on which need to drop.
        WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));

        //Element(500) which need to drag.
        WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
        act.dragAndDrop(From2, To2).build().perform();

        //500 drag and drop debit side.
        act.dragAndDrop(From3, To3).build().perform();

        //500 drag and drop credit side.
        act.dragAndDrop(From4, To4).build().perform();
    }
    }

