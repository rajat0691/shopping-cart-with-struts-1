/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.charu;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import edu.charu.model.UserCredentials;

public class LoginForm extends org.apache.struts.validator.ValidatorForm {
    
	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;
    
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
	@SuppressWarnings("deprecation")
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) 
    {    
    	ActionErrors errors = new ActionErrors();        
    	UserCredentials uc = new UserCredentials();
    	if(!uc.authenticateUser(userName, password))
    	{
    		errors.add("invalidusernameorpassword", 
    				new ActionError("error.invalid.username.password"));
    	}
        return errors;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}