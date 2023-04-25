package steps;


import pages.AddLanguagesPage;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.NewMembershipPage;
import pages.SkillsPage;
import pages.*;

public class PageInitializers {

    public static LoginPage login;
    public static DashBoardPage dashBoard;
    public static AddLanguagesPage languagesPage;
    public static SkillsPage skillsPage;
    public static NewMembershipPage newMembershipPage;
    public static EmployeeSkillsPage employeeSkillsPage;
    public static AddLicencesPage addLicencesPage;
    public static AddEmployeeLicensesPage addEmployeeLicensesPage;
    public static AddEmployeeLanguagePage addEmployeeLanguagePage;
    public static AddJobDetailsPage jobDetailsPage;
    public static TerminateEmployeePage terminateEmployeePage;

    public static DependentsPage dependentsPage;
    public static WorkExperiencePage workExperiencePage;

    public static ChangeDetailsPage changeDetailsPage;
    public static EmergencyContactPage emergencyContactPage;


    public static PIMPage PimPage;

    public static void initializePageObjects() {
        login = new LoginPage();
        dashBoard = new DashBoardPage();
        languagesPage = new AddLanguagesPage();
        skillsPage = new SkillsPage();
        newMembershipPage = new NewMembershipPage();
        employeeSkillsPage = new EmployeeSkillsPage();
        addLicencesPage = new AddLicencesPage();
        addEmployeeLicensesPage = new AddEmployeeLicensesPage();
        addEmployeeLanguagePage = new AddEmployeeLanguagePage();
        dependentsPage = new DependentsPage();
        workExperiencePage = new WorkExperiencePage();
        changeDetailsPage = new ChangeDetailsPage();
        emergencyContactPage = new EmergencyContactPage();
        PimPage = new PIMPage();
        jobDetailsPage = new AddJobDetailsPage();
        terminateEmployeePage = new TerminateEmployeePage();


    }
}
