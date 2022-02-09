package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Lecturer_005fAddAssignment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
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
      out.write("     <div class=\"container mt-5\">\r\n");
      out.write("         <div class=\"row justify-content-center\">\r\n");
      out.write("             <div class=\"col-md-8\">\r\n");
      out.write("                 <div class=\"card\">\r\n");
      out.write("                     <div class=\"card-header\">Add an Assignment</div>\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                         <form class=\"form-horizontal\" method=\"post\" action=\"UploadAssignment\" enctype=\"multipart/form-data\" >\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"subject\" class=\"cols-sm-2 control-label\">Course</label>\r\n");
      out.write("                                 <select name=\"course\" id=\"course\" class=\"form-control\">\r\n");
      out.write("<!--                                     <option>Choose any course</option>-->\r\n");
      out.write("                            \r\n");
      out.write("                                 ");

                               
                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");
                               String query = "select * from courses";
                               Statement st = con.createStatement();
                               rs = st.executeQuery(query);
                               
                               while(rs.next()){
                                   String id = rs.getString("id");
                                   String course = rs.getString("CourseName");
                                   
      out.write("\r\n");
      out.write("                                   \r\n");
      out.write("                                   <option value=\"");
      out.print(id );
      out.write('"');
      out.write('>');
      out.print( course );
      out.write("</option>\r\n");
      out.write("                                   ");

                                       }
                                   
                               
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                                    </select>    \r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                               <br>\r\n");
      out.write("                               \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"title\" class=\"cols-sm-2 control-label\">Title</label>\r\n");
      out.write("                                 <div class=\"cols-sm-10\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"title\" id=\"name\" placeholder=\"Enter the assignment title\" />\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                               \r\n");
      out.write("                               <br>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"duedate\" class=\"cols-sm-2 control-label\">Due Date:</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                        <input type=\"date\" id=\"date\" name=\"duedate\">\r\n");
      out.write("                                         \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                 \r\n");
      out.write("                               <br>    \r\n");
      out.write("                                   \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <input type=\"file\" name=\"file\" id=\"file\"/>\r\n");
      out.write("                             </div>\r\n");
      out.write("                               \r\n");
      out.write("                               <br>\r\n");
      out.write("                  \r\n");
      out.write("        \r\n");
      out.write("                             <div class=\"form-group\"> \r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\" name=\"submit\" id=\"submit\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                               \r\n");
      out.write("                               <br>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"back\">\r\n");
      out.write("                                 <a href=\"view assignment.jsp\" style=\"text-align: left;\">Back</a>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                \r\n");
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
