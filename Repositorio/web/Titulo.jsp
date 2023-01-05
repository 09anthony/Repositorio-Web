<%-- 
    Document   : Titulo
    Created on : 15/11/2018, 03:01:37 AM
    Author     : ANTHONY and Blustin
--%>
<%@page import="java.sql.*" %>
<%@page import="VO.PdfVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.PdfDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Titulo</title>
    </head>
    <body>
        <div class="panel panel-success">
            <div class="panel-heading"><center><h2>Listar por Titulo</h2></center></div>
            <div class="panel-body">
                <form class="navbar-form navbar-left" action="" style="margin-left: 43%">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Ingrese Titulo" name="txt1">
                        <div class="input-group-btn">
                            <button class="btn btn-primary" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <center><table  class="table table-striped" style="width: 50%;">
                    <tr>
                        <td><label style=" color: #0000cc"><center>Codigo</center></label></td>
                        <td><label style=" color: #0000cc"><center>Nombre</center></label></td>
                        <td><label style=" color: #0000cc"><center>Autor</center></label></td>
                        <td><label style=" color: #0000cc"><center>Tema</center></label></td>
                        <td><label style=" color: #0000cc"><center>Fecha</center></label></td>
                        <td><label style=" color: #0000cc"><center>Libro</center></label></td>
                    </tr>
                    <%
                PdfDAO emp = new PdfDAO();
                PdfVO pdfvo = new PdfVO();
                String nom = (String) request.getParameter("txt1");
                if (nom == null || nom == ""){
                
                ArrayList<PdfVO> listar = emp.Listar_PdfVO();
            
            
                if (listar.size() > 0) {
                        for (PdfVO listar2 : listar) {
                            pdfvo = listar2;%>
            <tr>
                    <td><%=pdfvo.getCodigopdf()%></td>
                    <td><%=pdfvo.getNombrepdf()%></td>
                    <td><%=pdfvo.getAutor()%></td>
                    <td><%=pdfvo.getMateria()%></td>
                    <td><%=pdfvo.getFecha()%></td>
                    <td>
                        <%
                            if (pdfvo.getArchivopdf2() != null) {
                        %>
                        <a href="pdf?id=<%=pdfvo.getCodigopdf()%>" target="_blank"><img src="imagenes/mpdf.png" title="pdf"/></a>
                            <%
                                } else {
                                    out.print("Vacio");
                                }
                            %>
                    </td>
                </tr>
<%}
                    }
                        } else {
                            ArrayList<PdfVO> listar = emp.Listard_PdfVO(nom);
            
            
                if (listar.size() > 0) {
                        for (PdfVO listar2 : listar) {
                            pdfvo = listar2;
                %>
                <tr>
                    <td><%=pdfvo.getCodigopdf()%></td>
                    <td><%=pdfvo.getNombrepdf()%></td>
                    <td><%=pdfvo.getAutor()%></td>
                    <td><%=pdfvo.getMateria()%></td>
                    <td><%=pdfvo.getFecha()%></td>
                    <td>
                        <%
                            if (pdfvo.getArchivopdf2() != null) {
                        %>
                        <a href="pdf?id=<%=pdfvo.getCodigopdf()%>" target="_blank"><img src="imagenes/mpdf.png" title="pdf"/></a>
                            <%
                                } else {
                                    out.print("Vacio");
                                }
                            %>
                    </td>
                </tr>
                <%}
                    }
                }%>
                </table></center><br>
        </div>
    <center><a href="Principal.jsp">Volver</a></center> 
</body>
</html>
