@DeclineBidPrice
  Feature: Decline Bid Price

    @DeclineBidPrice @positive
      Scenario: Seller decline bid price
      Given navigate to url "https://secondhand-store.herokuapp.com"
      * login as "kelompok1regie@gmail.com"
      Given seller direct to daftar jual page
      When seller decline bid price
      Then seller get allert decline message
#      * user take screenshot full page with name "Decline Bid Price"
