package APPauth;

import Helperpages.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void loginApp()
    {

        driver.get("https://livosin832.daftra.com/");
        driver.manage().window().maximize();
        //enter email and password
        driver.findElement(By.id("Email")).sendKeys("livosin832@ndiety.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        //Click on Log In button
        driver.findElement(By.className("btn")).click();

    }
}
