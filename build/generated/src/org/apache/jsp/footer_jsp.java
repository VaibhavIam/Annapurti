package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("</div>\n");
      out.write("     <div style=\"position: fixed; left: 0; bottom: 0; width: 100%;\">  \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("<!--        <footer class=\"w3-container w3-theme-d3 w3-padding-16\" style=\"\">\n");
      out.write("            <h5>Footer</h5>\n");
      out.write("        </footer>-->\n");
      out.write("\n");
      out.write("        <footer class=\"w3-container w3-theme-d5 w3-opacity\">\n");
      out.write("            <p class=\"w3-center w3-text-white\"><strong>&COPY; AnnaPurti 2019</strong></p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        // Accordion\n");
      out.write("            function myFunction(id) {\n");
      out.write("                var x = document.getElementById(id);\n");
      out.write("                if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("                    x.className += \" w3-show\";\n");
      out.write("                    x.previousElementSibling.className += \" w3-theme-d1\";\n");
      out.write("                } else {\n");
      out.write("                    x.className = x.className.replace(\"w3-show\", \"\");\n");
      out.write("                    x.previousElementSibling.className =\n");
      out.write("                            x.previousElementSibling.className.replace(\" w3-theme-d1\", \"\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        // Used to toggle the menu on smaller screens when clicking on the menu button\n");
      out.write("            function openNav() {\n");
      out.write("                var x = document.getElementById(\"navDemo\");\n");
      out.write("                if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("                    x.className += \" w3-show\";\n");
      out.write("                } else {\n");
      out.write("                    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("</body>\n");
      out.write("</html> \n");
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
