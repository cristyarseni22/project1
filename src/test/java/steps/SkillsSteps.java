package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class SkillsSteps extends CommonMethods {

    @Given("admin user is already logged in")
    public void admin_user_is_already_logged_in() {
        Assert.assertTrue(dashBoard.welcomeMessage.isDisplayed());
    }

    @When("admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        clickOnDashBoardTabs("Admin");
        click(dashBoard.qualificationTab);
    }

    @When("admin selects skills")
    public void selects_skills() {
        click(dashBoard.skillsOption);
    }

    @Then("admin user can add any skills")
    public void admin_user_can_add_any_skills() {
        int i = 1;
        for (WebElement skills : skillsPage.tableSkillNames) {
            String skill = skills.getText();
            if (skill.equals("Data analysis")) {
                System.out.println(skill + " Skill already present");
                i++;
            }
        }
        if (i == 1) {
            click(skillsPage.addButton);
            sendText(skillsPage.skillNameBox, "Data analysis");
            sendText(skillsPage.skillDescriptionBox, "Quickly identify, understand, " +
                    "communicate & action key insights with narratives based data");
            click(skillsPage.saveButton);
            selectNameFromDD(skillsPage.tableSkillNames, "Data analysis");
        }
    }
}
