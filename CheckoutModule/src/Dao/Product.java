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
	
	public void setPrice(double price){
		this.price = price;
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", unit=" + unit + ", specPrice=" + specPrice + "]";
	}
	
	
	

}
