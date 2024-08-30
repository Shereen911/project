package clientManagement;

import Helperpages.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clientaction {
    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void clientAction(String UpdateName)

    {
        //click 3l 3 dots
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr/td[4]/div/button/i")).click();
        //click 3la edit
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr/td[4]/div/div/a[2]")).click();
        //hamsa7 l esm l adem 3shan a3mel edit w a7ot esm geded
        WebElement clientname = driver.findElement(By.id("ClientBusinessName"));
        clientname.clear();
        clientname.sendKeys(UpdateName);
        // click on save button
        driver.findElement(By.id("submitBtn")).click();
        // click on clients
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();

    }
}
