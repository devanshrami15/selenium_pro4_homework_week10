import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class Com_Saucedemo {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";

        // 1. Set up Chrome Browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open Url.
        driver.get(baseUrl);

        // 3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current url.
        System.out.println("This is the Current Url: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println(driver.getPageSource());

        // 6. Enter the email to email field.
        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("Devansh");

        // 7. Enter the password to password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prime123");

        // 8. Click on Login Button.
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();

        // 9. Print the current url.
        System.out.println("This is the current Url: " + driver.getCurrentUrl());

        // 10. Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        // 11. Refresh the page.
        driver.navigate().refresh();

        // 12. Close the browser.
        driver.quit();

    }
}
