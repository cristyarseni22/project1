package pages;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;


public class PIMPage  extends CommonMethods{

    @FindBy(css = "#menu_pim_viewEmployeeList")
    public WebElement EmployeeList;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement FirstEmployee;

    @FindBy(xpath = "//ul[@id='sidenav']//li[11]")
    public WebElement Memberships;

    @FindBy(id = "membership_membership")
    public WebElement Member;

    @FindBy(id = "membership_subscriptionPaidBy")
    public WebElement membershipSubPaidByDrop;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement membershipSubAmount;

    @FindBy(id = "membership_currency")
    public WebElement membershipCurrencyDrop;

    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement memberCommenceDateTable;

    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement membershipRenewalDateTable;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement pickerMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement pickerYear;

    @FindBy(id="btnSaveMembership")
    public WebElement membershipSaveBtn;

    @FindBy(xpath = "//ul[@id='sidenav']/li")
    public List<WebElement> allEmployeeOptions;

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addButton;

    @FindBy(xpath = "//select[@class ='ui-datepicker-month']")
    public WebElement commenceMonths;

    @FindBy(xpath = "//select[@class ='ui-datepicker-year']")
    public WebElement commenceYear;

    @FindBy(xpath = "//table[@class ='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> commenceDays;

    @FindBy(xpath = "(//img[@class ='ui-datepicker-trigger'])[1]")
    public WebElement commenceLogo;

    @FindBy(xpath = "(//img[@class ='ui-datepicker-trigger'])[2]")
    public WebElement renewLogo;

    @FindBy(xpath = "//table[@class='table hover']/tbody/tr/td[2]")
    public List<WebElement> membershipTableCheck;

    public PIMPage() {
        PageFactory.initElements(driver, this);
    }
}
