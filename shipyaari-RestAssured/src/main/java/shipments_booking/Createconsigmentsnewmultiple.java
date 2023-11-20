package shipments_booking;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

import io.restassured.RestAssured;
public class Createconsigmentsnewmultiple {

	    
	   public static String[] partnerIds = {"2", "9","6406","19467","5161","9008","2354","19537","19550","19657"};
	    static List<String> orderIds = new ArrayList<String>();

	    static {
	        Random random = new Random();
	        for (int i = 0; i < 10; i++) {
	            int showMe = random.nextInt(1000, 100000);
	            String orderId = String.valueOf(showMe);	
	            orderIds.add(orderId);
	        }
	    }

	    public static void main(String[] args) {

	        RestAssured.baseURI = "https://seller.shipyaari.com";

	        byte[] data = new byte[16];
	        new Random().nextBytes(data);
	        int countOrderID = 0;
	        for (String orderId : orderIds) {
	            System.out.println("Order ID: " + orderId);
	            String encodedData = Base64.getEncoder().encodeToString(orderId.getBytes());


	            String partner_id = partnerIds[countOrderID]; 
	            System.out.println("Partner ID :"+partner_id);
	            String encodedPartnerId = Base64.getEncoder().encodeToString(partner_id.getBytes());
	            try {
	            	
	                given().queryParam("avnkey", "5934@5181").header("Content-Type", "text/plain")
	                        .body("{\r\n"
	                        		+ "    \"from_company_name\": \"\",\r\n"
	                        		+ "    \"username\": \"cHJldm8=\",\r\n"
	                        		+ "    \"insurance\": \"eWVz\",\r\n"
	                        		+ "    \"order_id\": \""+orderId+"\",\r\n"
	                        		+ "    \"sub_order_id\": \"NDU2NTc2NTc=\",\r\n"
	                        		+ "    \"from_contact_number\": \"OTc2OTAxMzEzMA==\",\r\n"
	                        		+ "    \"from_pincode\": \"NjgyMDI0\",\r\n"
	                        		+ "    \"from_landmark\": \"TmVhciBHb2xkZW4gUGFsYWNlIEhvdGVs\",\r\n"
	                        		+ "    \"from_address\": \"MjAxIEthaWxhc2ggU2FkYW4sIFNlY3RvciA1LCBQbG90IDEyLCBTYW5wYWRhIEVhc3QNCg==\",\r\n"
	                        		+ "    \"from_address2\": \"TmF2aSBNdW1iYWkgTWFoYXJhc2h0cmE=\",\r\n"
	                        		+ "    \"to_pincode\": \"NDAwNzA4\",\r\n"
	                        		+ "    \"to_landmark\": \"T3BwLiBCcmFobWFzdGFuYW0sIExha3NobWlwdXJhbSBSb2FkLA==\",\r\n"
	                        		+ "    \"to_address\": \"SW5kZWV2YXJhbSwgS3VubnVtcHVyYW0sIEVkYXBwYWxseSBOb3J0aA==\",\r\n"
	                        		+ "    \"to_address2\": \"Q29jaGluIEtvY2hpIEtlcmFsYQ==\",\r\n"
	                        		+ "    \"customer_name\": \"SW5kcmFzZW5hbiBOYWly\",\r\n"
	                        		+ "    \"customer_email\": \"aWJuLm5haXJAZ21haWwuY29t\",\r\n"
	                        		+ "    \"customer_contact_no\": \"OTk0NzM1MjYyNg==\",\r\n"
	                        		+ "    \"customer_alternative_contact_no\": \"OTk0NzM1MjYyNg==\",\r\n"
	                        		+ "    \"ship_date\": \"MjAyMy8xMC8wNw==\",\r\n"
	                        		+ "    \"package_type\": \"SWRlbnRpY2Fs\",\r\n"
	                        		+ "    \"package_content\": \"cHJvZHVjdA==\",\r\n"
	                        		+ "    \"package_content_desc\": \"\",\r\n"
	                        		+ "    \"total_invoice_value\": \"MzIw\",\r\n"
	                        		+ "    \"collect_amt\": \"\",\r\n"
	                        		+ "    \"created_by\": \"NTkzNA==\",\r\n"
	                        		+ "    \"avnkey\": \"NTkzNEA1MTgx\",\r\n"
	                        		+ "    \"seller_label_logo\": \"\",\r\n"
	                        		+ "    \"merchant_gst\": \"QnJhbmRHU1Q%3D\",\r\n"
	                        		+ "    \"payment_mode\": \"b25saW5l\",\r\n"
	                        		+ "    \"package_name\": \"\",\r\n"
	                        		+ "    \"partner_id\": \""+encodedData+"\",\r\n"
	                        		+ "    \"no_of_packages\": \"MQ==\",\r\n"
	                        		+ "    \"product_data\": [\r\n"
	                        		+ "        {\r\n"
	                        		+ "            \"package_details\": [\r\n"
	                        		+ "                {\r\n"
	                        		+ "                    \"name\": \"Organic Channa Sattu - Pack of 2 (400g Each)\",\r\n"
	                        		+ "                    \"discount\": \"\",\r\n"
	                        		+ "                    \"total\": 320,\r\n"
	                        		+ "                    \"tax\": \"\",\r\n"
	                        		+ "                    \"qty\": \"1\",\r\n"
	                        		+ "                    \"sku\": \"MR-SATU2\",\r\n"
	                        		+ "                    \"hsn\": \"21069099\"\r\n"
	                        		+ "                }\r\n"
	                        		+ "            ],\r\n"
	                        		+ "            \"package_weight\": 0.5,\r\n"
	                        		+ "            \"package_length\": \"10\",\r\n"
	                        		+ "            \"package_width\": \"10\",\r\n"
	                        		+ "            \"package_height\": \"12\",\r\n"
	                        		+ "            \"total\": 320,\r\n"
	                        		+ "            \"total_qty\": 1,\r\n"
	                        		+ "            \"cod_amt\": \"\"\r\n"
	                        		+ "        }\r\n"
	                        		+ "    ],\r\n"
	                        		+ "    \"total_price_set\": 320,\r\n"
	                        		+ "    \"channel\": \"API\"\r\n"
	                        		+ "}")
	               .when()
	                        .post("/logistic/webservice/create_consignment_api.php")
	               .then().log().all()
	                        .assertThat().statusCode(200)
	                        .assertThat().body("status", equalTo("success"))
	                        .assertThat().body("client_order_id", notNullValue())
	                        .assertThat().body("tracking_number", notNullValue());
	            } catch (AssertionError e) {
	                System.out.println("Assertion failed for Partner ID: " + partner_id);
	                countOrderID++;
	                continue;
	            }
	            countOrderID++;
	            
	        }
	        							
	    }
	}


