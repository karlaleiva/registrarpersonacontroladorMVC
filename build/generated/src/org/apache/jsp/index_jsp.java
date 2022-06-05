package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 out.print("BIENVENIDOS A JSP");
        int a = 10;
        int b = 20;
        int suma = a+b;
        out.print("<h1>La suma de" +a+ "+" +b+ "=" + suma + "</h1" );
        
      out.write("\r\n");
      out.write("        <h1> Esta es la pÃ¡gina de inicio</h1>\r\n");
      out.write("        <h2> Aqui se piden los datos </h2> \r\n");
      out.write("        <p> Hola, por favor introduce la informaciÃ³n </p>\r\n");
      out.write("        <form action=\"paginaDestino.jsp\" method=\"post\">  \r\n");
      out.write("        <table cellspacing=\"3\" cellpadding=\"3\" border=\"1\" >   \r\n");
      out.write("         <tr>   \r\n");
      out.write("        <td align=\"right\"> Nombre: </td> \r\n");
      out.write("        <td><input type=\"text\" name=\"nombre\"></td> \r\n");
      out.write("        </tr>   \r\n");
      out.write("        <tr>  \r\n");
      out.write("        <td align=\"right\"> Color favorito: </td> \r\n");
      out.write("        <td> <input type=\"text\" name=\"color\"> </td> \r\n");
      out.write("        </tr> \r\n");
      out.write("        <tr>  \r\n");
      out.write("        <td align=\"right\"> Correo: </td> \r\n");
      out.write("        <td> <input type=\"text\" name=\"mail\"> </td> \r\n");
      out.write("        </tr>   \r\n");
      out.write("        </table>  \r\n");
      out.write("        <input type=\"reset\" value=\"Borrar\">  \r\n");
      out.write("        <input type=\"submit\" value=\"Enviar\"> \r\n");
      out.write("        </form> \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
