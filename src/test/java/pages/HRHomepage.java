package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HRHomepage {

    WebDriver driver;

    public HRHomepage(){

        driver= Driver.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/*[@id='europe-employees']/tbody/tr/td")
    public List<WebElement> listOfFirstLastNames;

    @FindBy (xpath = "//*[@id='europe-employees']/tbody/tr/td[1]")
    public WebElement firstName;

    @FindBy (xpath = "//*[@id='europe-employees']/tbody/tr/td[2]")
    public WebElement lastName;

}
