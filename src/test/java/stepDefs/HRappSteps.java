package stepDefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HRHomepage;
import utilities.Configuration;
import utilities.Driver;
import utilities.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class HRappSteps {

   HRHomepage hrHomepage = new HRHomepage();

    @Given("^User goes to HR homepage$")
    public void user_goes_to_HR_homepage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("HRProjectUrl"));
    }

    @When("^User gets first and lastnames of the employees from homepage$")
    public void user_gets_first_and_lastnames_of_the_employees_from_homepage() throws Throwable {


        try {
            JDBCUtils.establishConnection();
            List<Map<String, Object>> dbData = JDBCUtils.runSQLQuery("select first_name ,last_name\n" +
                    " from employees e join  departments d on\n" +
                    " e.department_id=d.department_id\n" +
                    " join locations l on d.location_id=l.location_id\n" +
                    " join countries c on l.country_id=c.country_id\n" +
                    " join regions r on c.region_id=r.region_id\n" +
                    " where region_name ='Europe'");
            System.out.println(dbData.get(1).get("FIRST_NAME"));
            System.out.println(dbData.get(1).get("LAST_NAME"));
            System.out.println(dbData.size());
            JDBCUtils.closeConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection();
            System.out.println("Database Connection is CLOSED");
        }
    }


    @When("^User counts the number of the employees from the homepage$")
    public void user_counts_the_number_of_the_employees_from_the_homepage() throws Throwable {

    }

    @When("^User gets first and lastnames from database and counts$")
    public void user_gets_first_and_lastnames_from_database_and_counts() throws Throwable {


    }

    @When("^User Compares the both data$")
    public void user_Compares_the_both_data() throws Throwable {

    }

    @Then("^User updates the excel file for documentation$")
    public void user_updates_the_excel_file_for_documentation() throws Throwable {

    }
}
