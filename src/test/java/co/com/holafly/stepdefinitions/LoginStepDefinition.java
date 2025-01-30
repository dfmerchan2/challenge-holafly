package co.com.holafly.stepdefinitions;

import co.com.holafly.questions.TheMessage;
import co.com.holafly.tasks.DoLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.holafly.userinterfaces.LoginPage.LBL_ERROR_MESSAGE;
import static co.com.holafly.userinterfaces.ProductsPage.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
  @When("{string} types username {string} and password {string} on SwagLabs app")
  public void typesUserAndPasswordOnSwagLabsApp(String actor, String user, String password) {
    theActorCalled(actor).attemptsTo(DoLogin.inSwagLabs(user, password));
  }

  @Then("should see the welcome message {string}")
  public void youShouldSeeTheWelcomeMessage(String message) {
    theActorInTheSpotlight()
        .should(seeThat("the message", TheMessage.ofElement(LBL_PRODUCTS), equalTo(message)));
  }

  @Then("should see the error message {string}")
  public void shouldSeeTheErrorMessage(String message) {
    theActorInTheSpotlight()
        .should(seeThat("the message", TheMessage.ofElement(LBL_ERROR_MESSAGE), equalTo(message)));
  }
}
