package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("   <meta charset=\"UTF-8\" />\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/Dashboard2.css\" />\n");
      out.write("   <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    /* UTILITIES */\n");
      out.write("* {\n");
      out.write(" margin: 0;\n");
      out.write(" padding: 0;\n");
      out.write(" box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write(" font-family: cursive;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write(" text-decoration: none;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write(" list-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* NAVBAR STYLING STARTS */\n");
      out.write(".navbar {\n");
      out.write(" display: flex;\n");
      out.write(" align-items: center;\n");
      out.write(" justify-content: space-between;\n");
      out.write(" padding: 20px;\n");
      out.write(" background-color: teal;\n");
      out.write(" color: #fff;\n");
      out.write("}\n");
      out.write(".nav-links a {\n");
      out.write(" color: #fff;\n");
      out.write("}\n");
      out.write("/* LOGO */\n");
      out.write(".logo {\n");
      out.write(" font-size: 32px;\n");
      out.write("}\n");
      out.write("/* NAVBAR MENU */\n");
      out.write(".menu {\n");
      out.write(" display: flex;\n");
      out.write(" gap: 1em;\n");
      out.write(" font-size: 18px;\n");
      out.write("}\n");
      out.write(".menu li:hover {\n");
      out.write(" background-color: #4c9e9e;\n");
      out.write(" border-radius: 5px;\n");
      out.write(" transition: 0.3s ease;\n");
      out.write("}\n");
      out.write(".menu li {\n");
      out.write(" padding: 5px 14px;\n");
      out.write("}\n");
      out.write("/* DROPDOWN MENU */\n");
      out.write(".services {\n");
      out.write(" position: relative; \n");
      out.write("}\n");
      out.write(".dropdown {\n");
      out.write(" background-color: rgb(1, 139, 139);\n");
      out.write(" padding: 1em 0;\n");
      out.write(" position: absolute; /*WITH RESPECT TO PARENT*/\n");
      out.write(" display: none;\n");
      out.write(" border-radius: 8px;\n");
      out.write(" top: 35px;\n");
      out.write("}\n");
      out.write(".dropdown li + li {\n");
      out.write(" margin-top: 10px;\n");
      out.write("}\n");
      out.write(".dropdown li {\n");
      out.write(" padding: 0.5em 1em;\n");
      out.write(" width: 8em;\n");
      out.write(" text-align: center;\n");
      out.write("}\n");
      out.write(".dropdown li:hover {\n");
      out.write(" background-color: #4c9e9e;\n");
      out.write("}\n");
      out.write(".services:hover .dropdown {\n");
      out.write(" display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*sidebar*/\n");
      out.write(".sidebar {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 200px;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  position: fixed;\n");
      out.write("  height: 100%;\n");
      out.write("  overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a {\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  padding: 40px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".sidebar a.active {\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a:hover:not(.active) {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.content {\n");
      out.write("  margin-left: 200px;\n");
      out.write("  padding: 1px 16px;\n");
      out.write("  height: 1000px;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.content1{\n");
      out.write("    padding: 40px;\n");
      out.write("    border-style: solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  width: 250px;\n");
      out.write("  height: 250px;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 700px) {\n");
      out.write("  .sidebar {\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("    position: relative;\n");
      out.write("  }\n");
      out.write("  .sidebar a {float: left;}\n");
      out.write("  div.content {margin-left: 0;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 400px) {\n");
      out.write("  .sidebar a {\n");
      out.write("    text-align: center;\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("   <title>Document</title>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" \n");
      out.write("\n");
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
      out.write("   </nav>\n");
      out.write("     \n");
      out.write(" <div class=\"sidebar\">\n");
      out.write("  <a class=\"active\" href=\"#home\">Courses</a>\n");
      out.write("  <a href=\"#news\">Assignment</a>\n");
      out.write("  <a href=\"#contact\">Student List</a>\n");
      out.write("  <a href=\"#about\">Manage Grade</a>\n");
      out.write("  <a href=\"#about\">Logout</a>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("     <div class=\"content\">\n");
      out.write("        <div class=\"content1\">\n");
      out.write("            <div class=\"text\">\n");
      out.write("                <h2>Manage Course</h2>\n");
      out.write("                <p>Teach new course or withdraw from the current taught courses</p>\n");
      out.write("\n");
      out.write("       <!--          <div style=\"text-align: right;\"><img src=\"books.png\" alt=\"Sunflower\"></div>-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content2\">\n");
      out.write("            <div class=\"mt-4\">\n");
      out.write("                <p><b>Currently taught courses</b></p>\n");
      out.write("                <table class=\"table table-striped table-light border-light\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"col\">No.</th>\n");
      out.write("                        <th scope=\"col\">Course Code</th>\n");
      out.write("                        <th scope=\"col\">Course Title</th>\n");
      out.write("                        <th scope=\"col\">No. Of Students</th>\n");
      out.write("                        <th scope=\"col\">Actions</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                  </table>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"content3\">\n");
      out.write("            <div class=\"mt-5\">\n");
      out.write("                <p><b>Add courses to teach</b></p>\n");
      out.write("                <table class=\"table table-striped table-light border-light\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"col\">No.</th>\n");
      out.write("                        <th scope=\"col\">Course Code</th>\n");
      out.write("                        <th scope=\"col\">Course Title</th>\n");
      out.write("                        <th scope=\"col\">No. Of Students</th>\n");
      out.write("                        <th scope=\"col\">Actions</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                  </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write(" </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("course");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCourse}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td scope=\"row\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.courseName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.studentCount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
