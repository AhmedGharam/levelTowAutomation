package loginTests;

import base.Base;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTests extends Base {

    @Test
    public void successLogin() throws FileNotFoundException {
        System.out.println(dataModel().URL);
        System.out.println(dataModel().loginData.validCredentials.Username);
        //LoginPage loginPage= homePage.clickOnLoginLink();
        //loginPage.loginFeature(dataModel().login.validCredentials.Username,dataModel().login.validCredentials.Password);
    }

}
