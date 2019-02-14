<%-- 
    Document   : RegistrationErrors
    Created on : Feb 10, 2019, 10:12:35 AM
    Author     : axelzgiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose,dtd">
<html>
    <head>
          </head>
          <body>
        <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top" rowspan="200" colspan="80">
        <table><tr>
           
                <td>
                <c:set var="message" value="${requestScope.errMsg}"/>
                <font color='red' size="+2"><c:out value="${message}"/>
                </font></td></tr>
           

        </table>
    </body>
</html>
