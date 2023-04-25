package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class WorkExperienceSteps extends CommonMethods {

    @When("user clicks on Qualifications tabs")
    public void clicks_on_qualifications_tabs() {
        click(workExperiencePage.qualificationsTabs);
    }

    @When("clicks on Work Experience add button")
    public void clicks_on_work_experience_add_button() {
        click(workExperiencePage.addButton);
    }

    @When("enters work experience")
    public void enters_work_experience() {
        sendText(workExperiencePage.companyName, "Galactic Republic");
        sendText(workExperiencePage.jobTitle, "Sith Lord");
        sendText(workExperiencePage.fromDate, "1985-05-15");
        sendText(workExperiencePage.toDate, "2022-01-01");
        sendText(workExperiencePage.comments, "Return of the Jedi");
    }

    @Then("clicks on save button")
    public void clicks_on_save_button() {
        click(workExperiencePage.saveBtn);
    }

}
