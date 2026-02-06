<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h3>Calculator</h3>
<form method="POST" action="${pageContext.request.contextPath}/calculate">
    <input type="text" name="firstOp">
    <input type="text" name="secondOp">
    <br>
    <br>
    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="sub">Subtraction(-)</button>
    <button type="submit" name="operator" value="multi">Multiplication(x)</button>
    <button type="submit" name="operator" value="div">Division(/)</button>
    <p>${result}</p>
</form>
</body>
</html>
