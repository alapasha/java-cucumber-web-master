@sell-list
Feature: Notification

  @sell-list @positive
  Scenario: As a user i should be able to check their list of product
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    When user click my sell list button
    Then user could verify their list of product