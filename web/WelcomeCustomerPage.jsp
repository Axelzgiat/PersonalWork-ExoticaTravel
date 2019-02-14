<%-- 
    Document   : WelcomeCustomerPage
    Created on : Feb 6, 2019, 12:32:01 PM
    Author     : axelzgiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
	<title>Customer Page</title>
</head>
<body>
	<jsp:include page="Template.jsp"></jsp:include>
	<td valign="top" rowspan="200" colspan="80">
		<table><tr>
			<td><font color='darkblue' size='+1'><a href='<c:url value="Flights.jsp"/>'>Domestic Flights</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="Flights.jsp"/>'>International Flights</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="Hotels.jsp"/>'>Hotels</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Car Rentals</a></td>
                        <td><font color='darkblue' size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Tour Packages</a></td>
                        <td width="350">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <ct:UserNameTagHandler/>
                        
			</tr>
				<tr>
					<td rowspan="200" colspan="80">
						<font color='darkblue' size='+2'>Welcome to the Exotica Travels Website!
		</table>
</body>
</html>