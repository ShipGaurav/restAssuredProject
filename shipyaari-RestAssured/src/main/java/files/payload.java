package files;

public class payload{
		
		public static String searchAvailabilityNew() {
			return "{\r\n"
		     		+ "    \"product_data\": [\r\n"
		     		+ "        {\r\n"
		     		+ "            \"prod_name\": \"product 1\",\r\n"
		     		+ "            \"prod_qty\": \"1\",\r\n"
		     		+ "            \"total_qty\": \"1\",\r\n"
		     		+ "            \"prod_weight\": \"1.5\",\r\n"
		     		+ "            \"prod_price\": \"50.00\",\r\n"
		     		+ "            \"total\": 50,\r\n"
		     		+ "            \"length\": \"1\",\r\n"
		     		+ "            \"width\": \"1\",\r\n"
		     		+ "            \"height\": \"1\",\r\n"
		     		+ "            \"package_weight\": 1.5\r\n"
		     		+ "        }\r\n"
		     		+ "    ],\r\n"
		     		+ "    \"pickup_pincode\": \"400001\",\r\n"
		     		+ "    \"delivery_pincode\": \"400064\",\r\n"
		     		+ "    \"weight\": 1.5,\r\n"
		     		+ "    \"paymentmode\": \"online\",\r\n"
		     		+ "    \"invoicevalue\": 50,\r\n"
		     		+ "    \"avnkey\": \"5934@5181\",\r\n"
		     		+ "    \"partner\": \"\",\r\n"
		     		+ "    \"service\": \"\",\r\n"
		     		+ "    \"length\": \"1\",\r\n"
		     		+ "    \"width\": \"1\",\r\n"
		     		+ "    \"height\": \"1\",\r\n"
		     		+ "    \"pod\": \"no\"\r\n"
		     		+ "}";
		}
		
		public static String createconsigments(String encodedData ,String ss) {
			
			return "{\r\n"
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
					+ "    \"partner_id\": \""+ss+"\",\r\n"
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
					+ "}";
		}
		
