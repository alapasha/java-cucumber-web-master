@logout
Feature: Logout

@logout @positive

Scenario: As a user i should be able to login and logout
Given navigate to url "https://secondhand-store.herokuapp.com/login"
When login as "binarqae1@gmail.com"
Then current url should be "https://secondhand-store.herokuapp.com/login"
* user logout