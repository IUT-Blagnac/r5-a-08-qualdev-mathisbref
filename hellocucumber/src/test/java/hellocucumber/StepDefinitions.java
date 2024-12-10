package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;


class IsItFriday {   
    static String isItFriday(String today) {
        return null;
    }

    @Given("today is sunday")
    public void anExampleScenario() {
        throw new io.cucumber.java.PendingException();
    }

    @When("i said it's friday")
    public void allStepDefinitionsAreImplemented() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I'm wrong it's not friday")
    public void theScenarioPasses() {
        throw new io.cucumber.java.PendingException();
    }

}