
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Persona;


@WebServlet(name = "Mostrar", urlPatterns = {"/mostrar.do"})
public class Mostrar extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Persona p = new Persona();
        ArrayList<Persona>Persona = new ArrayList();
        
        request.getSession().setAttribute("persona",Persona);
        request.getRequestDispatcher("mostrartodo.jsp").forward(request, response);
        }
    
    }


    

