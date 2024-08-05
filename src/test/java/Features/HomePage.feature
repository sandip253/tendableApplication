Feature: Home Page Features

  #TC_001
  @Test
  Scenario: End to End Testing for Tendable Application
    Given user open a login page url in "chrome" browser
    When user verify Home Page Title, Our Story , Our Solution & Why Tendable Is Enabled
    Then user Request a Demo button is displayed on home page 
    And user verify top level button Enabled
    And user click on contactUs button
    And user verify system redirected to Contact Us page
    And user click on Contact at Marketing option
    And Enter full name
    And Enter Oranization Name
    And Enter phone number 
    And Enter email 
    And user select job Role from dropdown
    And user type message to textbox
    And user click on I Agree radio btn
    And user click on Submit btn
    And user verify error message displayed 
    
  