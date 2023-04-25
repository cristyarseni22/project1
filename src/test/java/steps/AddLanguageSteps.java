package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddLanguagesPage;
import utils.CommonMethods;

import java.util.List;

public class AddLanguageSteps extends CommonMethods {

    @When("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        click(dashBoard.adminTab);
     click(dashBoard.qualificationTab);
        //throw new io.cucumber.java.PendingException();
    }
    @When("selects Language")
    public void selects_language() {
       click(dashBoard.languagesOption);
       // throw new io.cucumber.java.PendingException();
    }


    @Then("Admin user can add any Language {string} succesfully")
    public void adminUserCanAddAnyLanguageSuccesfully(String MyLanguage) {
        int i=1;
        int flag =1;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(WebElement language : languagesPage.listOfLanguages){
            if (language.getText().equalsIgnoreCase(MyLanguage)){
                for(WebElement checkbox : languagesPage.languageCheckBox){
                    if (flag==i){
                        click(checkbox);
                        click(languagesPage.deleteButton);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



                    }
                    flag ++;
                }
            }

            i++;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(languagesPage.addButton);
        sendText(languagesPage.languageName,MyLanguage);
        click(languagesPage.saveNameButton);

    }
}
