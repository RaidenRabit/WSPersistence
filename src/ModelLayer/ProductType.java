package ModelLayer;

public abstract class ProductType {
	private int productID,miniStock;
	private String name,countryOfOrigin;
	private double purchasePrice,salesPrice,rentPrice;
	
	public ProductType(int productID,int miniStock,String name,String countryOfOrigin,double purchasePrice,double salesPrice,double rentPrice){
		this.setProductID(productID);
		this.setMiniStock(miniStock);
		this.setName(name);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setPurchasePrice(purchasePrice);
		this.setSalesPrice(salesPrice);
		this.setRentPrice(rentPrice);
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getMiniStock() {
		return miniStock;
	}

	public void setMiniStock(int miniStock) {
		this.miniStock = miniStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
}
