package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class NewMembershipSteps extends CommonMethods {

    @When("admin selects Memberships")
    public void admin_selects_memberships() {
        click(dashBoard.membershipOption);
    }

    @Then("admin user can add any Memberships")
    public void admin_user_can_add_any_memberships() {
        int i = 1;
        for (WebElement memberships : newMembershipPage.membershipName) {
            String membership = memberships.getText();
            if (membership.equals("Zumba")) {
                System.out.println(membership + " membership already exists");
                i++;
            }
        }
        if (i == 1) {
            click(newMembershipPage.addButton);
            sendText(newMembershipPage.nameBox, "Zumba");
            click(newMembershipPage.saveButton);
            selectNameFromDD(newMembershipPage.membershipName, "Zumba");
        }
    }
}
