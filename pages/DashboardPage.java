package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class DashboardPage {

    WebDriver driver = DriverManager.getDriver();

    By dashboardText = By.id("dashboard");

    public String getDashboardText() {
        return driver.findElement(dashboardText).getText();
    }
}
