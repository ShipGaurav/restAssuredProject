package StepDefinations;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import resources.TestDataBuild;

public class Maskingshipments {
    private static List<String> orderIds = new ArrayList<String>();

    static {
        regenerateOrderIds();
    }

    private static void regenerateOrderIds() {
        Random random = new Random();
        orderIds.clear();
        for (int i = 0; i < 10; i++) {
            int showMe = random.nextInt(100000, 10000000);
            String orderId = String.valueOf(showMe);
            orderIds.add(orderId);
        }
        Collections.shuffle(orderIds);
    }

    private String partnerId;
    private String partnerName;
    private String encodedData;
    private String encodedPartnerId;
    private Response response;
    private String channelName;

   
   
    @When("the user calls create_consignment_API_B2C with a POST http request")
    public void the_user_calls_create_consignment_api_b2c_with_a_post_http_request() {
        String orderId = generateOrderId();
        encodedData = Base64.getEncoder().encodeToString(orderId.getBytes());
        encodedPartnerId = Base64.getEncoder().encodeToString(partnerId.getBytes());

        RestAssured.baseURI = "https://seller.shipyaari.com";

        String requestBody = TestDataBuild.createconsigments(encodedData, encodedPartnerId, channelName);

        response = given()
                .queryParam("avnkey", "5934@5181")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .log().all()
                .when().post("/logistic/webservice/create_consignment_api.php");
    }

    @Then("the API call succeeds with status code {int}")
    public void the_api_call_succeeds_with_status_code(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the {string} in the response body is {string}")
    public void the_in_the_response_body_is(String key, String expectedValue) {
        String actualValue = response.jsonPath().getString(key);
        assert actualValue.equals(expectedValue);
    }

    @Then("the response includes a valid {string}")
    public void the_response_includes_a_valid(String key) {
        String value = response.jsonPath().getString(key);
       
    }

    @Then("the response includes {string} as {string}")
    public void the_response_includes_as(String key, String expectedValue) {
        String actualValue = response.jsonPath().getString(key);
        assert actualValue.equals(expectedValue);
    }

    private String generateOrderId() {
        if (orderIds.isEmpty()) {
            regenerateOrderIds();
        }
        return orderIds.remove(0);
    }
}
