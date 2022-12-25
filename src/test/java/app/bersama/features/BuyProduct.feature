@BuyProduct
Feature: Buy Product

  @BuyProduct @positive
  Scenario: User should be able to buy product
    Given user want to buy product "https://secondhand-store.herokuapp.com/productpage/14"
    When user click interested and nego button
    Then pop up message should be appear with value "Harga tawarmu berhasil dikirim ke penjual"