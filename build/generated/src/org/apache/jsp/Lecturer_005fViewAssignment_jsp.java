package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBUtility.DBConnection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Lecturer_005fViewAssignment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("    <!--<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">--> \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("   <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("     <style>\r\n");
      out.write("         .button{\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            border: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px 32px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            margin: 4px 2px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            float: right;\r\n");
      out.write("\r\n");
      out.write("          }\r\n");
      out.write("     </style>\r\n");
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
      out.write("  <a class=\"btns\" href=\"#about\">Logout</a>\r\n");
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
      out.write("      <div class=\"content\">\r\n");
      out.write("          <a href=\"Lecturer_AddAssignment.jsp\" class=\"button\">Add Assignment</a>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("                <h2>Assignment List:</h2>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("           <div class=\"col-md-10\">\r\n");
      out.write("               <div class=\"panel-body\">\r\n");
      out.write("                   <table id=\"tbl-asgn\" class=\"table table-responsive table-bordered\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("                      \r\n");
      out.write("                       <thead>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                               \r\n");
      out.write("                               <th style=\"text-align: center\">Course</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Title</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Created On</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Due Date</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Instructions & Materials</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Action</th>\r\n");
      out.write("                               <th style=\"text-align: center\">Action</th>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           \r\n");
      out.write("                       <tbody>\r\n");
      out.write("                          \r\n");
      out.write("                           ");

                               
                               Connection con = null;
                               PreparedStatement ps = null;
                               ResultSet rs = null;
                               
                               con = DBConnection.openConnection();
                              
                               String query = "select a.id,a.title,a.duedate,a.filename,a.path,a.added_date, c.courseName from assignment a JOIN courses c ON a.course = c.id";
                               ps = con.prepareStatement(query);
                               rs = ps.executeQuery();
                               
                               while(rs.next()){
                                   String id = rs.getString("a.id");
                                   
                               
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                         \r\n");
      out.write("                               <tr>\r\n");
      out.write("                                   <td style=\"text-align: center\">");
      out.print( rs.getString("c.courseName") );
      out.write("</td>\r\n");
      out.write("                                   <td style=\"text-align: center\">");
      out.print( rs.getString("a.title") );
      out.write("</td>\r\n");
      out.write("                                   <td style=\"text-align: center\">");
      out.print( rs.getString("a.added_date") );
      out.write("</td>\r\n");
      out.write("                                   <td style=\"text-align: center\">");
      out.print( rs.getString("a.duedate") );
      out.write("</td>\r\n");
      out.write("                                   <td style=\"text-align: center\"><a href=\"DownloadAssignment?fileName=");
      out.print(rs.getString("a.filename"));
      out.write("\">Download</a></td>\r\n");
      out.write("                                   <td style=\"text-align: center\"><a href=\"Lecturer_UpdateAssignment.jsp?id=");
      out.print(id );
      out.write("\">Edit</a></td>\r\n");
      out.write("                                   <td style=\"text-align: center\"><a href=\"Lecturer_DeleteAssignment.jsp?id=");
      out.print(id );
      out.write("\">Delete</a></td>\r\n");
      out.write("                               </tr>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                                 </tbody>\r\n");
      out.write("                              \r\n");
      out.write("                            \r\n");
      out.write("                         \r\n");
      out.write("                      \r\n");
      out.write("                   </table>\r\n");
      out.write("               </div>  \r\n");
      out.write("                               </div>\r\n");
      out.write("           </div>\r\n");
      out.write(" </body>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
