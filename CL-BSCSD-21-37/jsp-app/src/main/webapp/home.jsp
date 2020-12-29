<%@ page import="com.example.jsp_app.WebHelper" %>
<%@ page import="java.util.UUID" %>
<%@ page import="com.example.jsp_app.User" %><%--
  Created by IntelliJ IDEA.
  User: sadeesha
  Date: 12/29/20
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%
    String user = WebHelper.authenticate(request.getCookies(), session);

    if (user == null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && password != null) {
            User usrObj = WebHelper.authenticate(username, password);
            if (usrObj != null) {
                String sessionId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
                Cookie cookie = new Cookie("SES_ID", sessionId);
                response.addCookie(cookie);

                session.setAttribute(sessionId, username);

                out.print("<h1>Welcome " + username + "</h1>");
            } else {
                response.sendRedirect("login.jsp?auth=false");
            }
        } else {
            response.sendRedirect("login.jsp?auth=false");
        }
    } else {
        out.print("<h1>Welcome " + user + "</h1>");
    }
%>
</body>
</html>
