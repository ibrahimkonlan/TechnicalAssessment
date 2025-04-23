import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {


        WebDriver driver;

        @BeforeTest
        public void beforeTest() {
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com/v1");
        }
    @Test
    public void verifyLogin() throws InterruptedException {
        SauceDemoTest  page = new SauceDemoTest(driver);
        page.enterUsername("Konlan");
        page.enterPassword("Damire@1111");
        page.clickLogin();

    }
}