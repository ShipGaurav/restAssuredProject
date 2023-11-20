package label_api;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getlabel_avn {

    public static void main(String[] args) {

        // Login API
        String apiUrl = "https://seller.shipyaari.com/angularapi/login";

        Response response = RestAssured.given()
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

        int[] labelTypes = {1}; // Set the desired label types here

        for (int labelType : labelTypes) {
            Response labelResponse = RestAssured.given()
                    .body("{\r\n" + "  \"label_type\": " + labelType + "\r\n" + "}")
                    .header("Content-Type", "application/json") // Update content type to JSON
                    .header("Authorization", app_token)
                    .post("https://seller.shipyaari.com/angularapi/LabelSettings/changelabel") // Provide the complete URL
                    .then()
                    .log().all()
                    .assertThat()
                    .statusCode(200)
                    .extract().response();

            RestAssured.baseURI = "https://seller.shipyaari.com";
          
            given()
                .queryParam("avnkey", "5934@5181")
                .header("Authorization", app_token)
                .header("Content-Type", "application/json") // Update content type to JSON
                .body(get_label(labelTypes)) // Pass labelTypes as argument
                .log().all(DEFAULT_URL_ENCODING_ENABLED)               
            .when()
                .post("/client/siteadmin/labels/getlabel_avn")
            .then()
                .log().all()
                .assertThat()
                .statusCode(200);
            
        
            

            // Print the label response
            System.out.println("Label Type: " + labelType);
            System.out.println("Response Body: " + labelResponse.getBody().asString());
            System.out.println("-------------------------------------");
        }
    }

    public static String get_label(int[] labelTypes) {
        return "{\"avnkey\":\"5934@5181\",\"shipyaari_id\":[\"I14269176\r\n"
        		+ "\"]}";
    }
}
