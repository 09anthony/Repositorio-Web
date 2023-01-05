<%-- 
    Document   : ValidateUser
    Created on : 22/11/2018, 05:51:44 PM
    Author     : Acmon
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    String userid = request.getParameter("txt1");    
    String pwd = request.getParameter("txt2");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upsjb",
            "root", "12345678");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from usuario where mail_usu='" + userid + "' and contra_usu='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
         response.sendRedirect("Alerta2.jsp");
    } else {
       response.sendRedirect("Alerta3.jsp");
    }
%>
    </body>
</html>
