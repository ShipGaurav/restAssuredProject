package crearte_consigemnt_pincodeupdate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

import io.restassured.RestAssured;
public class partner_pickup_not_servicieble {


		   public static String[] partnerIds = {"2354", "9","19467","9008","19537","19550","2","6406"};
		    static List<String> orderIds = new ArrayList<String>();

		    static {
		        Random random = new Random();
		        for (int i = 0; i < 10; i++) {
		            int showMe = random.nextInt(1000, 100000);
		            String orderId = String.valueOf(showMe);	
		            orderIds.add(orderId);
		        }
		    }
		    //test
		    //test

		    public static void main(String[] args) {

		        RestAssured.baseURI = "https://staging.shipyaari.com";

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
		                        		+ "    \"channel\": \"API\",\r\n"
		                        		+ "    \"avnkey\": \"NTkzNEA1MTgx\",\r\n"
		                        		+ "    \"created_by\": \"NTkzNA==\",\r\n"
		                        		+ "    \"customer_name\": \"TmF3YXogYmhhdCBOYXdheiBiaGF0\",\r\n"
		                        		+ "    \"customer_email\": \"YmhhdG5hd2F6ODM1QGdtYWlsLmNvbQ==\",\r\n"
		                        		+ "    \"customer_contact_no\": \"OTE0OTQwNjU4MQ==\",\r\n"
		                        		+ "    \"from_contact_number\": \"OTMyMTgyMTA5NA==\",\r\n"
		                        		+ "    \"from_pincode\": \"NTMyMTI1\",\r\n"
		                        		+ "    \"from_landmark\": \"bmVhcmJ5\",\r\n"
		                        		+ "    \"from_address\": \"Yy9vIFByb3pvIERpc3RyaWJ1dGlvbiBQdnQgTHRkLCBCdWlsZGluZyBCLEluZmluaXR5IExvZ2lwYXJrLEthbHlhbiBQYWRnaGEgUm9hZA==\",\r\n"
		                        		+ "    \"from_address2\": null,\r\n"
		                        		+ "    \"insurance\": null,\r\n"
		                        		+ "    \"to_pincode\": \"NTMyMTI1\",\r\n"
		                        		+ "    \"to_landmark\": \"bmVhcmJ5\",\r\n"
		                        		+ "    \"to_address\": \"RGFzaGlwb3JhIHNob3BpYW4ga2FzaG1pcg==\",\r\n"
		                        		+ "    \"to_address2\": null,\r\n"
		                        		+ "    \"payment_mode\": \"b25saW5l\",\r\n"
		                        		+ "    \"package_name\": \"\",\r\n"
		                        		+ "    \"partner_id\": \""+encodedPartnerId+"\",\r\n"
		                        		+ "    \"no_of_packages\": \"MQ==\",\r\n"
		                        		+ "    \"from_company_name\": \"U1BPUlRBIFRFQ0hOT0xPR0lFUyBQUklWQVRFIExJTUlURUQ=\",\r\n"
		                        		+ "    \"username\": \"cHJldm8=\",\r\n"
		                        		+ "    \"order_id\": \""+encodedData+"\",\r\n"
		                        		+ "    \"ship_date\": \"MjAyMy0xMC0zMVQwNjozMDowMFo=\",\r\n"
		                        		+ "    \"package_type\": null,\r\n"
		                        		+ "    \"package_content\": null,\r\n"
		                        		+ "    \"package_content_desc\": null,\r\n"
		                        		+ "    \"total_invoice_value\": \"MTIxNC4w\",\r\n"
		                        		+ "    \"total_price_set\": 1214,\r\n"
		                        		+ "    \"return_name\": \"U1BPUlRBIFRFQ0hOT0xPR0lFUyBQUklWQVRFIExJTUlURUQ=\",\r\n"
		                        		+ "    \"return_landmark\": \"bmVhcmJ5\",\r\n"
		                        		+ "    \"return_address1\": \"Yy9vIFByb3pvIERpc3RyaWJ1dGlvbiBQdnQgTHRkLCBCdWlsZGluZyBCLEluZmluaXR5IExvZ2lwYXJrLEthbHlhbiBQYWRnaGEgUm9hZA==\",\r\n"
		                        		+ "    \"return_address2\": null,\r\n"
		                        		+ "    \"return_pincode\": \"NDIxMzAy\",\r\n"
		                        		+ "    \"return_mobile_number\": \"OTMyMTgyMTA5NA==\",\r\n"
		                        		+ "    \"sub_order_id\": \"RkMxMDAzOTY1NzI=\",\r\n"
		                        		+ "    \"customer_alternative_contact_no\": null,\r\n"
		                        		+ "    \"collect_amt\": \"MC4w\",\r\n"
		                        		+ "    \"seller_label_logo\": null,\r\n"
		                        		+ "    \"merchant_gst\": \"MjdBQUdDQTQ4NTRLMVpE\",\r\n"
		                        		+ "    \"company_name\": null,\r\n"
		                        		+ "    \"customer_gstn_no\": null,\r\n"
		                        		+ "    \"from_gst_no\": null,\r\n"
		                        		+ "    \"product_data\": [\r\n"
		                        		+ "        {\r\n"
		                        		+ "            \"package_weight\": 0.21,\r\n"
		                        		+ "            \"package_length\": \"35\",\r\n"
		                        		+ "            \"package_width\": \"25\",\r\n"
		                        		+ "            \"package_height\": \"12\",\r\n"
		                        		+ "            \"total\": 1299,\r\n"
		                        		+ "            \"total_qty\": 1,\r\n"
		                        		+ "            \"package_details\": [\r\n"
		                        		+ "                {\r\n"
		                        		+ "                    \"name\": \"SG Men FIT RUN Black Sports Shoes\",\r\n"
		                        		+ "                    \"discount\": null,\r\n"
		                        		+ "                    \"total\": 1299,\r\n"
		                        		+ "                    \"tax\": null,\r\n"
		                        		+ "                    \"qty\": \"1\",\r\n"
		                        		+ "                    \"sku\": \"FCSFM1501SV\",\r\n"
		                        		+ "                    \"hsn\": null,\r\n"
		                        		+ "                    \"line_item\": null,\r\n"
		                        		+ "                    \"id\": null,\r\n"
		                        		+ "                    \"package_number\": null,\r\n"
		                        		+ "                    \"price\": \"1299.0\"\r\n"
		                        		+ "                }\r\n"
		                        		+ "            ],\r\n"
		                        		+ "            \"cod_amt\": \"0.0\"\r\n"
		                        		+ "        }\r\n"
		                        		+ "    ]\r\n"
		                        		+ "}")
		               .when()
		                        .post("/webservice/create_consignment_api.php")
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
