package ModelLayer;

public class Employee extends Person{
	private String password;

    Employee(String name, int phone, String email, int id, String password,String country, int zip, String street) {
        super(name,phone,email,id,country,zip,street);
        this.password=password;
    }
    
    public void setPassword(String password){
    	this.password=password;
    }
    
    public String getPassword(){
    	return password;
    }
}