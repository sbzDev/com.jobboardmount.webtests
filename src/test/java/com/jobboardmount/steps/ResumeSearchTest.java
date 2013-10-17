package com.jobboardmount.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 10.10.13
 * Time: 23:46
 * To change this template use File | Settings | File Templates.
 */
public class ResumeSearchTest {

    @Steps
    private EmployerSteps employer;

    @Given("I login as Employer")
    public void loginAsEmployer(){
        employer.loginAsEmployer();
    }

    @Given("I am on the Quick resume search page")
    public void openQuickResumeSearchPage(){
        employer.openQuickResumeSearchPage();
    }

    @Then("I should see the resume list:$table")
    public void shouldSeeFoundResumes(ExamplesTable table){
        System.out.println("test :"+table.getRowCount());
    }

    @When("I enter keywords $keywords")
    public void enterKeywords(String keywords){
        employer.enterKeywords(keywords);
    }

    @When("I enter location $location")
    public void enterLocation(String location){
        employer.enterLocation(location);
    }

    @When("I press the Search button")
    public void performSearch(){
        employer.performSearch();
    }

    @AfterScenario
    public void logout(){
        employer.logout();
    }
}

