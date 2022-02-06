package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <style>\r\n");
      out.write("            .register-card {\r\n");
      out.write("                padding: 50px;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                background-color:#E5E5E5;\r\n");
      out.write("                margin: 0 auto 10px;\r\n");
      out.write("\r\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card h1 {\r\n");
      out.write("                font-weight: 100;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 2.3em;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card input[type=submit] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                position: relative;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card input[type=text], input[type=password] {\r\n");
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
      out.write("            .register-card select[type=text], input[type=password] {\r\n");
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
      out.write("            .register-card input[type=text]:hover, input[type=password]:hover {\r\n");
      out.write("                border: 1px solid #b9b9b9;\r\n");
      out.write("                border-top: 1px solid #a0a0a0;\r\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card select[type=text]:hover, select[type=password]:hover {\r\n");
      out.write("                border: 1px solid #b9b9b9;\r\n");
      out.write("                border-top: 1px solid #a0a0a0;\r\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                font-family: 'Arial', sans-serif;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                height: 36px;\r\n");
      out.write("                padding: 0 8px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-submit {\r\n");
      out.write("\r\n");
      out.write("                border: 1px;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \r\n");
      out.write("                background-color: #822EA9;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\r\n");
      out.write("                width: 100%;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-submit:hover {\r\n");
      out.write("\r\n");
      out.write("                border: 0px;\r\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\r\n");
      out.write("                background-color:#a0a0a0;\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: #666;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                opacity: 0.6;\r\n");
      out.write("                transition: opacity ease 0.5s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-card a:hover {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .register-help {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                text-align:right;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .text{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-family:serif,roboto;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br/><br/><br/><br/><br/>\r\n");
      out.write("        <div class=\"register-card\">\r\n");
      out.write("            <h2 class=\"text\" ><b>Registration </b></h2><br>\r\n");
      out.write("\r\n");
      out.write("            <form  name=\"form\" method=\"POST\" action=\"RegisterUser\">\r\n");
      out.write("\r\n");
      out.write("                <input type=\"text\" name=\"u_name\" placeholder=\"Username\">\r\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"E-mail\"/>\r\n");
      out.write("                 <input type=\"text\" name=\"phone\" placeholder=\"Phone Number\"/>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("\r\n");
      out.write("                <select type=\"text\" name=\"r_id\">\r\n");
      out.write("                  <option value=\"\" selected=\"selected\"> Register as: </option>\r\n");
      out.write("                    <option value=\"1\"> Teacher</option>\r\n");
      out.write("                    <option value=\"2\">Student</option>\r\n");
      out.write("                </select>   \r\n");
      out.write("                <input type=\"submit\" name=\"regs\" class=\"register register-submit\" value=\"Register\" >\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"register-help\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/login.jsp\"> Back </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

//                if (request.getParameter("btn_register") != null) {
//                    String firstname, lastname, username, password, role;
//
//                    firstname = request.getParameter("txt_firstname");
//                    lastname = request.getParameter("txt_lastname");
//                    username = request.getParameter("txt_username");
//                    password = request.getParameter("txt_password");
//                    role = request.getParameter("txt_role");
//
//                    String driver = "com.mysql.jdbc.Driver";
//                    String dburl = "jdbc:mysql://localhost:3306/userdata";
//                    String dbuname = "root";
//                    String dbpwd = "";
//
//                    try {
//                        Class.forName(driver);
//                       Connection con=DriverManager.getConnection(dburl,dbuname,dbpwd); 
//            
//            PreparedStatement pstmt=null; 
//            
//            pstmt=con.prepareStatement("SELECT * FROM tbl_user WHERE username=? "); 
//            pstmt.setString(1,username); 
//            ResultSet rs=pstmt.executeQuery(); 
//           
//            if(rs.next())
//            {
//                String checkUsername=rs.getString("username");
//                
//                if(username.equals(checkUsername))    
//                {
//                    request.setAttribute("errorMsg", "sorry email already exist"); 
//                }
//            }
//            else
//            {
//                pstmt=con.prepareStatement("INSERT INTO tbl_user(firstname,lastname,username,password,role) VALUES(?,?,?,?,?)"); 
//                pstmt.setString(1,firstname);
//                pstmt.setString(2,lastname);
//                pstmt.setString(3,username);           
//                pstmt.setString(4,password);
//                pstmt.setString(5,role);
//                pstmt.executeUpdate(); 
//                
//                request.setAttribute("successMsg", "register successfully please login account"); 
//            }
//            
//            pstmt.close();  
//            con.close(); 
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }

      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
