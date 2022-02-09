package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageCourseGrade_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/layout_header.jsp");
    _jspx_dependants.add("/layout_navbar.jsp");
    _jspx_dependants.add("/layout_sidebar.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("    <!--<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">--> \r\n");
      out.write("    <!--    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-3.6.0.min.js\"></script>-->\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write(" <body>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--INCLUDE IN EACH JSP FILE-->\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<nav class=\"navbar\">\r\n");
      out.write("  <!-- LOGO -->\r\n");
      out.write("  <div class=\"logo\">E-learning</div>\r\n");
      out.write("  <!-- NAVIGATION MENU -->\r\n");
      out.write("  <ul class=\"nav-links\">\r\n");
      out.write("    <!-- NAVIGATION MENUS -->\r\n");
      out.write("    <div class=\"menu\">\r\n");
      out.write("<!--           <li><a href=\"/\">Contacts</a></li>-->\r\n");
      out.write("         <li class=\"services\">\r\n");
      out.write("        <a href=\"#\">Profile</a>\r\n");
      out.write("        <!-- DROPDOWN MENU -->\r\n");
      out.write("        <ul class=\"dropdown\">\r\n");
      out.write("          <li><a href=\"Lecturer_Profile.jsp\">My Profile </a></li>\r\n");
      out.write("          <li><a href=\"/\">Settings</a></li>  \r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("      </li>\r\n");
      out.write("      <li><a href=\"/\">Contacts</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--INCLUDE IN EACH JSP FILE-->\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\r\n");
      out.write("</head>\r\n");
      out.write(" <div id=\"myDIV\" class=\"sidebar\">\r\n");
      out.write("  <a class=\"btns active\" href=\"Lecturer_HomeManageCourse.jsp\">Courses</a>\r\n");
      out.write("  <a class=\"btns\" href=\"Lecturer_ViewAssignment.jsp\">Assignment</a>\r\n");
      out.write("  <a class=\"btns\" href=\"#contact\">Student List</a>\r\n");
      out.write("  <a class=\"btns\" href=\"#about\">Manage Grade</a>\r\n");
      out.write("  <a class=\"btns\" href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // Add active class to the current button (highlight it)\r\n");
      out.write("    var header = document.getElementById(\"myDIV\");\r\n");
      out.write("    var btns = header.getElementsByClassName(\"btns\");\r\n");
      out.write("    for (var i = 0; i < btns.length; i++) {\r\n");
      out.write("      btns[i].addEventListener(\"click\", function() {\r\n");
      out.write("      var current = document.getElementsByClassName(\"active\");\r\n");
      out.write("      current[0].className = current[0].className.replace(\" active\", \"\");\r\n");
      out.write("      this.className += \" active\";\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"content\">\r\n");
      out.write("        <div class=\"content1\">\r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("                <h2>Manage Course Grade</h2>\r\n");
      out.write("                <p>Publish marks and grade to students of their respective courses</p>\r\n");
      out.write("\r\n");
      out.write("       <!--          <div style=\"text-align: right;\"><img src=\"books.png\" alt=\"Sunflower\"></div>-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <p style=\"margin-left:40%\" ><b>Insert Result</b></p>\r\n");
      out.write("         \r\n");
      out.write("<!--         <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("              SCSJ3234 - Internet Programming\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Database</a>\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Genetic Engineering</a>\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Artificial Intelligence</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"btn-group\">\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-info dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("    SECI3133-Internet Programming\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"dropdown-menu\">\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Separated link</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("         \r\n");
      out.write("        <div class=\"content2\" style=\"margin-top:100px\">\r\n");
      out.write("            <div class=\"mt-4\">\r\n");
      out.write("                \r\n");
      out.write("               <table class=\"table table-striped table-light border-light\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"col\">Serial</th>  \r\n");
      out.write("                        <th scope=\"col\">Name</th>\r\n");
      out.write("                        <th scope=\"col\">Matric</th>\r\n");
      out.write("                        <th scope=\"col\">Grade</th>\r\n");
      out.write("                        <th scope=\"col\">GPA</th>\r\n");
      out.write("                        <th scope=\"col\">Actions</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>1.</td>\r\n");
      out.write("                            <td>Ahmad Fahmi</td>\r\n");
      out.write("                            <td>A18CS3454</td>\r\n");
      out.write("                            <td>A+</td>\r\n");
      out.write("                            <td>4.00</td>\r\n");
      out.write("                            <td>Save | Edit</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>2.</td>\r\n");
      out.write("                            <td>Ahmad Nadan</td>\r\n");
      out.write("                            <td>A18CS3694</td>\r\n");
      out.write("                            <td>A+</td>\r\n");
      out.write("                            <td>4.00</td>\r\n");
      out.write("                            <td>Save | Edit</td>\r\n");
      out.write("                        </tr><tr>\r\n");
      out.write("                            <td>3.</td>\r\n");
      out.write("                            <td>Adib Khan</td>\r\n");
      out.write("                            <td>A18CS4747</td>\r\n");
      out.write("                            <td>A+</td>\r\n");
      out.write("                            <td>4.00</td>\r\n");
      out.write("                            <td>Save | Edit</td>\r\n");
      out.write("                        </tr><tr>\r\n");
      out.write("                            <td>4.</td>\r\n");
      out.write("                            <td>Ayaz Adittah</td>\r\n");
      out.write("                            <td>A18CS1234</td>\r\n");
      out.write("                            <td>B+</td>\r\n");
      out.write("                            <td>3.00</td>\r\n");
      out.write("                            <td>Save | Edit</td>\r\n");
      out.write("                        </tr><tr>\r\n");
      out.write("                            <td>5.</td>\r\n");
      out.write("                            <td>Hamza Choudhury</td>\r\n");
      out.write("                            <td>A18CS3234</td>\r\n");
      out.write("                            <td>A+</td>\r\n");
      out.write("                            <td>4.00</td>\r\n");
      out.write("                            <td>Save | Edit</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("\r\n");
      out.write("                  </table>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        \r\n");
      out.write("     </div>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
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