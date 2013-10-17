package com.jobboardmount.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 13.10.13
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class SubMenuEmployer extends PageObject{
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    public void logout(){
        clickOn(logoutLink);
    }
}
