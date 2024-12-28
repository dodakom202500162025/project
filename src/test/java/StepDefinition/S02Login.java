package StepDefinition;

import Pages.LoginPage.Login;
import TestData.Configurations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02Login {


    Login login = new Login(Hooks.driver);

    @Given("Click on the Log in button in the Header")
    public void setLoginButtonHeader() throws InterruptedException {
        login.setLoginButtonHeader();

    }

    @When("Fill in the username  in the login form")
    public void setUsernamelogin() {
        login.setUsernamelogin(Configurations.Username);
    }

    @And("password  in the login form")
    public void setPasswordLogin() {
        login.setPasswordLogin(Configurations.Password);
    }

    @And("Click on the Log In button")
    public void setLoginButton() throws InterruptedException {
        login.setLoginButton();

    }

    @Then("The account should open successfully, and the user should be logged in")
    public void AsserMessage() {
        login.AsserMessage();
    }
}