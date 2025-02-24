package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MethodHandles {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public MethodHandles(WebDriver driver){
        this.driver=driver;
    }
    private WebElement webElement(By locator){
        return driver.findElement(locator);
    }
    protected void explicitWait(By locator,int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(driver.findElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)));
    }
    protected void click(By locator, int time){
        explicitWait(locator,time);
        webElement(locator).click();
    }
    protected void sendKeys(By locator, int time, String text){
        explicitWait(locator,time);
        webElement(locator).sendKeys(text);
    }
    protected String getText(By locator, int time){
        explicitWait(locator,time);
        return webElement(locator).getText();
    }





}
