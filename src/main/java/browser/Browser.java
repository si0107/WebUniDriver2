package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private static String webDriverName = "Chrome";
   private static WebDriver driver;

    public static void setDriver(){
        if (webDriverName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();

        } else if (webDriverName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver(); }
        else {
            driver = new EdgeDriver(); }




    }

     public static WebDriver getWebDriver(){
        return driver;
     }
}
