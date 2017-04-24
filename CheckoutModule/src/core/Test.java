package core;

import java.util.ArrayList;

import Dao.Product;
import Dao.ProductList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Product> list = new ProductList().returnAllProd();
		
		System.out.println(list);
		
		Calculate calc = new Calculate();
		
		calc.individualPrice(list, "A", 1100);
		
		System.out.println(list);

	}

}
