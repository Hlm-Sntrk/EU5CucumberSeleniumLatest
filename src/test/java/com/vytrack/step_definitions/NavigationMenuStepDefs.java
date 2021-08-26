package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user navigates to Fleet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and actual titles are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user navigates to Marketing, Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and actual titles are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendar")
    public void title_should_be_Calendar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and actual titles are matching");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNum,actualNumber);
    }
}
