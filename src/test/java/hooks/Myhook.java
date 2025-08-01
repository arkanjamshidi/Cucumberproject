package hooks;

import org.openqa.selenium.WebDriver;
import factory.Factory;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Myhook {

    WebDriver driver;

    @Before
    public void setup() {
        Factory.Browser("chrome");         
        driver = Factory.getdriver();      
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
