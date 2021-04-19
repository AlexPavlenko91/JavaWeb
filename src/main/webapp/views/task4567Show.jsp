<%@ page import="java.util.regex.Pattern" %>
<%@ page import="java.util.regex.Matcher" %><%--
  Created by IntelliJ IDEA.
  User: year1
  Date: 4/15/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hw13 task4567</title>
</head>
<body>
<h2>show 4567</h2>
<pre>
<%
    final String regex = "[+0-9 -:]";
    final String phone = (String) request.getAttribute("userPhone");
    int age = Integer.parseInt((String) request.getAttribute("userAge"));

    out.println("Name - " + request.getAttribute("userName"));
    out.println("Email - " + request.getAttribute("userEmail"));
    if (!phone.matches(regex)) out.println("Phone - " + phone);
    else out.println("You've entered wrong phone");
    if (age > 0 && age < 120)
        out.println("Age - " + age);
    else out.println("You've entered wrong age");
    String gender = (String) request.getAttribute("userGender");
    if (gender != null) {
        out.println("Gender - " + request.getAttribute("userGender"));
    }
    if (request.getAttribute("userSubscribe") != null) {
        out.println("You've subscribed on our mailing");
    }

%>
</pre>
</body>
</html>
