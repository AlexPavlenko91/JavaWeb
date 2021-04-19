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
    String userName = (String) request.getAttribute("userName");
    out.println(userName);
//    out.println(request.getParameter("userEmail"));
//    out.println(request.getParameter("userPhone"));
//    out.println(request.getParameter("userAge"));
//    if (request.getParameter("userSubscribe") != null) {
//        out.println("You've subscribed on our mailing");
//    }
    /*out.println(request.getParameter("name"));
    out.println(request.getParameter("email"));
    out.println(request.getParameter("phone"));
    out.println(request.getParameter("age"));
    if (request.getParameter("subscribe") != null) {
        out.println("You've subscribed on our mailing");
    }*/
%>
    <%=
    request.getParameter("userName")
    %>

   <%-- <div>${userName}</div>
    <div>${userEmail}</div>--%>
</pre>
</body>
</html>
