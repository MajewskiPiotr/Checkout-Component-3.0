package core;

import java.util.ArrayList;
import java.util.Iterator;

import Dao.Product;
import Dao.ProductList;

public class Calculate {
	
	/**
	* This method sum price of all elements.
	* @param ArrayList of Product
	* @return double (total price)
	*/	
	public double totalPrice(ArrayList<Product> listOfProd){
		double totalPrice = 0;
		
		for (Product list: listOfProd){
			totalPrice+=list.getPrice();			
		}
		
		return totalPrice;		
	}
	
	
	/**
	* This return a price of given item.
	* @param Product
	* @return double (price)
	*/	
	public double actualPrice(Product prod){
		return prod.getPrice();
	}
	

	public void individualPrice(String productName, double price){
		Product newProd=null;
		
		ArrayList<Product> allProd = ProductList.returnAllProd();
		Iterator<Product> it = allProd.iterator();
		
		//Iterate over list of product and find product with the same name. If name is eguals we replace it
		//this could by done by Setter but this 
		while(it.hasNext()) {
			Product p = it.next();
			if (p.getName().equals(productName))
			{
				newProd = new Product(p.getName(), price, p.getUnit(), p.getSpecPrice());
				it.remove();
			}				
		}		
		if (newProd!=null) allProd.add(newProd);
		
				
		
		
	}
	
}
