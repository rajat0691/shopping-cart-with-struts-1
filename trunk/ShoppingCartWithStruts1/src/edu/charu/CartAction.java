package edu.charu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import edu.charu.model.ShoppableItem;

/**
* A simple Action for Checkbox test.
*
*/
public  class CartAction extends Action {

public ActionForward execute(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws ServletException, Exception {

	String[] cartItems = ((CartForm) form).getCartItems();

	List<ShoppableItem> allItems = ((CartForm) form).getAllItems();
	
	int[] quantities = ((CartForm) form).getQuantity();
	
	String summary = getSummary(allItems, cartItems, quantities);

	((CartForm) form).setSummary(summary);
	
//Save the htmlString in the session for later...
	HttpSession session = request.getSession();
	session.setAttribute("cartItems", cartItems);
	

return (mapping.findForward("success"));
}

private String getSummary(List<ShoppableItem> allItems, String[] cartItems,
		int[] quantities) {
	
	String summaryString = "";
	HashSet<String> setOfItems = new HashSet<String>(Arrays.asList(cartItems));
	int count = 0;
	for(ShoppableItem item: allItems)
	{
		if(setOfItems.contains(item.getItemId()+""))
		{
			summaryString += item.getItemName() + " : " + 
			item.getQuantity()*item.getUnitPrice() + " | "; 
		}
		count++;
	}
	return summaryString;
}
}
