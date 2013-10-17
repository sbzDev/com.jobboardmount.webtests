package com.jobboardmount.steps;

import com.jobboardmount.pages.EmployerDashboardPage;
import com.jobboardmount.pages.JobBoardDemoPage;
import com.jobboardmount.pages.QuickResumeSearchPage;
import com.jobboardmount.pages.SubMenuEmployer;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 10.10.13
 * Time: 23:47
 * To change this template use File | Settings | File Templates.
 */
public class EmployerSteps extends ScenarioSteps {
    @Step
    public void openQuickResumeSearchPage(){
        pages().get(QuickResumeSearchPage.class).open();
    }

    @Step
    public void enterKeywords(String keywords){
        pages().currentPageAt(QuickResumeSearchPage.class).enterKeywords(keywords);
    }

    @Step
    public void enterLocation(String location){
        pages().currentPageAt(QuickResumeSearchPage.class).enterLocation(location);
    }

    @Step
    public void performSearch(){
        pages().currentPageAt(QuickResumeSearchPage.class).clickSearch();
    }

    @Step
    public void loginAsEmployer(){
        JobBoardDemoPage page = pages().get(JobBoardDemoPage.class);
        page.open();
        page.loginAsEmployer();
        shouldEmployerDashboardPageBeOpened();
    }

    @Step
    public void shouldEmployerDashboardPageBeOpened() {
        assertTrue(pages().isCurrentPageAt(EmployerDashboardPage.class));
    }

    @Step
    public void logout() {
        pages().get(SubMenuEmployer.class).logout();
    }
}
