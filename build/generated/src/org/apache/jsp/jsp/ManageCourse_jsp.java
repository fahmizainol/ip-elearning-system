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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write(" <head>\r\n");
      out.write("   <meta charset=\"UTF-8\" />\r\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"../css/Dashboard2.css\" />\r\n");
      out.write("   <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("    /* UTILITIES */\r\n");
      out.write("* {\r\n");
      out.write(" margin: 0;\r\n");
      out.write(" padding: 0;\r\n");
      out.write(" box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write(" font-family: cursive;\r\n");
      out.write("}\r\n");
      out.write("a {\r\n");
      out.write(" text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("li {\r\n");
      out.write(" list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* NAVBAR STYLING STARTS */\r\n");
      out.write(".navbar {\r\n");
      out.write(" display: flex;\r\n");
      out.write(" align-items: center;\r\n");
      out.write(" justify-content: space-between;\r\n");
      out.write(" padding: 20px;\r\n");
      out.write(" background-color: teal;\r\n");
      out.write(" color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".nav-links a {\r\n");
      out.write(" color: #fff;\r\n");
      out.write("}\r\n");
      out.write("/* LOGO */\r\n");
      out.write(".logo {\r\n");
      out.write(" font-size: 32px;\r\n");
      out.write("}\r\n");
      out.write("/* NAVBAR MENU */\r\n");
      out.write(".menu {\r\n");
      out.write(" display: flex;\r\n");
      out.write(" gap: 1em;\r\n");
      out.write(" font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".menu li:hover {\r\n");
      out.write(" background-color: #4c9e9e;\r\n");
      out.write(" border-radius: 5px;\r\n");
      out.write(" transition: 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write(".menu li {\r\n");
      out.write(" padding: 5px 14px;\r\n");
      out.write("}\r\n");
      out.write("/* DROPDOWN MENU */\r\n");
      out.write(".services {\r\n");
      out.write(" position: relative; \r\n");
      out.write("}\r\n");
      out.write(".dropdown {\r\n");
      out.write(" background-color: rgb(1, 139, 139);\r\n");
      out.write(" padding: 1em 0;\r\n");
      out.write(" position: absolute; /*WITH RESPECT TO PARENT*/\r\n");
      out.write(" display: none;\r\n");
      out.write(" border-radius: 8px;\r\n");
      out.write(" top: 35px;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li + li {\r\n");
      out.write(" margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li {\r\n");
      out.write(" padding: 0.5em 1em;\r\n");
      out.write(" width: 8em;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li:hover {\r\n");
      out.write(" background-color: #4c9e9e;\r\n");
      out.write("}\r\n");
      out.write(".services:hover .dropdown {\r\n");
      out.write(" display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*sidebar*/\r\n");
      out.write(".sidebar {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  background-color: #f1f1f1;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  overflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding: 40px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(".sidebar a.active {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar a:hover:not(.active) {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.content {\r\n");
      out.write("  margin-left: 200px;\r\n");
      out.write("  padding: 1px 16px;\r\n");
      out.write("  height: 1000px;\r\n");
      out.write("  padding: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.content1{\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("    border-style: solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("  width: 250px;\r\n");
      out.write("  height: 250px;\r\n");
      out.write("  text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 700px) {\r\n");
      out.write("  .sidebar {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("  .sidebar a {float: left;}\r\n");
      out.write("  div.content {margin-left: 0;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 400px) {\r\n");
      out.write("  .sidebar a {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("   <title>Document</title>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   <nav class=\"navbar\">\r\n");
      out.write("     <!-- LOGO -->\r\n");
      out.write("     <div class=\"logo\">E-learning</div>\r\n");
      out.write("     <!-- NAVIGATION MENU -->\r\n");
      out.write("     <ul class=\"nav-links\">\r\n");
      out.write("       <!-- NAVIGATION MENUS -->\r\n");
      out.write("       <div class=\"menu\">\r\n");
      out.write("<!--           <li><a href=\"/\">Contacts</a></li>-->\r\n");
      out.write("            <li class=\"services\">\r\n");
      out.write("           <a href=\"/\">Profile</a>\r\n");
      out.write("           <!-- DROPDOWN MENU -->\r\n");
      out.write("           <ul class=\"dropdown\">\r\n");
      out.write("             <li><a href=\"/\">My Profile </a></li>\r\n");
      out.write("             <li><a href=\"/\">Settings</a></li>  \r\n");
      out.write("           </ul>\r\n");
      out.write("\r\n");
      out.write("         </li>\r\n");
      out.write("         <li><a href=\"/\">Contacts</a></li>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("       </div>\r\n");
      out.write("     </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("     \r\n");
      out.write(" <div class=\"sidebar\">\r\n");
      out.write("  <a class=\"active\" href=\"#home\">Courses</a>\r\n");
      out.write("  <a href=\"jsp/ViewAssignment.jsp\">Assignment</a>\r\n");
      out.write("  <a href=\"#contact\">Student List</a>\r\n");
      out.write("  <a href=\"#about\">Manage Grade</a>\r\n");
      out.write("  <a href=\"#about\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"content\">\r\n");
      out.write("        <div class=\"content1\">\r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("                <h2>Manage Course</h2>\r\n");
      out.write("                <p>Teach new course or withdraw from the current taught courses</p>\r\n");
      out.write("\r\n");
      out.write("       <!--          <div style=\"text-align: right;\"><img src=\"books.png\" alt=\"Sunflower\"></div>-->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content2\">\r\n");
      out.write("            <div class=\"mt-4\">\r\n");
      out.write("                <p><b>Currently taught courses</b></p>\r\n");
      out.write("                <table class=\"table table-striped table-light border-light\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"col\">No.</th>\r\n");
      out.write("                        <th scope=\"col\">Course Code</th>\r\n");
      out.write("                        <th scope=\"col\">Course Title</th>\r\n");
      out.write("                        <th scope=\"col\">No. Of Students</th>\r\n");
      out.write("                        <th scope=\"col\">Actions</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("\r\n");
      out.write("                  </table>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"content3\">\r\n");
      out.write("            <div class=\"mt-5\">\r\n");
      out.write("                <p><b>Add courses to teach</b></p>\r\n");
      out.write("                <table class=\"table table-striped table-light border-light\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th scope=\"col\">No.</th>\r\n");
      out.write("                        <th scope=\"col\">Course Code</th>\r\n");
      out.write("                        <th scope=\"col\">Course Title</th>\r\n");
      out.write("                        <th scope=\"col\">No. Of Students</th>\r\n");
      out.write("                        <th scope=\"col\">Actions</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </tbody>\r\n");
      out.write("\r\n");
      out.write("                  </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td scope=\"row\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td><a href=\"add?id=");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Add</a></td>\r\n");
          out.write("                                </tr>\r\n");
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

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
