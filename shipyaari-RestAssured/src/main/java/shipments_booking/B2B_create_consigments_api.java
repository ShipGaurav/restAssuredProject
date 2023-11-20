package shipments_booking;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import files.payload;
import io.restassured.RestAssured;

public class B2B_create_consigments_api {
    
   public static String[] partnerIds = {"8719"};
    static List<String> orderIds = new ArrayList<String>();

    static {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int showMe = random.nextInt(1000, 100000);
            String orderId = String.valueOf(showMe);
            orderIds.add(orderId);
        }
    }

    public static void main(String[] args) {

    	RestAssured.baseURI = "https://seller.shipyaari.com/";

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
                        .body(payload.B2b_create_consigments(encodedData, encodedPartnerId)).log().all()
                       
               .when()
                        .post("siteadmin/shipment_api/consignment_b2b_prod")
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
