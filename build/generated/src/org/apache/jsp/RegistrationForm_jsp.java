package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">Register</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                <form class=\"form-horizontal\" method=\"post\" action=\"#\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"name\" class=\"cols-sm-2 control-label\">Your Name</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Enter your Full Name\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"email\" class=\"cols-sm-2 control-label\">Your Email</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Enter your Email\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"username\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"Enter your Username\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Enter your Password\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">Confirm Password</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"confirm\" id=\"confirm\" placeholder=\"Confirm your Password\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                     <div class=\"form-group \">\n");
      out.write("                                         <label for=\"confirm\" class=\"cols-sm-2 control-label\">Register As:</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                         <input type=\"radio\" id=\"student\" name=\"user_role\" value=\"Student\">\n");
      out.write("                                         <label for=\"html\">Student</label><br>\n");
      out.write("                                         <input type=\"radio\" id=\"lecturer\" name=\"user_role\" value=\"lecturer\">\n");
      out.write("                                         <label for=\"html\">Lecturer</label><br>\n");
      out.write("                                        </div>\n");
      out.write("                                     </div>\n");
      out.write("        \n");
      out.write("                                    <div class=\"form-group\">  \n");
      out.write("                                        <button type=\"button\" class=\"btnSubmit\">Register</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                 \n");
      out.write("                                    <div class=\"login-register\">\n");
      out.write("                                        <a href=\"index.php\">Back to Login</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .note\n");
      out.write("{\n");
      out.write("    text-align: center;\n");
      out.write("    height: 80px;\n");
      out.write("    background: -webkit-linear-gradient(left, #0072ff, #8811c5);\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    line-height: 80px;\n");
      out.write("}\n");
      out.write(".form-content\n");
      out.write("{\n");
      out.write("    padding: 5%;\n");
      out.write("    border: 1px solid #ced4da;\n");
      out.write("    margin-bottom: 2%;\n");
      out.write("}\n");
      out.write(".form-control{\n");
      out.write("    border-radius:1.5rem;\n");
      out.write("}\n");
      out.write(".btnSubmit\n");
      out.write("{\n");
      out.write("    border:none;\n");
      out.write("    border-radius:1.5rem;\n");
      out.write("    padding: 1%;\n");
      out.write("    width: 30%;\n");
      out.write("    cursor: pointer;\n");
      out.write("    background: #822EA9;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("    </style>\n");
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