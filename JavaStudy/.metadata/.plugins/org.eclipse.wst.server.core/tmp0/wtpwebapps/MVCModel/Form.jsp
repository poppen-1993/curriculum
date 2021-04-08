<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	<a>request.getContextPath() = 「<%= request.getContextPath() %>」</a>
<%-- <%= 変数名 %> 変数名をout.printf("変数名")と同じ --%>
		<Form action="<%= request.getContextPath() %>/Controller" method="post">
			Postで送信
			<br />
			<input type="text" name="fromJsp" value="jspでセット">
			<br />
			<input type="submit" value="実行" />
		</Form>
	</body>
</html>