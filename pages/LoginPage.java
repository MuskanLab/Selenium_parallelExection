package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class LoginPage {

    WebDriver driver = DriverManager.getDriver();

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("loginBtn");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
