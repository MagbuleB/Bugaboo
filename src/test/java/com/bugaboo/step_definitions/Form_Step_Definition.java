package com.bugaboo.step_definitions;

import com.bugaboo.pages.FormPage;
import com.bugaboo.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Form_Step_Definition {

    FormPage formPage=new FormPage();

    @When("filling the {string}")
    public void filling_the(String serialNumber) {
        formPage.serialNumberInputBox.sendKeys(serialNumber);

    }
    @When("filling {string}")
    public void filling(String purchaseDate) {
        formPage.purchaseDateInputBox.sendKeys(purchaseDate);

    }
    @When("choose {string}")
    public void choose(String purchaseLocation) {
        List<WebElement> onlineOrShop = Driver.getDriver().findElements(By.xpath("//div[@class=\"slds-form-element__control\"]/span"));
        if (onlineOrShop.get(0).getText().equalsIgnoreCase("Online")) {
            onlineOrShop.get(0).click();
        } else {
            onlineOrShop.get(1).click();
        }
    }

        @Then("verify user should see {string}")
        public void verify_user_should_see (String string){
            formPage.lastName.sendKeys(string);

        }
    }


