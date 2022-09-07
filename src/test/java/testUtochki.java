import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class testUtochki {
    @Test
    public void FirstSelenimTest() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        elements.get(9).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
