<%-- 
    Document   : Hotels
    Created on : Feb 6, 2019, 12:32:44 PM
    Author     : axelzgiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="ct" uri="/WEB-INF/tlds/UserNameTLD.tld" %>
<!DOCTYPE html>
<html>
<head>
	<title>Hotels Page</title>
</head>
<body>
	<jsp:include page="Template.jsp"></jsp:include>
	<td valign="top" rowspan="200" colspan="80">
		<table>
			<tr>
			<td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Domestic Flights</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>International Flights</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Hotels</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Car Rentals</a></td>
			<td><font color='darkblue' size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Tour Packages</a></td>
                         <td width="350">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <ct:UserNameTagHandler/>
                        
			</tr>
		</table>
		<br>
		<font align='center' color='darkblue' size='+1'>Please select the hotel in which you would like to stay:<br><br>
			<form action='<c:url value="SessionServlet"></c:url>' name='MyForm' Method='POST'>
			<table cellspacing='10' align='center' border='2' border color='black'>
				<tr>
                                    <td bordercolor="white"><font color="black">Select Hotel:</font></td>
                                    <td bordercolor="white">
					<select name="HotelName">
					<option value="Sea View">Hotel Sea View</option>
					<option value="Sea Breeze">Hotel Sea Breeze</option>
                                            </select>
				</td>
			</tr>
			<tr>
			<td bordercolor="white">Number of days: </td>
                        <td bordercolor="white"><input type="text" name="numOfDays"</td>  
			</td></tr>
			<tr>
				
					<td bordercolor='white'>
                                            	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Next"></input></a>
					<input type="hidden" value="Hotels" name="PageName"/>
                                        </td></tr></table></form>
</body>
</html>