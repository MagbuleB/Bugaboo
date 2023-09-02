package com.bugaboo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class FormPage extends BasePage{

    @FindBy(id  ="input-114")
    public WebElement serialNumberInputBox;

    @FindBy(id  ="input-123")
    public WebElement purchaseDateInputBox;



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

    @FindBy(id  ="input-144")
    public WebElement city;

    @FindBy(id  ="input-144")
    public WebElement country;








    

    






}
