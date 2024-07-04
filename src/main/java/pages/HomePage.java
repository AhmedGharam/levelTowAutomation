package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver){
        super(driver);
    }
    private final By accountPageButton = By.cssSelector(".ico-account");
    private final By successfullRegisterResult = By.cssSelector(".result");
    private final By registrationErrorResult = By.cssSelector(".message-error.validation-summary-errors");

    public String getLoginValidationText(){
        return getText(accountPageButton,10);
    }

    public String getRegisterValidationText(){
        return getText(successfullRegisterResult,5);
    }

    public String getRegisterErrorText(){
        return getText(registrationErrorResult,5);
    }


}
