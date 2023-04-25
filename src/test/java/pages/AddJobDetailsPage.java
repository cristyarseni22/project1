package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddJobDetailsPage extends CommonMethods {

    @FindBy(css = "a#menu_pim_viewPimModule")
    public WebElement pim;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[49]/td[3]/a")
    public WebElement empIndex;

    @FindBy(xpath = "(//a[text()='Job'])[2]")
    public WebElement jobButton;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement edit;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[1]/label")
    public WebElement jobTitleText;

    @FindBy(xpath = "//*[@id=\"job_job_title\"]")
    public WebElement jobTitleDropdown;

    @FindBy(xpath = "//*[@id=\"job_job_title\"]/option[2]")
    public WebElement jobTitleValue;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[3]/label")
    public WebElement empStatusText;

    @FindBy(xpath = "//*[@id=\"job_emp_status\"]")
    public WebElement empStatusDropdown;

    @FindBy(xpath = "//*[@id=\"job_emp_status\"]/option[9]")
    public WebElement empStatusValue;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[4]/label")
    public WebElement jobCatText;

    @FindBy(xpath = "//*[@id=\"job_eeo_category\"]")
    public WebElement jobCategoryDropdown;

    @FindBy(xpath = "//*[@id=\"job_eeo_category\"]/option[4]")
    public WebElement jobCatValue;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[5]/label")
    public WebElement joinedDateText;

    @FindBy(xpath = "//*[@id=\"job_joined_date\"]")
    public WebElement joinedDateCal;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
    public WebElement joinedDate;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[6]/label")
    public WebElement subUnitText;

    @FindBy(xpath = "//*[@id=\"job_sub_unit\"]")
    public WebElement subUnitDropdow;

    @FindBy(xpath = "//*[@id=\"job_sub_unit\"]/option[2]")
    public WebElement subUnitValue;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[7]/label")
    public WebElement locationText;

    @FindBy(xpath = "//*[@id=\"job_location\"]")
    public WebElement LocationDropDown;

    @FindBy(xpath = "//*[@id=\"job_location\"]/option[4]")
    public WebElement locationValue;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[9]/label")
    public WebElement startDateText;

    @FindBy(xpath = "//*[@id=\"job_contract_start_date\"]")
    public WebElement startDateCal;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")
    public WebElement startDate;

    @FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[10]/label")
    public WebElement endDateText;

    @FindBy(xpath = "//*[@id=\"job_contract_end_date\"]")
    public WebElement endDateDropdown;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")
    public WebElement endDate;

    @FindBy(xpath = "//*[@id=\"job_contract_file\"]")
    public WebElement contractDetailsupload;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement save;

    public AddJobDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}
