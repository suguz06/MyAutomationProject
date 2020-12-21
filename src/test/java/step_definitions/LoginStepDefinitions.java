package step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("\"user is on the landing page\" = " + "user is on the landing page");
    }




    @When("user enter credentials")
    public void user_enter_credentials() {
        System.out.println("user enter credentials");
    }
    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("user click login button");
    }
    @Then("user supposed to see welcome message")
    public void user_supposed_to_see_welcome_message() {
        System.out.println("user supposed to see welcome message");
    }
}
