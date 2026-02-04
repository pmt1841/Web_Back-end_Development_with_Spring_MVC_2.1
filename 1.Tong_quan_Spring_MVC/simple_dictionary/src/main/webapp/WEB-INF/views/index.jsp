<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/search" method="GET">
    <label for="en">Nhập từ tiếng Anh cần dịch</label>
    <input type="text" id="en" name="value">
    <input type="submit" value="Dịch">
</form>
<p>${result}</p>
</body>
</html>
