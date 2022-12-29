@profile
Feature: Login

  @profile @positive
  Scenario: As a user i should be able to edit profile
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    * current url should be "https://secondhand-store.herokuapp.com/login"
    When user navigate to profile page
#    Then fillout profile information
    Then user successfully landed to profile page "https://secondhand-store.herokuapp.com/profile"