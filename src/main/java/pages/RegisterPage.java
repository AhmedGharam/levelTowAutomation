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
    private final By registerButton = By.id("register-button");


    /*private void clickOnMaleRadioButton(String password){
        sendKeys(passwordField,5,password);
    }*/

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
    private void insertConfirmPassword(String password){
        sendKeys(confirmPasswordField,5,password);
    }
    private void clickRegisterButton(){
        click(registerButton,3);
    }

    public HomePage registerFeature(String firstName, String lastName, String email, String companyName, String password){
        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(email);
        insertCompanyName(companyName);
        insertPassword(password);
        insertConfirmPassword(password);
        clickRegisterButton();
        return new HomePage(driver);
    }






}
