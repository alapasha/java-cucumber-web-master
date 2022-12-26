@login
Feature: Login

  @login @positive
  Scenario: As a user i should be able to login
    Given navigate to url "https://secondhand-store.herokuapp.com/login"
    When login as "kopi.lintau@gmail.com"
    Then current url should be "https://secondhand-store.herokuapp.com/login"

#  @logout @positive
#  Scenario: As a user i should be able to login and logout
#    Given navigate to url "https://secondhand-store.herokuapp.com/login"
#    When login with valid credential
#    Then current url should be "https://secondhand-store.herokuapp.com/"
#    * user logout
#
#  @login @negative
#    Scenario Outline: As a user i should not be able to login because credential is not valid
#      Given navigate to url "https://www.saucedemo.com/"
#      When login as "invalid_user"
#      Then user verify error message with value "<errorMessage>"
#      * user take screenshot full page with name "negative_login_001"
#
#    Examples:
#        | errorMessage                                                              |
#        | Epic sadface: Username and password do not match any user in this service |
#
#  @login @positive
#    Scenario: User should be able to open About Page
#      Given navigate to url "https://www.saucedemo.com/"
#      When login as "standard_user"
#      Then user open About Page
