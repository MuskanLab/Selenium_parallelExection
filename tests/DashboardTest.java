package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.DashboardPage;

public class DashboardTest extends BaseTest {

    @Test
    public void dashboardTest() {
        DashboardPage dp = new DashboardPage();
        Assert.assertTrue(dp.getDashboardText().contains("Dashboard"));
    }
}
