package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private static String webDriverName= "chrome";
   static WebDriver driver;
    public void setDriver(){
        if(webDriverName.equalsIgnoreCase("chrome"))
            driver=new ChromeDriver();
        else if (webDriverName.equalsIgnoreCase("firfox")) {
            driver=new FirefoxDriver();


        }
        driver=new EdgeDriver();

    }
    public static WebDriver getDriver(){
        return driver;
    }

    
}
