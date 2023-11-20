Feature: Unicommerce API

  Scenario: Login and perform Unicommerce API call
    Given client login shipyaari panel with given credential 
    When I call the login API
    Then I obtain the app token
    When I perform the Unicommerce API call using the app token
    When i hit unicommerence API call 
    Then the API call is successful
