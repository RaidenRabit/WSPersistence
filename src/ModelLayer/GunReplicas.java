package ModelLayer;

public class GunReplicas extends ProductType{
	private double calibre;
	private String material;

	public GunReplicas(int productID, int miniStock, String name, String countryOfOrigin, double purchasePrice,
			double salesPrice, double rentPrice,double calibre,String material) {
		super(productID, miniStock, name, countryOfOrigin, purchasePrice, salesPrice, rentPrice);
		this.setCalibre(calibre);
		this.setCalibre(calibre);
	}

	public double getCalibre() {
		return calibre;
	}

	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
