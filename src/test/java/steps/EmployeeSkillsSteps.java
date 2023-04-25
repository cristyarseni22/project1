package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeSkillsSteps extends CommonMethods {

    @When("admin navigates to employee list")
    public void admin_navigates_to_employee_list() {
        clickOnElementFromList(dashBoard.dashboardTabs, "PIM");
        click(employeeSkillsPage.employeeListTab);
    }

    @When("admin user searches for and employee by id {string}")
    public void admin_user_searches_for_and_employee(String id) {
        sendText(employeeSkillsPage.searchIDBox, id);
        click(employeeSkillsPage.searchButton);
    }

    @When("admin user selects the employee and clicks on qualifications")
    public void admin_user_selects_the_employee_and_clicks_on_qualifications() {
        click(employeeSkillsPage.employeeIdTable);
        clickOnElementFromList(employeeSkillsPage.sideNavigationBar, "Qualifications");
    }

    @Then("admin user should be able to select and add skills")
    public void admin_user_should_be_able_to_select_and_add_skills() {
        scrollToAnElement(employeeSkillsPage.addSkillButton);
        click(employeeSkillsPage.addSkillButton);

        if (employeeSkillsPage.skillSelectDD.isDisplayed()) {
            click(employeeSkillsPage.skillSelectDD);
            for (WebElement skills : employeeSkillsPage.skillList) {
                String skill = skills.getText();
                if (skill.equals("Data analysis")) {
                    selectFromSingleDD(employeeSkillsPage.skillSelectDD, "Data analysis");

                    if (employeeSkillsPage.yearOfExpBox.isDisplayed()) {
                        sendText(employeeSkillsPage.yearOfExpBox, "4");
                    } else {
                        System.out.println("Years of experience element is not displayed");
                    }

                    if (employeeSkillsPage.skillCommentBox.isDisplayed()) {
                        sendText(employeeSkillsPage.skillCommentBox, "4 years of experience, a lot of knowledge, very professional");
                    } else {
                        System.out.println("Comments element is not displayed");
                    }

                    click(employeeSkillsPage.skillSaveButton);
                    selectNameFromDD(employeeSkillsPage.addedSkillName, "Data analysis");
                }
            }
        } else {
            System.out.println("Skill not displayed");
        }
    }
}
