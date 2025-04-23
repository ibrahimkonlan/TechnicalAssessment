import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {

    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.saucedemo.com/v1");

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

            String expectedUrl = "https://www.saucedemo.com/v1/inventory.html";
            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Login successful: URL matched.");
            } else {
                System.out.println("Login failed: URL did not match.");
                System.out.println("Current URL: " + actualUrl);
            }
        } finally {

        }
    }

}


