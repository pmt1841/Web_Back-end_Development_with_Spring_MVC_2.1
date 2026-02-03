<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<fieldset>
    <legend>Currency Converter</legend>
    <form method="POST" action="${pageContext.request.contextPath}/convert">
        <table border="1">
            <tr>
                <td><label for="usd">USD</label></td>
                <td><input type="text" id="usd" name="usd" value="${usd}"></td>
            </tr>
            <tr>
                <td><label for="rate">Rate</label></td>
                <td><input type="text" id="rate" name="rate" value="${rate}"></td>
            </tr>
            <tr>
                <td>VND</td>
                <td>${vnd}</td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
