/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-07-16 03:21:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>PÃ¡gina Home</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\r\n");
      out.write("  <script>\r\n");
      out.write("        document.addEventListener(\"DOMContentLoaded\", function () {\r\n");
      out.write("            const bannerImages = document.querySelectorAll(\".banner img\");\r\n");
      out.write("            let currentImageIndex = 0;\r\n");
      out.write("\r\n");
      out.write("            function showNextImage() {\r\n");
      out.write("                bannerImages[currentImageIndex].classList.remove(\"active\");\r\n");
      out.write("                currentImageIndex = (currentImageIndex + 1) % bannerImages.length;\r\n");
      out.write("                bannerImages[currentImageIndex].classList.add(\"active\");\r\n");
      out.write("            }\r\n");
      out.write("            setInterval(showNextImage, 3000);\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <h1>Restaurante Pavezzi</h1>\r\n");
      out.write("  <p>Saboreie os melhores pratos da CulinÃ¡ria Brasileira</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"banner\">\r\n");
      out.write("  <img src=\"prato1.jpg\" alt=\"Imagem 1\" class=\"active\">\r\n");
      out.write("  <img src=\"prato2.jpg\" alt=\"Imagem 2\">\r\n");
      out.write("  <img src=\"prato3.jpg\" alt=\"Imagem 3\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("  <h2>Prato em Destaque</h2>\r\n");
      out.write("  <div class=\"featured-dish\">\r\n");
      out.write("    <img src=\"prato4.jpg\" alt=\"Prato em Destaque\">\r\n");
      out.write("    <div>\r\n");
      out.write("      <h3>Delicioso Prato Famoso e Especial (Virado a Paulista)</h3>\r\n");
      out.write("      <p>Experimente nosso prato especial do dia, preparado com ingredientes de qualidade e deliciosos.</p>\r\n");
      out.write("      <a href=\"#\">Ver Mais</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <h2>Nosso CardÃ¡pio</h2>\r\n");
      out.write("  <p>Aqui vocÃª encontra uma variedade de pratos deliciosos, desde entradas atÃ© sobremesas.</p>\r\n");
      out.write("  <a href=\"#\">Veja o CardÃ¡pio Completo</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("  <p>&copy; 2023 Restaurante Pavezzi. Todos os direitos reservados.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}