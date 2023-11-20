package pincode_api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Pincode_api {

	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.pincodeAPI()).log().all()
		.when()
		    .post("client/siteadmin/api/check_pincode")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
}


