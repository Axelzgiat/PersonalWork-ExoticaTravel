<%-- 
    Document   : LoginPage
    Created on : Feb 6, 2019, 12:31:21 PM
    Author     : axelzgiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>

</head>

<body>
	<jsp:include page="Template.jsp"></jsp:include>
	<td valign="top">
		<html:form method="post" action="/ValidateAction">
                 <%--   <%@include file="modal.jsp" %>--%>
                    	<table cellspacing='10' align='center'>
		<tr>
                    <td><font color='darkblue' size='+2'>Login Form</td>			
		</tr>
	</table>
	<table cellspacing='10' align='center'border='2' bordercolor='black'>
		<tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'><html:text property="userid"/>
		<tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'><html:password property="password"/>
		<tr><td bordercolor='white'>Role:<td COLSPAN='2'bordercolor='white'><html:radio property='r1' value="administrator"/>Administrator
		<tr><td bordercolor='white'><html:radio property='r1' value="customer"/>Customer
		<tr><td bordercolor='white'>
		<tr><td bordercolor='white'><input type="submit" value="Submit"/>
		<td bordercolor='white'><input type="reset" value="Reset"/>
</table>
</html:form>
        </body>