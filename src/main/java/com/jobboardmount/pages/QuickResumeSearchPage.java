package com.jobboardmount.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 10.10.13
 * Time: 23:55
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("/cm/client/quick_resume_search")
public class QuickResumeSearchPage extends PageObject{

    @FindBy(id="criterion154")
    private WebElement keywordsField;

    @FindBy(id="criterion249")
    private WebElement locationField;

    @FindBy(xpath = "//input[@value='Search']")
    private WebElement searchButton;

    public void clickSearch() {
        clickOn(searchButton);
    }

    public void enterLocation(String location) {
        enter(location).into(locationField);
    }

    public void enterKeywords(String keywords) {
        enter(keywords).into(keywordsField);
    }
}
