package edu.charu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class SummaryAction extends DispatchAction {
	

	public ActionForward modifyCart(ActionMapping mapping,
	ActionForm form,
	HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, Exception {
		return mapping.findForward("modifyCart");

	}

	public ActionForward checkout(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, Exception {
				return mapping.findForward("checkout");

			}

	
}
