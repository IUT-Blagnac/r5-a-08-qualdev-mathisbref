Feature: Is it Friday ?
    Scenario: Sunday is not Friday
      Given today is sunday
      When i said it's friday
      Then I'm wrong it's not friday
