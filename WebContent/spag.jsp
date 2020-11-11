<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("result", "abcccc");
%>
<body>
${requestScope.result}
${names[0]}${names[1]}
${notice.id }${notice.title }
<br>
${result}
<br>
${param.n}
<br>
${header.accept}
<br>
${pageContext.request.method}
</body>
</html>