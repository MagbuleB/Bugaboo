package com.bugaboo.step_definitions;

import com.bugaboo.pages.BugabooPage;
import com.bugaboo.utilites.BrowserUtils;
import com.bugaboo.utilites.ConfigurationReader;
import com.bugaboo.utilites.Driver;
import com.google.common.base.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Bugaboo_Step_Definition {


    BugabooPage bugabooPage = new BugabooPage();

    @Given("user should navigate to the bugaboo link")
    public void user_should_navigate_to_the_bugaboo_link() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Then("user should confirm contact customer text is displayed")
    public void user_should_confirm_contact_customer_text_is_displayed() {
        String expectedCustomerContactText = "Customer Contact";
        String actualCustomerContactText = bugabooPage.CustomerContactText.getText();
        Assert.assertEquals(expectedCustomerContactText, actualCustomerContactText);
        // cookies
        // bugabooPage.cookiesBtn.click();
    }

    @When("user selects the dropdown button")
    public void user_selects_the_dropdown() {
        BrowserUtils.waitFor(5);
        if(bugabooPage.cookies.isDisplayed()){
            bugabooPage.cookies.click();
        }
        bugabooPage.dropDownQuestion.click();
    }


    @Then("verify user see dropdownOptions")
    public void verify_user_see_dropdown_options(List<String> dropdownOption) {
        System.out.println(dropdownOption);

    }

    @When("user select Product Registration option")
    public void user_select_product_registration_option() {
        bugabooPage.dropDownQuestion.click();
        bugabooPage.productRegistrationDropDownOption.click();

        //bugabooPage.productRegistrationDropDownOption.isSelected();
        //Assert.assertTrue(bugabooPage.productRegistrationDropDownOption.isSelected());
        // System.out.println("bugabooPage = " + bugabooPage);
        // String expectedProductRegistration="Product Registration";
        // String actualProductRegistration=bugabooPage.productRegistrationDropDownOption.getText();
        // Assert.assertEquals(expectedProductRegistration,actualProductRegistration);

        // Verify “Hockey” radio button is selected after clicking.
       /* if (bugabooPage.productRegistrationDropDownOption.isSelected()){

            System.out.println("Button is selected. Verification PASSED!");

        }else{
            System.out.println("Button is not selected. Verification FAILED!!!");
        }*/

    }

    @When("click Next button")
    public void click_next_button() {
        bugabooPage.nextButton.click();
    }

    @Then("verify user sees Serial Id Text")
    public void verify_user_sees_first_name_text() {

        Assert.assertTrue(bugabooPage.serialIDText.isDisplayed());



    }


}
