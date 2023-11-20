package label_api;

import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class newlabel1 {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://clientservicedev.yaarilabs.com";
		Response response = given()
		    .queryParam("avnkey", "5934@5181")
		    .header("Content-Type", "text/plain")
		    .body(payload.get_b2b_label())
		    .when()
		    .post("/siteadmin/labels/getlabel_avn")
		    .then()
		    .extract().response();

		if (response != null) {
			String jsonResponse = response.asString();
			System.out.println("Response:");
			System.out.println(jsonResponse);
		} else {
			System.out.println("Response is null.");
		}
	}
}
