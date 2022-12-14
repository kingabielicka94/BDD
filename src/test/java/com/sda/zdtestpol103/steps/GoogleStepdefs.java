package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdefs {
    @Given("Google page is opened")
    public void googlePageIsOpened() {
        System.out.println("Google page is opened!!!");
    }

    @When("I click Accept all button")
    public void iClickAcceptAllButton() {
        System.out.println("User clicks Accept all button");
    }

    @And("I search for phrase {string}")
    public void iSearchForPhrase(String searchPhrase) {
        System.out.println("This is searchPhrase " + searchPhrase);
        
    }

    @Then("I can see search results page")
    public void iCanSeeSearchResultsPage() {
        System.out.println("User can see results page");
    }

    @And("I click Enter button")
    public void iClickEnterButton() {
        System.out.println("User clicks enter button");
    }


    @Then("Search results page is not presented")
    public void searchResultsPageIsNotPresented(){
            System.out.println("Search results page is not presented");

        }
    }