		public static String B2b_create_consigments(String encodedData ,String ss) {
			return "       {\r\n"
					+ "      	\"from_company_name\": \"TkVPTklDSEUgSURFQVMgQU5EIFNPTFVUSU9OUyBQUklWQVRFIExJTUlURUQ%3D\",\r\n"
					+ "      	\"username\": \"UHJldm8=\",\r\n"
					+ "      	\"insurance\": \"Tm8%3D\",\r\n"
					+ "      	\"order_id\": \""+encodedData+"\",\r\n"
					+ "      	\"from_contact_number\": \"OTgyMDM1MzkxOQ%3D%3D\",\r\n"
					+ "      	\"from_pincode\": \"MTEwMDA3\",\r\n"
					+ "      	\"from_landmark\": \"R2FsYSBubyA0NyAmIDQ4LA%3D%3D\",\r\n"
					+ "      	\"from_address\": \"U3V2aWRoaW5hYXRoIENvbXBsZXgoU2lkZGhpbmF0aCBDb21wbGV4KQ%3D%3D\",\r\n"
					+ "      	\"from_address2\": \"RGFwb2RhIFJvYWQsIEJoaXdhbmRpIC0gNDIxMzAy\",\r\n"
					+ "      	\"to_pincode\": \"MTEwMDA3\",\r\n"
					+ "      	\"to_landmark\": \"\",\r\n"
					+ "      	\"to_address\": \"U09OVSBUUkFERVJT\",\r\n"
					+ "      	\"to_address2\": \"R1VEQVJJIEJBWkFSIEJBTElBIDI3NzAwMQ%3D%3D\",\r\n"
					+ "      	\"customer_name\": \"U09OVQ%3D%3D\",\r\n"
					+ "      	\"customer_email\": \"Y2NAY2MuaW4%3D\",\r\n"
					+ "      	\"customer_contact_no\": \"OTQxNTMxMzU2NA%3D%3D\",\r\n"
					+ "      	\"company_name\": \"U09OVQ%3D%3D\",\r\n"
					+ "      	\"ship_date\": \"MjAyMS0wMi0wMg%3D%3D\",\r\n"
					+ "      	\"no_of_packages\": \"MQ%3D%3D\",\r\n"
					+ "      	\"package_type\": \"\",\r\n"
					+ "      	\"package_content\": \"U2Ftc3VuZyBGdWxseSBBdXRvbWF0aWMgdG9wIGxvYWRpbmcgV2FzaGluZyBNYWNoaW5l\",\r\n"
					+ "      	\"package_content_desc\": \"\",\r\n"
					+ "      	\"total_invoice_value\": \"MTYwMDA%3D\",\r\n"
					+ "      	\"created_by\": \"NTkzNA%3D%3D\",\r\n"
					+ "      	\"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "      	\"payment_mode\": \"T25saW5l\",\r\n"
					+ "      	\"package_name\": \"RWNvbm9teSBCMkI%3D\",\r\n"
					+ "      	\"partner_id\": \""+ss+"=\",\r\n"
					+ "      	\"pickup_gstin\": \"MTI1NDc4NTIxNDc1NTMzMg%3D%3D\",\r\n"
					+ "      	\"customer_gstin\": \"MTI1NDc4NTIxNDc1NTMzMQ%3D%3D\",\r\n"
					+ "      	\"product_data\": [{\r\n"
					+ "      		\"package_weight\": \"16\",\r\n"
					+ "      		\"package_length\": \"1\",\r\n"
					+ "      		\"package_width\": \"1\",\r\n"
					+ "      		\"package_height\": \"1\",\r\n"
					+ "      		\"package_details\": [{\r\n"
					+ "      			\"package_number\": \"Samsung Fully Automatic top loading Washing Machine\",\r\n"
					+ "      			\"name\": \"Samsung Fully Automatic top loading Washing Machine\",\r\n"
					+ "      			\"total\": \"16\",\r\n"
					+ "      			\"qty\": \"2\",\r\n"
					+ "      			\"sku\": \"\"\r\n"
					+ "      		}],\r\n"
					+ "      		\"total\": \"32\",\r\n"
					+ "      		\"total_qty\": \"2\"\r\n"
					+ "      	}],\r\n"
					+ "      	\"total_line_items_price_set\": 0,\r\n"
					+ "      	\"total_discounts_set\": \"\",\r\n"
					+ "      	\"total_shipping_price_set\": \"\",\r\n"
					+ "      	\"subtotal_price_set\": 0,\r\n"
					+ "      	\"total_price_set\": \"32\",\r\n"
					+ "      	\"channel\": \"B2B API\"\r\n"
					+ "      }";
		}
		
		public static String get_label(String labelTypes) {
			return "{\"avnkey\":\"5934@5181\",\"shipyaari_id\":[\"SHIPYAARI-2990934\"],\"html_flag\":\"html\"}";
		}
		
		public static String get_b2b_label() {
			return "{\"avnkey\":\"5934@5181\",\"shipyaari_id\":[\"SHIPYAARI-2990934\"],\"html_flag\":\"html\"}";
		}
		
