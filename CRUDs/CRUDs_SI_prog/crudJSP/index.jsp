<%-- 
    Document   : index
    Created on : 03-may-2017, 9:50:23
    Author     : 6000851
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="web for CRUD">
        <meta name="keywords" content="HTML, CSS, Bootstrap, jQuery, discos duros">
        <meta name="author" content="Manuel Trinidad Cerezo Bonilla">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Addisdu</title>
        <!-- Mi hoja de estilos -->
        <link rel="stylesheet" type="text/css" href="css/estilosindex.css">
        <!-- Fuente de Inknut Antiqua -->
        <link href="https://fonts.googleapis.com/css?family=Inknut+Antiqua" rel="stylesheet"> 
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
    <body background="img/fondo.jpg" style="background-size: 1920px 980px">
        <div class="container text-center">
                <h1 id="titulo">Addisdu</h1>
            
            <div class="row">
                <br>
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <p>Si necesitas más información sobre discos duros, no dudes en visitar alguna de estas webs</p>
                    <a id="redditicon" href="https://www.reddit.com/r/DataHoarder/"> <i class="fa fa-reddit-alien"></i></a>
                    <a id="stackoverflowicon" href="https://es.stackoverflow.com/"> <i class="fa fa-stack-overflow"></i></a>
                    <br><br><br><br><br>
                    <a href="tabla.jsp" class="btn btn-primary"><i class="fa fa-table" aria-hidden="true"></i> Ver datos</a>
                </div>
            </div>
                <br><br><br><br><br>
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <p> Progreso del CRUD. Actualmente en la versión 1.0 </p>
                    <div class="progress text-center">
                        <div class="progress-bar progress-bar-striped active" role="progressbar"
                        aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%">
                        40% 
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="text-center">
            <hr>
            <p> Created by: Manuel Trinidad Cerezo Bonilla <br>
            Contact info: 
                <a id="twitter" href="https://www.twitter.com/manueldevjour" target="_blank"><i class="fa fa-twitter"></i></a>  
                <a id="linkedin" href="https://www.linkedin.com/in/manuel-trinidad-cerezo-bonilla-735701a9/" target="_blank"><i class="fa fa-linkedin"></i></a>  
                <a id="telegram" href="https://t.me/Wanolo"><i class="fa fa-telegram" target="_blank"></i></a>  
                <a id="github" href="https://www.github.com/manueldevjour"><i class="fa fa-github" target="_blank"></i></a>
            </p>
        </footer>
    </body>
</html>
