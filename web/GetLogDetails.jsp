<%-- 
    Document   : GetLogDetails
    Created on : Feb 6, 2019, 12:32:11 PM
    Author     : axelzgiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<title>GetLogDetails</title>
</head>
<body>
	<jsp:include page="Template.jsp"></jsp:include>
	<td valign="top" rowspan="200" colspan="80">
		<table>
			<tr>
                            <td><jsp:include page="/GetLogDetails">
			<jsp:param name="title" value="GetLogDetails"/>
		</jsp:include>
		</table>
</body>
</html>