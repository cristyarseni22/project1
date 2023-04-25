package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeeLanguagePage extends CommonMethods {

    @FindBy (xpath = "//input [@id='addLanguage']")
    public WebElement AddLanguageBtn;

    @FindBy (xpath = "//*[@id=\"language_code\"]")
    public WebElement SelectLanguageOption;

    @FindBy (xpath = "//*[@id=\"language_lang_type\"]")
    public WebElement SelectFluencyOption;

    @FindBy (xpath = "//*[@id=\"language_competency\"]")
    public WebElement SelectCompetencyOption;

    @FindBy (xpath = "//*[@id='language_comments']")
    public WebElement AddLanguageComments;

    @FindBy (xpath = "//*[@id='btnLanguageSave']")
    public WebElement AddLanguageSaveBtn;



    public AddEmployeeLanguagePage() {
        PageFactory.initElements(driver, this);
    }
}
