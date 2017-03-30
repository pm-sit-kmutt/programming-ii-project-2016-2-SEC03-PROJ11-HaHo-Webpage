<%-- 
    Document   : Register
    Created on : Nov 8, 2015, 11:33:28 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


        
          <link rel="stylesheet" type="text/css" href="css/styleregis.css">

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
    <div class="container">
       

        <div class="register">
            <form id="regis" action ='Register' method="post">
                <div class="register-top-grid">
                     <h2>R E G I S T E R</h2> 
                    <div class="fadeInLeft">
                        <span>First Name<label>*</label></span>
                        <input type="text" name="userFname" required > 
                    </div>
                    <div class="fadeInRight">
                        <span>Last Name<label>*</label></span>
                        <input type="text" name="userLname" required >
                    </div>
                    <div class="fadeInRight">
                        <span>Email Address<label>*</label></span>
                        <input type="text" name="userEmail" required >
                    </div>
                  
 <br><br><br><br><br><br>

                </div>
         
                <div class="register-bottom-grid">
                   
                    <div class="fadeInRight">
                        <span>Username<label>*</label></span>
                        <input type="text" name="username" required >
                    </div>
                    <div class="fadeInLeft">
                        <span>Password<label>*</label></span>
                        <input type="password" name="userPassword" id="password" required >
                    </div>
                    <div class="fadeInRight">
                        <span>Confirm Password<label>*</label></span>
                        <input type="password" name="ReuserPassword" id="confirmPass" required >
                    </div>
                </div>
              
          
            <div class="clearfix"> </div>
            <div class="register-but">
          
                    <br>
                    <input type="submit" value="create you account now" onclick="checkPass()">
                    <div class="clearfix"> </div>
                </form>
            </div>
        </div>
    </div>
<br>
<h3>${request.getAttribute("message")}</h3>
    <div class="clearfix"> </div>


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


    <script language="javaScript">
        var pass = document.getElementById("password");
        var conpass = document.getElementById("confirmPass");
        function checkPass() {
            if (pass.value != conpass.value) {
                conpass.setCustomValidity("Password not match!");
            } else {
                conpass.setCustomValidity("");
            }
        }

    </script>
</body>
</html>