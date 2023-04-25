package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class WorkExperiencePage extends CommonMethods {

    @FindBy(xpath = "//a[text() 'Qualifications']")
    public WebElement qualificationsTabs;

    @FindBy(id = "addWorkExperience")
    public WebElement addButton;

    @FindBy(id = "experience_employer")
    public WebElement companyName;

    @FindBy(id = "experience_jobtitle")
    public WebElement jobTitle;

    @FindBy(id = "experience_from_date")
    public WebElement fromDate;

    @FindBy(id = "experience_to_date")
    public WebElement toDate;

    @FindBy(id = "experience_comments")
    public WebElement comments;

    @FindBy (id = "btnWorkExpSave")
    public WebElement saveBtn;

    public WorkExperiencePage() {PageFactory.initElements(driver, this);
    }
}

