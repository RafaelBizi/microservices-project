package academy.devdojo.youtube.course.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookStepdefs {

    @Given("this is the first step")
    public void this_is_the_first_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test first");
    }

    @When("this is the second step")
    public void this_is_the_second_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test second");
    }

    @Then("this is the third step")
    public void this_is_the_third_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test third");
    }

    @Given("this is the first step - test second")
    public void this_is_the_first_step_test_second() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test fourth");
    }

    @When("this is the second step - test second")
    public void this_is_the_second_step_test_second() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test fifth");
    }

    @Then("this is the third step - test second")
    public void this_is_the_third_step_test_second() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test sixth");
    }


}
