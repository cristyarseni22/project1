package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ChangeDetailsSteps extends CommonMethods {

    @Given("user clicks on PIM")
    public void user_clicks_on_pim() {
        click(changeDetailsPage.PIMButton);

    }
    @Given("user clicks on employee list")
    public void user_clicks_on_employee_list() {
        click(changeDetailsPage.EmployeeListButton);

    }

    @Given("user searches for an employee by name")
    public void user_searches_for_and_employee_by_name() {
        sendText(changeDetailsPage.SearchNameBox, "Donald Jr Biden");

    }

    @Given("user clicks on search")
    public void user_clicks_on_search() {
        click(changeDetailsPage.SearchButton);

    }

    @When("user selects employee")
    public void user_selects_employee() {
        click(changeDetailsPage.EmployeeName);

    }

    @When("user clicks on contact details")
    public void user_clicks_on_contact_details() {
        click(changeDetailsPage.ContactDetailsButton);


    }

    @When("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        click(changeDetailsPage.EditButton);

    }

    @When("user enters new employee contact details")
    public void user_enters_new_employee_contact_details() {
        sendText(changeDetailsPage.Street1, "123 White House");
        sendText(changeDetailsPage.Street2, "BigHouse");
        sendText(changeDetailsPage.City, "Miami");
        sendText(changeDetailsPage.Zipcode, "12345");
        sendText(changeDetailsPage.WorkPhone, "571-123-0987");

    }

    @Then("user saves new changes made to employee contact details")
    public void user_saves_new_changes_made_to_employee_contact_details() {
        click(changeDetailsPage.SaveButton);

    }
}
