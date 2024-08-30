package clientManagement;

import Helperpages.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addclient {
    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void addClient( String ClientName)
    {

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/ol/div[2]/div[2]/div[4]/div/div[4]/a")).click();
        driver.findElement(By.id("ClientBusinessName")).sendKeys(ClientName);
        // click on save button
        driver.findElement(By.id("submitBtn")).click();
        //click on clients 3shan ageb list l clients beto3ii
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
    }
}
