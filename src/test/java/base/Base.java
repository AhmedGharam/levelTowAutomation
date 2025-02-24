package base;

import dataModeling.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class Base {

    protected WebDriver driver;
    protected LandingPage landingPage;
    protected ReadDataFromJson readDataFromJson;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        landingPage = new LandingPage(driver);
    }

    @BeforeMethod
    public void goHome() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        driver.get(dataModel().URL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public DataModel dataModel() throws FileNotFoundException {
        ReadDataFromJson readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile();
    }
}
