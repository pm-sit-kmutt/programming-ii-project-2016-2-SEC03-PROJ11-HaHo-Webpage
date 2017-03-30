<%-- 
    Document   : Login
    Created on : Nov 8, 2015, 11:22:04 AM
    Author     : Administrator
--%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>


        <!----meta---->
        <meta charset="UTF-8" />

        <!----CSS-->
        <link rel="stylesheet" type="text/css" href="css/mystyle2.css">
          

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

        
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css">
       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

        
       
        <script src="js/jquery.min.js"></script> 

        <script src="js/jquery.flexslider-min.js"></script>

        <script>
            $(document).ready(function () {
                $("li").hover(function () {
                    var itemwidth = $(this).width();
                    $(this).prepend("<div class='hover'></div>");
                    $(this).find("div").fadeIn('10000').css({'width': itemwidth});
                    $(this).find("ul").fadeIn('1000').slideDown('10000').css("display", "block");
                }, function () {

                    $(this).find("div").slideUp('1000').fadeOut('1000');
                    $(this).find("div").remove();
                    $(this).find("ul").fadeOut('1000');
                });
            });
        </script>


    </head>
    <body>

    <center><a href="http://localhost:8080/Buffet/index.jsp"> <img src="images/12-1.jpg" alt="head"></a></center> 

    <jsp:include page="WEB-INF/include/pageHeader.jsp"/> 


    <!----##########################################################################################--->


    <!----##########################################################################################--->   


    <div class="login-page">
        <div class="container">
            <div class="account_grid">
                <div class="col-md-6 login-left ">
                    <h3>NEW CUSTOMERS</h3>
                    <p>By creating an account with our page, you will be able to comment process faster, get some duty cupom , bla bla bla super junior Donghae Kihae is real and more.</p>
                    <a class="acount-btn" href="http://localhost:8080/Buffet/Register.jsp">Create an Account</a>
                </div>

                <!------------------------------------------------------->                
                <div class="col-md-6 login-right">
                    <h3>REGISTERED CUSTOMERS</h3>
                    <p>If you have an account with us, please log in.</p>
                    <form action="Login" method="post">
                        <div>
                            <span>Email Address<label>*</label></span>
                            <input type="text" name="username"> 
                        </div>
                        <div>
                            <span>Password<label>*</label></span>
                            <input type="password" name="userPassword"> 
                        </div>
                        <a class="forgot" href="#">Forgot Your Password?</a>
                        <input type="submit" value="Login">
                    </form>
                </div>	


                <h3>${request.getAttribute("message")}</h3>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
    <!--#################################################################################################-->
    <div class="footer">
        <hr>
        <center>
            <p style="color:white">© SIT KMUTT 2015 | Designed by Project X </p>
            <a href="#">About Us</a> &emsp; &emsp;
            <a href="#">Contact Us</a> &emsp; &emsp;
            <a href="#">Privacy Policy</a> &emsp; &emsp;
            <a href="#">Terms & Condition</a>
        </center>
    </div>

</body>
</html>

