<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int x = 3;
	int y = 4;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
	width:50px;
	height:50px;
}
.output{
	background: red;
	height:50px;
	font-weight: bold;
	text-align: right;
	padding: 0px 5px;
}

</style>
</head>
<body>
	calculation
	<form action="calcal2" method="post">
		<table>
			<tr>
				<td class="output" colspan="4">${3+4}</td>
			</tr>
			<tr>
				<td><input type="submit" name="op" value="CE"></td>
				<td><input type="submit" name="op" value="C"></td>
				<td><input type="submit" name="op" value="BS"></td>
				<td><input type="submit" name="op" value="?"></td>
			</tr>
			<tr>
				<td><input type="submit" name="val" value="7"></td>
				<td><input type="submit" name="val" value="8"></td>
				<td><input type="submit" name="val" value="9"></td>
				<td><input type="submit" name="op" value="X"></td>
			</tr>
			<tr>
				<td><input type="submit" name="val" value="4"></td>
				<td><input type="submit" name="val" value="5"></td>
				<td><input type="submit" name="val" value="6"></td>
				<td><input type="submit" name="op" value="-"></td>
			</tr>
			<tr>
				<td><input type="submit" name="val" value="1"></td>
				<td><input type="submit" name="val" value="2"></td>
				<td><input type="submit" name="val" value="3"></td>
				<td><input type="submit" name="op" value="+"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="val" value="0"></td>
				<td><input type="submit" name="dot" value="."></td>
				<td><input type="submit" name="op" value="="></td>
			</tr>
			
		</table>
		결과
	</form>
</body>
</html>