package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class DependentsSteps extends CommonMethods {

    @Given("user searches for an employee by id")
    public void user_searches_for_an_employee_by_name() {
        sendText(dependentsPage.searchIDBox, "5859667");
    }

    @Given("user clicks on search button")
    public void user_user_clicks_on_search_button() {
        click(dependentsPage.searchButton);
    }

    @When("user clicks on Dependents tab")
    public void user_clicks_on_dependents_tab() {
        click(dependentsPage.dependentsTab);
    }

    @When("user click on add button to add dependents")
    public void user_click_on_add_button_to_add_dependents() {
        click(dependentsPage.addDependentButton);
    }

    @When("user adds {string} and {string}")
    public void user_adds_and(String firstName, String lastName) {
        sendText(dependentsPage.dependentName,firstName + " " + lastName);
        click(dependentsPage.dependentRelationshipType);
        sendText(dependentsPage.dependentDOB, "1985-05-05");
        System.out.println("Dependent added");
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(dependentsPage.dependentSaveBtn);
    }



}
