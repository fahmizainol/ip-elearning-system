package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .login-card {\n");
      out.write("                padding: 50px;\n");
      out.write("                width: 300px;\n");
      out.write("                background-color:#E5E5E5;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card h1 {\n");
      out.write("                font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=text], input[type=password] {\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card select[type=text], input[type=password] {\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=text]:hover, input[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card select[type=text]:hover, select[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-submit {\n");
      out.write("\n");
      out.write("                border: 1px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color: #822EA9;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-submit:hover {\n");
      out.write("\n");
      out.write("                border: 0px;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("                background-color:#a0a0a0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #666;\n");
      out.write("                font-weight: 400;\n");
      out.write("                text-align: center;\n");
      out.write("                display: inline-block;\n");
      out.write("                opacity: 0.6;\n");
      out.write("                transition: opacity ease 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card a:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-help {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .text{\n");
      out.write("                text-align: center;\n");
      out.write("                font-family:serif,roboto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br/><br/><br/><br/><br/>\n");
      out.write("        <div class=\"login-card\">\n");
      out.write("            <h2 class=\"text\" ><b>E-LEARNING SYSTEM</b></h2><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--            <form method=\"POST\" action=\"../loginUser\">\n");
      out.write("                            <input type=\"text\" name=\"u_name\" placeholder=\"Username\"/>\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("                            <select type=\"text\" name=\"r_id\">\n");
      out.write("                                <option value=\"\" selected=\"selected\"> Login As</option>\n");
      out.write("                                <option value=\"1\"> Teacher</option>\n");
      out.write("                                <option value=\"2\">Student</option>\n");
      out.write("            \n");
      out.write("                            </select>     \n");
      out.write("                            <input type=\"submit\" name=\"btn_login\" class=\"login login-submit\" value=\"Login\"/>\n");
      out.write("                        </form>\n");
      out.write("            \n");
      out.write("                        <div class=\"login-help\">\n");
      out.write("                            <a href=\"register.jsp\"> Register</a>\n");
      out.write("                        </div>-->\n");
      out.write("\n");
      out.write("            <form method=\"POST\" id=\"loginform\">\n");
      out.write("                <input type=\"text\" name=\"txt_username\" placeholder=\"Username\"/>\n");
      out.write("                <input type=\"password\" name=\"txt_password\" placeholder=\"Password\"/>\n");
      out.write("                <select type=\"text\" name=\"txt_role\">\n");
      out.write("                    <option value=\"\" selected=\"selected\"> Login As</option>\n");
      out.write("                    <option value=\"1\"> Teacher</option>\n");
      out.write("                    <option value=\"2\">Student</option>\n");
      out.write("\n");
      out.write("                </select>    \n");
      out.write("                <input type=\"submit\" name=\"btn_login\" class=\"login login-submit\" value=\"Login\"/>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class=\"login-help\">\n");
      out.write("                <a href=\"register.jsp\"> Register</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                //check condition admin login not back index.jsp(login) page
//                if (session.getAttribute("teacher_login") != null) {
//                    response.sendRedirect("teacher_home.jsp");
//                }
//
//                //check condition employee login not back index.jsp(login) page
//                if (session.getAttribute("student_login") != null) {
//                    response.sendRedirect("student_home.jsp");
//                }

                if (request.getParameter("btn_login") != null) {
                    String username, password;
                    int role;

                    username = request.getParameter("txt_username");
                    password = request.getParameter("txt_password");
                    role = Integer.parseInt(request.getParameter("txt_role"));

                    String driver = "com.mysql.jdbc.Driver";
                    String url = "jdbc:mysql://localhost:3306/elearning";
                    String uname = "root";
                    String pwd = "";

                    try {
                        Class.forName(driver); //load driver
                        Connection conn = DriverManager.getConnection(url, uname, pwd);

                        PreparedStatement pstmt = null;

                        pstmt = conn.prepareStatement("SELECT * FROM users WHERE u_name=? AND password=? AND r_id=? ");
                        pstmt.setString(1, username);
                        pstmt.setString(2, password);
                        pstmt.setInt(3, role);
                        ResultSet rs = pstmt.executeQuery();

                        if (rs.next()) {
                            String dbemail = rs.getString("u_name");
                            String dbpassword = rs.getString("password");
                            int dbrole = rs.getInt("r_id");

                            if (username.equals(dbemail) && password.equals(dbpassword) && (role == dbrole)) {
                                if (dbrole == 1) {
                                    session.setAttribute("teacher_login", dbemail);
                                    response.sendRedirect("jsp/teacher_home.jsp");
                                } else if (dbrole == 2) {
                                    session.setAttribute("student_login", dbemail);
                                    response.sendRedirect("registerSub.jsp");
                                }
                            }
                        } else {
                            request.setAttribute("errorMsg", "invalid email or password or role");
                        }

                        pstmt.close();
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
