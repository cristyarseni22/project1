package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PIMPage;
import steps.PageInitializers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializers {
    public static WebDriver driver;
    public static Actions action;
    public static Alert alert;

    public void openBrowserAndLauchApplication() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        initializePageObjects();
    }

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        return wait;
    }

    public static void waitForClickability(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", element);
    }


    public static byte[] takeScreenshot(String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH + fileName
                    + " " + getTimeStamp("yyyy-MM-dd-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        //to format the date according to our choice we want to implement in this function
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * This method clicks on one of the dashboard Tabs
     * Insert the tab name in parameters
     *
     * @param tabName
     */
    public static void clickOnDashBoardTabs(String tabName) {
        for (WebElement element : dashBoard.dashboardTabs) {
            String textTab = element.getText();
            if (textTab.equals(tabName)) {
                element.click();
                break;
            }
        }
    }

    /**
     * click on an element from a list
     * insert the list with elements, and insert the elementName as parameters
     *
     * @param element
     * @param elementName
     */
    public static void clickOnElementFromList(List<WebElement> element, String elementName) {
        for (WebElement option : element) {
            String textTab = option.getText();
            if (textTab.equals(elementName)) {
                option.click();
                break;
            }
        }

    }

    /**
     * this method hovers over a webElement
     *
     * @param element
     */
    public static void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * this method checks if the skill was added to the Skill list
     *
     * @param element
     * @param name
     */
    public static void selectNameFromDD(List<WebElement> element, String name) {
        for (WebElement option : element) {
            String text = option.getText();
            if (text.equals(name)) {
                option.click();
                if (option.isDisplayed()) {
                    getJSExecutor().executeScript("arguments[0].scrollIntoView(true)", option);
                    getJSExecutor().executeScript("arguments[0].style.backgroundColor='red'", option);
                }
                break;
            }
        }
    }

    public static void selectDayFromDD(List<WebElement> element, String name) {
        for (WebElement option : element) {
            String text = option.getText();
            if (text.equals(name)) {
                option.click();
                break;
            }
        }
    }

    /**
     * this method scrolls to an element
     *
     * @param element
     */
    public static void scrollToAnElement(WebElement element) {
        getJSExecutor().executeScript("arguments[0].scrollIntoView(true)", element);
    }

    /**
     * this method selects an element by visible text from a single DropDown
     * @param ddElement
     * @param elementName
     */
    public static void selectFromSingleDD(WebElement ddElement, String elementName) {
        Select select = new Select(ddElement);
        select.selectByVisibleText(elementName);

    }
    public  static void display(WebElement element){
        String elementText= element.getText();
        boolean condition = element.isDisplayed();
        if(condition){
            System.out.println(elementText+" is displayed");
        }else{
            System.out.println(elementText+ " is not displayed");
        }
    }


    public static void uploadFile(String string,WebElement webElement){

        webElement.sendKeys(string);

    }

    public static void handleAlert(){
        alert=driver.switchTo().alert();
        alert.accept();

    }

    public static void tearDown() {
        driver.quit();
    }
    public static void selectDD(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);

    }
    public static String selectDD(WebElement element, int index) {
        Select select = new Select(element);

        select.selectByIndex(index);
        return select.getFirstSelectedOption().getText();
    }
    public static void selectDateInTable(WebElement element, String month, String year, String day) {
        click(element);
        selectDD(PIMPage.PimPage.pickerMonth, month);
        selectDD(PIMPage.PimPage.pickerYear, year);
        List<WebElement> issueDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement issueDay : issueDays) {
            if (issueDay.getText().equals(day)) {
                issueDay.click();
            }

        }

    }
    public static void undefinedList(String text, List<WebElement> elements) {
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(text)) {
                click(element);
                break;
            }
        }

    }

}