package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLicencesPage extends CommonMethods {

    @FindBy(id = "menu_admin_viewLicenses")
    public WebElement licenceOption;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "license_name")
    public WebElement licenceNameBox;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@class ='table hover']/tbody/tr/td[2]")
    public List<WebElement> licenceNameInTableList;

    public AddLicencesPage() {
        PageFactory.initElements(driver, this);
    }
}
