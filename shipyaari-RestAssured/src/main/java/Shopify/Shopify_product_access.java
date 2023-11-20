package Shopify;

import static io.restassured.RestAssured.given;

//import files.payload;
import io.restassured.RestAssured;
//import io.restassured.response.Response;

public class Shopify_product_access {

	public static void main(String[] args) {
		//RestAssured.baseURI="https://{{api_key}}:{{api_password}}@{{store_name}}.myshopify.com/admin/oauth/access_scopes.json";
		RestAssured.baseURI="https://80dc193ce56bc7c30d0a0ae6a2dadcc4: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@2023-04.myshopify.com/admin/oauth/access_scopes.json";

	 given()
		      
		.when()
		    .post("baseURI")
		.then()
		     
		    .extract().response();
	 System.out.println("Response");
	}
	    
}

	
