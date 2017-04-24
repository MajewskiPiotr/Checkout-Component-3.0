package core;

import java.util.ArrayList;
import java.util.Iterator;


import Dao.Item;

public class Calculate {
	
	/**
	 * This method change price of Item.
	 * 
	 * @param ArrayList
	 *            of Product
	 * @return double (total price)
	 */
	public void multiPrice(ArrayList<Item> lista, String nameItemToChange) {

		int count = 0;
		int amount = 0;

		for (int i = 0; i < lista.size() - 1; i++) {
			// searching the same item in list
			if (lista.get(i).getName().equals(nameItemToChange)) {
				amount = lista.get(i).getUnit();
				count++;
			}
		}

		if (count >= amount) {

			for (Item l : lista) {
				l.setPrice(111);
			}
		}

	}

	/**
	 * This method sum price of all elements.
	 * 
	 * @param ArrayList
	 *            of Product
	 * @return double (total price)
	 */
	public double totalPrice(ArrayList<Item> listOfProd) {
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
	public double actualPrice(Item item) {
		return item.getPrice();
	}

	/**
	 * Method change a price a productName to price. *
	 * 
	 * @param list  of Item
	 * @param ItemName
	 * @return double (price)
	 */
	public void individualPrice(ArrayList<Item> list, String itemName, double price) {

		// Iterate over list of product and find product with the same name. If
		// name is eguals we change price
		for (Product l : list) {
			if (l.getName() == itemName) {
				l.setPrice(price);
			}
		}

	}

}
