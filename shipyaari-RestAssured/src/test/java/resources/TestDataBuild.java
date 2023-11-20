package resources;

import pojo.SearchAvailability;

public class TestDataBuild {
	
	public SearchAvailability searchavailability(String pickup_pincode, String delivery_pincode, String weight, String paymentmode, String invoicevalue, String avnkey, String length, String width, String height)
	{
		SearchAvailability p =new SearchAvailability();
	  p.setPickup_pincode(pickup_pincode);
	  p.setDelivery_pincode(delivery_pincode);
	  p.setAvnkey(avnkey);
	  p.setInvoicevalue(invoicevalue);
	  p.setPaymentmode(paymentmode);
	  p.setWeight(weight);
	  p.setLength(length);
	  p.setWidth(width);
	  p.setHeight(height);
	
		return p;
	}
	
	
	
		public static String createconsigments(String encodedData ,String ss ,String channelname ) {
			
			return "{\r\n"
					+ "	\"from_company_name\": \"Z2F1cmF2\",\r\n"
					+ "	\"username\": \"UHJldm8=\",\r\n"
					+ "	\"insurance\": \"eWVz\",\r\n"
					+ "	\"order_id\": \""+encodedData+"\",\r\n"
					+ "	\"from_contact_number\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"from_landmark\": \"MzA0LzEgU2hyZWUgU29jaWV0eSBqYWkgbWFoYWthbCBSb2FkLCBuZWFyIGJhYmEgcmFtY2huYWRyYSBuYWdhciBvcHBvc2l0ZSB0byBnaGFuc2hhbSBuYWdhciBjb2xvbnkgcw=="
					+ "	\"from_address\": \"MzA0LzEgU2hyZWUgU29jaWV0eSBqYWkgbWFoYWthbCBSb2FkLCBuZWFyIGJhYmEgcmFtY2huYWRyYSBuYWdhciBvcHBvc2l0ZSB0byBnaGFuc2hhbSBuYWdhciBjb2xvbnkgcw=="
					+ "	\"from_address2\": \"MzA0LzEgU2hyZWUgU29jaWV0eSBqYWkgbWFoYWthbCBSb2FkLCBuZWFyIGJhYmEgcmFtY2huYWRyYSBuYWdhciBvcHBvc2l0ZSB0byBnaGFuc2hhbSBuYWdhciBjb2xvbnkgcw=="
					+ "	\"to_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"to_landmark\": \"T3BwLiBCcmFobWFzdGFuYW0sIExha3NobWlwdXJhbSBSb2FkLA==\",\r\n"
					+ "	\"to_address\": \"SW5kZWV2YXJhbSwgS3VubnVtcHVyYW0sIEVkYXBwYWxseSBOb3J0aA==\",\r\n"
					+ "	\"to_address2\": \"Q29jaGluIEtvY2hpIEtlcmFsYQ==\",\r\n"
					+ "	\"customer_name\": \"SW5kcmFzZW5hbiBOYWly\",\r\n"
					+ "	\"customer_email\": \"aWJuLm5haXJAZ21haWwuY29t\",\r\n"
					+ "	\"customer_contact_no\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "  \"customer_alternative_contact_no\":\"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"ship_date\": \"MjAyMy0wMy0wMQ==\",\r\n"
					+ "	\"package_type\": \"SWRlbnRpY2Fs\",\r\n"
					+ "	\"package_content\": \"cHJvZHVjdA==\",\r\n"
					+ "	\"package_content_desc\": \"\",\r\n"
					+ "	\"total_invoice_value\": \"MzIw\",\r\n"
					+ "    \"collect_amt\": \"MTAw\",\r\n"
					+ "	\"created_by\": \"NTkzNA==\",\r\n"
					+ "	\"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "	\"payment_mode\": \"Q09E\",\r\n"
					+ "    \"merchant_gst\":\"MjJBQUJDVTk2MDNSMVpY\",\r\n"
					+ "    \"seller_label_logo\":\"aHR0cHM6Ly93Ny5wbmd3aW5nLmNvbS9wbmdzLzEwMTIvNjkyL3BuZy10cmFuc3BhcmVudC1jb21wdXRlci1pY29ucy1saW5rZWRpbi1zb2NpYWwtbWVkaWEtc29jaWFsLW1lZGlhLXRleHQtcmVjdGFuZ2xlLWxvZ28tdGh1bWJuYWlsLnBuZw==\",\r\n"
					+ "	\"package_name\": \"\",\r\n"
					+ "	\"partner_id\": \""+ss+"\",\r\n"
					+ "	\"no_of_packages\": \"MQ==\",\r\n"
					+ "	\"product_data\": [{\r\n"
					+ "		\"package_details\": [{\r\n"
					+ "			\"name\": \"Organic Channa Sattu - Pack of 2 (400g Each)\",\r\n"
					+ "			\"total\": 320,\r\n"
					+ "			\"qty\": \"1\",\r\n"
					+ "			\"sku\": \"MR-SATU2\",\r\n"
					+ "			\"hsn\": \"21069099\"\r\n"
					+ "		}],\r\n"
					+ "		\"package_weight\": 0.5,\r\n"
					+ "		\"package_length\": \"10\",\r\n"
					+ "		\"package_width\": \"10\",\r\n"
					+ "		\"package_height\": \"12\",\r\n"
					+ "		\"total\": 320,\r\n"
					+ "		\"total_qty\": 1,\r\n"
					+ "        \"cod_amt\": \"\"\r\n"
					+ "	}],\r\n"
					+ "	\"total_price_set\": 320,\r\n"
					+ "	\"channel\": \""+channelname+"\"\r\n"
					+ "}";
		}
		
