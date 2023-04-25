package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DependentsPage extends CommonMethods {

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement PIMButton;

    @FindBy(id = "empsearch_id")
    public WebElement searchIDBox;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")
    public WebElement employeeName;

    @FindBy(xpath = "//a[text() = 'Dependents']")
    public WebElement dependentsTab;

    @FindBy(id = "btnAddDependent")
    public WebElement addDependentButton;

    @FindBy(id = "dependent_name")
    public WebElement dependentName;

    @FindBy(xpath = "//*[@id=\"dependent_relationshipType\"]/option[2]")
    public WebElement dependentRelationshipType;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dependentDOB;

    @FindBy(id = "btnSaveDependent")
    public WebElement dependentSaveBtn;

    public DependentsPage(){PageFactory.initElements(driver, this);}

}
