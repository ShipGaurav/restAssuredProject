package hyperlocal;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class cancellled_hyperlocal {

	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/avn_ci/siteadmin/shipment_api/cancel_hyperlocal_shipment";
		 Response response = given()
		  //  .queryParam("avnkey", "999@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.cncelled_api_hyperlocal()).log().all()
		.when()
		    .post("avn_ci/siteadmin/shipment_api/cancel_hyperlocal_shipment")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
	
}