		public static String Multiple_create_consigemnts_b2c(String encodedData ,String ss ,String channelname) {
			
			return "{\r\n"
					+ "    \"from_company_name\": \"R2F1cmF2IGphZGhhdiBiMmI%3D\",\r\n"
					+ "    \"username\": \"cHJldm8=\",\r\n"
					+ "    \"insurance\": \"bm8%3D\",\r\n"
					+ "    \"order_id\": \""+encodedData+"\",\r\n"
					+ "    \"from_contact_number\": \"NjAyMDU1MzM5Mw%3D%3D\",\r\n"
					+ "    \"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "    \"from_landmark\": \"VW1hcml5YSBQYW4%3D\",\r\n"
					+ "    \"from_address\": \"MTYxNiBBbmRoZWxpIGJhZw%3D%3D\",\r\n"
					+ "    \"from_address2\": \"ZGRmZHNk\",\r\n"
					+ "    \"to_pincode\": \"NDAwMDY0\",\r\n"
					+ "    \"to_landmark\": \"VGVzdCBsYW5kbWFyaw%3D%3D\",\r\n"
					+ "    \"to_address\": \"VGVzdCBsYW5kbWFyaw%3D%3D\",\r\n"
					+ "    \"to_address2\": \"\",\r\n"
					+ "    \"customer_name\": \"bmV3IGN1c3RvbWVyciBubWFlIA%3D%3D\",\r\n"
					+ "    \"customer_email\": \"Y2NAY2MuaW4%3D\",\r\n"
					+ "    \"customer_contact_no\": \"NjAyMDU1MzM5Mw%3D%3D\",\r\n"
					+ "    \"company_name\": \"bmV3IGN1c3RvbWVyciBubWFlIA%3D%3D\",\r\n"
					+ "    \"ship_date\": \"MjAyMy0wOC0wMQ%3D%3D\",\r\n"
					+ "    \"no_of_packages\": \"Mg%3D%3D\",\r\n"
					+ "    \"package_type\": \"SWRlbnRpY2Fs\",\r\n"
					+ "    \"package_content\": \"cHJvZHVjdA%3D%3D\",\r\n"
					+ "    \"package_content_desc\": \"\",\r\n"
					+ "    \"total_invoice_value\": \"MTkw\",\r\n"
					+ "    \"created_by\": \"NTkzNA==\",\r\n"
					+ "    \"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "    \"payment_mode\": \"b25saW5l\",\r\n"
					+ "    \"package_name\": \"\",\r\n"
					+ "    \"partner_id\": \""+ss+"\",\r\n"
					+ "    \"product_data\": [\r\n"
					+ "        {\r\n"
					+ "            \"package_weight\": \"0.2\",\r\n"
					+ "            \"package_length\": \"1\",\r\n"
					+ "            \"package_width\": \"1\",\r\n"
					+ "            \"package_height\": \"1\",\r\n"
					+ "            \"package_details\": [\r\n"
					+ "                {\r\n"
					+ "                    \"package_number\": \"package_1\",\r\n"
					+ "                    \"id\": \"testeww23\",\r\n"
					+ "                    \"name\": \"TEST\",\r\n"
					+ "                    \"total\": \"100\",\r\n"
					+ "                    \"qty\": \"1\",\r\n"
					+ "                    \"sku\": \"\"\r\n"
					+ "                }\r\n"
					+ "            ],\r\n"
					+ "            \"total\": \"100\",\r\n"
					+ "            \"total_qty\": \"1\",\r\n"
					+ "            \"cod_amt\": \"0\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"package_weight\": \"0.3\",\r\n"
					+ "            \"package_length\": \"1\",\r\n"
					+ "            \"package_width\": \"1\",\r\n"
					+ "            \"package_height\": \"1\",\r\n"
					+ "            \"package_details\": [\r\n"
					+ "                {\r\n"
					+ "                    \"package_number\": \"package_2\",\r\n"
					+ "                    \"id\": \"testeww23\",\r\n"
					+ "                    \"name\": \"TEST\",\r\n"
					+ "                    \"total\": \"90\",\r\n"
					+ "                    \"qty\": \"1\",\r\n"
					+ "                    \"sku\": \"\"\r\n"
					+ "                }\r\n"
					+ "            ],\r\n"
					+ "            \"total\": \"90\",\r\n"
					+ "            \"total_qty\": \"1\",\r\n"
					+ "            \"cod_amt\": \"0\"\r\n"
					+ "        }\r\n"
					+ "    ],\r\n"
					+ "    \"total_line_items_price_set\": 0,\r\n"
					+ "    \"total_discounts_set\": \"\",\r\n"
					+ "    \"total_shipping_price_set\": \"\",\r\n"
					+ "    \"subtotal_price_set\": 0,\r\n"
					+ "    \"total_price_set\": \"190\",\r\n"
					+ "    \"channel\": \"\",\r\n"
					+ "    \"collect_amt\": \"\",\r\n"
					+ "    \"channel_id\": 0\r\n"
					+ "}";
		}
		
