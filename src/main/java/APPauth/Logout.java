package APPauth;

import Helperpages.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void  logoutApp()
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/button/span[1]/img")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/div/a[5]")).click();
        driver.close();

    }
}
