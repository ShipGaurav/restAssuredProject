package search_service_Api;

import static io.restassured.RestAssured.given;
import files.payload;
import io.restassured.response.Response;

public class Search_Service_B2B_API {

	public static void main(String[] args) {
		 Response response = given()
	         .header("Content-Type", "application/json")
	         .body(payload.searchAvailabilityNew()) .when() .log().all()
	         .get("https://seller.shipyaari.com/avn_ci/siteadmin/btob_search_service/index")
	         .then()
	         .statusCode(200)
	         .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);      
	}
}




