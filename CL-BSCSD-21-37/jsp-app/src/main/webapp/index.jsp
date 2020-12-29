<%@ page import="com.example.jsp_app.WebHelper" %>
<%@ page import="com.example.jsp_app.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<%
    String greeting = WebHelper.getGreeting();
    out.print(greeting);

    Student[] students = WebHelper.getStudents();

    out.print("<table>");
    out.print("<tr><th>ID</th><th>Name</th><th>NIC</th></tr>");
    for (Student student : students) {
        out.print("<tr>");
        out.print("<td>" + student.getId() + "</td>");
        out.print("<td>" + student.getName() + "</td>");
        out.print("<td>" + student.getNic() + "</td>");
        out.print("<tr>");
    }
    out.print("</table>");

    out.print("<br>");

    out.print("<table id='student-table' class='display'>");
    out.print("<thead>");
    out.print(
            "<tr>" +
                "<th>ID</th>" +
                "<th>Name</th>" +
                "<th>NIC</th>" +
            "</tr>"
    );
    out.print("</thead>");
    out.print("<tbody>");
    for (Student student : students) {
        out.print("<tr>");
        out.print("<td>" + student.getId() + "</td>");
        out.print("<td>" + student.getName() + "</td>");
        out.print("<td>" + student.getNic() + "</td>");
        out.print("</tr>");
    }
    out.print("</tbody>");
    out.print("</table>");

    out.print("<br>");
    out.print("<a href=\"login.jsp\">Login</a>");
%>
<script>
    $(document).ready( function () {
        $('#student-table').DataTable();
    } );
</script>
</body>
</html>