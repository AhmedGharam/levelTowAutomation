package loginTests;

import base.Base;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class LoginTests extends Base {

    @Test
    public void successLogin() throws FileNotFoundException {
        LoginPage loginPage= landingPage.clickOnLoginLink();
        HomePage homePage = loginPage.loginFeature(dataModel().LoginData.ValidCredentials.Username,dataModel().LoginData.ValidCredentials.Password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(homePage.getLoginValidationText().contains("My account"));
    }


}
