package com.bugaboo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage{

    @FindBy(id  ="input-114")
    public WebElement serialNumberInputBox;

    @FindBy(id  ="input-123")
    public WebElement purchaseDateInputBox;

    @FindBy(id  ="input-123")
    public WebElement purchaseLocationRadioButtonOnline;

    @FindBy(id  ="input-123")
    public WebElement purchaseLocationRadioButtonShop;

    @FindBy(xpath ="//div[@class=\"slds-form-element__control slds-grow textarea-container\"]/textarea")
    public WebElement description;

    @FindBy(id  ="input-137")
    public WebElement firstName;

    @FindBy(id  ="input-141")
    public WebElement lastName;

    @FindBy(id  ="input-145")
    public WebElement email;

    @FindBy(id  ="input-145")
    public WebElement verifyEmail;

    @FindBy(id  ="input-145")
    public WebElement phone;

    @FindBy(id  ="input-136")
    public WebElement street1;

    @FindBy(id  ="input-140")
    public WebElement street2;




    

    






}
