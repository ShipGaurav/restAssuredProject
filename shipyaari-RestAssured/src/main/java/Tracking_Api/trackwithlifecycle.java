package Tracking_Api;
import static io.restassured.RestAssured.given;

import org.testng.Assert;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class trackwithlifecycle {
		
		public static void main(String[] args) {
			RestAssured.baseURI="https://seller.shipyaari.com/avn_ci/siteadmin/track/trackdetails";
			 Response response = given()
			    .queryParam("avnkey", "5934@5181")
			    .header("Content-Type","text/plain")
			    .body(payload.trackdetails()).log().all()
			.when()
			    .post("avn_ci/siteadmin/track/trackdetails")
			.then()
			    .assertThat()
			    .statusCode(200)
			    .extract().response();
		     String jsonResponse = response.asString();
		     System.out.println("Response");
		     System.out.println(jsonResponse);
		     
		     String responseBody = response.getBody().asString();
				Assert.assertTrue(responseBody.contains("\"status\":true"));
				Assert.assertTrue(responseBody.contains("\"tracking_number\":\"1430910705434\""));
			}
		     
		}
		

