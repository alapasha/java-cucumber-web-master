@AcceptBidPrice
  Feature: Accept Bid Price

    @AcceptBidPrice @positive
      Scenario: Seller should be able to accept bid price
      Given navigate to url "https://secondhand-store.herokuapp.com"
      * login as "kelompok1regie@gmail.com"
      Given seller direct to daftar jual page
      When seller accepted the bid price
      Then seller get allert message
#      Then user take screenshot full page with name "Accept Bid Price"