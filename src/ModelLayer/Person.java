package ModelLayer;

public abstract class Person extends Address{

	private int id;
    private String name;
    private int phone;
    private String email;

    public Person(String name, int phone, String email, int id,String country, int zip, String street) {
    	super(country, zip, street);
    	this.name = name;
        this.phone = phone;
        this.email = email;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}