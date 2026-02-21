package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage();
        lp.login("admin", "1234");

        DashboardPage dp = new DashboardPage();
        Assert.assertTrue(dp.getDashboardText().contains("Dashboard"));
    }
}