		public static String reverse_consigments(String encodedData ,String ss) {
			return "{\r\n"
					+ "	\"from_company_name\": \"U2FyYW5nIENvbXBhbnk%3D\",\r\n"
					+ "	\"username\": \"cHJldm8%3D\",\r\n"
					+ "	\"insurance\": \"eWVz\",\r\n"
					+ "	\"order_id\": \""+encodedData+"\",\r\n"
					+ "	\"from_contact_number\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"from_landmark\": \"YmhoeXlodGo%3D\",\r\n"
					+ "	\"from_address\": \"QXJ1biBnYXVyIDE0OWR1cmdhIG5hZ2Fy\",\r\n"
					+ "	\"from_address2\": \"QXJ1biBnYXVyIDE0OWR1cmdhIG5hZ2Fy\",\r\n"
					+ "	\"customer_gstn_no\": \"\",\r\n"
					+ "	\"from_gst_no\": \"\",\r\n"
					+ "	\"to_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"to_landmark\": \"\",\r\n"
					+ "	\"to_address\": \"QUJDLDEyM05lYXIgd2VzdCByb2Fk\",\r\n"
					+ "	\"to_address2\": \"\",\r\n"
					+ "	\"customer_name\": \"VGVycmlsbCBSYXRo\",\r\n"
					+ "	\"customer_email\": \"dGhlby5sdWVpbHdpdHoxOUBnbWFpbC5jb20%3D\",\r\n"
					+ "	\"customer_contact_no\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"company_name\": \"\",\r\n"
					+ "	\"ship_date\": \"MjAyMy0wMy0xNw==\",\r\n"
					+ "	\"no_of_packages\": \"MQ%3D%3D\",\r\n"
					+ "	\"package_type\": \"aWRlbnRpY2Fs\",\r\n"
					+ "	\"package_content\": \"cHJvZHVjdA%3D%3D\",\r\n"
					+ "	\"package_content_desc\": \"\",\r\n"
					+ "	\"total_invoice_value\": \"NTAwMA%3D%3D\",\r\n"
					+ "	\"created_by\": \"NTkzNA%3D%3D\",\r\n"
					+ "	\"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "	\"payment_mode\": \"b25saW5l\",\r\n"
					+ "	\"package_name\": \"UmV2ZXJzZQ%3D%3D\",\r\n"
					+ "	\"partner_id\": \""+ss+"\",\r\n"
					+ "	\"product_data\": [{\r\n"
					+ "		\"package_details\": [{\r\n"
					+ "			\"package_number\": \"package_1\",\r\n"
					+ "			\"id\": \"P2-SSO1-2108201647280178_copy\",\r\n"
					+ "			\"name\": \"Grade 11-12 JEE SD Card\",\r\n"
					+ "			\"price\": \"10\",\r\n"
					+ "			\"total\": \"10\",\r\n"
					+ "			\"qty\": \"1\",\r\n"
					+ "			\"sku\": \"S4JM1112\",\r\n"
					+ "			\"hsn\": \"21069099\",\r\n"
					+ "			\"discount\": \"\",\r\n"
					+ "			\"tax\": \"\",\r\n"
					+ "			\"line_item\": null\r\n"
					+ "		}],\r\n"
					+ "        \"package_weight\": 5,\r\n"
					+ "		\"package_length\": \"28\",\r\n"
					+ "		\"package_width\": \"22\",\r\n"
					+ "		\"package_height\": \"13\",\r\n"
					+ "		\"total\": 10,\r\n"
					+ "		\"total_qty\": 1\r\n"
					+ "	}],\r\n"
					+ "	\"total_price_set\": \"10\",\r\n"
					+ "	\"channel\": \"API\"\r\n"
					+ "}";
		}
		
		public static String trackstatus() {
			return "{\r\n"
					+ "	\"avn_key\":\"5934@5181\",\r\n"
					+ "	\"tracking_number\" : [\"SYRC1110294230\"]\r\n"
					+ "}";
		}
		
		public static String trackdetails() {
			
		return"{\r\n"
				+ "	\"avn_key\":\"5934@5181\",\r\n"
				+ "	\"tracking_number\" : [\"1430910705434\"]\r\n"
				+ "}";
		}
		
		public static String b2b_tracking_number() {
			return"{\r\n"
					+ "    \"avn_key\":\"5934@5181\",\r\n"
					+ "    \"jobid\" : \"930164e2-f9da-44ce-8146-2e988927b40a\"\r\n"
					+ "}";
		}
		
		public static String manifest() {
			return "{\"avn_key\":\"5934@5181\",\"type\":\"tracking_number\","
					+ "\"ids\":[\"1430910730026\",\"1430910729691\"]}";
			
		}
		
		public static String Reattempt(){
			return "{\r\n"
					+ "    \"avn_key\": \"5934@5181\",\r\n"
					+ "    \"tracking_number\": \"9610379159\",\r\n"
					+ "    \"remark\": \"Re-attempt\",\r\n"
					+ "    \"update_address\": \"\",\r\n"
					+ "    \"delivery_date\": \"\"\r\n"
					+ "}";
		}
		
