@profile
Feature: Login

  @profile @positive
  Scenario: As a user i should be able to edit profile
    Given navigate to url "https://secondhand-store.herokuapp.com/login"
    * login as "binarqae1@gmail.com"
    * current url should be "https://secondhand-store.herokuapp.com/login"
    When user navigate to profile page "https://secondhand-store.herokuapp.com/profile"
    Then fillout profile information
    * user successfully change account information