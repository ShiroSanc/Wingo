package co.com.bancolombia.certification.Wingo2.stepdefinitions;

import co.com.bancolombia.certification.Wingo2.userinterfaces.ComprarVueloUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ComprarVueloStepDefinition {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Danilo");
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.wingo.com/"));
    }
    
    @When("user find a flight filling all fields")
    public void userFindAFlightFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(ComprarVueloUI.makeinformation());



    }
    @Then("user sees the flight")
    public void userSeesTheFlight() {

    }
}