		public static String Return(){
			return "{\r\n"
					+ "    \"avn_key\": \"5934@5181\",\r\n"
					+ "    \"tracking_number\": \"9610379159\",\r\n"
					+ "    \"remark\": \"Return\",\r\n"
					+ "    \"update_address\": \"\",\r\n"
					+ "    \"delivery_date\": \"\"\r\n"
					+ "}";
		}
		
		public static String cancelapi() {
			return"{\"avn_key\":\"5934@5181\",\"ids\":[\"9734740671\"]}";
		}
		
		public static String recharge () {
			
			return "{\r\n"
					+ "    \"avn_key\":\"5934@5181\",\r\n"
					+ "    \"amount\":100\r\n"
					+ "}";
		}
		
		public static String pincodeAPI() {
			
			return"{\r\n"
					+ "    \"avn_key\":\"5934@5181\",\r\n"
					+ "    \"pickup_pincode\" : \"440022\",\r\n"
					+ "    \"delivery_pincode\" : \"110001\",\r\n"
					+ "    \"payment_mode\" : \"online\"\r\n"
					+ "}";
		}
		
		public static String featch_rate_hyperlocal() {
			return "{\r\n"
					+ "    \"avn_key\": \"5934@5181\",\r\n"
					+ "    \"partnerID\": \"\",\r\n"
					+ "    \"total_weight\": \"0.5\",\r\n"
					+ "    \"pickup_pincode\": \"400064\",\r\n"
					+ "    \"delivery_pincode\": \"400086\",\r\n"
					+ "    \"deliveryAddress_str\": \"Skyline Viha Wing A, Kirol Village, Ghatkopar West, Mumbai, Maharashtra, 400086\",\r\n"
					+ "    \"pickupAddress_str\": \"Baccha Party, Ground Floor, Goldline Business Center, Near Greens Restaurant Inside, Link Road, Ram Nagar, Malad West, Mumbai, Maharashtra, 400064\",\r\n"
					+ "    \"total_km\":  \"\",\r\n"
					+ "    \"payment_mode\":\"online\",\r\n"
					+ "    \"invoice_value\":\"100\"\r\n"
					+ "}";
		}
		
