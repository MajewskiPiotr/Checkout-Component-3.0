package Dao;

public class Product {
	
	String name;
	double price;
	int unit;
	

	
	double specPrice;
	
	public Product(String name, double price, int unit, double specPrice) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.specPrice = specPrice;
	}
	public String getName() {
		return name;
	}

	
	public double getPrice() {
		return price;
	}

	

	public int getUnit() {
		return unit;
	}

	

	public double getSpecPrice() {
		return specPrice;
	}
	
	
	

}
