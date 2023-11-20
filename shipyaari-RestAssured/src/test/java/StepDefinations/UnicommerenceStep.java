package StepDefinations;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;

public class UnicommerenceStep {
	
	private static List<String> orderIds = new ArrayList<String>();

    static {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int showMe = random.nextInt(100000, 10000000);
            String orderId = String.valueOf(showMe);
            orderIds.add(orderId);
        }
        Collections.shuffle(orderIds);
    }

    private Response response;
    
   // private List<String> orderIds = new ArrayList<String>();

    private String apiEndPoint;
    private String requestBody;
    private String appToken;
   // private Response response;

    @Given("client login shipyaari panel with given credential")
    public void client_login_shipyaari_panel_with_given_credential() {
        // Set the user API EndPoint
        apiEndPoint = "https://seller.shipyaari.com/angularapi/login";

        // Set the request body with the given credentials
        requestBody = "{\n" +
                "  \"username\": \"prevo\",\n" +
                "  \"password\": \"Dinesh@0904\"\n" +
                "}";
    }

    @When("I call the login API")
    public void i_call_the_login_api() {
        // Set the request specification and send the POST request
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody);
        response = request.post(apiEndPoint);

        // Extract the app_token from the response
        appToken = response.jsonPath().getString("result.app_token");
    }

    @Then("I obtain the app token")
    public void i_obtain_the_app_token() {
        System.out.println("App Token: " + appToken);
    }

    @When("I perform the Unicommerce API call using the app token")
    public void i_perform_the_unicommerce_api_call_using_the_app_token() {
        // Set the API endpoint for the Unicommerce API call
        String unicommerceApiUrl = "https://seller.shipyaari.com/avn_ci/siteadmin/unicommerceapis/waybill";

        // Set the request specification with the app_token header
        RequestSpecification request = RestAssured.given();
        request.header("app_token", appToken);

        // Send GET request to the Unicommerce API
        response = request.get(unicommerceApiUrl);
    }

    @When("i hit unicommerence API call")
    public void i_hit_unicommerence_api_call() {
       
    	RestAssured.baseURI = "https://seller.shipyaari.com";
        byte[] data = new byte[16];
        new Random().nextBytes(data);

        Random randomNum = new Random();
        int showMe = randomNum.nextInt(1000, 100000);

        String order_id = "" + Integer.parseInt("" + showMe);
        System.out.println("Order ID:" + order_id);
        String encodedData = Base64.getEncoder().encodeToString(order_id.getBytes());

        given().queryParam("avnkey", "5934@5181")
            .header("Authorization", appToken)
            .header("Content-Type", "text/plain")
            .body(TestDataBuild.unicommerence_api(encodedData))
            .log().all()
            .when()
            .post("/avn_ci/siteadmin/unicommerceapis/waybill")
            .then()
            .log().all()
            .assertThat()
            .statusCode(200);
        

   }

    
    @Then("the API call is successful")
    public void the_api_call_is_successful() {
    	
//    	int statusCode = response.getStatusCode();
//        Assert.assertEquals(200, statusCode);
//    	
//        // Parse the response body
//        String responseBody = response.getBody().asString();
//        JsonPath json = new JsonPath(responseBody);
//
//        // Extract the values from the response
//        String status = json.getString("status");
//        String waybill = json.getString("waybill");
//        String shippingLabel = json.getString("shippingLabel");
//        String courierName = json.getString("courierName");
//
//        // Perform assertions on the response values
//        Assert.assertEquals("SUCCESS", status);
//        Assert.assertNotNull(waybill);
//        Assert.assertNotNull(shippingLabel);
//        Assert.assertNotNull(courierName);
    
    }
    
    private String generateOrderId() {
        if (orderIds.isEmpty()) {
            throw new IllegalStateException("No more order IDs available.");
        }
        return orderIds.remove(0);
    }

}