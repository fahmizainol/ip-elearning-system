package org.apache.jsp.jsp;

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .register-card {\n");
      out.write("                padding: 50px;\n");
      out.write("                width: 300px;\n");
      out.write("                background-color:#E5E5E5;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: hidden;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card h1 {\n");
      out.write("                font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card input[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card input[type=text], input[type=password] {\n");
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
      out.write("            .register-card select[type=text], input[type=password] {\n");
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
      out.write("            .register-card input[type=text]:hover, input[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card select[type=text]:hover, select[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-submit {\n");
      out.write("\n");
      out.write("                border: 1px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color: #822EA9;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-submit:hover {\n");
      out.write("\n");
      out.write("                border: 0px;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("                background-color:#a0a0a0;\n");
      out.write("                \n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #666;\n");
      out.write("                font-weight: 400;\n");
      out.write("                text-align: center;\n");
      out.write("                display: inline-block;\n");
      out.write("                opacity: 0.6;\n");
      out.write("                transition: opacity ease 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-card a:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-help {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align:right;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .text{\n");
      out.write("                text-align: center;\n");
      out.write("                font-family:serif,roboto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/><br/><br/><br/><br/>\n");
      out.write("        <div class=\"register-card\">\n");
      out.write("            <h2 class=\"text\" ><b>Registration </b></h2><br>\n");
      out.write("\n");
      out.write("            <form commandName=\"user_registration\"  method=\"POST\" action=\"user_registration\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"txt_username\" placeholder=\"Username\">\n");
      out.write("                <input type=\"text\" path=\"email\" placeholder=\"E-mail\"/>\n");
      out.write("                 <input type=\"text\" path=\"phone\" placeholder=\"Phone Number\"/>\n");
      out.write("                <input type=\"password\" name=\"txt_password\" placeholder=\"Password\">\n");
      out.write("\n");
      out.write("                <select type=\"text\" path=\"r_id\">\n");
      out.write("                    <option value=\"\">Registration As</option>\n");
      out.write("                    <forEach var=\"role\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roles}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.r_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.r_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </option>\n");
      out.write("                    </forEach>\n");
      out.write("                </select>   \n");
      out.write("                <input type=\"submit\" name=\"regs\" class=\"register register-submit\" value=\"Register\" >\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class=\"register-help\">\n");
      out.write("                <a href=\"login.jsp\"> Back </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
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

      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
