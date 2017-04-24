package core;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import Dao.Product;
import Dao.ProductList;

public class Calculate {

	/**
	 * This method sum price of all elements.
	 * 
	 * @param ArrayList
	 *            of Product
	 * @return double (total price)
	 */
	public double totalPrice(ArrayList<Product> listOfProd) {
		double totalPrice = 0;

		for (Product list : listOfProd) {
			totalPrice += list.getPrice();
		}

		return totalPrice;
	}

	/**
	 * This return a price of given item.
	 * 
	 * @param Product
	 * @return double (price)
	 */
	public double actualPrice(Product prod) {
		return prod.getPrice();
	}

	/**
	 * Method change a price a productName to price. *
	 * @param list of products
	 * @param Product
	 * @return double (price)
	 */
	public void individualPrice(ArrayList<Product> list, String productName, double price) {

		// Iterate over list of product and find product with the same name. If
		// name is eguals we change price
		for (Product l : list) {
			if (l.getName() == productName) {
				l.setPrice(price);
			}
		}

	}

}
