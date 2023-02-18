package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en_lol.AN;

public class LoginSteps {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("inside step - user is on login page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("inside step - user enters username and password");

    }
    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("inside step - user clicks on login button");

    }
    @Then("user is navigated to home")
    public void user_is_navigated_to_home() {
        System.out.println("inside step - user navigated to home page");

    }

}
