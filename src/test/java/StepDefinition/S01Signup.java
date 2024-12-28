package StepDefinition;

import Pages.SignupPage.Signup;
import TestData.Configurations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01Signup  {
Signup signup = new Signup(Hooks.driver);

@Given("Click on the Sign up button in the Header")
public void openSignupPage() throws InterruptedException {
    System.out.println(Hooks.driver);
    signup.openSignupPage();


}

@When("Fill in the username")
public void setUserName()  {
    signup.setUserName(Configurations.Username);
}

@And("password")
public void setPassword(){
    signup.setPassword(Configurations.Password);
}

@And("Click on the Sign Up button")
public void setSignupButton()  {
    signup.setSignupButton();
}

  @Then("A success message should be displayed")

    public void assertofSignup(){
      signup.setSignupMsg();
    }
}
