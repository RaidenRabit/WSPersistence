package ModelLayer;

public class Supplier extends Person {
	private String website;
	
	public Supplier(String name, int phone, String email, int id, String website,String country, int zip, String street) {
		super(name, phone, email, id,country,zip,street);
		this.website=website;
	}
	
	public void setWebsite(String website){
		this.website=website;
	}
	
	public String getWebsite(){
		return website;
	}

}
