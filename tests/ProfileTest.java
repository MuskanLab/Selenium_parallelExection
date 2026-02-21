package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.ProfilePage;

public class ProfileTest extends BaseTest {

    @Test
    public void profileTest() {
        ProfilePage pp = new ProfilePage();
        Assert.assertNotNull(pp.getProfileName());
    }
}
