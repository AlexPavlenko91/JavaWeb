<%--
  Created by IntelliJ IDEA.
  User: year1
  Date: 4/15/2021
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiplication table</title>
</head>
<style>
    table, th, td {
        border: 1px solid gray;
    }
</style>
<body>
<table>
    <%
        int num = Integer.parseInt(request.getParameter("num"));

        for (int i = 0; i < 3; i++) {
            out.println("<tr>");
            for (int j = 1; j < 10; j++) {
                if (i == 0) out.println("<td>" + num + "</td>");
                if (i == 1) out.println("<td>" + j + "</td>");
                if (i == 2) out.println("<th>" + (j * num) + "</th>");
            }
            out.println("</tr>");
        }
    %>
</table>
</body>
</html>
