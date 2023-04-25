package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashBoardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    @FindBy (xpath = "//a [@id='menu_admin_viewAdminModule']")
    public WebElement adminTab;

    @FindBy (xpath = "//a [@id='menu_admin_viewLanguages']")
    public WebElement languagesOption;

    @FindBy(xpath = "//*[@class ='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    @FindBy(xpath = "//*[@class ='menu']/ul/li[2]")
    public WebElement PIMTabs;

    @FindBy(xpath = "//a[@id ='menu_admin_Qualifications']")
    public WebElement qualificationTab;

    @FindBy(id = "menu_admin_viewSkills")
    public WebElement skillsOption;

    @FindBy(id = "menu_admin_membership")
    public WebElement membershipOption;

    @FindBy(xpath = "//li[@class ='selected']/ul/li")
    public WebElement qualificationDD;


    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }
}
