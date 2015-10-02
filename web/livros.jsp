<%-- 
    Document   : livros
    Created on : 15/09/2015, 16:16:43
    Author     : info206
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Cadastrar</h2>  
        <form action="Cadastrolivros" method="POST">  
  
            <table>  
                 
                <tr>  
                    <td>Título: </td>  
                    <td><input type="text" size="30" name="Titulo"></td>  
                </tr>  
                <tr>  
                    <td>Tipo: </td>  
                    <td><input type="text" size="30" name="Tipo"></td>   
                </tr>  
                <tr>  
                    <td>Genero: </td>  
                    <td><input type="text" size="15" name="Genero"></td>  
                </tr>  
                 
                <tr>  
                    <td> <input type="reset" value="Limpar"> </td>  
                    <td> <input type="submit" value="Enviar"> </td> 
                </tr>  
                  
                      </table>
        </form>
             
        <form action="Consultalivros" method="POST">
            
            <table>
                <tr>
                     <td> <input type="submit" value="Consultar"> </td>
                </tr>  
               
            </table>
                
        </form>
        
        <form action="Excluirlivros" method="POST">  
  
            <table>                  
                <tr>  
                    <td>Título: </td> 
                    <td><input type="text" size="30" name="Nome"></td>                                
                    <td><input type="submit" value="Deletar"></td>
                </tr>
            </table>
                
        </form>
        
    </body>
</html>
