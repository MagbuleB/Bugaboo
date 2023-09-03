package com.bugaboo.step_definitions;

import com.bugaboo.pages.FormPage;
import com.bugaboo.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Form_Step_Definition {

    FormPage formPage = new FormPage();

    @When("filling the {string}")
    public void filling_the(String serialNumber) {
        formPage.serialNumberInputBox.sendKeys(serialNumber);
        // Faker faker=new Faker();
        // faker.number();
    }

    @When("filling {string}")
    public void filling(String purchaseDate) {
        formPage.purchaseDateInputBox.sendKeys(purchaseDate);
        //  Faker faker=new Faker();
        //  faker.date();


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

    @And("writing {string}")
    public void writing(String description) {
        formPage.description.sendKeys(description);
        // Faker faker=new Faker();
        // faker.bothify("################################");
    }


    @And("filling first name{string}")
    public void fillingFirstName(String firstName) {
        //Faker faker=new Faker();
        // formPage.firstName.sendKeys(faker.name().firstName());
        formPage.firstName.sendKeys(firstName);


    }

    @And("filling last name{string}")
    public void fillingLastName(String lastName) {
        // Faker faker=new Faker();
        // formPage.lastName.sendKeys(faker.name().lastName());
        formPage.lastName.sendKeys(lastName);
    }

    @And("filling email{string}")
    public void fillingEmail(String email) {
        //Faker faker=new Faker();
        // I couldn't find email in javafaker thats why i coulnt implement it??????????
        formPage.email.sendKeys(email);
    }

    @And("verify verify email{string}")
    public void verifyVerifyEmail(String verifyEmail) {
        formPage.verifyEmail.sendKeys(verifyEmail);
    }

    @And("filling phone {string}")
    public void fillingPhone(String phone) {
        formPage.phone.sendKeys(phone);
        //Faker faker=new Faker();
        //  formPage.phone.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @And("filling street first address {string}")
    public void fillingStreetFirstAddress(String street1) {
        formPage.street1.sendKeys(street1);

        //Faker faker=new Faker();
        //formPage.street1.sendKeys(faker.address().streetAddress());
    }


    @And("filling street second address {string}")
    public void fillingStreetSecondAddress(String street2) {
        formPage.street2.sendKeys(street2);
        // Faker faker=new Faker();
        // formPage.street2.sendKeys(faker.address().streetAddress());
    }


    @And("filling city {string}")
    public void fillingCity(String city) {
        formPage.city.sendKeys(city);
        //Faker faker=new Faker();
        //formPage.city.sendKeys(faker.address().city());
    }

    @And("filling country {string}")
    public void fillingCountry(String country) {
        Select select = new Select(formPage.country);
        select.selectByVisibleText(country);

    }

    @Then("verify user should see {string}")
    public void verify_user_should_see(String string) {
        formPage.captcha.click();
        formPage.nextButton.click();
        String actualVerifyText = formPage.verifyText.getText();
        String expectedVerifyText = string;
        Assert.assertEquals(expectedVerifyText, actualVerifyText);

    }

}


