<%-- 
    Document   : register
    Created on : Jan 7, 2022, 3:05:04 PM
    Author     : muham
--%>

<%--<%@page import="java.sql.*"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .register-card {
                padding: 50px;
                width: 300px;
                background-color:#E5E5E5;
                margin: 0 auto 10px;

                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                overflow: hidden;

            }

            .register-card h1 {
                font-weight: 100;
                text-align: center;
                font-size: 2.3em;

            }

            .register-card input[type=submit] {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                position: relative;


            }

            .register-card input[type=text], input[type=password] {
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                border-radius: 10px;
                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
            }

            .register-card select[type=text], input[type=password] {
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                border-radius: 10px;
                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
            }

            .register-card input[type=text]:hover, input[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }

            .register-card select[type=text]:hover, select[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }

            .register {
                text-align: center;
                font-size: 14px;
                font-family: 'Arial', sans-serif;
                font-weight: 700;
                height: 36px;
                padding: 0 8px;

            }

            .register-submit {

                border: 1px;
                border-radius: 3px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
                background-color: #822EA9;
                border-radius: 10px;
                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
                width: 100%;

            }

            .register-submit:hover {

                border: 0px;
                text-shadow: 0 1px rgba(0,0,0,0.3);
                background-color:#a0a0a0;
                

            }

            .register-card a {
                text-decoration: none;
                color: #666;
                font-weight: 400;
                text-align: center;
                display: inline-block;
                opacity: 0.6;
                transition: opacity ease 0.5s;
            }

            .register-card a:hover {
                opacity: 1;
            }

            .register-help {
                width: 100%;
                text-align:right;
                font-size: 20px;
            }
            .text{
                text-align: center;
                font-family:serif,roboto;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <br/><br/><br/><br/><br/>
        <div class="register-card">
            <h2 class="text" ><b>Registration </b></h2><br>

            <form   method="POST" action="RegisterUSer">

                <input type="text" name="txt_username" placeholder="Username">
                <input type="text" path="email" placeholder="E-mail"/>
                 <input type="text" path="phone" placeholder="Phone Number"/>
                <input type="password" name="txt_password" placeholder="Password">

                <select type="text" path="r_id">
                    <option value="">Registration As</option>
                    <forEach var="role" items="${roles}">
                        <option value="${role.r_id}">${role.r_name}
                        </option>
                    </forEach>
                </select>   
                <input type="submit" name="regs" class="register register-submit" value="Register" >
            </form>

            <div class="register-help">
                <a href="login.jsp"> Back </a>
            </div>


            <%
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
%>
            


    </body>

</html>



