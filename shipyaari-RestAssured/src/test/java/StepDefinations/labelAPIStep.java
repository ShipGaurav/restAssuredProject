package StepDefinations;

import static io.restassured.RestAssured.given;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class labelAPIStep {
    private String labelPdfUrl;
    private Response response;
    private int[] labelTypes;

    @Given("select the label type {string}")
    public void select_the_label_type(String labelType) {
        this.labelTypes = new int[] { Integer.parseInt(labelType) };

        String apiUrl = "https://seller.shipyaari.com/angularapi/login";

        response = RestAssured.given()
                .body("{\r\n" + "  \"username\": \"Prevo\",\r\n" + "  \"password\": \"Dinesh@0904\"\r\n" + "}")
                .header("Content-Type", "application/json") // Update content type to JSON
                .post(apiUrl)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath = response.jsonPath();
        String app_token = jsonPath.get("result.app_token");
        System.out.println(app_token);

        for (int labelType1 : labelTypes) {
            RestAssured.given()
                    .body("{\r\n" + "  \"label_type\": " + labelType + "\r\n" + "}")
                    .header("Content-Type", "application/json") // Update content type to JSON
                    .header("Authorization", app_token)
                    .post("https://seller.shipyaari.com/angularapi/LabelSettings/changelabel") // Provide the complete URL
                    .then()
                    .log().all()
                    .assertThat()
                    .statusCode(200)
                    .extract().response();
        }
    }

    @When("user calls getlabel_avn with POST http request")
    public void user_calls_getlabel_avn_with_post_http_request() {
        RestAssured.baseURI = "https://seller.shipyaari.com";

        String requestBody = "{\r\n"
        		+ "    \"avnkey\": \"5934@5181\",\r\n"
        		+ "    \"shipyaari_id\": [\r\n"
        		+ "        \"SHIPYAARI-5007957\"\r\n"
        		+ "    ]\r\n"
        		+ "}";

        response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "ci_session=a%3A5%3A%7Bs%3A10%3A%22session_id%22%3Bs%3A32%3A%2236a6f13d3958d961a34d2348609c2261%22%3Bs%3A10%3A%22ip_address%22%3Bs%3A13%3A%2249.249.219.90%22%3Bs%3A10%3A%22user_agent%22%3Bs%3A21%3A%22PostmanRuntime%2F7.32.3%22%3Bs%3A13%3A%22last_activity%22%3Bi%3A1687859196%3Bs%3A9%3A%22user_data%22%3Bs%3A0%3A%22%22%3B%7D849192a1cb257b04cc792bd4dcd09a53")
                .body(requestBody)
                .when().post("/client/siteadmin/labels/getlabel_avn");  
    }

    @Then("the API call is successful with status code {int}")
    public void the_api_call_is_successful_with_status_code(Integer statusCode) {
        Assert.assertNotNull("Response object is null", response);
        response.then().statusCode(statusCode).log().all();
    }

    @Then("\"status\" in response is \"success\"")
    public void status_in_response_is_success() {
//        String responseBody = response.getBody().asString();
//        JsonPath jsonPath = new JsonPath(responseBody);
//        String status = jsonPath.getString("status");
//        Assert.assertEquals("success", status);
    }

    @Then("save the label URL in {string}")
    public void save_the_label_URL_in(String labelPdf) {
        String responseBody = response.getBody().asString();
        JsonPath jsonPath = new JsonPath(responseBody);
        labelPdfUrl = jsonPath.getString("label_pdf");
        System.out.println("Label PDF URL: " + labelPdfUrl);
    }
    
    @Then("validate the label PDF and multi-labels")
    public void validate_label_pdf_and_multi_labels() {
     
    }

}
