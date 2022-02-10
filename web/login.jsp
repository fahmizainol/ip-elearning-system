


<%@page import="Model.Lecturer"%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .login-card {
                padding: 50px;
                width: 300px;
                background-color:#E5E5E5;
                margin: 0 auto 10px;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                overflow: hidden;
            }

            .login-card h1 {
                font-weight: 100;
                text-align: center;
                font-size: 2.3em;
            }

            .login-card input[type=submit] {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                position: relative;
            }

            .login-card input[type=text], input[type=password] {
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

            .login-card select[type=text], input[type=password] {
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

            .login-card input[type=text]:hover, input[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }

            .login-card select[type=text]:hover, select[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }

            .login {
                text-align: center;
                font-size: 14px;
                font-family: 'Arial', sans-serif;
                font-weight: 700;
                height: 36px;
                padding: 0 8px;

            }

            .login-submit {

                border: 1px;
                border-radius: 3px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
                background-color: #822EA9;
                border-radius: 10px;
                box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);

            }

            .login-submit:hover {

                border: 0px;
                text-shadow: 0 1px rgba(0,0,0,0.3);
                background-color:#a0a0a0;

            }

            .login-card a {
                text-decoration: none;
                color: #666;
                font-weight: 400;
                text-align: center;
                display: inline-block;
                opacity: 0.6;
                transition: opacity ease 0.5s;
            }

            .login-card a:hover {
                opacity: 1;
            }

            .login-help {
                width: 100%;
                text-align: center;
                font-size: 20px;
            }
            .text{
                text-align: center;
                font-family:serif,roboto;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <br/><br/><br/><br/><br/>
        <div class="login-card">
            <h2 class="text" ><b>E-LEARNING SYSTEM</b></h2><br>


            

            <form method="get" id="loginform" action="loginUser">
                <input type="text" name="txt_username" placeholder="Username"/>
                <input type="password" name="txt_password" placeholder="Password"/>
                <input type="hidden" name="action" value="home"/>
                <select type="text" name="txt_role">
                    <option selected="selected"> Login As</option>
                    <option value="1"> Teacher</option>
                    <option value="2">Student</option>

                </select>    
                <input type="submit" name="btn_login" class="login login-submit" value="Login"/>
            </form>

            <div class="login-help">
                <a href="register.jsp"> Register</a>
            </div>
           
    </body>
</html>

