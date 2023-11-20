	package unicommerence_Api;
	import static io.restassured.RestAssured.given;
	import java.util.Base64;
	import java.util.Random;
	import files.payload;
	import io.restassured.RestAssured;
	import io.restassured.path.json.JsonPath;
	import io.restassured.response.Response;
	
	public class unicommerceapis_waybill {
	    
	    public static void main(String[] args) {
	        
	        String apiUrl = "https://seller.shipyaari.com/angularapi/login";
	        
	        Response response = RestAssured.given()
	            .body("{\r\n"
	                + "  \"username\": \"Prevo\",\r\n"
	                + "  \"password\": \"Dinesh@0904\"\r\n"
	                + "}")
	            .header("Content-Type", "text/plain")
	            .post(apiUrl)
	            .then()
	            .log().all()
	            .assertThat()
	            .statusCode(200)
	            .extract().response();
	
	        JsonPath jsonPath = response.jsonPath();
	        String app_token = jsonPath.get("result.app_token");
	        System.out.println(app_token);
	
	        RestAssured.baseURI = "https://seller.shipyaari.com";
	        byte[] data = new byte[16];
	        new Random().nextBytes(data);
	
	        Random randomNum = new Random();
	        int showMe = randomNum.nextInt(1000, 100000);
	
	        String order_id = "" + Integer.parseInt("" + showMe);
	        System.out.println("Order ID:" + order_id);
	        String encodedData = Base64.getEncoder().encodeToString(order_id.getBytes());
	
	        given().queryParam("avnkey", "5934@5181")
	            .header("Authorization", app_token)
	            .header("Content-Type", "text/plain")
	            .body(payload.unicommerence_api(encodedData))
	            .log().all()
	            .when()
	            .post("/avn_ci/siteadmin/unicommerceapis/waybill")
	            .then()
	            .log().all()
	            .assertThat()
	            .statusCode(200);
	    }
	}
