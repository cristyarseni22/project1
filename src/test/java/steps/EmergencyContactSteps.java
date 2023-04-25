package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class EmergencyContactSteps extends CommonMethods {

    @When("user clicks on Emergency contacts")
    public void user_clicks_on_emergency_contacts() {
        click(emergencyContactPage.EmergencyContactButton);

    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(emergencyContactPage.AddContactButton);

    }

    @When("user enters Emergency contact information")
    public void user_enters_emergency_contact_information() {
        sendText(emergencyContactPage.NameBox, "Paula Biden");
        sendText(emergencyContactPage.RelationshipBox, "child");
        sendText(emergencyContactPage.HomeNumber, "555-123-4455");
        sendText(emergencyContactPage.MobileNumber, "555-123-4567");
        sendText(emergencyContactPage.WorkNumer, "555-818-0986");


    }

    @Then("user saves the information successfully")
    public void user_saves_the_information_successfully() {
        click(emergencyContactPage.SaveButton);

    }

}
