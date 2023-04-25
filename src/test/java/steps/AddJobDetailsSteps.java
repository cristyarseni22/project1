package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddJobDetailsPage;
import utils.CommonMethods;

public class AddJobDetailsSteps extends CommonMethods {

    @When("admin clicks on PIM option")
    public void admin_clicks_on_pim_option() {
        click(jobDetailsPage.pim);
    }

    @When("admin clicks one employee name and navigates to personal details page")
    public void admin_clicks_one_employee_name_and_navigates_to_personal_details_page() {
       click(jobDetailsPage.empIndex);
    }

    @When("admin  clicks on Job on side list")
    public void admin_clicks_on_job_on_side_list() {
      click(jobDetailsPage.jobButton);
    }

    @When("admin clicks on Edit button")
    public void admin_clicks_on_edit_button() {
       click(jobDetailsPage.edit);
    }

    @Then("admin clicks on Job Title dropdown and selects a value")
    public void admin_clicks_on_job_title_dropdown_and_selects_a_value() {

        display(jobDetailsPage.jobTitleText);
        click(jobDetailsPage.jobTitleDropdown);
        click(jobDetailsPage.jobTitleValue);
    }

    @Then("admin clicks on Employment Status dropdown and selects a value")
    public void admin_clicks_on_employment_status_dropdown_and_selects_a_value() {

        display(jobDetailsPage.empStatusText);
        click(jobDetailsPage.empStatusDropdown);
        click(jobDetailsPage.empStatusValue);
    }

    @Then("admin clicks on Job Category dropdown and selects a value")
    public void admin_clicks_on_job_category_dropdown_and_selects_a_value() {

        display(jobDetailsPage.jobCatText);
        click(jobDetailsPage.jobCategoryDropdown);
        click(jobDetailsPage.jobCatValue);
    }

    @Then("admin clicks on Joined Date calendar and picks a value")
    public void admin_clicks_on_joined_date_calendar_and_picks_a_value() {
        display(jobDetailsPage.joinedDateText);
        click(jobDetailsPage.joinedDateCal);
        click(jobDetailsPage.joinedDate);
    }

    @Then("admin clicks on Sub Unit dropdown and selects a value")
    public void admin_clicks_on_sub_unit_dropdown_and_selects_a_value() {

        display(jobDetailsPage.subUnitText);
        click(jobDetailsPage.subUnitDropdow);
        click(jobDetailsPage.subUnitValue);
    }

    @Then("admin clicks on Location dropdown and selects a value")
    public void admin_clicks_on_location_dropdown_and_selects_a_value() {

        display(jobDetailsPage.locationText);
        click(jobDetailsPage.LocationDropDown);
        click(jobDetailsPage.locationValue);
    }

    @Then("admin clicks on Start Date calendar and picks a value")
    public void admin_clicks_on_start_date_calendar_and_picks_a_value() {

        display(jobDetailsPage.startDateText);
        click(jobDetailsPage.startDateCal);
        click(jobDetailsPage.startDate);
    }

    @Then("admin clicks on End Date calendar and picks a value")
    public void admin_clicks_on_end_date_calendar_and_picks_a_value() {

        display(jobDetailsPage.endDateText);
        click(jobDetailsPage.endDateDropdown);
        click(jobDetailsPage.endDate);
    }

    @Then("admin chooses a file and uploads it to employee page")
    public void admin_chooses_a_file_and_uploads_it_to_employee_page() {
        uploadFile("/Users/tamerelsayed/Desktop/Group7.xlsx", jobDetailsPage.contractDetailsupload);
        click(jobDetailsPage.save);
    }
}