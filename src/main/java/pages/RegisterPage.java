package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class RegisterPage extends MethodHandles {
    public RegisterPage(WebDriver driver){
        super(driver);
    }
    private final By firstNameField = By.id("FirstName");
    private final By lastNameField = By.id("LastName");
    private final By emailField = By.id("Email");
    private final By companyNameField = By.id("Company");
    private final By passwordField = By.id("Password");
    private final By confirmPasswordField = By.id("ConfirmPassword");
    private final By registerButton = By.cssSelector(".button-1.login-button");


    private void clickOnMaleRadioButton(String password){
        sendKeys(passwordField,5,password);
    }

    private void insertFirstName(String firstName){
        sendKeys(firstNameField,5,firstName);
    }
    private void insertLastName(String lastName){
        sendKeys(lastNameField,5,lastName);
    }
    private void insertEmail(String email){
        sendKeys(emailField,5,email);
    }
    private void insertCompanyName(String companyName){
        sendKeys(companyNameField,5,companyName);
    }
    private void insertPassword(String password){
        sendKeys(passwordField,5,password);
    }
    private void insertConfirmPassword(String confirmPassword){
        sendKeys(confirmPasswordField,5,confirmPassword);
    }
    private void clickRegisterButton(){
        click(registerButton,2);
    }

    public void registerFeature(String firstName, String lastName, String email, String companyName, String password, String confirmPassword){
        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(email);
        insertCompanyName(companyName);
        insertPassword(password);
        insertConfirmPassword(confirmPassword);
        clickRegisterButton();
    }






}
