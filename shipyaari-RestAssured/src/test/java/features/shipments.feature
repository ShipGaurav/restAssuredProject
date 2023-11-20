Feature: Create Consignments API B2C Orders

  @createconsignments
  Scenario Outline: Create consignments API for partners "<partnerName>"
    Given a partner with ID "<partnerId>"
    When user calls create_consignment_API_B2C with POST http request
    Then the API call got success with status code 200
    And "status" in response body is "success"
    And verify trackingNumber created maps to "<partnerId>" using "create_consignment_API_B2C"

    Examples:
      | partnerId | partnerName          | channelname |
      | 2         | DTDC                 | API         |
      | 9         | Delhivery            | API         |
      | 6406      | Ekart                | API         |
      | 19467     | Smartr               | API         |
      | 5161      | XpressBees           | API         |
      | 9008      | Shadowfax            | API         |
      | 2354      | Bluedart             | API         |
      | 19537     | Ecom Express         | API         |
      | 19550     | Amazon (SWA)         | API         |
      | 19657     | Shree Maruti Courier | API         |
     
      
    
  @create_consignment_API_B2B
  Scenario Outline: Create consignments API for partners "<partnerName>"
    Given a partner with ID "<partnerId>"
    When user calls create_consignment_API_B2B with POST http request
    Then the API call got success with status code 200
    And "status" in response body is "success"
    And verify trackingNumber created maps to "<partnerId>" using "create_consignment_API_B2B"

    Examples:
      | partnerId | partnerName      | channelname |
      #| 8719      | Delhivery B2B    | API         |
      #| 16974     | Bluedart - B2B   | API         |
      #| 22361     | SmartR B2B       | API         |
      #| 16774     | Xpressbees - B2B | API         |
      
      
      @crate_consigments_hyperlocal
  Scenario Outline: Create consignments API for partners "<partnerName>"
    Given a partner with ID "<partnerId>"
    When user calls crate_consigments_hyperlocal with POST http request
    Then the API call got success with status code 200
    And "status" in response body is "success"
    And verify trackingNumber created maps to "<partnerId>" using "crate_consigments_hyperlocal"

    Examples:
      | partnerId  | partnerName                   | channelname |
      #| 21124      |  Innofulfill (Hyper Local)    | API         |
      #| 18664      |  Dunzo - Hyperlocal           | API         |
      #| 18665      |  Wefast - Hyperlocal          | API         |
      
     @create_reverse_consigments
  Scenario Outline: Create consignments API for partners "<partnerName>"
    Given a partner with ID "<partnerId>"
    When user calls create_reverse_consigments with POST http request
    Then the API call got success with status code 200
    And "status" in response body is "success"
    And verify trackingNumber created maps to "<partnerId>" using "create_reverse_consigments"

    Examples:
      | partnerId  | partnerName         | channelname |
      #| 5524      | Shadowfax_Reverse	   | API         |
      #| 22449     | Bluedart Reverse     | API         |
      #| 11216     | Delhivery_Reverse	   | API         |
      
      
     
      
      
