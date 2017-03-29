package ModelLayer;

public abstract class Address{
	private String country,street;
	private int zip;
	
	public Address(String country,int zip,String street){
		this.country=country;
		this.zip=zip;
		this.street=street;
	}
	
	public void setCountry(String country){
		this.country=country;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setStreet(String street){
		this.street=street;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setZip(int zip){
		this.zip=zip;
	}
	
	public int getZip(){
		return zip;
	}

}
