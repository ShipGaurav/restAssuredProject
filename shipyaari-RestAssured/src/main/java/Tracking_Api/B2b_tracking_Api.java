package Tracking_Api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class B2b_tracking_Api {

	
	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/client/siteadmin/api/b2b_tracking_number";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.b2b_tracking_number()).log().all()
		.when()
		    .post("client/siteadmin/api/b2b_tracking_number")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
}
