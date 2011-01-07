package edu.charu;

import java.util.ArrayList;
import java.util.List;

import edu.charu.model.ManageShoppingItems;
import edu.charu.model.ShoppableItem;

public class CartForm
extends org.apache.struts.action.ActionForm  {

// Instance Variables
	private static final long serialVersionUID = 1L;

private String[] cartItems ;
private List<ShoppableItem> allItems;
private int[] quantity;

private String summary;

public String getSummary() {
	return summary;
}

public void setSummary(String summary) {
	this.summary = summary;
}

public int[] getQuantity() {
	return quantity;
}

public void setQuantity(int[] quantity) {
	this.quantity = quantity;
}

public String[] getCartItems() {
	return this.cartItems;
}

public void setCartItems(String[] cartItems) {
this.cartItems = cartItems;
}

public List<ShoppableItem> getAllItems() {
	if(allItems==null)
	{
		ManageShoppingItems itemManager = new ManageShoppingItems();
		allItems =  new ArrayList<ShoppableItem>(itemManager.getAvailableItems().values());
	}
	return this.allItems;
}

public void setAllItems(List<ShoppableItem> mountains) {
this.allItems = mountains;
}
}
