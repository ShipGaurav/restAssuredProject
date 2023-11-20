Feature: Create Consignments API for B2C Orders with ServiceName and MaskServiceName

  @createconsignments
  Scenario Outline: Create consignments API for partners "<partnerName>"
    Given a partner with ID "<partnerId>"
    When the user calls create_consignment_API_B2C with a POST http request
    Then the API call succeeds with status code 200
    And the "status" in the response body is "success"
    And verify trackingNumber created maps to "<partnerId>" using "create_consignment_API_B2C"
    And the response includes a valid "trackingNumber"
    And the response includes "ServiceName" as "<ServiceName>"
    And the response includes "MaskserviceName" as "<MaskserviceName>"
    
    Examples:
      | partnerId | partnerName         | ServiceName      | MaskserviceName |
      | 19550     | Amazon              | Economy 1kg      | Balanced        |
      | 19550     | Amazon              | Economy 2Kgs     | Balanced        |
      | 19550     | Amazon              | Economy 5kgs     | Balanced        |
      | 19550     | Amazon              | Economy          | Balanced        |
      | 19550     | Amazon              | Economy 20kgs    | Balanced        |
      | 19550     | Amazon              | Economy 30kgs    | Balanced        |
      | 19550     | Amazon              | Economy 0.5kg    | Balanced        |
      | 2354      | BlueDart            | Standard         | Cost Saver      |
      | 2354      | BlueDart            | Economy 0.5kg    | Cost Saver      |
      | 2354      | BlueDart            | Economy 0.75kg   | Cost Saver      |
      | 2354      | BlueDart            | Economy 0.25kg   | Cost Saver      |
      | 22449     | Bluedart Reverse    | Reverse          | Cost Saver      |
      | 9         | Delhivery           | Standard         | Cost Saver      |
      | 9         | Delhivery           | Economy          | Cost Saver      |
      | 9         | Delhivery           | Economy 0.5kg    | Balanced        |
      | 9         | Delhivery           | Economy 5kgs     | Balanced        |
      | 9         | Delhivery           | Economy 2Kgs     | Balanced        |
      | 9         | Delhivery           | Economy 20kgs    | Balanced        |
      | 9         | Delhivery           | Economy 1kg      | Balanced        |
      | 9         | Delhivery           | Standard 1kg     | Balanced        |
      | 9         | Delhivery           | Standard 2kg     | Balanced        |
      | 9         | Delhivery           | Standard 5kg     | Balanced        |
      | 9         | Delhivery           | Standard 10kg    | Balanced        |
      | 9         | Delhivery           | Economy 30kgs    | Balanced        |
      | 9         | Delhivery           | Economy 50kgs    | Balanced        |
      | 9         | Delhivery           | Economy 100kgs   | Balanced        |
      | 9         | Delhivery           | Economy 0.75kg   | Balanced        |
      | 9         | Delhivery           | Economy 0.25kg   | Balanced        |
      | 2         | DTDC                | Standard         | Cost Saver      |
      | 2         | DTDC                | Economy          | Cost Saver      |
      | 2         | DTDC                | Economy 0.5kg    | Cost Saver      |
      | 2         | DTDC                | Economy 1kg      | Cost Saver      |
      | 2         | DTDC                | Economy 2Kgs     | Cost Saver      |
      | 2         | DTDC                | Economy 5kgs     | Cost Saver      |
      | 2         | DTDC                | Economy 20kgs    | Cost Saver      |
      | 2         | DTDC                | Economy 30kgs    | Cost Saver      |
      | 2         | DTDC                | Economy 3Kgs     | Cost Saver      |
      | 2         | DTDC                | Economy 0.75kg   | Cost Saver      |
      | 2         | DTDC                | Economy 0.25kg   | Cost Saver      |
      | 19537     | Ecom Express        | Economy 0.5kg    | Balanced        |
      | 19537     | Ecom Express        | Economy 5kgs     | Balanced        |
      | 19537     | Ecom Express        | Economy 1kg      | Balanced        |
      | partnerId | partnerName          | ServiceName       | MaskserviceName |
      | 19537     | Ecom Express         | Economy 2Kgs      | Balanced        |
      | 19537     | Ecom Express         | Economy           | Balanced        |
      | 19537     | Ecom Express         | Standard          | Rapid           |
      | 19537     | Ecom Express         | Economy 20kgs     | Balanced        |
      | 19537     | Ecom Express         | Economy 30kgs     | Balanced        |
      | 19537     | Ecom Express         | Economy 50kgs     | Balanced        |
      | 19537     | Ecom Express         | Economy 100kgs    | Balanced        |
      | 19537     | Ecom Express         | Economy 0.75kg    | Balanced        |
      | 19537     | Ecom Express         | Economy 0.25kg    | Balanced        |
      | 6406      | Ekart                | Standard          | Balanced        |
      | 6406      | Ekart                | Economy 0.5kg     | Balanced        |
      | 6406      | Ekart                | Economy 1kg       | Balanced        |
      | 6406      | Ekart                | Economy 2Kgs      | Balanced        |
      | 6406      | Ekart                | Economy 5kgs      | Cost Saver      |
      | 6406      | Ekart                | Economy           | Cost Saver      |
      | 6406      | Ekart                | Economy 0.75kg    | Balanced        |
      | 6406      | Ekart                | Economy 0.25kg    | Cost Saver      |
      | 19636     | Load Share           | Economy 2Kgs      | Balanced        |
      | 19636     | Load Share           | Economy 5kgs      | Balanced        |
      | 19636     | Load Share           | Economy           | Balanced        |
      | 19636     | Shadowfax            | Reverse           | Balanced        |
      | 9008      | Shadowfax            | Standard          | Balanced        |
      | 9008      | Shadowfax            | Economy 0.25kg    | Cost Saver      |
      | 19657     | Shree Maruti Courier | Standard          | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 1kg       | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 2Kgs      | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 5kgs      | Balanced        |
      | 19657     | Shree Maruti Courier | Economy           | Cost Saver      |
      | 19657     | Shree Maruti Courier | Economy 100kgs    | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 50kgs     | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 30kgs     | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 20kgs     | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 0.5kg     | Cost Saver      |
      | 19657     | Shree Maruti Courier | Economy 3Kgs      | Balanced        |
      | 19657     | Shree Maruti Courier | Economy 0.75kg    | Cost Saver      |
      | 19657     | Shree Maruti Courier | Economy 0.25kg    | Cost Saver      |
      | 19467     | Smartr               | Standard          | Rapid           |
      | 19467     | Smartr               | Standard 1kg      | Rapid           |
      | 19467     | Smartr               | Standard 2kg      | Rapid           |
      | 19467     | Smartr               | Standard 5kg      | Rapid           |
      | 19467     | Smartr               | Standard 10kg     | Balanced        |
      | 19467     | Smartr               | Economy 0.25kg    | Balanced        |
      | 5161      | XpressBee            | Standard          | Rapid           |
      | 5161      | XpressBee            | Economy 0.5kg     | Rapid           |
      | 5161      | XpressBee            | Economy 1kg       | Rapid           |
      | 5161      | XpressBee            | Economy 5kgs      | Rapid           |
      | 5161      | XpressBee            | Economy           | Balanced        |
      | 5161      | XpressBee            | Economy 2Kgs      | Rapid           |
      | 5161      | XpressBee            | Economy 3Kgs      | Rapid           |
      | 5161      | XpressBee            | Economy 20kgs     | Rapid           |
      | 5161      | XpressBee            | Economy 30kgs     | Rapid           |
      | 5161      | XpressBee            | Economy 50kgs     | Rapid           |
      | 5161      | XpressBee            | Economy 100kgs    | Rapid           |
      
