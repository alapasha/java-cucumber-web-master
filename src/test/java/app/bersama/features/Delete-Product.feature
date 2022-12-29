@delete-product
  Feature: Delete Product

  @delete-product @positive
  Scenario: As a user i should be able to add new product
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    When user click my sell list button
    When delete product
    Then user return to homepage
