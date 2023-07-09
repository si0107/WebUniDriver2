package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    static WebDriver driver;
    private static String webDriverName = "Chrome";

    //Setter Method - Create a new Driver
    public static void setWebDriver(){
        if(webDriverName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (webDriverName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
    }

    //Getter Method
    public static WebDriver getWebDriver(){
        return driver;
    }

}
