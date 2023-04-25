package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddLicencesSteps extends CommonMethods {

    @When("admin selects licenses")
    public void admin_selects_licenses() {
        click(addLicencesPage.licenceOption);
    }

    @Then("admin user can add any licenses")
    public void admin_user_can_add_any_licenses() {
        click(addLicencesPage.addButton);
        sendText(addLicencesPage.licenceNameBox, "TruckDriver Licence");
        click(addLicencesPage.saveButton);
        selectNameFromDD(addLicencesPage.licenceNameInTableList, "TruckDriver Licence");
    }
}
