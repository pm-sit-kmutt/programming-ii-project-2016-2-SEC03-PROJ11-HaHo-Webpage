<%-- 
    Document   : food
    Created on : Nov 15, 2015, 6:21:20 PM
    Author     : User!
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>${cat_name}</title>
        
        <!----meta---->
        <meta charset="UTF-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!----CSS-->
        <link rel="stylesheet" type="text/css" href="css/mystyle2.css">
        <link href="css/layout.css" rel="stylesheet" type="text/css" media="all">

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

        <script src="js/jquery.min.js"></script> 

        <script src="js/jquery.flexslider-min.js"></script>


        <style type="text/css">
            body{
                font-family: Century Gothic;


            }

        </style>

        <!--script--->


        <script>
            $(document).ready(function () {
                $("li").hover(function () {
                    var itemwidth = $(this).width(); /* Getting the LI width */
                    $(this).prepend("<div class='hover'></div>"); /* Inserting a blank div into within li above the <a> tag*/
                    $(this).find("div").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/
                    $(this).find("ul").fadeIn('1000').slideDown('10000').css("display", "block");
                }, function () {

                    $(this).find("div").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */
                    $(this).find("div").remove();/* removing the <div> code from html at every mouseout event*/
                    $(this).find("ul").fadeOut('1000'); /* fading out the sub menu */
                });
            });





            $(document).scroll(function (e) {
                var scrollTop = $(document).scrollTop();
                if (scrollTop > 200) {
                    console.log(scrollTop);
                    $('.navbar-default2').removeClass('navbar-static-top').addClass('navbar-fixed-top');
                } else {
                    $('.navbar-default2').removeClass('navbar-fixed-top').addClass('navbar-static-top');
                }
            });







        </script>

        
    </head>
    <body>
         <center><a href="http://localhost:8080/Buffet/index.jsp"> <img src="images/12-1.jpg" alt="head"></a></center> 
        
       <jsp:include page="WEB-INF/include/pageHeader.jsp"/>
       
       
       <div class="container">
        <div class="row">
            <!----##########################################################################################--->
            <div class="col-md-8 top-heading">     
               <h1>--cat_name}</h1><br>  


            </div>
            <!----##########################################################################################--->               
            <div class="clearfix"> </div>
           <c:forEach items="${food_array}" var="food">
            <div class="col-md-4 top-post">
                <div class="post">
                    <div class="post-top">
                        <a href="http://localhost:8080/Buffet/showThread?threadId=1"><img class="img-responsive" src="images/pi5.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="http://localhost:8080/Buffet/showThread?threadId=1">ชื่อเรื่อง</a></h4><p>
                            รายละเอียด
                        </p>
                        <span>08 October.2014</span>
                        <a href="http://localhost:8080/Buffet/showThread?threadId=1" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                    <br>
                </div><!---book--->  






            </div><!--top book-->    
               </c:forEach>
        </div></div>         
       <div class="clearfix"> </div>
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
