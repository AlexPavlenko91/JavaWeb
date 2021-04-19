<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>hw13 task3</title>
</head>
<body>
<h3><%= "Task 3" %>
</h3>
<br/>
<form name="guess" method="get" action="${pageContext.request.contextPath}/guess_num-servlet">
    <label for="more">Is your number </label>
    <input type="submit" name="guess" value="more" id="more">

    <label for="less">, or </label>
    <input type="submit" name="guess" value="less" id="less">

    <label for="equals">, or </label>
    <input type="submit" name="guess" value="equals" id="equals">
    <b><label for="equals"> <%= request.getAttribute("num")%> </label></b>
</form>
<ul>
</ul>

</body>
</html>