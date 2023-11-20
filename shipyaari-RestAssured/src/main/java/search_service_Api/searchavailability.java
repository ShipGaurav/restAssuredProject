package search_service_Api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class searchavailability {
    public static void main(String[] args) {

    	RestAssured.baseURI = "https://seller.shipyaari.com";
        Response response = given().queryParam("avnkey", "5934@5181").log().all()
                .queryParam("weight", "4.7")
                .queryParam("invoicevalue", "100")
                .queryParam("length", "6")
                .queryParam("height", "7")
                .queryParam("pickup_pincode", "400086")
                .queryParam("delivery_pincode", "400086")
                .queryParam("paymentmode", "online")
                .when()
                .post("logistic/webservice/SearchAvailability_new.php")
                .then()
                .log()
                .all()
                .statusCode(200)
                .header("Content-Type", "application/json")
                .extract()
                .response();

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    
    }
}