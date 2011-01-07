<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested"%>

<html:form action="/Cart" method="post">
<table>
	<nested:iterate name="CartForm" property="allItems" id="item">
	<tr>
	<td>
		<html:multibox property="cartItems" >
			<bean:write name="item"  property="itemId"/>
		</html:multibox>
	</td>
	<td>
		<nested:write  property="itemName"/>
	</td>
	<td>
		<nested:write  property="unitPrice"/>
	</td>
	<td>
		<nested:text  property="quantity" /> 
	</td>
	</tr>
	</nested:iterate>
</table>
<html:submit/>

</html:form>

