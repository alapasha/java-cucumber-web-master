@notification
Feature: Notification

  @notification @positive
    Scenario: As a user i should be able to check notification
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    When user click notification button on homepage
    Then user could verify the notification list