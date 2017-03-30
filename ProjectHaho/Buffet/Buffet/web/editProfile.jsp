<%-- 
    Document   : editProfile
    Created on : Nov 18, 2015, 9:48:41 PM
    Author     : User!
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
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



        <link rel="stylesheet" type="text/css" href="css/styleEditPro.css">

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


                    
                <%User u = null;
                        if (request.getSession().getAttribute("user") != null) {
                            u = (User) request.getSession().getAttribute("user");
                        }%>
                <%if (u == null) {%>

                <li class="login">
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                </li>
                <li class="login">
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                </li>
                <li class="login"><a href="http://localhost:8080/Buffet/Login.jsp" class="login" 
                                     data-toggle="modal" data-target="#basicModal" >Log in</a>
                </li>


                <%} else {%>

                <%if (u.getIsAdmin().equalsIgnoreCase("y")) {%>
                <li class="addthread"><a class="addthread" href = "#">AddThread</a></li>
                <li class="edit"><a class="edit" href="http://localhost:8080/Buffet/editProfile.jsp" >${user.getUserId()}</a></li>
                <li class="logout"><a class="logout" href="logout" >Log out</a></li>

                <%} else {%>
                <li class="addthread">  &ensp;&ensp;&ensp;&ensp;&ensp; &ensp; &ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</li>
                <li class="edit"><a class="edit" href="http://localhost:8080/Buffet/editProfile.jsp" >[ ${user.getUserId()} ]</a></li>
                <li class="logout"><a class="logout" href="logout" >Log out</a></li>
                    <%}%>
                    <%}%>


                </ul>

            </div>
        </nav>

        <!---#########################################################################################-->
   

        <div class="topic">
            <h1>Edit Profile</h1>
            <div class="phase-text01">
                You can edit discribe "Photograph" is track #7 on the album X. / Mcdaid, Johnny.	
            </div>

            <div class="edit-pro">
                <form method="post" action="editProfile" enctype="MULTIPART/FORM-DATA"  accept-charset="UTF-8">
                    <div id="body-content">
                        
                        First Name &emsp; &emsp; &emsp; &nbsp; &nbsp;
                        <input type="text" id="exampleInputUname" name='fname' value="${user.getUserName()}"aria-required="true" required="required" readonly /><br><br>					
                        Last Name &emsp; &emsp; &emsp; &nbsp;&nbsp;
                        <input type="text" id="exampleInputUsname" name='lname' value="${user.getUserLastName()}" readonly /><br><br>
                        Email &emsp; &emsp; &emsp; &emsp; &emsp; &nbsp;&nbsp;
                        <input type="email" id="exampleInputEmail" name='uemail' value="${user.getUserEmail()}" readonly /><br><br>
                        Username &emsp; &emsp; &emsp; &nbsp;  &nbsp;
                         <input type="text" name='userName' value="${user.getUserId()}" /><br><br>
                        Current password &emsp; 
                        <input type="password" id="userpass" name='upass' placeholder="PassWord" /><br><br>
                        New password &emsp; &emsp; 
                        <input type="password" id="exampleInputPass" placeholder="New Password" name='newpass' /><br><br>
                        Verify password &emsp; &nbsp;&nbsp;
                        <input type="password" id="re_newpass" placeholder=" Verify password " name='re_newpass' /><br><br>


                    </div> 

                    <div class="chang-img">
                        <h3>Image</h3>
                        <img src="images/${user.getUserImage()}" width="222px" /><br><br>
                        <input type="file" name="imagepath" accept="image/*" /><br>

                    </div>

                    <div class="saved">
                        <input type="submit" value="SAVE">
                    </div>
                </form>

            </div>   
        </div>
        <div class="clearfix"></div>

        <!--#################################################################################################-->


        <jsp:include page="WEB-INF/include/pageFooter.jsp"/> 



    </body>
</html>
