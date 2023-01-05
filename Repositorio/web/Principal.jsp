<%-- 
    Document   : Principal
    Created on : 11/11/2018, 06:44:22 PM
    Author     : ANTHONY
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Santa Maria</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <header>
            <div id="header">
                <H1>REPOSITORIO WEB</H1>
            </div>
        </header>
        <div><img src="imagenes/libros.jpg" alt="" id="imagen"/></div>
        <ul id="menu">
            <li><a style="color: #0000cc" href="ComunidadyColecciones.jsp">Comunidades y Colecciones</a></li><br>
            <li><a style="color: #0000cc" href="FechadePublicacion.jsp" >Fecha de Publicación</a></li><br>
            <li><a style="color: #0000cc" href="Autores.jsp">Autor</a></li><br>
            <li><a style="color: #0000cc" href="Titulo.jsp">Titulo</a></li><br>
            <li><a style="color: #0000cc" href="Materia.jsp">Materia</a></li><br>
            <li><img src="imagenes/Logosantamaria2.png" alt="" id="icono"/></li>        
        </ul>

        <ul id="map">
            <li><a style="color: #0000cc">Ubicación</a></li><br>
            <li><iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15600.499347243867!2d-77.0085325!3d-12.1719032!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x7f93e792bf13389b!2sColegio+%22Santa+Maria+de+Matellini%22!5e0!3m2!1ses-419!2spe!4v1542147718447" width="400" height="400" frameborder="0" style="border:0" allowfullscreen></iframe></li><br>
            <li><a style="color: #0000cc">Información</a></li><br>
            <li><a>Aquí podras encontrar los mejores libros y podras agregarlo a tu cuenta</a></li>
        </ul>

        <footer>
            <h1>TODOS LOS DERECHOS RESERVADOS POR EL COLEGIO SANTA MARIA</h1>
        </footer>
    </body>
</html>
