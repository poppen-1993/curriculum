<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// Servletのデータ受け取り
	request.setCharacterEncoding("UTF-8");
	String strServlet = (String) request.getAttribute("fromServlet");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PAGE</title>
</head>
<body>
	Servletでセットしたデータを表示 ：
	<%=strServlet%>
</body>
</html>