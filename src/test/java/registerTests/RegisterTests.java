package registerTests;

import base.Base;
import dataModeling.DataModel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends Base {

    @Test
    public void registerWithAnAlreadyExistEmail() throws FileNotFoundException {
        RegisterPage registerPage = landingPage.clickOnRegiterLink();
        HomePage homePage = registerPage.registerFeature(dataModel().RegistrationData.FirstName,
                dataModel().RegistrationData.LastName,
                dataModel().RegistrationData.Email,
                dataModel().RegistrationData.CompanyName,
                dataModel().RegistrationData.Password);
        assertTrue(homePage.getRegisterErrorText().contains("The specified email already exists"));
    }
}
