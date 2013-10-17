package com.jobboardmount.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11.10.13
 * Time: 1:52
 * To change this template use File | Settings | File Templates.
 */
@At("#HOST")
public class JobBoardDemoPage extends PageObject {

    @FindBy(linkText = "Employer / recruiter")
    private WebElement loginAsEmployerLink;

    public void loginAsEmployer() {
        clickOn(loginAsEmployerLink);
    }
}
