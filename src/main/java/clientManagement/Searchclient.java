package clientManagement;

import Helperpages.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchclient {
    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void searchClient()
    {
        //bad5al Ahmed gowa l search box
        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("Ahmed");

        //click 3la search button
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();
     // search after edit
        // b3mel search fl box bl name l geded l 3amltlo edit fa bams7 l adem l mktob
        WebElement searchbox = driver.findElement(By.name("filter[first_name][like]"));
        searchbox.clear();
        //driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[2]/div/div/input")).sendKeys("Ahmed1");
        driver.findElement(By.name("filter[first_name][like]")).sendKeys("Ahmed1");
        //click on search button
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();

    }
}
