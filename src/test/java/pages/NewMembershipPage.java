package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.NewMembershipSteps;
import utils.CommonMethods;

import java.util.List;

public class NewMembershipPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "membership_name")
    public WebElement nameBox;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@id ='resultTable']/tbody/tr/td[2]")
    public List<WebElement> membershipName;

    public NewMembershipPage(){
        PageFactory.initElements(driver, this);
    }
}
