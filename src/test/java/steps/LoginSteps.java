package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user navigates to HRMS application")
    public void user_navigates_hrms_application() {
        openBrowserAndLauchApplication();
    }

    @When("user enter valid admin credentials")
    public void user_enter_valid_admin_credentials() {
        sendText(login.UsernameBox, ConfigReader.getPropertyValue("username"));
        sendText(login.PasswordBox, ConfigReader.getPropertyValue("password"));
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        click(login.LoginButton);
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        Assert.assertTrue(dashBoard.welcomeMessage.isDisplayed());

    }
}
