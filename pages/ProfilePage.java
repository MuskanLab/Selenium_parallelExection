package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class ProfilePage {

    WebDriver driver = DriverManager.getDriver();

    By profileName = By.id("profileName");

    public String getProfileName() {
        return driver.findElement(profileName).getText();
    }
}
