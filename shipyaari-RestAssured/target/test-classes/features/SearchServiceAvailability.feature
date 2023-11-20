Feature: Search Service Availability

  Scenario: Verify search service availability
    Given the Search Service Availability Payload with the following details:
      | pickup_pincode   | 400064 |
      | delivery_pincode | 400064 |
      | weight           | 0.5    |
      | paymentmode      | Online |
      | invoicevalue     | 100    |
      | avnkey           | 5934@5181 |
      | service_type     | Standard |
      | length           | 21     |
      | width            | 23     |
      | height           | 3      |
    When user calls "Search_Service_Availability_API" with "POST" http request
    Then the API call for shipment got success with status code 200

