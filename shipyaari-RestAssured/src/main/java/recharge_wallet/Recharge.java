package recharge_wallet;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Recharge {

	
	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/avn_ci/siteadmin/payment_link/recharge";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.recharge()).log().all()
		.when()
		    .post("avn_ci/siteadmin/payment_link/recharge")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
	
}

