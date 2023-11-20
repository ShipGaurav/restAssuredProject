package Ndr_mark_api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Return_api {

	
	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/avn_ci/siteadmin/track/ndr_remark";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.Return()).log().all()
		.when()
		    .post("avn_ci/siteadmin/track/ndr_remark")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
}

