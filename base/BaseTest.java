package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.initDriver();
        DriverManager.getDriver().get("https://example.com/login");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
