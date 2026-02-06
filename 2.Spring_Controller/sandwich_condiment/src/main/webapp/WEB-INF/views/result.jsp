<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<c:forEach items="${condiments}" var="condiment">
    <p>${condiment}</p>
</c:forEach>
</body>
</html>
