<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>


<html:form action="/Summary">
<bean:write name="CartForm" property="summary"/>
<br/>
<html:submit property="nextToSummary" value="modifyCart">Modify Cart</html:submit>
<html:submit property="nextToSummary" value="checkout">Checkout</html:submit>
<html:reset/>
</html:form>


