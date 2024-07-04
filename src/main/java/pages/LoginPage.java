package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);}

    private final By emailField = By.id("Email");
    private final By passwordField = By.id("Password");
    private final By loginButton = By.cssSelector(".button-1.login-button");

    private void insertEmail(String email){
        sendKeys(emailField,5,email);
    }
    private void insertPassword(String password){
        sendKeys(passwordField,5,password);
    }
    private void clickLoginButton(){
        click(loginButton,2);
    }
    public HomePage loginFeature(String email, String password){
        insertEmail(email);
        insertPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }
}
