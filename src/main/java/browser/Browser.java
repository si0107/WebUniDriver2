package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    static WebDriver driver;
    private static String webdriverName="Chorme";

    public static void  setWebDriver() {
        if (webdriverName.equalsIgnoreCase("Chorme")) {
            driver = new ChromeDriver();
        } else if (webdriverName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }

    }
    public static WebDriver getWebDriver(){
        return driver;
    }
}
