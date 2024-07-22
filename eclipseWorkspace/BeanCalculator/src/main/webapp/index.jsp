<%@ page language="java" import="com.sag.tools.Calculator"%>

<jsp:useBean id='cal' class='com.sag.tools.Calculator'></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>square</title>
</head>
<body>
	<h1>
		The square of 5 :: <%= new Calculator().square(5) %><br />
		The square of 9 :: <%= new Calculator().square(9) %><br />
		The square of 10 :: <%= cal.square(10) %><br />
	</h1>
</body>
</html>