package com.bugaboo.pages;

import org.apache.commons.collections4.map.PassiveExpiringMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class FormPage extends BasePage {

    @FindBy(xpath = "//input[@name='Serial_Number']")
    public WebElement serialNumberInputBox;

    @FindBy(xpath = "//input[@name='Purchase_Date']")
    public WebElement purchaseDateInputBox;


    @FindBy(xpath = "//textarea[@class=\"slds-textarea\"]")
    public WebElement description;

    @FindBy(xpath = "//input[@name=\"First_Name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name=\"Last_Name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name=\"Email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@name=\"Verify_EMail\"]")
    public WebElement verifyEmail;

    @FindBy(xpath = "//input[@name=\"country\"]")
    public WebElement phone;

    @FindBy(xpath = "//input[@name=\"Street_Address_1\"]")
    public WebElement street1;

    @FindBy(xpath = "//input[@name=\"Street_Address_2\"]")
    public WebElement street2;

    @FindBy(xpath = "//input[@name=\"City\"]")
    public WebElement city;

    @FindBy(xpath = "//select[@name=\"Country\"]")
    public WebElement country;

    @FindBy(xpath = "//div[@class=\"recaptcha-checkbox-border\"]")
    public WebElement captcha;

    @FindBy(xpath = "//button[@class=\"slds-button slds-button_brand\"]")
    public WebElement nextButton;

    @FindBy(xpath = "//div[@class=\"container slds-m-bottom_x-small\"]//p")
    public WebElement verifyText;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div[1]/div/div/article/div/flowruntime-flow/flowruntime-lwc-body/div/flowruntime-list-container/div/flowruntime-base-section/div/flowruntime-screen-field/flowruntime-lwc-field/div/flowruntime-display-text-lwc/lightning-formatted-rich-text/span/p/span")
    public WebElement invalidSerialNumberVerifyText;
}
