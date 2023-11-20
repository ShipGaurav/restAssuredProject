Feature: Client Login

  Scenario: Login with valid credentials
    Given I set user API EndPoint to "https://seller.shipyaari.com/angularapi/login"
    And I set request body as:
    """
    {
      "username": "prevo",
      "password": "Dinesh@0904"
    }
    """
    When I send POST request
    Then the response status code should be 200
   # And the response body should contain "Login Successfully!"
   # And the response body should have property "result.user_id" with value "5934"
   # And the response body should have property "result.full_name" with value "Demo-Tech"
   # And the response body should have property "result.email" with value "gaurav.jadhav@shipyaari.com"
   # And the response body should have property "result.mobile" with value "7020553391"
