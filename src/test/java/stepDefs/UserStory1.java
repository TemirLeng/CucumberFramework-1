package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.UserStory1Page;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class UserStory1 {

    UserStory1Page userStory1Page = new UserStory1Page();
    @Given("^Navigate to the Sing In page$")
    public void navigate_to_the_Sing_In_page() throws Throwable {
        Driver.driver.get(Configuration.getProperties("browserURL2"));
        Thread.sleep(3000);
    }
    @Then("^User clicks on Sing in Button$")
    public void user_clicks_on_Sing_in_Button() throws Throwable {
        userStory1Page.singinButton.click();
    }
    @Then("^User types Email address$")
    public void user_types_Email_address() throws Throwable {
        Random random=new Random();
        int n = random.nextInt(10000);
        System.out.println(n+"@gmail.com");
        userStory1Page.typeEmail.sendKeys(n+"@gmail.com");
    }
    @Then("^User clicks on Create on account Button$")
    public void user_clicks_on_Create_on_account_Button() throws Throwable {
        userStory1Page.createButton.click();
    }
    @Then("^User types personal information$")
    public void user_types_personal_information(DataTable arg1) throws Throwable {
        List<Map<String, Object>> listOfMaps = arg1.asMaps(String.class,Object.class);
        userStory1Page.firstName.sendKeys(listOfMaps.get(0).get("First name").toString());
        Thread.sleep(5000);
        userStory1Page.lastName.sendKeys(listOfMaps.get(0).get("Last name").toString());
//        userStory1Page.email.sendKeys(listOfMaps.get(0).get("email").toString());
        userStory1Page.password.sendKeys(listOfMaps.get(0).get("password").toString());
        Select select=new Select(userStory1Page.days);
        select.selectByValue(listOfMaps.get(0).get("day").toString());
        Select select1=new Select(userStory1Page.months);
        select1.selectByValue(listOfMaps.get(0).get("month").toString());
        Select select2=new Select(userStory1Page.years);
        select2.selectByValue(listOfMaps.get(0).get("years").toString());
    }
    @Then("^User types Address$")
    public void user_types_Address(DataTable arg1) throws Throwable {
        List<Map<String, Object>> listOfMaps1 = arg1.asMaps(String.class,Object.class);
        userStory1Page.firstNameCompany.sendKeys(listOfMaps1.get(0).get("first name").toString());
        userStory1Page.lastNameCompany.sendKeys(listOfMaps1.get(0).get("last name").toString());
        userStory1Page.company.sendKeys(listOfMaps1.get(0).get("company").toString());
        userStory1Page.address.sendKeys(listOfMaps1.get(0).get("address").toString());
        userStory1Page.apt.sendKeys(listOfMaps1.get(0).get("apt").toString());
        userStory1Page.city.sendKeys(listOfMaps1.get(0).get("City").toString());
        Select select3 = new Select(userStory1Page.state);
        select3.selectByVisibleText(listOfMaps1.get(0).get("State").toString());
        userStory1Page.zipCode.sendKeys(listOfMaps1.get(0).get("zip").toString());
        // userStory1Page.country.sendKeys(listOfMaps.get(1).get("Country").toString());
        userStory1Page.phonenumber.sendKeys(listOfMaps1.get(0).get("Phone number").toString());
    }
    @Then("^User click on Register Button$")
    public void user_click_on_Register_Button() throws Throwable {
        userStory1Page.clickOnRegister.click();
    }
}
