package label_api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get_b2b_label {

	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.get_b2b_label()).log().all()
		.when()
		    .post("avn_ci/siteadmin/shipment_api/get_b2b_labels")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
	
}
