
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
@Test
    public class test {


        private static String Email_css = "input[name='username']"; //setter
        private static String Password_id= "password"; //setter
        private static String Login_id =" tp-sign-in";   //setter

        /**
         * Method to enter email id
         * @param driver
         * @param emailid
         */
        public void enterEmailId(WebDriver driver, String emailid)
        {
            WebElement element= driver.findElement(By.id(Email_css));
            element.sendKeys(emailid);
        }

        /**
         * Method to enter password
         *@param driver
         *@param password
         */
        public void enterpassword(WebDriver driver,String password)
        {
            WebElement element1= driver.findElement(By.id(Password_id));
            element1.sendKeys(password);
        }
    }
