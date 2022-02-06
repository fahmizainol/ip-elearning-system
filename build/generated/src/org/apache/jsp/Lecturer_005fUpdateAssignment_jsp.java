package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBUtility.DBConnection;
import java.sql.*;

public final class Lecturer_005fUpdateAssignment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("   <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\r\n");
      out.write(" <body>\r\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("<!--INCLUDE IN EACH JSP FILE-->\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\n");
      out.write("</head>\n");
      out.write("<nav class=\"navbar\">\n");
      out.write("  <!-- LOGO -->\n");
      out.write("  <div class=\"logo\">E-learning</div>\n");
      out.write("  <!-- NAVIGATION MENU -->\n");
      out.write("  <ul class=\"nav-links\">\n");
      out.write("    <!-- NAVIGATION MENUS -->\n");
      out.write("    <div class=\"menu\">\n");
      out.write("<!--           <li><a href=\"/\">Contacts</a></li>-->\n");
      out.write("         <li class=\"services\">\n");
      out.write("        <a href=\"/\">Profile</a>\n");
      out.write("        <!-- DROPDOWN MENU -->\n");
      out.write("        <ul class=\"dropdown\">\n");
      out.write("          <li><a href=\"/\">My Profile </a></li>\n");
      out.write("          <li><a href=\"/\">Settings</a></li>  \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      </li>\n");
      out.write("      <li><a href=\"/\">Contacts</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </ul>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("<!--INCLUDE IN EACH JSP FILE-->\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\n");
      out.write("</head>\n");
      out.write(" <div class=\"sidebar\">\n");
      out.write("  <a class=\"active\" href=\"#home\">Courses</a>\n");
      out.write("  <a href=\"ViewAssignment.jsp\">Assignment</a>\n");
      out.write("  <a href=\"#contact\">Student List</a>\n");
      out.write("  <a href=\"#about\">Manage Grade</a>\n");
      out.write("  <a href=\"#about\">Logout</a>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("         <div class=\"row justify-content-center\">\r\n");
      out.write("             <div class=\"col-md-8\">\r\n");
      out.write("                 <div class=\"card\">\r\n");
      out.write("                     <div class=\"card-header\">Update Assignment</div>\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                         <form class=\"form-horizontal\" method=\"post\" action=\"UpdateAssignment\">\r\n");
      out.write("                             ");

                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");

                               String id = request.getParameter("id");

                               pst = con.prepareStatement("select a.id, a.title, a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id where a.id = ?");
                               pst.setString(1, id);
                               rs = pst.executeQuery();
                               
                               while(rs.next())
                               {

//                                
                                   
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                              <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"course\" class=\"cols-sm-2 control-label\">Course</label>\r\n");
      out.write("                                 <div class=\"cols-sm-10\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"course\" id=\"name\" disabled value=\"");
      out.print( rs.getString("c.courseName"));
      out.write("\">\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"title\" class=\"cols-sm-2 control-label\">Title</label>\r\n");
      out.write("                                 <div class=\"cols-sm-10\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"title\" id=\"name\" value=\"");
      out.print( rs.getString("a.title"));
      out.write("\">\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"date\" class=\"cols-sm-2 control-label\">Due Date:</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                        <input type=\"date\" id=\"date\" name=\"date\" value=\"");
      out.print( rs.getString("a.duedate"));
      out.write("\">>\r\n");
      out.write("                                         \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                 \r\n");
      out.write("                                   \r\n");
      out.write("                                   \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <input type=\"file\" id=\"myFile\" name=\"filename\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                  \r\n");
      out.write("        \r\n");
      out.write("                             <div class=\"form-group\"> \r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"back\">\r\n");
      out.write("                                 <a href=\"view assignment.jsp\" style=\"text-align: left;\">Back</a>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                \r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                         </form>\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
