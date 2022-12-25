@delete-product
  Feature: Delete Product

  @delete-product @positive
  Scenario: As a user i should be able to add new product
    Given navigate to url "https://secondhand-store.herokuapp.com/login"
    * login as "kelompok1regie@gmail.com"
    When delete product
