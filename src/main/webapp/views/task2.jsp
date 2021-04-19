<%--
  Created by IntelliJ IDEA.
  User: year1
  Date: 4/15/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hw13 task2</title>
</head>
<body>
<h3><%= "Task 2" %>
</h3>
<form name="multi" method="get" action="${pageContext.request.contextPath}/multiplicationTable">
    <label for="num">Input the number</label>
    <input type="number" name="num" id="num" required>
    <input type="submit" value="Show multiplication table">
</form>
</body>
</html>
