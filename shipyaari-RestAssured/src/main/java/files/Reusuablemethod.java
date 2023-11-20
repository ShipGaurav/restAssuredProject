package files;

import java.util.Random;

public class Reusuablemethod  {

	public static void random_order_id() {
	  
		 byte[] data = new byte[16];
		    new Random().nextBytes(data);
		    
		    Random randomNum = new Random();
		    int showMe = randomNum. nextInt(1000,100000);
		    
		   // payload obj =new payload();
		    
		   
		    String order_id=""+Integer.parseInt(""+showMe);
		  System.out.println("Order ID:"+order_id);
		  //  String encodedData = Base64.getEncoder().encodeToString(order_id.getBytes());
}
}
