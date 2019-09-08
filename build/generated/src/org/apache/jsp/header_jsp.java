package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Statement;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String type = (String) session.getAttribute("type");

    if (session.getAttribute("username") == null || session.getAttribute("type").equals("0")) {
        response.sendRedirect("index.jsp");
    }



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>User</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-blue-grey.css\">\n");
      out.write("    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        html, body, h1, h2, h3, h4, h5 {font-family: \"Open Sans\", sans-serif}\n");
      out.write("    </style>\n");
      out.write("    <body class=\"w3-theme-l5\">\n");
      out.write("\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div class=\"w3-top\">\n");
      out.write("            <div class=\"w3-bar w3-theme-d2 w3-left-align w3-large\">\n");
      out.write("                <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a href=\"people.jsp\" class=\"\" style=\"\"><img src=\"images/FinalAnnaPurti.png\" class=\"fa fa-home w3-margin-right\" style=\" zoom: 100%; height: 57px;\" align='left'></a>\n");
      out.write("                <!--<a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\" title=\"News\"><i class=\"fa fa-globe\"></i></a>-->\n");
      out.write("                <a href=\"account_user.jsp\" class=\"w3-bar-item w3-button w3-hide-small\" style=\"padding: 15px 30px 15px 30px; margin-left:-15px; \" title=\"Account\"><i class=\"fa fa-user\"></i></a>\n");
      out.write("                <!--<a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\" title=\"Messages\"><i class=\"fa fa-envelope\"></i></a>-->\n");
      out.write("                <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("                    ");
    try {
                            Statement st = DBConnector.getStatement();
                            String user_id = (String) session.getAttribute("user_id");

                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                            LocalDate today = LocalDate.now();
                            
                            String query = "SELECT COUNT(req_id) FROM user_request natural join feed_form WHERE user_id='" + user_id + "' and ngo_id!=0 and date>='"+today.minusDays(2)+"' ;";

                            ResultSet rs = st.executeQuery(query);

                            if (rs.next()) {
                                int number = Integer.parseInt(rs.getString(1));
                                System.out.println("number of requests " + number);
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <button class=\"w3-button\" style=\"padding-top:15px;padding-bottom:15px\" onclick=\"notification();\" title=\"Notifications\">\n");
      out.write("                        <i class=\"fa fa-bell\"></i>\n");
      out.write("                        <span class=\"w3-badge w3-right w3-small w3-green\">");
      out.print( number);
      out.write("</span>\n");
      out.write("                    </button>     \n");
      out.write("\n");
      out.write("                    ");
   }

                        } catch (SQLException e) {
                            System.out.println(e);
                        }


                    
      out.write("     \n");
      out.write("                    <!--                    <button class=\"w3-button w3-padding-large\" title=\"Notifications\"><i class=\"fa fa-bell\"></i><span class=\"w3-badge w3-right w3-small w3-green\">3</span></button>     -->\n");
      out.write("                </div>\n");
      out.write("<!--                <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white\" onmouseenter=\"logout();\" onmouseleave=\"mouseout();\" title=\"My Account\">\n");
      out.write("                    <img src=\"images/avatar2.png\" class=\"w3-circle\" style=\"height:30px;width:30px\"onclick=\"account();\" alt=\"Avatar\">\n");
      out.write("                    \n");
      out.write("                </a>-->\n");
      out.write("                <div class=\"w3-dropdown-hover w3-hide-small w3-right\">\n");
      out.write("\n");
      out.write("                    <button class=\"w3-button w3-padding-large w3-hover-white\"><img src=\"images/avatar2.png\" class=\"w3-circle\" style=\"height:30px;\"></button>     \n");
      out.write("     \n");
      out.write("                    <!--                    <button class=\"w3-button w3-padding-large\" title=\"Notifications\"><i class=\"fa fa-bell\"></i><span class=\"w3-badge w3-right w3-small w3-green\">3</span></button>     -->\n");
      out.write("                    <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\" style=\"width:150px; margin-left: -80px\">\n");
      out.write("                        <a href=\"account_user.jsp\" class=\"w3-bar-item w3-button w3-center\">Account</a>\n");
      out.write("                        <a href=\"index.jsp\" class=\"w3-bar-item w3-button w3-text-red w3-center\">Logout</a>\n");
      out.write("<!--                        <a href=\"#\" class=\"w3-bar-item w3-button\">Jane likes your post</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Navbar on small screens -->\n");
      out.write("        <div id=\"navDemo\" class=\"w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium w3-large\">\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 1</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 2</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 3</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">My Profile</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Page Container -->\n");
      out.write("\n");
      out.write("        <div class=\"w3-container w3-content\" style=\"max-width:1450px;margin-top:40px\"> \n");
      out.write("\n");
      out.write("            <!--                <div class=\"w3-container w3-padding-large\"style=\"max-width:1400px;margin-top:80px\">\n");
      out.write("                                \n");
      out.write("                            </div>-->\n");
      out.write("            <div id =\"logout\" onmouseenter=\"logout();\" onmouseleave=\"mouseout();\" style=\"position:fixed;z-index:1; top:50px;right:10px;visibility:hidden;\">\n");
      out.write("                <div class=\"w3-card w3-round w3-white w3-center\">\n");
      out.write("                    <div class=\"w3-container\">\n");
      out.write("                        <p>   </p>\n");
      out.write("                        <img src=\"images/avatar2.png\" alt=\"Avatar\" style=\"height:30px;width:30px\"><br>\n");
      out.write("                        <span>");
      out.print((String) session.getAttribute("username"));
      out.write("</span>\n");
      out.write("\n");
      out.write("                        <div class=\"w3-row w3-opacity\">\n");
      out.write("                            <form action=\"Logout\" method=\"post\">\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"w3-button\" style=\"color:red;\">Logout</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>   \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function account()\n");
      out.write("                {\n");
      out.write("                    window.location.replace(\"account_user.jsp\");\n");
      out.write("                }\n");
      out.write("                function logout()\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"logout\").style.visibility = 'visible';\n");
      out.write("                }\n");
      out.write("                function mouseout()\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"logout\").style.visibility = 'hidden';\n");
      out.write("                }\n");
      out.write("                function notification()\n");
      out.write("                {\n");
      out.write("                    window.location.replace(\"notification_user.jsp\");\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
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
