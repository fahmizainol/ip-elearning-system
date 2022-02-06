package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Lecturer;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <style>\r\n");
      out.write("            .login-card {\r\n");
      out.write("                padding: 50px;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                background-color:#E5E5E5;\r\n");
      out.write("                margin: 0 auto 10px;\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card h1 {\r\n");
      out.write("                font-weight: 100;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 2.3em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card input[type=submit] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                position: relative;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card input[type=text], input[type=password] {\r\n");
      out.write("                height: 44px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                -webkit-appearance: none;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                border: 1px solid #d9d9d9;\r\n");
      out.write("                border-top: 1px solid #c0c0c0;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\r\n");
      out.write("                padding: 0 8px;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                -moz-box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card select[type=text], input[type=password] {\r\n");
      out.write("                height: 44px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                -webkit-appearance: none;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                border: 1px solid #d9d9d9;\r\n");
      out.write("                border-top: 1px solid #c0c0c0;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\r\n");
      out.write("                padding: 0 8px;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                -moz-box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card input[type=text]:hover, input[type=password]:hover {\r\n");
      out.write("                border: 1px solid #b9b9b9;\r\n");
      out.write("                border-top: 1px solid #a0a0a0;\r\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card select[type=text]:hover, select[type=password]:hover {\r\n");
      out.write("                border: 1px solid #b9b9b9;\r\n");
      out.write("                border-top: 1px solid #a0a0a0;\r\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                font-family: 'Arial', sans-serif;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                height: 36px;\r\n");
      out.write("                padding: 0 8px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-submit {\r\n");
      out.write("\r\n");
      out.write("                border: 1px;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \r\n");
      out.write("                background-color: #822EA9;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-submit:hover {\r\n");
      out.write("\r\n");
      out.write("                border: 0px;\r\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\r\n");
      out.write("                background-color:#a0a0a0;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: #666;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                opacity: 0.6;\r\n");
      out.write("                transition: opacity ease 0.5s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-card a:hover {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-help {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .text{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-family:serif,roboto;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <br/><br/><br/><br/><br/>\r\n");
      out.write("        <div class=\"login-card\">\r\n");
      out.write("            <h2 class=\"text\" ><b>E-LEARNING SYSTEM</b></h2><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--            <form method=\"POST\" action=\"../loginUser\">\r\n");
      out.write("                            <input type=\"text\" name=\"u_name\" placeholder=\"Username\"/>\r\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Password\"/>\r\n");
      out.write("                            <select type=\"text\" name=\"r_id\">\r\n");
      out.write("                                <option value=\"\" selected=\"selected\"> Login As</option>\r\n");
      out.write("                                <option value=\"1\"> Teacher</option>\r\n");
      out.write("                                <option value=\"2\">Student</option>\r\n");
      out.write("            \r\n");
      out.write("                            </select>     \r\n");
      out.write("                            <input type=\"submit\" name=\"btn_login\" class=\"login login-submit\" value=\"Login\"/>\r\n");
      out.write("                        </form>\r\n");
      out.write("            \r\n");
      out.write("                        <div class=\"login-help\">\r\n");
      out.write("                            <a href=\"register.jsp\"> Register</a>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("\r\n");
      out.write("            <form method=\"get\" id=\"loginform\" >\r\n");
      out.write("                <input type=\"text\" name=\"txt_username\" placeholder=\"Username\"/>\r\n");
      out.write("                <input type=\"password\" name=\"txt_password\" placeholder=\"Password\"/>\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"view\"/>\r\n");
      out.write("                <select type=\"text\" name=\"txt_role\">\r\n");
      out.write("                    <option selected=\"selected\"> Login As</option>\r\n");
      out.write("                    <option value=\"1\"> Teacher</option>\r\n");
      out.write("                    <option value=\"2\">Student</option>\r\n");
      out.write("\r\n");
      out.write("                </select>    \r\n");
      out.write("                <input type=\"submit\" name=\"btn_login\" class=\"login login-submit\" value=\"Login\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-help\">\r\n");
      out.write("                <a href=\"register.jsp\"> Register</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
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
                                    response.sendRedirect("CourseServlet");
                                } else if (dbrole == 2) {
                                    session.setAttribute("student_login", dbemail);
                                    response.sendRedirect("student_home.jsp");
                                    
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
            
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
