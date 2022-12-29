@UpdateStatusSold
  Feature: Seller Update Status Sold

    @UpdateStatusSold @positive
      Scenario: Seller should be able to update status
      Given navigate to url "https://secondhand-store.herokuapp.com"
      * login as "kelompok1regie@gmail.com"
      * seller direct to daftar jual page
      When seller accepted the bid price
      Then seller update status sold product
      * seller get allert success updated status product