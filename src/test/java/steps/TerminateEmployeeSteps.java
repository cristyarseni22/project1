package steps;

import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class TerminateEmployeeSteps extends CommonMethods {

    @Then("admin can terminate employee")
    public void admin_can_terminate_employee() {

        click(terminateEmployeePage.terminateButton);
       click(terminateEmployeePage.confirm);

        }

}
