package selenium.HTMLdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.letskodeit.com/practice");

        WebElement multiselectdropdown = drive.findElement(By.id("multiple-select-example"));
        Select select = new Select(multiselectdropdown);

        select.selectByIndex(0);
        Thread.sleep(3000);

        select.selectByValue("orange");
        Thread.sleep(3000);

        select.selectByVisibleText("Peach");
        Thread.sleep(3000);


        select.deselectByVisibleText("Peach");
        Thread.sleep(3000);

        select.deselectByValue("orange");
        Thread.sleep(3000);

        select.deselectByIndex(0);
        Thread.sleep(3000);

        drive.close();
    }
}
