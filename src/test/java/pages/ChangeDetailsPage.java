package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ChangeDetailsPage extends CommonMethods {


    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement PIMButton;

    @FindBy (xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]")
    public WebElement EmployeeListButton;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement SearchNameBox;

    @FindBy(id ="searchBtn")
    public WebElement SearchButton;

    @FindBy (xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement EmployeeName;

    @FindBy (xpath = "//a [text() ='Contact Details']")
    public WebElement ContactDetailsButton;

    @FindBy (xpath = "//input [@value = 'Edit']")
    public WebElement EditButton;

    @FindBy (id ="contact_street1")
    public WebElement Street1;

    @FindBy (id ="contact_street2")
    public WebElement Street2;

    @FindBy(id = "contact_city")
    public WebElement City;

    @FindBy (id ="contact_state")
    public WebElement State;

    @FindBy(id ="contact_country")
    public WebElement Country;

    @FindBy (id = "contact_emp_zipcode")
    public WebElement Zipcode;

    @FindBy (id ="contact_emp_hm_telephone")
    public WebElement HomePhone;

    @FindBy (id ="contact_emp_mobile")
    public WebElement MobilePhone;

    @FindBy(id ="contact_emp_work_telephone")
    public WebElement WorkPhone;

    @FindBy (id ="contact_emp_work_email")
    public WebElement WorkEmail;

    @FindBy (id ="contact_emp_oth_email")
    public WebElement OtherEmail;

    @FindBy (id ="btnSave")
    public WebElement SaveButton;

    public ChangeDetailsPage(){
        PageFactory.initElements(driver, this);
    }



}
