@add-product
  Feature: Add Product

  @add-product @positive
  Scenario: As a user i should be able to add new product
    Given navigate to url "https://secondhand-store.herokuapp.com/login"
    * login as "kelompok1regie@gmail.com"
#    * current url should be "https://secondhand-store.herokuapp.com/"
    When Add new item
    * current url should be "https://secondhand-store.herokuapp.com/productinfo"
    Then Fill the information form
    * current url should be "https://secondhand-store.herokuapp.com/"
