package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	Search_Service_Availability_API("https://seller.shipyaari.com/logistic/webservice/SearchAvailability_new.php"),
	create_consignment_API_B2C("https://seller.shipyaari.com/logistic/webservice/create_consignment_api.php"),
	create_consignment_API_B2B("https://seller.shipyaari.com/avn_ci/siteadmin/shipment_api/consignment_b2b_prod"),
	cancle_api("https://seller.shipyaari.com/avn_ci/siteadmin/cancel_consignment/");
		
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
