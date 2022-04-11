package co.com.choucair.pruebatecnica.stepdefinitions;

import co.com.choucair.pruebatecnica.model.FormModel;
import co.com.choucair.pruebatecnica.questions.Answer;
import co.com.choucair.pruebatecnica.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SingUpStepDefinitions {

    @Before()
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^given than Alejandro wants register new user at utest$")
    public void givenThanAlejandroWantsRegisterNewUserAtUtest() {
        OnStage.theActorCalled("Alejandro")
                .wasAbleTo(
                        OpenUp.thePage(),
                        Enroll.onThePage()
                );
    }

    @When("^he fill the fields$")
    public void heFillTheFields(List<FormModel>FormInfo) {
    OnStage.theActorInTheSpotlight().attemptsTo(
            CompleteFirst.form(FormInfo),
            CompleteSecond.form(FormInfo),
            CompleteThird.form(FormInfo),
            CompleteFourth.form(FormInfo)
    );

    }

    @Then("^then he create a new user and redirects to home page$")
    public void thenHeCreateANewUserAndRedirectsToHomePage(List<FormModel> FormInfo) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theform(FormInfo)));

    }
}
