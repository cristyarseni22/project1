package steps;

import io.cucumber.java.en.*;
import pages.PIMPage;
import utils.CommonMethods;

public class PIMSteps extends CommonMethods {
    @When("admin user selects the employee and clicks on memberships")
    public void admin_user_selects_the_employee_and_clicks_on_memberships() {
        click(employeeSkillsPage.employeeIdTable);
        clickOnElementFromList(employeeSkillsPage.sideNavigationBar, "Memberships");
    }

    @Then("admin user should be able to add new Membership {string} {string} {string} {string} {string} {string} {string} {string} {string} and {string}")
    public void admin_user_should_be_able_to_add_new_membership(String membership, String subscription, String amount, String currency, String commenceMonth, String commenceYear, String commenceDay, String renewMonth, String renewYear, String renewDay) {
        click(PimPage.addButton);
        selectDD(PimPage.Member, membership);
        selectDD(PimPage.membershipSubPaidByDrop, subscription);
        PimPage.membershipSubAmount.sendKeys(amount);
        selectDD(PimPage.membershipCurrencyDrop, currency);

        click(PimPage.commenceLogo);
        selectDD(PimPage.commenceMonths, commenceMonth);
        selectDD(PimPage.commenceYear, commenceYear);
        selectDayFromDD(PimPage.commenceDays, commenceDay);

        click(PimPage.renewLogo);
        selectDD(PimPage.commenceMonths, renewMonth);
        selectDD(PimPage.commenceYear, renewYear);
        selectDayFromDD(PimPage.commenceDays, commenceDay);

        click(PimPage.membershipSaveBtn);
        selectNameFromDD(PimPage.membershipTableCheck, membership);
    }
}


