<%-- 
    Document   : agregar
    Created on : 03-may-2017, 13:04:54
    Author     : 6000851
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="web for CRUD">
        <meta name="keywords" content="HTML, CSS, Bootstrap, jQuery, discos duros">
        <meta name="author" content="Manuel Trinidad Cerezo Bonilla">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Agregar artículo - Addisdu</title>
        <!-- Mi hoja de estilos -->
        <link rel="stylesheet" type="text/css" href="css/estilosindex.css">
        <!-- Bootstrap en sí + Bootstrap social -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css">
        <!-- Font awesome for icons and more -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">         
        <!-- Script para jQuery -->
        <script src="https://code.jquery.com/jquery-3.0.0.js"></script>
        <!-- Latest compiled Javascript from Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
        
        </script>
    </head>
    <body>
        <div class="container text-center">
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root", "");
          Statement s = conexion.createStatement();
          
          request.setCharacterEncoding("UTF-8");
          
          String consultaId = "SELECT * FROM info WHERE ID="
                                + Integer.valueOf(request.getParameter("ID"));
          
          ResultSet numeroDeIds = s.executeQuery (consultaId);
          numeroDeIds.last();
          
          if (numeroDeIds.getRow() != 0) {
              out.println("<body class='error'></body>");
              out.println("<h1>El artículo no se ha agregado a la base de datos</h1>");
              out.println("Lo siento, no se ha podido dar de alta ya que este producto está registrado con el ID ."
                            + request.getParameter("ID") + "·");
          } else {
              String insercion = "INSERT INTO info VALUES (" + Integer.valueOf(request.getParameter("ID"))
                                    + ", '" + request.getParameter("marca")
                                    + "', '" + request.getParameter("modelo")
                                    + "', '" + request.getParameter("tipo")
                                    + "', '" + request.getParameter("almacenamiento")
                                    + "', '" + request.getParameter("conexion")
                                    + "', " + Float.valueOf(request.getParameter("precio")) + ")";
              s.execute(insercion);
              out.println("<body class='success'></body>");
              out.println("<h1> Artículo agregado a la base de datos correctamente</h1>");
              out.println("El artículo se acaba de añadir en su base de datos.");
          }
          conexion.close();
        %>
        
        <br><br>
        <a href="index.jsp" class="btn btn-primary"><i class="fa fa-home" aria-hidden="true"></i> Volver a la página principal</a>
        <a href="tabla.jsp" class="btn btn-primary"><i class="fa fa-table" aria-hidden="true"></i> Volver atrás para ver los datos</a>
        </div>
        <footer class="text-center">
                <hr>
                <p style="color: black!important"> Created by: Manuel Trinidad Cerezo Bonilla <br>
                Contact info: 
                    <a id="twitter" href="https://www.twitter.com/manueldevjour" target="_blank"><i class="fa fa-twitter"></i></a>  
                    <a id="linkedin" href="https://www.linkedin.com/in/manuel-trinidad-cerezo-bonilla-735701a9/" target="_blank"><i class="fa fa-linkedin"></i></a>  
                    <a id="telegram" href="https://t.me/Wanolo"><i class="fa fa-telegram" target="_blank"></i></a>  
                    <a id="github" href="https://www.github.com/manueldevjour"><i class="fa fa-github" target="_blank"></i></a>
                </p>
            </footer>
    </body>
</html>
