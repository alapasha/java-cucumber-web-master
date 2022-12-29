@register
Feature: Register

  @register @positive
  Scenario: As a user i should be able to register
    Given navigate to url "https://secondhand-store.herokuapp.com"
    When click button daftar disini
    When regist as new account
    Then user get alert message verification email