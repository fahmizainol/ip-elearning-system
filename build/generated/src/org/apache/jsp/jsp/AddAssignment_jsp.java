package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddAssignment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("   <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css.css\" />\n");
      out.write("   <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \n");
      out.write("   <title>Document</title>\n");
      out.write(" </head>\n");
      out.write(" \n");
      out.write(" <body>\n");
      out.write("     <nav class=\"navbar\">\n");
      out.write("     <!-- LOGO -->\n");
      out.write("     <div class=\"logo\">E-learning</div>\n");
      out.write("     <!-- NAVIGATION MENU -->\n");
      out.write("     <ul class=\"nav-links\">\n");
      out.write("     <!-- USING CHECKBOX HACK -->\n");
      out.write("<!--     <input type=\"checkbox\" id=\"checkbox_toggle\" />\n");
      out.write("     <label for=\"checkbox_toggle\" class=\"hamburger\">&#9776;</label>-->\n");
      out.write("     <!-- NAVIGATION MENUS -->\n");
      out.write("     <div class=\"menu\">\n");
      out.write("         <li><a href=\"/\">Contacts</a></li>\n");
      out.write("         <li class=\"services\">\n");
      out.write("         <a href=\"/\">My Profile</a>\n");
      out.write("     <!-- DROPDOWN MENU -->\n");
      out.write("<!--     <ul class=\"dropdown\">\n");
      out.write("     <li><a href=\"/\">My Profile </a></li>\n");
      out.write("     <li><a href=\"/\">Settings</a></li>  \n");
      out.write("     </ul>-->\n");
      out.write("\n");
      out.write("     </li>\n");
      out.write("     <li><a href=\"/\">Contacts</a></li>\n");
      out.write("     \n");
      out.write("     </div>\n");
      out.write("     </ul>\n");
      out.write("     </nav>\n");
      out.write("     \n");
      out.write("     <div class=\"container\">\n");
      out.write("         <div class=\"row justify-content-center\">\n");
      out.write("             <div class=\"col-md-8\">\n");
      out.write("                 <div class=\"card\">\n");
      out.write("                     <div class=\"card-header\">Add an Assignment</div>\n");
      out.write("                     <div class=\"card-body\">\n");
      out.write("                         <form class=\"form-horizontal\" method=\"post\" action=\"add.jsp\">\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                 <label for=\"title\" class=\"cols-sm-2 control-label\">Title</label>\n");
      out.write("                                 <div class=\"cols-sm-10\">\n");
      out.write("                                     <div class=\"input-group\">\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"title\" id=\"name\" placeholder=\"Enter the assignment title\" />\n");
      out.write("                                     </div>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                             \n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                        <label for=\"date\" class=\"cols-sm-2 control-label\">Due Date:</label>\n");
      out.write("                                        <div class=\"cols-sm-10\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                        <input type=\"date\" id=\"date\" name=\"date\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                             </div>\n");
      out.write("                                 \n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                 <input type=\"file\" id=\"myFile\" name=\"filename\">\n");
      out.write("                             </div>\n");
      out.write("                  \n");
      out.write("        \n");
      out.write("                             <div class=\"form-group\"> \n");
      out.write("                                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                             </div>\n");
      out.write("                             \n");
      out.write("                             <div class=\"back\">\n");
      out.write("                                 <a href=\"view assignment.jsp\" style=\"text-align: left;\">Back</a>\n");
      out.write("                             </div>\n");
      out.write("                                \n");
      out.write("                         </form>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("     \n");
      out.write("<!--     <div class=\"row\">\n");
      out.write("         <form method=\"POST\" align=\"Left\">\n");
      out.write("             <div>\n");
      out.write("                 <label class=\"form-label\">Title</label>\n");
      out.write("                 <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" required>\n");
      out.write("                 \n");
      out.write("               </div>\n");
      out.write("             \n");
      out.write("             <div>\n");
      out.write("                 <label for=\"date\">Due Date:</label>\n");
      out.write("                 <input type=\"date\" id=\"birthday\" name=\"date\">\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"buttons\">\n");
      out.write("\n");
      out.write("            <div class=\"action_btn\">\n");
      out.write("\n");
      out.write("            <button name=\"submit\" class=\"action_btn submit\" type=\"submit\" value=\"Save\" onclick=\"myFunction()\">Save</button>\n");
      out.write("            <button name=\"submit\" class=\"action_btn cancel\" type=\"submit\" value=\"Cancel\" onclick=\"myFunction2()\">Cancel</button>\n");
      out.write("\n");
      out.write("            <p id=\"saved\"></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                 \n");
      out.write("         </form>\n");
      out.write("     </div>\n");
      out.write(" </body>-->\n");
      out.write("\n");
      out.write("\n");
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
