package ModelLayer;

public class Equipment extends ProductType{
	private String type,description;

	public Equipment(int productID, int miniStock, String name, String countryOfOrigin, double purchasePrice,
			double salesPrice, double rentPrice,String type,String description) {
		super(productID, miniStock, name, countryOfOrigin, purchasePrice, salesPrice, rentPrice);
		this.setType(type);
		this.setDescription(description);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
