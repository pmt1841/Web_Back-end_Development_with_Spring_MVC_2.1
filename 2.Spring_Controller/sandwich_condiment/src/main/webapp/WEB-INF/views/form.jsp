<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<form method="POST" action="${pageContext.request.contextPath}/save">
    <input type="checkbox" name="condiments" value="Lettuce">Lettuce
    <input type="checkbox" name="condiments" value="Tomato">Tomato
    <input type="checkbox" name="condiments" value="Mustard">Mustard
    <input type="checkbox" name="condiments" value="Sprouts">Sprouts
    <input type="submit" value="Save">
</form>
</body>
</html>
