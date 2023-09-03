package com.bugaboo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BugabooPage extends BasePage{
    @FindBy(xpath = "//div[@class=\"content\"]/h2")
    public WebElement CustomerContactText;

    @FindBy(xpath  ="//div[@role=\"none\"]/button")
    public WebElement dropDownQuestion;


    @FindBy(xpath  ="//*[@id=\"combobox-button-22\"]")
    public WebElement dropDownButton;

    @FindBy(xpath  ="//span[@title=\"Product Registration\"]")
    public WebElement productRegistrationDropDownOption;


    @FindBy(xpath  ="//button[.='Next']")
    public WebElement nextButton;

    @FindBy(xpath  ="//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cookiesBtn;

    @FindBy(xpath  ="//*[text()=\"Serial Number\"]")
    public WebElement serialIDText;


    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement cookies;



}
