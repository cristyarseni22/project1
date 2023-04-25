package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TerminateEmployeePage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"btnTerminateEmployement\"]")
    public WebElement terminateButton;

    @FindBy(xpath = "//*[@id=\"dialogConfirm\"]")
    public WebElement  confirm;

    public TerminateEmployeePage(){PageFactory.initElements(driver,this);    }


}