		public static String create_consignment_API_B2B(String encodedData ,String ss) {
			return "       {\r\n"
					+ "      	\"from_company_name\": \"TkVPTklDSEUgSURFQV\",\r\n"
					+ "      	\"username\": \"cHJldm8=\",\r\n"
					+ "      	\"insurance\": \"Tm8%3D\",\r\n"
					+ "      	\"order_id\": \""+encodedData+"\",\r\n"
					+ "      	\"from_contact_number\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "      	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "      	\"from_landmark\": \"VEVTVF9hY2NvdW50IHRlIHNhZCBzYWRzYWRzYWQ=\",\r\n"
					+ "      	\"from_address\": \"VEVTVF9hY2NvdW50IHRlIHNhZCBzYWRzYWRzYWQ=\",\r\n"
					+ "      	\"from_address2\": \"VEVTVF9hY2NvdW50IHRlIHNhZCBzYWRzYWRzYWQ=\",\r\n"
					+ "      	\"to_pincode\": \"MTEwMDIw\",\r\n"
					+ "      	\"to_landmark\": \"\",\r\n"
					+ "      	\"to_address\": \"VEVTVF9hY2NvdW50IHRlIHNhZCBzYWRzYWRzYWQ=\",\r\n"
					+ "      	\"to_address2\": \"VEVTVF9hY2NvdW50IHRlIHNhZCBzYWRzYWRzYWQ=\",\r\n"
					+ "      	\"customer_name\": \"U09OVQ%3D%3D\",\r\n"
					+ "      	\"customer_email\": \"Y2NAY2MuaW4%3D\",\r\n"
					+ "      	\"customer_contact_no\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "      	\"company_name\": \"U09OVQ%3D%3D\",\r\n"
					+ "      	\"ship_date\": \"MjAyMy0wNi02\",\r\n"
					+ "      	\"no_of_packages\": \"MQ%3D%3D\",\r\n"
					+ "      	\"package_type\": \"\",\r\n"
					+ "      	\"package_content\":	 \"U2Ftc3VuZyBGdWxseSBBdXRvbWF0aWMgdG9wIGxvYWRpbmcgV2FzaGluZyBNYWNoaW5l\",\r\n"
					+ "      	\"package_content_desc\": \"\",\r\n"
					+ "      	\"total_invoice_value\": \"MTYw%3D\",\r\n"
					+ "      	\"created_by\": \"NTkzNA%3D%3D\",\r\n"
					+ "      	\"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "      	\"payment_mode\": \"T25saW5l\",\r\n"
					+ "      	\"package_name\": \"RWNvbm9teSBCMkI%3D\",\r\n"
					+ "      	\"partner_id\": \""+ss+"\",\r\n"
					+ "      	\"pickup_gstin\": \"MTI1NDc4NTIxNDc1NTMzMg%3D%3D\",\r\n"
					+ "      	\"customer_gstin\": \"MTI1NDc4NTIxNDc1NTMzMQ%3D%3D\",\r\n"
					+ "      	\"product_data\": [{\r\n"
					+ "      		\"package_weight\": \"1\",\r\n"
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

		public static String get_label() {
			return "{\"avnkey\":\"5934@5181\",\"shipyaari_id\":[\"SHIPYAARI-3915081\"]}";
		}

		public static String get_b2b_label() {
			return "{\r\n"
					+ "  \"avnkey\": \"23592@19786\",\r\n"
					+ "  \"shipyaari_id\": [\r\n"
					+ "    \"SHIPYAARI-3886938\",\r\n"
					+ "    \"SHIPYAARI-3886934\",\r\n"
					+ "    \"SHIPYAARI-3886936\"\r\n"
					+ "\r\n"
					+ "  ]\r\n"
					+ "}";
		}

		public static String create_reverse_consigments(String encodedData ,String ss) {
			return "{\r\n"
					+ "	\"from_company_name\": \"U2FyYW5nIENvbXBhbnk%3D\",\r\n"
					+ "	\"username\": \"cHJldm8%3D\",\r\n"
					+ "	\"insurance\": \"eWVz\",\r\n"
					+ "	\"order_id\": \""+encodedData+"\",\r\n"
					+ "	\"from_contact_number\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"from_landmark\": \"VEVTVEFERFJFU1Mx\",\r\n"
					+ "	\"from_address\": \"VEVTVEFERFJFU1Mx\",\r\n"
					+ "	\"from_address2\": \"VEVTVEFERFJFU1Mx\",\r\n"
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
					+ "	\"ship_date\": \"MjAyMy0wNy0yMA==\",\r\n"
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
					+ "			\"price\": \"10000\",\r\n"
					+ "			\"total\": \"10000\",\r\n"
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
					+ "		\"total\": 10000,\r\n"
					+ "		\"total_qty\": 1\r\n"
					+ "	}],\r\n"
					+ "	\"total_price_set\": \"5000\",\r\n"
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

		public static String cancelapi(String tracking_number) {
			return"{\"avn_key\":\"5934@5181\",\"ids\":[\""+tracking_number+"\"]}";
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
					+ "	\"from_company_name\": \"VEVTVA%3D%3D\",\r\n"
					+ "	\"username\": \"cHJldm8%3D\",\r\n"
					+ "	\"insurance\": \"eWVz\",\r\n"
					+ "	\"order_id\": \""+encodedData+"\",\r\n"
					+ "	\"from_contact_number\": \"NjAyMDU1MzM5Mw%3D%3D\",\r\n"
					+ "	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"from_landmark\": \"\",\r\n"
					+ "	\"from_address\": \"QkogUGF0ZWwgUm9hZCwgS2V2YWwgVG93ZXIsIE1hbGFkIFdlc3Q%3D\",\r\n"
					+ "	\"from_address2\": \"\",\r\n"
					+ "	\"eway_bill_no\": \"\",\r\n"
					+ "	\"eway_bill_no_hsn_code\": \"\",\r\n"
					+ "	\"customer_gstn_no\": \"\",\r\n"
					+ "	\"from_gst_no\": \"\",\r\n"
					+ "	\"to_pincode\": \"NDAwMDAx\",\r\n"
					+ "	\"to_landmark\": \"\",\r\n"
					+ "	\"to_address\": \"QXJ1biBBdXRvbW9iaWxlcywgRm91cnRoIEZsb29yLCAgVmFyZGhhbWFuIENoYW1iZXIgS2FsYSBHaG9kYSBGb3J0LCAgTXVtYmFp\",\r\n"
					+ "	\"to_address2\": \"\",\r\n"
					+ "	\"customer_name\": \"U2FyYW5nIFNhcmFuZw%3D%3D\",\r\n"
					+ "	\"customer_email\": \"YWJjQGdtYWlsLmNvbQ%3D%3D\",\r\n"
					+ "	\"customer_contact_no\": \"OTIxMjEyMTIxMg%3D%3D\",\r\n"
					+ "	\"company_name\": \"ZmFraGZzYWs%3D\",\r\n"
					+ "	\"ship_date\": \"MjAyMy0wNy0yMQ%3D%3D\",\r\n"
					+ "	\"no_of_packages\": \"MQ%3D%3D\",\r\n"
					+ "	\"package_type\": \"aWRlbnRpY2Fs\",\r\n"
					+ "	\"package_content\": \"b25saW5l\",\r\n"
					+ "	\"package_content_desc\": \"\",\r\n"
					+ "	\"total_invoice_value\": \"MTIuMDA%3D\",\r\n"
					+ "	\"created_by\": \"NTkzNA%3D%3D\",\r\n"
					+ "	\"avnkey\": \"NTkzNEAyNTA5NA==\",\r\n"
					+ "	\"payment_mode\": \"b25saW5l\",\r\n"
					+ "	\"package_name\": \"\",\r\n"
					+ "	\"partner_id\": \""+ss+"\",\r\n"
					+ "	\"product_data\": [{\r\n"
					+ "		\"package_weight\": 1,\r\n"
					+ "		\"package_length\": \"1\",\r\n"
					+ "		\"package_width\": \"1\",\r\n"
					+ "		\"package_height\": \"1\",\r\n"
					+ "		\"package_details\": [{\r\n"
					+ "			\"package_number\": \"package_0\",\r\n"
					+ "			\"id\": \"TESOREREE\",\r\n"
					+ "			\"name\": \"Rrrrrrrr\",\r\n"
					+ "			\"price\": \"12.00\",\r\n"
					+ "			\"discount\": \"\",\r\n"
					+ "			\"total\": \"12.00\",\r\n"
					+ "			\"qty\": \"1\",\r\n"
					+ "			\"weight\": \"1.00\",\r\n"
					+ "			\"sku\": \"rrrrrrrr\",\r\n"
					+ "			\"hsn\": \"rrrrrrrr\",\r\n"
					+ "			\"tax\": \"0\",\r\n"
					+ "			\"line_item\": 0\r\n"
					+ "		}],\r\n"
					+ "		\"total\": 12,\r\n"
					+ "		\"total_qty\": 1\r\n"
					+ "	}],\r\n"
					+ "	\"total_line_items_price_set\": \"\",\r\n"
					+ "	\"total_discounts_set\": \"\",\r\n"
					+ "	\"total_shipping_price_set\": \"\",\r\n"
					+ "	\"subtotal_price_set\": \"\",\r\n"
					+ "	\"total_price_set\": \"12.00\",\r\n"
					+ "	\"channel_id\": \"\",\r\n"
					+ "	\"channel\": \"API\",\r\n"
					+ "	\"split\": \"\",\r\n"
					+ "	\"what3words\": \"\",\r\n"
					+ "	\"shipment_by\": \"MQ%3D%3D\",\r\n"
					+ "	\"pickupAddress_str\": \"QkogUGF0ZWwgUm9hZCwgS2V2YWwgVG93ZXIsIE1hbGFkIFdlc3QsIE11bWJhaSwgTWFoYXJhc2h0cmEuIFBpbi00MDAwNjQgKEluZGlhKQ%3D%3D\",\r\n"
					+ "	\"deliveryAddress_str\": \"QXJ1biBBdXRvbW9iaWxlcywgRm91cnRoIEZsb29yLCAgVmFyZGhhbWFuIENoYW1iZXIgS2FsYSBHaG9kYSBGb3J0LCAgTXVtYmFpLCA0MDAwMDE%3D\",\r\n"
					+ "	\"total_wt\": \"MQ%3D%3D\",\r\n"
					+ "	\"total_km\": \"\"\r\n"
					+ "}";

		}

		public static String cncelled_api_hyperlocal() {

			return"{\r\n"
					+ "    \"partner_id\":\"18665\",\r\n"
					+ "    \"tracking_number\":\"15311490\",\r\n"
					+ "    \"avn_key\":\"5934@5181\"\r\n"
					+ "}";
		}

		public static String unicommerence_api(String encodedData ) {
			

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
					+ "        \"address1\": \"Baccha Party Malad New Link Road Ram Nagar Malad W\",\r\n"
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
					+ "        \"phone\": \"6020553393\",\r\n"
					+ "        \"address1\": \"hygtfgh\",\r\n"
					+ "        \"address2\": \"\",\r\n"
					+ "        \"pincode\": \"400601\",\r\n"
					+ "        \"city\": \"Maharashtra\",\r\n"
					+ "        \"state\": \"Maharashtra\",\r\n"
					+ "        \"country\": \"India\",\r\n"
					+ "        \"gstin\": null\r\n"
					+ "    },\r\n"
					+ "    \"returnAddressId\": \"\",\r\n"
					+ "    \"returnAddressDetails\": {\r\n"
					+ "        \"pincode\": \"400601\",\r\n"
					+ "        \"country\": \"India\",\r\n"
					+ "        \"phone\": \"6020553393\",\r\n"
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
					+ "    \"courierName\": \"\"\r\n"
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
		
		public static String login() {

			return "{\r\n"
					+ "  \"username\": \"prevo\",\r\n"
					+ "  \"password\": \"Dinesh@0904\"\r\n"
					+ "}";
		}
		
public static String maskingShipments(String encodedData ,String ss ,String channelname ) {
			
			return "{\r\n"
					+ "	\"from_company_name\": \"Z2F1cmF2\",\r\n"
					+ "	\"username\": \"UHJldm8=\",\r\n"
					+ "	\"insurance\": \"eWVz\",\r\n"
					+ "	\"order_id\": \""+encodedData+"\",\r\n"
					+ "	\"from_contact_number\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"from_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"from_landmark\": \"TmVhciBHb2xkZW4gUGFsYWNlIEhvdGVs\",\r\n"
					+ "	\"from_address\": \"MjAxIEthaWxhc2ggU2FkYW4sIFNlY3RvciA1LCBQbG90IDEyLCBTYW5wYWRhIEVhc3QNCg==\",\r\n"
					+ "	\"from_address2\": \"TmF2aSBNdW1iYWkgTWFoYXJhc2h0cmE=\",\r\n"
					+ "	\"to_pincode\": \"NDAwMDY0\",\r\n"
					+ "	\"to_landmark\": \"T3BwLiBCcmFobWFzdGFuYW0sIExha3NobWlwdXJhbSBSb2FkLA==\",\r\n"
					+ "	\"to_address\": \"SW5kZWV2YXJhbSwgS3VubnVtcHVyYW0sIEVkYXBwYWxseSBOb3J0aA==\",\r\n"
					+ "	\"to_address2\": \"Q29jaGluIEtvY2hpIEtlcmFsYQ==\",\r\n"
					+ "	\"customer_name\": \"SW5kcmFzZW5hbiBOYWly\",\r\n"
					+ "	\"customer_email\": \"aWJuLm5haXJAZ21haWwuY29t\",\r\n"
					+ "	\"customer_contact_no\": \"NjAyMDU1MzM5Mw==\",\r\n"
					+ "  \"customer_alternative_contact_no\":\"NjAyMDU1MzM5Mw==\",\r\n"
					+ "	\"ship_date\": \"MjAyMy0wMy0wMQ==\",\r\n"
					+ "	\"package_type\": \"SWRlbnRpY2Fs\",\r\n"
					+ "	\"package_content\": \"cHJvZHVjdA==\",\r\n"
					+ "	\"package_content_desc\": \"\",\r\n"
					+ "	\"total_invoice_value\": \"MzIw\",\r\n"
					+ "    \"collect_amt\": \"MTAw\",\r\n"
					+ "	\"created_by\": \"NTkzNA==\",\r\n"
					+ "	\"avnkey\": \"NTkzNEA1MTgx\",\r\n"
					+ "	\"payment_mode\": \"Q09E\",\r\n"
					+ "    \"merchant_gst\":\"MjJBQUJDVTk2MDNSMVpY\",\r\n"
					+ "    \"seller_label_logo\":\"aHR0cHM6Ly93Ny5wbmd3aW5nLmNvbS9wbmdzLzEwMTIvNjkyL3BuZy10cmFuc3BhcmVudC1jb21wdXRlci1pY29ucy1saW5rZWRpbi1zb2NpYWwtbWVkaWEtc29jaWFsLW1lZGlhLXRleHQtcmVjdGFuZ2xlLWxvZ28tdGh1bWJuYWlsLnBuZw==\",\r\n"
					+ "	\"package_name\": \"\",\r\n"
					+ "	\"partner_id\": \""+ss+"\",\r\n"
					+ "	\"no_of_packages\": \"MQ==\",\r\n"
					+ "	\"product_data\": [{\r\n"
					+ "		\"package_details\": [{\r\n"
					+ "			\"name\": \"Organic Channa Sattu - Pack of 2 (400g Each)\",\r\n"
					+ "			\"total\": 320,\r\n"
					+ "			\"qty\": \"1\",\r\n"
					+ "			\"sku\": \"MR-SATU2\",\r\n"
					+ "			\"hsn\": \"21069099\"\r\n"
					+ "		}],\r\n"
					+ "		\"package_weight\": 0.5,\r\n"
					+ "		\"package_length\": \"10\",\r\n"
					+ "		\"package_width\": \"10\",\r\n"
					+ "		\"package_height\": \"12\",\r\n"
					+ "		\"total\": 320,\r\n"
					+ "		\"total_qty\": 1,\r\n"
					+ "        \"cod_amt\": \"\"\r\n"
					+ "	}],\r\n"
					+ "	\"total_price_set\": 320,\r\n"
					+ "	\"channel\": \""+channelname+"\"\r\n"
					+ "}";
		}

		
	
}


