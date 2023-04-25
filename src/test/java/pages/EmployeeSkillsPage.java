package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeSkillsPage extends CommonMethods {

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeListTab;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement searchNameBox;

    @FindBy(id = "empsearch_id")
    public WebElement searchIDBox;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//table[@id ='resultTable']/tbody/tr/td[2]")
    public WebElement employeeIdTable;

    @FindBy(xpath = "//ul[@id ='sidenav']/li")
    public List<WebElement> sideNavigationBar;

    @FindBy(id = "addSkill")
    public WebElement addSkillButton;

    @FindBy(id = "skill_code")
    public WebElement skillSelectDD;

    @FindBy(xpath = "//select[@id ='skill_code']/option")
    public List<WebElement> skillList;

    @FindBy(id = "skill_years_of_exp")
    public WebElement yearOfExpBox;

    @FindBy(id = "skill_comments")
    public WebElement skillCommentBox;

    @FindBy(id = "btnSkillSave")
    public WebElement skillSaveButton;

    @FindBy(xpath = "//form[@id ='frmDelSkill']/table/tbody/tr/td[2]")
    public List<WebElement> addedSkillName;


    public EmployeeSkillsPage() {
        PageFactory.initElements(driver, this);
    }
}
