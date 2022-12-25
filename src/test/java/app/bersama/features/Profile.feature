@profile
Feature: Login

  @profile @positive
  Scenario: As a user i should be able to edit profile
    Given navigate to url "https://secondhand-store.herokuapp.com/login"
    * login as "binarqae1@gmail.com"
    * current url should be "https://secondhand-store.herokuapp.com/login"
    When user directed to profile page
    Then fillout profile information as "arya"
    * current url should be "https://secondhand-store.herokuapp.com/profile"