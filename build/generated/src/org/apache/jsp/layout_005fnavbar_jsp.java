package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_005fnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--INCLUDE IN EACH JSP FILE-->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Dashboard2.css\" />\n");
      out.write("</head>\n");
      out.write("   <nav class=\"navbar\">\n");
      out.write("     <!-- LOGO -->\n");
      out.write("     <div class=\"logo\">E-learning</div>\n");
      out.write("     <!-- NAVIGATION MENU -->\n");
      out.write("     <ul class=\"nav-links\">\n");
      out.write("       <!-- NAVIGATION MENUS -->\n");
      out.write("       <div class=\"menu\">\n");
      out.write("<!--           <li><a href=\"/\">Contacts</a></li>-->\n");
      out.write("            <li class=\"services\">\n");
      out.write("           <a href=\"/\">Profile</a>\n");
      out.write("           <!-- DROPDOWN MENU -->\n");
      out.write("           <ul class=\"dropdown\">\n");
      out.write("             <li><a href=\"/\">My Profile </a></li>\n");
      out.write("             <li><a href=\"/\">Settings</a></li>  \n");
      out.write("           </ul>\n");
      out.write("\n");
      out.write("         </li>\n");
      out.write("         <li><a href=\"/\">Contacts</a></li>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("        \n");
      out.write("       </div>\n");
      out.write("     </ul>\n");
      out.write("   </nav>");
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
