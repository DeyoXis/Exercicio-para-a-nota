/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author info206
 */
@WebServlet(name = "Cadastrolivros", urlPatterns = {"/Cadastrolivros"})
public class Cadastrolivros extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws ClassNotFoundException  
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        
        String connectionURL = "jdbc:mysql://127.0.0.1/nota";
        String User = "root";
        String Pass = "123456";    
        
        //Pega os Valores dos campos  
        String Titulo = request.getParameter("Titulo");    
        String Tipo = request.getParameter("Tipo");    
        String Genero = request.getParameter("Genero");   
      
        
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        PrintWriter out = response.getWriter();
        try {
            connection = DriverManager.getConnection(connectionURL, User, Pass);
            statement = connection.createStatement();
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO livros VALUES(?,?,?)");

             
            stmt.setString(1, Titulo);       //SetString pois é um texto e 1 pois ocupa a primeira posiçao,e Nome é a sua variavel  
            stmt.setString(2, Tipo);  //SetString pois é um texto e 2 pois ocupa a terceira posiçao,e endereco é a sual variavel  
            stmt.setString(3, Genero);     //SetString pois é um texto e 4 pois ocupa a quarta posiçao,e cpf é a sual variavel  
            stmt.executeUpdate();
            
            
        }  catch (SQLException e) {
            out.println("Erro no Sql" + e.getMessage());
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastrolivros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastrolivros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
