package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    static WebDriver driver;

    private static String webdriverName = "Chrome";

    public static void setWebdriver(){
        if(webdriverName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (webdriverName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else{
            driver = new EdgeDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
