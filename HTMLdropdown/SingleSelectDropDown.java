package selenium.HTMLdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelectDropDown {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver drive=new ChromeDriver();
        drive.get("https://www.letskodeit.com/practice");

       WebElement dropdown= drive.findElement(By.id("carselect"));
       //System.out.println(dropdown.isEnabled());

        Select select=new Select(dropdown);
        List<WebElement> allelement=select.getOptions();
        for(WebElement element:allelement){
            System.out.println(element.getText());
        }
         drive.close();
    }
}
