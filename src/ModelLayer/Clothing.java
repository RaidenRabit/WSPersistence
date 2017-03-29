package ModelLayer;

public class Clothing extends ProductType{
	private int size;
	private String colour;

	public Clothing(int productID, int miniStock, String name, String countryOfOrigin, double purchasePrice,
			double salesPrice, double rentPrice, int size,String colour) {
		super(productID, miniStock, name, countryOfOrigin, purchasePrice, salesPrice, rentPrice);
		this.setSize(size);
		this.setColour(colour);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
