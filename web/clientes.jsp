<%-- 
    Document   : clientes
    Created on : 15/09/2015, 16:16:35
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
        <form action="Cadastro" method="POST">  
  
            <table>  
                 
                <tr>  
                    <td>Nome: </td>  
                    <td><input type="text" size="30" name="Nome"></td>  
                </tr>  
                <tr>  
                    <td> Endereço: </td>  
                    <td><input type="text" size="30" name="Endereco"></td>   
                </tr>  
                <tr>  
                    <td>CPF: </td>  
                    <td><input type="text" size="15" name="CPF"></td>  
                </tr>  
                 
                <tr>  
                    <td> <input type="reset" value="Limpar"> </td>  
                    <td> <input type="submit" value="Enviar"> </td> 
                </tr>  
                  
                      </table>
        </form>
        
        <form action="Consultaclientes" method="POST">
            
            <table>                
                     <td> <input type="submit" value="Consultar"> </td>
                </tr>  
               
            </table>
                
        </form>
        
        <form action="Excluirclientes" method="POST">  
  
            <table>  
                 
                <tr>  
                    <td>Nome:</td> 
                    <td><input type="text" size="30" name="Nome"></td>                 
                    <td><input type="submit" value="Deletar"></td>
                </tr>
            </table>
                
        </form>
    </body>
</html>
