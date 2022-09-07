import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testSaitUtochki {
    private WebDriver utochki;

    @BeforeTest
    public  void BeforeTest(){
        utochki = new ChromeDriver();
        utochki.manage().window().maximize();
        utochki.get("https://litecart.stqa.ru/en/");
    }
    @AfterTest
    public  void AfterTest(){
        utochki.quit();
    }

    @Test
    public void HomeSelenimTest() {
        WebElement Home = utochki.findElement(By.cssSelector("i[class='fa fa-home']"));
        Home.click();

        String name = utochki.getTitle();
        Assert.assertTrue(name.contains("Online Store | My Store1"));
    }

        @Test
        public void RubberDucksSelenimTest() {
        WebElement RubberDucks = utochki.findElement(By.cssSelector(
                    "li[class='category-1']>a[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        RubberDucks.click();

        String name = utochki.getTitle();
        Assert.assertTrue(name.contains("Rubber Ducks | My Store1"));
    }

        @Test
        public void DeliveryInformationSelenimTest() {
        WebElement DeliveryInformation = utochki.findElement(By.cssSelector(
                    "li[class='page-2']>a[href='https://litecart.stqa.ru/en/delivery-information-i-2']"));
        DeliveryInformation.click();

        String name = utochki.getTitle();
        Assert.assertTrue(name.contains("Delivery Information | My Store1"));
        }

        @Test
        public void TermsAndConditionsSelenimTest() {
        WebElement TermsAndConditions = utochki.findElement(By.cssSelector(
                "li[class='page-4']>a[href='https://litecart.stqa.ru/en/terms-conditions-i-4']"));
        TermsAndConditions.click();

        String name = utochki.getTitle();
        Assert.assertTrue(name.contains("Terms & Conditions | My Store1"));
    }

}