		public static String crate_consigments_hyperlocal(String encodedData ,String ss) {
			return"{\r\n"
					+ "    \"product_data\": [\r\n"
					+ "        {\r\n"
					+ "            \"package_weight\": 0.5,\r\n"
					+ "            \"package_length\": \"1\",\r\n"
					+ "            \"package_width\": \"1\",\r\n"
					+ "            \"package_height\": \"1\",\r\n"
					+ "            \"package_details\": [\r\n"
					+ "                {\r\n"
					+ "                    \"package_number\": \"0\",\r\n"
					+ "                    \"id\": \"5934\",\r\n"
					+ "                    \"name\": \"hyplerlocal product\",\r\n"
					+ "                    \"price\": \"30.0\",\r\n"
					+ "                    \"total\": \"30.0\",\r\n"
					+ "                    \"qty\": \"1\"\r\n"
					+ "                }\r\n"
					+ "            ],\r\n"
					+ "            \"total\": \"300.0\",\r\n"
					+ "            \"total_qty\": 1\r\n"
					+ "        }\r\n"
					+ "    ],\r\n"
					+ "    \"from_company_name\": \"aHlwZXJsb2NhbA==\",\r\n"
					+ "    \"username\": \"cHJldm8=\",\r\n"
					+ "    \"insurance\": \"WWVz\",\r\n"
					+ "    \"order_id\": \""+encodedData+"\",\r\n"
					+ "    \"from_contact_number\": \"NDg0OTM4NDAzNA==\",\r\n"
					+ "    \"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "    \"from_landmark\": \"UFZSIElOT1gsIEluZmluaXRpIE1hbGFkLCBJbmZpbml0aSBNYWxsIE1hbGFkLCBTdXJ2ZXkgTm8gNTA0LCBOZQ==\",\r\n"
					+ "    \"from_address\": \"UFZSIElOT1gsIEluZmluaXRpIE1hbGFkLCBJbmZpbml0aSBNYWxsIE1hbGFkLCBTdXJ2ZXkgTm8gNTA0LCBOZQ==\",\r\n"
					+ "    \"from_address2\": \"UFZSIElOT1gsIEluZmluaXRpIE1hbGFkLCBJbmZpbml0aSBNYWxsIE1hbGFkLCBTdXJ2ZXkgTm8gNTA0LCBOZQ==\",\r\n"
					+ "    \"to_pincode\": \"NDAwMDY0\",\r\n"
					+ "    \"to_landmark\": \"c3Nz\",\r\n"
					+ "    \"to_address\": \"c3Nz\",\r\n"
					+ "    \"to_address2\": \"c3Nz\",\r\n"
					+ "    \"customer_name\": \"c2VsdmEgZ2FuYXBhdGhp\",\r\n"
					+ "    \"customer_email\": \"c2VsdmFnYW5hcGF0aGkubWFuaUBjb2RpbmdtYXJ0LmNvbQ==\",\r\n"
					+ "    \"customer_contact_no\": \"ODY2NzIzODY0Mw==\",\r\n"
					+ "    \"company_name\": \"c2VsdmEgZ2FuYXBhdGhp\",\r\n"
					+ "    \"ship_date\": \"MjAyMy0wMi0wMw==\",\r\n"
					+ "    \"no_of_packages\": \"MQ==\",\r\n"
					+ "    \"package_type\": \"aWRlbnRpY2Fs\",\r\n"
					+ "    \"package_content\": \"cHJvZHVjdA==\",\r\n"
					+ "    \"package_content_desc\": \"cGFja2FnZSBmcm9tIGh5cGVybG9jYWw=\",\r\n"
					+ "    \"total_invoice_value\": \"NDE4LjA=\",\r\n"
					+ "    \"created_by\": \"NTkzNA==\",\r\n"
					+ "    \"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "    \"payment_mode\": \"b25saW5l\",\r\n"
					+ "    \"partner_id\": \""+ss+"\",\r\n"
					+ "    \"pickupAddress_str\": \"dGVzdCwgTXVtYmFpLCBNYWhhcmFzaHRyYSwgSW5kaWEgNDAwMDY0\",\r\n"
					+ "    \"deliveryAddress_str\": \"c3NzLCBzc3NzLCBNYWhhcmFzaHRyYSwgSW5kaWEgNDAwMDYz\",\r\n"
					+ "    \"total_wt\": \"MC41\"\r\n"
					+ "}";
			
		}
		
		public static String cncelled_api_hyperlocal() {
			
			return"{\r\n"
					+ "    \"partner_id\":\"18665\",\r\n"
					+ "    \"tracking_number\":\"15311490\",\r\n"
					+ "    \"avn_key\":\"5934@5181\"\r\n"
					+ "}";
		}

