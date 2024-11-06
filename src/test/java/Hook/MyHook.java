package Hook;

import DriverFactory.DriverFactory;
import Util.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class MyHook {
    public static WebDriver driver;

    @Before
    public void setup() throws IOException {
       Properties pro= configReader.intialzeProperties();
        DriverFactory.intializeBrowser(pro.getProperty("browser"));
        driver=DriverFactory.getDriver();
        driver.manage().deleteAllCookies();
        driver.get(pro.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
