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
    <title>hw13 task4567</title>
</head>
<body>
<h2>show 4567</h2>
<pre>
<%

    out.println("Name - " + request.getAttribute("userName"));
    out.println("Email - " + request.getAttribute("userEmail"));
    out.println("Phone - " + request.getAttribute("userPhone"));
    out.println("Age - " + request.getAttribute("userAge"));
    String gender = (String) request.getAttribute("userGender");
    if (gender != null) {
        out.println("Gender - " + request.getAttribute("userGender"));
    }
    if (request.getAttribute("subscribe") != null) {
        out.println("You've subscribed on our mailing");
    }

%>
    <%--<%=
    request.getParameter("userName")
    %>--%>

   <%-- <div>${userName}</div>
    <div>${userEmail}</div>--%>
</pre>
</body>
</html>
