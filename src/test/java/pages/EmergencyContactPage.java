package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmergencyContactPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"sidenav\"]/li[3]/a")
    public WebElement EmergencyContactButton;

    @FindBy(id ="btnAddContact")
    public WebElement AddContactButton;

    @FindBy (xpath = "//*[@id=\"emgcontacts_name\"]")
    public WebElement NameBox;

    @FindBy(id ="emgcontacts_relationship")
    public WebElement RelationshipBox;

    @FindBy (id ="emgcontacts_homePhone")
    public WebElement HomeNumber;

    @FindBy (id ="emgcontacts_mobilePhone")
    public WebElement MobileNumber;

    @FindBy(id ="emgcontacts_workPhone")
    public WebElement WorkNumer;

    @FindBy(id ="btnSaveEContact")
    public WebElement SaveButton;

    public EmergencyContactPage(){
        PageFactory.initElements(driver, this);
    }

}
