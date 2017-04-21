package Dao;

public class Product {
	
	String name;
	double price;
	int unit;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public double getSpecPrice() {
		return specPrice;
	}

	public void setSpecPrice(double specPrice) {
		this.specPrice = specPrice;
	}

	double specPrice;
	
	public Product(String name, double price, int unit, double specPrice) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.specPrice = specPrice;
	}
	
	
	
	

}
