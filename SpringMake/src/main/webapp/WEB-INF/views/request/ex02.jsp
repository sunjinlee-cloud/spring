<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="param" method="post">
	id : <input type="text" name="id"><br>
	pw : <input type="text" name="pw"><br>
	name : <input type="text" name="name"><br>
	분야 : 
	<input type="checkbox" name="inter" value="java">java
	<input type="checkbox" name="inter" value="jsp">jsp
	<input type="checkbox" name="inter" value="spring">spring
	<br>
	<input type="submit" value="파라미터값 받기">
</form>

</body>
</html>