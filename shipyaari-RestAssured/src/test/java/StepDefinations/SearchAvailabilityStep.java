package StepDefinations;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SearchAvailabilityStep {

    private Response response;

    @Given("the Search Service Availability Payload with the following details:")
    public void setSearchServiceAvailabilityPayload(Map<String, String> payloadDetails) {
        RestAssured.baseURI = "https://seller.shipyaari.com";
        
        response = given()
            .queryParam("avnkey", payloadDetails.get("avnkey"))
            .queryParam("weight", payloadDetails.get("weight"))
            .queryParam("invoicevalue", payloadDetails.get("invoicevalue"))
            .queryParam("length", payloadDetails.get("length"))
            .queryParam("height", payloadDetails.get("height"))
            .queryParam("pickup_pincode", payloadDetails.get("pickup_pincode"))
            .queryParam("delivery_pincode", payloadDetails.get("delivery_pincode"))
            .queryParam("paymentmode", payloadDetails.get("paymentmode"))
            .log().all()
            .when()
            .post("logistic/webservice/SearchAvailability_new.php");
    }
    
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String string, String string2) {
      
    }

    @Then("the API call for shipment got success with status code {int}")
    public void verifyAPICallSuccess(int statusCode) {
        response.then()
            .log().all()
            .statusCode(statusCode);
        
        String responseBody = response.getBody().asString();
        
    }
}
