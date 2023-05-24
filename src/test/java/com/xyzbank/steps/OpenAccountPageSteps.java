package com.xyzbank.steps;

import com.xyzbank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OpenAccountPageSteps {
    @And("^I Click On Open Account Button$")
    public void iClickOnOpenAccountButton() {
        new OpenAccountPage().clickingOnTheOpenAccountButton();
    }

    @And("^I Select The \"([^\"]*)\" From Customer Drop Down$")
    public void iSelectTheFromCustomerDropDown(String customer) {
        new OpenAccountPage().selectingCreatedCustomerFromTheCustomerNameDropDown(customer);
    }

    @And("^I Select The \"([^\"]*)\" From Currency Drop Down$")
    public void iSelectTheFromCurrencyDropDown(String currency) {
        new OpenAccountPage().selectingTheCurrencyFromCurrencyDropDown(currency);
    }

    @And("^I Click On Process Button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickingOnTheProcessButton();
    }

    @Then("^I Can Verify The Account Creation Confirmation Text$")
    public void iCanVerifyTheAccountCreationConfirmationText() {
        new OpenAccountPage().verifyingAccountCreationText();
    }
}
