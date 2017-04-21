package Dao;

import java.util.ArrayList;

public class ProductList {

	static ArrayList<Product> allProducts = new ArrayList<>();
	
	public ProductList(){
		addProducts();
	}
	
	public void addProducts(){
		
		allProducts.add(new Product("A", 40 , 3 , 70));
		allProducts.add(new Product("B", 10 , 2 , 15));
		allProducts.add(new Product("C", 30 , 4 , 60));
		allProducts.add(new Product("D", 25 , 2 , 404));
	}
	
	public static ArrayList<Product> returnAllProd(){
		return allProducts;
		
	}
	
}
