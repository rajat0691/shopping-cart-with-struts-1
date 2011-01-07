/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.charu;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import edu.charu.model.ShoppableItem;

public class LoginForm extends org.apache.struts.validator.ValidatorForm {
    
	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;
    private HashMap<Long, ShoppableItem> cartItems;
    private HashMap<Long, ShoppableItem> availableItems;
    
    public LoginForm() 
    {
        super();
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (userName == null || userName.length() < 1) {
            errors.add("userName", new ActionMessage("error.userName.required"));
        }
        if (password == null || password.length() < 1) {
            errors.add("password", new ActionMessage("error.password.required"));
        }
        return errors;
    }

    public String getUserName() 
    {
        System.out.println("Inside getter "+userName);
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Inside setter "+userName);
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<Long, ShoppableItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(HashMap<Long, ShoppableItem> cartItems) {
		this.cartItems = cartItems;
	}

	public HashMap<Long, ShoppableItem> getAvailableItems() {
	return availableItems;
	}

	public void setAvailableItems(HashMap<Long, ShoppableItem> availableItems) {
	this.availableItems = availableItems;
	}

}