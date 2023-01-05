<%-- 
    Document   : Cuenta
    Created on : 14/11/2018, 02:03:08 PM
    Author     : ANTHONY and Blustin
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Cuentas</title>
    </head>
    <body>
        <div class="panel panel-success">
            <div class="panel-heading"><center>REGISTRATE</center></div>
            <div class="panel-body">
                <form class="form-horizontal" action="cdusuario" method="get" style="margin-left: 38%">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Email:</label>
                        <div class="col-sm-10">
                            <input type="text" name="txt1" class="form-control" id="email" placeholder="Ingrese email"  style="margin-left:1%; width:200px; margin-bottom:40px;">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="pwd">Contraseña:</label>
                        <div class="col-sm-10"> 
                            <input type="text" name="txt2" class="form-control" id="pwd" placeholder="Ingrese password"  style="margin-left:1%; width:200px; margin-bottom:40px;">
                        </div>
                    </div>
                    <div class="form-group"> 
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label><input type="checkbox"> Recordarme</label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group"> 
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" name="b1" class="btn btn-success" onclick="registro()">Enviar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    <center><a href="ComunidadyColecciones.jsp">Volver</a></center>
    
</body>
</html>
