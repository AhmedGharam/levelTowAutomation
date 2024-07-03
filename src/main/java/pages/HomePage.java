package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver){
        super(driver);
    }

    private final By loginLink = By.cssSelector(".ico-login");
    private final By registerLink = By.cssSelector(".ico-register");

    public LoginPage clickOnLoginLink(){
        click(loginLink,6);
        return new LoginPage(driver);
    }
    public RegisterPage clickOnRegiterLink(){
        click(registerLink,5);
        return new RegisterPage(driver);
    }

}
