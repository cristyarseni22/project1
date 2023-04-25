package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class
SkillsPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "btnDel")
    public WebElement deleteButton;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(id = "btnCancel")
    public WebElement cancelButton;


    @FindBy(id = "skill_name")
    public WebElement skillNameBox;

    @FindBy(id = "skill_description")
    public WebElement skillDescriptionBox;

    @FindBy(xpath = "//table[@class = 'table hover']/tbody/tr/td[2]")
    public List<WebElement> tableSkillNames;

    @FindBy(xpath = "//span[contains(text(), 'Already exists')]")
    public WebElement spanMessage;

    public SkillsPage() {
        PageFactory.initElements(driver, this);
    }
}
