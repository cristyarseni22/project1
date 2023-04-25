package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class AddEmployeeLicensesSteps extends CommonMethods {


    @Then("admin user should be able to add new license {string}{string}{string} {string} {string} {string} {string} and {string}")
    public void adminUserShouldBeAbleToAddNewLicenseAnd(String type, String number, String IssuedMonth, String IssuedYear, String IssuedDay, String ExpiryMonth, String ExpiryYear, String ExpiryDay) {
        click(addEmployeeLicensesPage.AddLicenseBtn);
        selectNameFromDD(addEmployeeLicensesPage.LicenseTypeDD,type);
        getJSExecutor().executeScript("arguments[0].scrollIntoView(true)",addEmployeeLicensesPage.LicenseNumberTextBox);
        click(addEmployeeLicensesPage.LicenseNumberTextBox);
        sendText(addEmployeeLicensesPage.LicenseNumberTextBox, number);
        click(addEmployeeLicensesPage.IssuedDateCalendar);
        selectDD(addEmployeeLicensesPage.DatePickerMonth,IssuedMonth);
        selectDD(addEmployeeLicensesPage.DatePickerYear,IssuedYear);
        click(addEmployeeLicensesPage.DatePickerYear);
        selectDayFromDD(addEmployeeLicensesPage.DatePickerDay,IssuedDay);
        click(addEmployeeLicensesPage.ExpiryDateCalendar);
        selectDD(addEmployeeLicensesPage.DatePickerMonth,ExpiryMonth);
        selectDD(addEmployeeLicensesPage.ExpiryDatePickerYear,ExpiryYear);
        click(addEmployeeLicensesPage.DatePickerYear);
        selectDayFromDD(addEmployeeLicensesPage.DatePickerDay,IssuedDay);
        click(addEmployeeLicensesPage.LicenseSaveBtn);


    }
}
