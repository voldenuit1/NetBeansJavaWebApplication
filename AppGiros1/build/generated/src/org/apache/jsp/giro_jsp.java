package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String nombre = new String(request.getParameter("Nombre")); 
      out.write('\n');
      out.write('\n');
 String nombreDestinatario = new String(request.getParameter("nombreDestinatario")); 
      out.write('\n');
      out.write('\n');
String lugarDestino = new String (request.getParameter("lugarDestino"));
      out.write('\n');
      out.write('\n');
 String monto = new String(request.getParameter("Monto")); 
      out.write('\n');
      out.write('\n');
 String tipoCambio = new String(request.getParameter("tipoCambio"));

    int valor;
    int montox;
    double valorTotal;
    montox = Integer.parseInt(monto);
    //si tipoCambio es igual a la opcion dolar, el valor es igual a el monto x 500
    if (tipoCambio == "dolar") {
        valor = montox * 500;
    //si no entonces el alor es igual al monto x 600
    } else {
        valor = montox * 600;
    }
    
    valorTotal = valor * 1.02;


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Comprobante de giro</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"href=\"GirosGet.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Giro Express</h1> \n");
      out.write("        \n");
      out.write("        <table border=\"2\"> \n");
      out.write("         <th>COMPROBANTE DE ENVÍO</th>   \n");
      out.write("            <tr>\n");
      out.write("                <th> <h3>Envía: ");
      out.print( nombre );
      out.write("</h3>  </th>\n");
      out.write("                <th> <h3>Recibe: ");
      out.print( nombreDestinatario );
      out.write("</h3> </th>\n");
      out.write("                <th> <h3>Monto: ");
      out.print( monto );
      out.write("</h3> </th>\n");
      out.write("                <th> <h3>Cambio: ");
      out.print( tipoCambio );
      out.write("</h3> </th>\n");
      out.write("                <th> <h3>Valor moneda: ");
      out.print( valor );
      out.write("</h3> </th>\n");
      out.write("                <th> <h3>Valor total: ");
      out.print( valorTotal );
      out.write("</h3> </th>\n");
      out.write("            </tr>    \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <h2>Gracias por su preferencia</h2>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
