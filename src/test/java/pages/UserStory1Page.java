package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserStory1Page {

    WebDriver driver;

    public UserStory1Page(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement singinButton;

    @FindBy(id = "email_create")
    public WebElement typeEmail;

    @FindBy(id="SubmitCreate")
    public WebElement createButton;

    @FindBy(id = "id_gender1")
    public WebElement gender;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;
    @FindBy(id = "customer_lastname")
    public WebElement lastName;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id="passwd")
    public WebElement password;
    @FindBy(xpath = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy (id = "firstname")
    public WebElement firstNameCompany;
    @FindBy(id = "lastname")
    public WebElement lastNameCompany;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id="address1")
    public WebElement address;
    @FindBy(id = "address2")
    public WebElement apt;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "id_state")
    public WebElement state;
    @FindBy(id = "postcode")
    public WebElement zipCode;
    @FindBy(id = "id_country")
    public WebElement country;
    @FindBy(id = "phone")
    public WebElement phonenumber;
    @FindBy(xpath = "//button[@id='submitAccount']")
    public WebElement clickOnRegister;

}
