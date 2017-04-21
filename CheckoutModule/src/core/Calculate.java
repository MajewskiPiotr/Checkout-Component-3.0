package core;

import java.util.ArrayList;

import Dao.Product;

public class Calculate {
	
	
	public double totalPrice(ArrayList<Product> listOfProd){
		double totalPrice = 0;
		
		for (Product list: listOfProd){
			totalPrice+=list.getPrice();			
		}
		
		return totalPrice;		
	}
	

}
