<%-- 
    Document   : addThread
    Created on : Nov 17, 2015, 10:07:10 PM
    Author     : User!
--%>

<%@page import="Model.User"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Add Thread</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

        <script src="js/jquery.min.js"></script> 

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

         <script src="ckeditor/ckeditor.js"></script>
         
        <link rel="stylesheet" type="text/css" href="css/styleAddThread.css">

       


    </head>
    <body>
        <nav class="navbar navbar-default2">   
            <div class="navbar-header" id="nav02">
                <ul>
                    <div class="hover" style="display:block; width:120px;"></div>
                    <li class="dropdown">
                        <a href="http://localhost:8080/Buffet/index.jsp" class="dropdown-toggle" 
                           data-toggle="dropdown" role="button" aria-expanded="false">H O M E </span></a> </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Promotion</a>
                        <ul class="dropdown-menu" role="menu">
                            <a href="#">Food</a>
                            <a href="#">Drink</a>
                            <a href="#">Desert</a>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Food</a></li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Drink</a>    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu5 </a></li>

                    <li></li>
                    <li class="login"><a class="addthread" href="#" >Add Thread</a></li>
                    <li class="login"><a class="edit" href="#" >Edit Profile</a></li>
                    <li class="login"><a class="logout" href="logout" >Log out</a></li>


                </ul>

            </div>
        </nav>

        <!--########################################################################-->

        <div class="topic">
            <h1>Add New Post
                <a href="http://localhost:8080/Buffet/addThread.jsp" class="addnew-topic">Add New</a> </h1>
            <div class="phase-text01">
                "Photograph" is track #7 on the album X. It was written by Sheeran, Ed / Mcdaid, Johnny.	
            </div>

            <div class="poststuff">
                <form method="post" action="testPost" enctype="MULTIPART/FORM-DATA" accept-charset="UTF-8">
                    <div id="body-content">
                        <h3>TOPIC</h3>
                        <input type="text" placeholder="Name Topic" name = "header"/><br>

                        <h3 >Content</h3>
                        <button> <i class="fa fa-map-marker"> Add Location </i></button>
                        <button> <i class="fa fa-bar-chart ">  Add Poll </i></button>
                        <button> <i class="fa fa-youtube-play"> Add Video </i></button>
                        <input type="file" name="imagepath"  />
                        <br><br>
                        <textarea name="body" id="editor1" rows="15" cols="40">
              
                        </textarea>
                        <script>
            // Replace the <textarea id="editor1"> with a CKEditor
            // instance, using default configuration.
            CKEDITOR.replace('body');
                        </script>

                    </div> 

                    <div class="cate-content">
                        <h3>Category</h3>
                        <div class="selected">
                            <select name = "tags">
                                <option value="n">--Select--</option>
                                <option value="food">Food</option>
                                <option value="drink">Drink</option>
                                <option value="desert">Desert</option>
                            </select>
                        </div>
                    </div>

                    <div class="posted">
                        <input type="submit" value="CREATE NEW TOPIC">
                    </div>
                </form>

            </div>   




        </div>
        <div class="clearfix"></div>
        <br> <br> <br>

        <div class="footer">
            <center>

                <a href="#">
                    <span class="fa-stack fa-lg">
                        <i class="fa fa-circle fa-stack-2x"></i>
                        <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                    </span>
                </a> &emsp; &emsp;

                <a href="#">
                    <span class="fa-stack fa-lg">
                        <i class="fa fa-circle fa-stack-2x"></i>
                        <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                    </span>
                </a> &emsp; &emsp;

                <a href="#"><span class="fa-stack fa-lg">
                        <i class="fa fa-circle fa-stack-2x"></i>
                        <i class="fa fa-instagram fa-stack-1x fa-inverse"></i>
                    </span></a><br>

                <p style="color:white">
                    <br>
                    © SIT KMUTT 2015 | Designed by group05 </p>
                
            </center>
        </div>



    </body>
</html>
