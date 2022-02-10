package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Submission;
import Model.Assignment;

public final class Lecturer_005fSubmitGrade_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/layout_header.jsp");
    _jspx_dependants.add("/layout_navbar_student.jsp");
    _jspx_dependants.add("/layout_sidebar_student.jsp");
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
      out.write("\r\n");
      out.write("\r\n");

    Assignment assignment = (Assignment) request.getAttribute("assignment");
    Submission submission = (Submission) request.getAttribute("submission");



      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    ");
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
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--INCLUDE IN EACH JSP FILE-->\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navbarStud.css\" />\r\n");
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
      out.write("          <li><a href=\"Student_Profile.jsp\">My Profile </a></li>\r\n");
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
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navbarStud.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<!-- <div id=\"myDIV\" class=\"sidebar\">\r\n");
      out.write("  <a class=\"btns active\" href=\"Student_Home.jsp\">Courses</a>\r\n");
      out.write("  <a class=\"btns\" href=\"Student_ViewAssignment.jsp\">Assignment</a>\r\n");
      out.write("  <a class=\"btns\" href=\"Student_RegisterCourse.jsp\">Register Course</a>\r\n");
      out.write("  <a class=\"btns\" href=\"\">Course Grade</a>\r\n");
      out.write("  <a class=\"btns\" href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</div>-->\r\n");
      out.write("<style>\r\n");
      out.write("    p{\r\n");
      out.write("        font-size:large;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"myDIV\" class=\"sidebar\">\r\n");
      out.write("  <a class=\"btns\" href=\"CourseStud?action=homepage\">Courses</a>\r\n");
      out.write("  <a class=\"btns\" href=\"Student_ViewAssignment.jsp\">Assignment</a>\r\n");
      out.write("    <a class=\"btns\" href=\"CourseStud?action=view\">Register Course</a>\r\n");
      out.write("  <a class=\"btns\" href=\"ViewCourseGrade.jsp\">Course Grade</a>\r\n");
      out.write("  <a class=\"btns\" href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // Add active class to the current button (highlight it)\r\n");
      out.write("    var header = document.getElementById(\"myDIV\");\r\n");
      out.write("    var btns = header.getElementsByClassName(\"btns\");\r\n");
      out.write("    \r\n");
      out.write("    for (var i = 0; i < btns.length; i++) {\r\n");
      out.write("      btns[i].addEventListener(\"click\", function() {\r\n");
      out.write("      var current = document.getElementsByClassName(\"active\");\r\n");
      out.write("      current[0].className = current[0].className.replace(\" active\", \"\");\r\n");
      out.write("      this.className += \" active\";\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            input#file-upload-button{\r\n");
      out.write("                border:  1px solid green !important;\r\n");
      out.write("                background-color: white !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"content1\" style=\"padding-top: 10px; padding-bottom: 10px;\">\r\n");
      out.write("                <div class=\"text\">\r\n");
      out.write("                    <h2>\r\n");
      out.write("                        ");
      out.print(assignment.getTitle());
      out.write("\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <p> Answer the questions in the pdf given. Compile your answers in pdf form and submit. </p>\r\n");
      out.write("                    <p> \r\n");
      out.write("                        <a href=\"DownloadPdf?file=");
      out.print(assignment.getPath());
      out.write("\" class=\"d-block\">\r\n");
      out.write("                            Download your assignment\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p> Assigned due at: ");
      out.print( assignment.getDuedate());
      out.write("</p>\r\n");
      out.write("                    <p class=\"alert alert-danger\"> Students not submitting by time will be penalized. </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content2 my-1 py-5 px-4\">\r\n");
      out.write("                <!--Trial-->\r\n");
      out.write("                <h5> Your submission </h5>\r\n");
      out.write("                <!--status\tsubmissionTime\tgrade\tfile\tassignmentID-->\r\n");
      out.write("                <!--Submission(\"Not submitted\", assignmentId, \"Not submitted yet\", -1, \"Not submitted yet\", true);-->\r\n");
      out.write("                <ul class=\"list-group\">\r\n");
      out.write("                    <li class=\"list-group-item\"> <span class=\"w-25 w-lg-50 d-inline-block\"> Submitted : </span>  ");
      out.print( submission.getStatus());
      out.write("</li>\r\n");
      out.write("                    <li class=\"list-group-item\"> <span class=\"w-25 w-lg-50 d-inline-block\"> Submitted at: </span> ");
      out.print( submission.getSubmissionTime());
      out.write(" </li>\r\n");
      out.write("                        ");
 if (submission.getGrade() > -1) {
      out.write("\r\n");
      out.write("                    <li class=\"list-group-item\"> <span class=\"w-25 w-lg-50 d-inline-block\"> Grade: </span> ");
      out.print(  submission.getGrade());
      out.write(" </li>\r\n");
      out.write("                        ");
 } else {
      out.write("\r\n");
      out.write("                    <form method=\"POST\" action=\"GradeAssignment2\" class=\"pb-2\" >\r\n");
      out.write("                        <li class=\"list-group-item\"> \r\n");
      out.write("                            <span class=\"w-25 w-lg-50 d-inline-block\"> \r\n");
      out.write("                                Grade: \r\n");
      out.write("                            </span> \r\n");
      out.write("                            <input name=\"file\" value=\"");
      out.print( submission.getFile());
      out.write("\"  class=\"d-none\">\r\n");
      out.write("                            <input name=\"submissionTime\" value=\"");
      out.print( submission.getSubmissionTime());
      out.write("\" class=\"d-none\">\r\n");
      out.write("                            <input name=\"id\" value=\"");
      out.print( submission.getAssignmentID());
      out.write("\"  class=\"d-none\">\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"form-group d-inline-block\">\r\n");
      out.write("                                <input type=\"grade\" name = \"grade\" class=\"form-control d-inline-block\"  placeholder=\"Grade\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" name=\"upload\" id=\"upload\" class=\"btn btn-sm btn-outline-success d-inline-block \"  />\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    ");
 if (submission.getEmpty() == "false") {
      out.write("\r\n");
      out.write("                    <li class=\"list-group-item\">\r\n");
      out.write("                        <span class=\"w-25 w-lg-50 d-inline-block\"> Submission : </span> <a href=\"DownloadPdf?file=");
      out.print(submission.getFile());
      out.write("\" class=\"btn btn-success btn-sm text-light\"> Submitted assignment </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    ");
 if (submission.getEmpty() == "true") {
      out.write("\r\n");
      out.write("                    <li class=\"list-group-item \">\r\n");
      out.write("                        <p> Student submitted nothing! <p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
