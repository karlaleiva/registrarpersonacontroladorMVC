package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Persona;


@WebServlet(name = "Recibir", urlPatterns = {"/recibir.do"})
public class Recibir extends HttpServlet {
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dui = request.getParameter("txtDui");
        String apellido = request.getParameter("txt.Apellido");
        String nombre = request.getParameter("txt.Nombre");
        
        Persona person = new Persona();
        person.setDui(dui);
        person.setApellido(apellido);
        person.setNombre(nombre);
        
        if(person.insertarDatos() == true){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noexito.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
     @Override
     public String getServletInfo(){
         return "Short description";
     }

}
