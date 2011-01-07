package edu.charu.model;

import java.sql.ResultSet;
import java.util.HashMap;

import edu.charu.dao.DBConnection;

public class ManageShoppingItems {

	private HashMap<Long, ShoppableItem> availableItems;
	private HashMap<Long, ShoppableItem> cartItems;
	
	public ManageShoppingItems()
	{
		try
		{
			availableItems = initAvailableItems();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private HashMap<Long, ShoppableItem> initAvailableItems() 
	{
		DBConnection dbConn;
		HashMap<Long, ShoppableItem> cart = new HashMap<Long, ShoppableItem>();
		try 
		{
			dbConn = new DBConnection();
			ResultSet rs = dbConn.executeStatement("SELECT * FROM	shopping_items");
			while(rs.next())
			{
				ShoppableItem item = new ShoppableItem();
				item.setItemId(rs.getLong("item_id"));
				item.setItemName(rs.getString("item_name"));
				item.setUnitPrice(rs.getFloat("unit_price"));
				cart.put(item.getItemId(), item);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cart;
	}

	public HashMap<Long, ShoppableItem> getAvailableItems() {
		return availableItems;
	}
	
	public HashMap<Long, ShoppableItem> getCartItems() {
		return cartItems;
	}
	
	public void setCartItems(HashMap<Long, ShoppableItem> cartItems) {
		this.cartItems = cartItems;
	}
}
