package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;



public class StepDefinitions {

    private String actualAnswer;

    @Given("aujourd'hui c'est dimanche")
    public void aujourd_hui_c_est_dimanche() {
        actualAnswer = IsItFriday.isItFriday("dimanche");
    }

    @Given("aujourd'hui c'est vendredi")
    public void aujourd_hui_c_est_vendredi() {
        actualAnswer = IsItFriday.isItFriday("vendredi");
    }

    @When("je demande si c'est vendredi")
    public void je_demande_si_c_est_vendredi() {
        // La logique est déjà appliquée dans les @Given, donc rien à ajouter ici
    }

    @Then("je devrais être répondu {string}")
    public void je_devrais_etre_repondu(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}


