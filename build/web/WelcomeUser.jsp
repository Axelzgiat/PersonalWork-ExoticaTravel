<%-- 
    Document   : WelcomeUser
    Created on : Feb 9, 2019, 10:55:13 PM
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
        <table>
            <tr>
                <td>
                <c:set var="message" value="${requestScope.NewUser}"/>
                <font color='darkblue' size="+2">Welcome to Exotica travels
                    <c:out value="${message}"/>. You have registered successfully.
            </tr>

        </table>
    </body>
</html>
