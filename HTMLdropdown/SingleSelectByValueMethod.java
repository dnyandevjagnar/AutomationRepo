package selenium.HTMLdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectByValueMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.letskodeit.com/practice");

        WebElement dropdown = drive.findElement(By.id("carselect"));
        Select selectobj= new Select(dropdown);
        selectobj.selectByValue("benz");
        Thread.sleep(3000);
        drive.close();
    }
}