		public static String unicommerence_api(String encodedData) {
			
			return "{\r\n"
					+ "    \"serviceType\": \"Warehouse\",\r\n"
					+ "    \"handOverMode\": \"Pick\",\r\n"
					+ "    \"returnShipmentFlag\": \"false\",\r\n"
					+ "    \"Shipment\": {\r\n"
					+ "        \"code\": \"AVNB00212\",\r\n"
					+ "        \"SaleOrderCode\": \"5261058638141\",\r\n"
					+ "        \"orderCode\": \""+encodedData+"\",\r\n"
					+ "        \"channelCode\": \"SHOPIFY\",\r\n"
					+ "        \"channelName\": \"newshipyaaristore\",\r\n"
					+ "        \"invoiceCode\": \"INS0042\",\r\n"
					+ "        \"orderDate\": \"09-Feb-2023 08:57:29\",\r\n"
					+ "        \"fullFilllmentTat\": \"11-Feb-2023 08:57:29\",\r\n"
					+ "        \"weight\": \"1.000\",\r\n"
					+ "        \"length\": \"1\",\r\n"
					+ "        \"height\": \"1\",\r\n"
					+ "        \"breadth\": \"1\",\r\n"
					+ "        \"items\": [\r\n"
					+ "            {\r\n"
					+ "                \"name\": \"Bags - Default Title\",\r\n"
					+ "                \"description\": \"Bags - Default Title\",\r\n"
					+ "                \"quantity\": 1,\r\n"
					+ "                \"skuCode\": \"Bags01\",\r\n"
					+ "                \"itemPrice\": 120.00,\r\n"
					+ "                \"imageURL\": \"https://cdn.shopify.com/s/files/1/0719/0229/8429/products/bags.jpg?v\\u003d1675921974\",\r\n"
					+ "                \"tags\": \"\"\r\n"
					+ "            }\r\n"
					+ "        ]\r\n"
					+ "    },\r\n"
					+ "    \"deliveryAddressId\": \"\",\r\n"
					+ "    \"deliveryAddressDetails\": {\r\n"
					+ "        \"name\": \"Gaurav jadhav\",\r\n"
					+ "        \"email\": \"gaurav.jadhav@shipyaari.com\",\r\n"
					+ "        \"phone\": \"6020553393\",\r\n"
					+ "        \"address1\": \"AVN Business Soluction, Baccha Party Malad New Link Road Ram Nagar Malad W\",\r\n"
					+ "        \"address2\": \"Baccha Party Malad New Link Road Ram Nagar Malad W\",\r\n"
					+ "        \"pincode\": \"400064\",\r\n"
					+ "        \"city\": \"Mumbai\",\r\n"
					+ "        \"state\": \"Maharashtra\",\r\n"
					+ "        \"country\": \"India\"\r\n"
					+ "    },\r\n"
					+ "    \"pickupAddressId\": \"\",\r\n"
					+ "    \"pickupAddressDetails\": {\r\n"
					+ "        \"name\": \"avnbusinesssolutionspvtltd\",\r\n"
					+ "        \"email\": \"\",\r\n"
					+ "        \"phone\": \"8624968453\",\r\n"
					+ "        \"address1\": \"hygtfgh\",\r\n"
					+ "        \"address2\": \"\",\r\n"
					+ "        \"pincode\": \"560076\",\r\n"
					+ "        \"city\": \"Maharashtra\",\r\n"
					+ "        \"state\": \"Maharashtra\",\r\n"
					+ "        \"country\": \"India\",\r\n"
					+ "        \"gstin\": null\r\n"
					+ "    },\r\n"
					+ "    \"returnAddressId\": \"\",\r\n"
					+ "    \"returnAddressDetails\": {\r\n"
					+ "        \"pincode\": \"560076\",\r\n"
					+ "        \"country\": \"India\",\r\n"
					+ "        \"phone\": \"8624968453\",\r\n"
					+ "        \"address2\": \"\",\r\n"
					+ "        \"city\": \"Maharashtra\",\r\n"
					+ "        \"address1\": \"hygtfgh\",\r\n"
					+ "        \"name\": \"avnbusinesssolutionspvtltd\",\r\n"
					+ "        \"state\": \"Maharashtra\",\r\n"
					+ "        \"email\": \"\"\r\n"
					+ "    },\r\n"
					+ "    \"currencyCode\": \"INR\",\r\n"
					+ "    \"paymentMode\": \"COD\",\r\n"
					+ "    \"totalAmount\": \"120.00\",\r\n"
					+ "    \"collectableAmount\": \"20\",\r\n"
					+ "    \"courierName\": \"QW1hem9u\"\r\n"
					+ "}";
		}
		
		public static String login(){
			
			return "{\r\n"
					+ "  \"username\": \"Prevo\",\r\n"
					+ "  \"password\": \"Prevo@12\"\r\n"
					+ "}";
		}
		
		public static String ndr_remark_whatsapp() {
			
			return "{\r\n"
					+ "    \"comment\": \"\",\r\n"
					+ "    \"tracking_number\": \"1370622033613\",\r\n"
					+ "    \"remark\": \"Re-attempt\",\r\n"
					+ "    \"address\": \"\",\r\n"
					+ "    \"delivery_date\": \"\"\r\n"
					+ "}";
		}

	
}

