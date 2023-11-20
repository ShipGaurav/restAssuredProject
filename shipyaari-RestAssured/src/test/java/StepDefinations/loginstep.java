package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginstep {

    private String apiEndPoint;
    private String requestBody;
    private Response response;
    private String appToken;

    @Given("I set user API EndPoint to {string}")
    public void i_set_user_api_end_point(String endPoint) {
        apiEndPoint = endPoint;
    }

    @Given("I set request body as:")
    public void i_set_request_body_as(String body) {
        requestBody = body;
    }

    @When("I send POST request")
    public void i_send_post_request() {
        // Set the request specification and send the POST request
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody);
        response = request.post(apiEndPoint);

        // Extract the app_token from the response
        appToken = response.jsonPath().getString("result.app_token");
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode).log().all();
    }

    public String getAppToken() {
        return appToken;
    }
}
