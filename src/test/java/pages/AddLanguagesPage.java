package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLanguagesPage extends CommonMethods {

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td[2]")
    public List<WebElement> listOfLanguages;

@FindBy (xpath = "//table[@id='recordsListTable']/tbody/tr/td[1]")
    public  List<WebElement> languageCheckBox;

@FindBy (xpath = "//input[@id='btnDel']")
    public  WebElement deleteButton;

@FindBy (xpath = "//input[@id='btnAdd']")
    public  WebElement addButton;

@FindBy(xpath = "//input[@id='language_name']")
    public  WebElement languageName;

@FindBy (xpath = "//input[@id='btnSave']")
    public  WebElement saveNameButton;

    public AddLanguagesPage() {
        PageFactory.initElements(driver, this);
    }
}
