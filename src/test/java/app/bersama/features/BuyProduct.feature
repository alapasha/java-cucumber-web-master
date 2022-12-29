@BuyProduct
Feature: Buy Product

  @BuyProduct @positive
  Scenario: User should be able to buy product
    Given navigate to url "https://secondhand-store.herokuapp.com"
    * login as "kelompok1regie@gmail.com"
    * user want to buy product
    When user click interested and nego button
    Then pop up message should be appear
#    * user take screenshot full page with name "Buy Product"