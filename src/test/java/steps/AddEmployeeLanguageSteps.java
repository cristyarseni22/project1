package steps;

import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class AddEmployeeLanguageSteps extends CommonMethods {



    @Then("Admin user can add any languages {string}{string}{string}")
    public void adminUserCanAddAnyLanguages(String language, String fluency, String competency) {
        click(addEmployeeLanguagePage.AddLanguageBtn);
        selectDD(addEmployeeLanguagePage.SelectLanguageOption, language);
        selectDD(addEmployeeLanguagePage.SelectFluencyOption, fluency);
        selectDD(addEmployeeLanguagePage.SelectCompetencyOption, competency);
        addEmployeeLanguagePage.AddLanguageComments.sendKeys("Be familiar with other language is a good qualification");
        click(addEmployeeLanguagePage.AddLanguageSaveBtn);
    }
}
