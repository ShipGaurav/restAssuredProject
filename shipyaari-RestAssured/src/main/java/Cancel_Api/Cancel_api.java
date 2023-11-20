package Cancel_Api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Cancel_api {
	public static  String trackingnumber;

	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.cancelapi()).log().all()
		.when()
		    .post("avn_ci/siteadmin/cancel_consignment/")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	     
	}
}
