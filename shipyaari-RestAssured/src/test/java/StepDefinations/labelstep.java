package StepDefinations;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;

public class labelstep {
    private Response response;
    private String labelPdfUrl;

    @When("user call with HTTPS post request")
    public void user_call_with_https_post_request() {
        RestAssured.baseURI = "https://seller.shipyaari.com";

        String requestBody = "{\r\n" +
                "    \"avnkey\": \"5934@5181\",\r\n" +
                "    \"shipyaari_id\": [\r\n" +
                "        \"SHIPYAARI-4370170\"\r\n" +
                "    ]\r\n" +
                "}";

        response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "ci_session=a%3A5%3A%7Bs%3A10%3A%22session_id%22%3Bs%3A32%3A%2236a6f13d3958d961a34d2348609c2261%22%3Bs%3A10%3A%22ip_address%22%3Bs%3A13%3A%2249.249.219.90%22%3Bs%3A10%3A%22user_agent%22%3Bs%3A21%3A%22PostmanRuntime%2F7.32.3%22%3Bs%3A13%3A%22last_activity%22%3Bi%3A1687859196%3Bs%3A9%3A%22user_data%22%3Bs%3A0%3A%22%22%3B%7D849192a1cb257b04cc792bd4dcd09a53")
                .body(requestBody)
                .when().post("/client/siteadmin/labels/getlabel_avn");
    }

    @Then("the API call getting sucessful response {int} ok")
    public void the_api_call_getting_sucessful_response_ok(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    @Then("save the label URL in in pdf")
    public void save_the_label_url_in_in_pdf() {
        labelPdfUrl = response.jsonPath().getString("label_pdf");
        System.out.println("Label PDF URL: " + labelPdfUrl);
    }

    @Then("validate the pdf data with given data")
    public void validate_the_pdf_data_with_given_data() {
        
    	InputStream inputStream = response.getBody().asInputStream();
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("C:/Users/admin/eclipse-workspace/shipyaari-RestAssured/target/label.pdf");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
}
