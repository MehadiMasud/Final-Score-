import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Base {
    public WebDriver driver = null;
    public Logger log = Logger.getLogger(Base.class.getName());


    @AfterMethod
    public void cleanUp() throws InterruptedException {
        log.info("driver is quiting");
        driver.quit();
    }


    @Parameters({"useSauceLab", "userName", "key", "appUrl", "os", "browserName", "browserVersion"})
    @BeforeMethod
    public void setUp(boolean useSauceLab, String userName, String key, String appUrl, String os, String browserName, String browserVersion) throws IOException {
        if (useSauceLab == true) {
            //getSauceLabDriver(userName, key, os, browserName, browserVersion);
            getSauceLabDriver();
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to(appUrl);
        driver.manage().window().maximize();
        log.info("browser loaded with App");
    }


    public void getSauceLabDriver(){}

    //get local driver
    public WebDriver getLocalDriver(String os, String browserName) {
        if (browserName.equalsIgnoreCase("firefox")) {
            //driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEHADI MASUD\\Desktop\\WEB2\\WEB2-20180519T142829Z-001\\WEB2\\Generic\\src\\resource\\driver\\chromedriver.exe");
            } else {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEHADI MASUD\\Desktop\\WEB2\\WEB2-20180519T142829Z-001\\WEB2\\Generic\\src\\resource\\driver\\chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            //driver = new SafariDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "");
            //driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("htmlunit")) {
            //driver = new HtmlUnitDriver();
        }
        return driver;
    }


    public void clickByXpath(String xPath) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(xPath)).click();
    }

    public void clickByCssSelector(String css)  throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(css)).click();
    }

    public void clickByCssSelectorAndSendKeys(String css, String key)  throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(css)).sendKeys(key);
    }

    public void waitSometime(int time) throws Exception{
        Thread.sleep(time);
    }






}