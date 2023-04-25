package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input [@id='txtUsername']")
    public WebElement UsernameBox;

    @FindBy(xpath = "//input [@id='txtPassword']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//input [@id='btnLogin']")
    public WebElement LoginButton;

    @FindBy(xpath="//a[text()='Welcome Admin']")
    public WebElement message;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
