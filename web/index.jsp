<%-- 
    Document   : index
    Created on : 08/09/2015, 16:40:29
    Author     : info206
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício para nota</title>
    </head>
    <body>
        <img src="imagens/logo.jpg" width="100%" height="300px">
        <h1 align="center">Bem Vindo!</h1>
        
        <form action="clientes.jsp" method="POST">                    
            <input type="submit" value="Cadastrar Clientes">           
        </form>
           
        <br /><br />
        
        <form action="livros.jsp" method="POST">
            
            <input type="submit" value="Cadastrar Livros">
            
        </form>
       
    </body>
</html>
