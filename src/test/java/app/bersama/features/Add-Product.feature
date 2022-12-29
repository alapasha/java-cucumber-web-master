@add-product
  Feature: Add Product

  @add-product @positive
  Scenario: As a user i should be able to add new product
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    When Add new item
    Then Fill the information form
    * user return to homepage
