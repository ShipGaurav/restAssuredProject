package manifest_api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class manifest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://seller.shipyaari.com/client/siteadmin/manifest/index";
		 Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type","text/plain")
		    .body(payload.manifest()).log().all()
		.when()
		    .post("client/siteadmin/manifest/index")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .extract().response();
	     String jsonResponse = response.asString();
	     System.out.println("Response");
	     System.out.println(jsonResponse);
	}
	
}

