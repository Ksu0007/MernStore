package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    @Test
    public void openBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        System.out.println("Browser opened successfully!");
        driver.quit();
    }
}
