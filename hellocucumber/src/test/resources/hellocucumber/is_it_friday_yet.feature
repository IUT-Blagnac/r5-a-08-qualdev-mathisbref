# language: fr

Feature: Est-ce vendredi ?

  Scenario: Dimanche n'est pas vendredi
    Given aujourd'hui c'est dimanche
    When je demande si c'est vendredi
    Then je devrais être répondu "Non"

  Scenario: Vendredi c'est vendredi
    Given aujourd'hui c'est vendredi
    When je demande si c'est vendredi
    Then je devrais être répondu "TGIF"

