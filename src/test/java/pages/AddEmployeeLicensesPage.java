package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeLicensesPage extends CommonMethods {
    @FindBy (xpath = "//input[@id = 'addLicense']")
    public WebElement AddLicenseBtn;

    @FindBy (xpath = "//select[@id = 'license_code']")
    public List<WebElement> LicenseTypeDD;

    @FindBy (xpath = "//input[@name = 'license[license_no]']")
    public WebElement LicenseNumberTextBox;

    @FindBy (xpath = "//input[@id = 'license_date']")
    public WebElement IssuedDateCalendar;

    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement DatePickerMonth;

    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement DatePickerYear;

    @FindBy (xpath = "//table [@class = 'ui-datepicker-calendar']/tbody/tr/td")
    public List< WebElement> DatePickerDay;

    @FindBy (xpath = "//input[@id = 'license_renewal_date']")
    public WebElement ExpiryDateCalendar;

    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement ExpiryDatePickerYear;

    @FindBy (xpath = "//input[@id = 'btnLicenseSave']")
    public WebElement LicenseSaveBtn;

    public AddEmployeeLicensesPage() {
        PageFactory.initElements(driver, this);
    }
}
