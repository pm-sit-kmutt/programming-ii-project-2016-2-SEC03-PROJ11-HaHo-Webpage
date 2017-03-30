<%-- 
    Document   : showTread
    Created on : Nov 7, 2015, 12:55:22 AM
    Author     : Matus
--%>

<%@page import="Model.User"%>
<%@page import="java.util.List"%>
<%@page import="Model.Comment"%>
<%@page import="Model.Tread"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Tread t = (Tread) request.getAttribute("tread");
        List<Comment> comments = (List) request.getAttribute("comments");
        int id = 0;
        if (t != null) {
            id = t.getThreadId();
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=t.getHeader()%></title>

        <!----meta---->
        <meta charset="UTF-8" />

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


        <script type="text/javascript" src="js/tinymce.min.js"></script>

        <script src="js/jquery.min.js"></script> 

        <script src="js/jquery.flexslider-min.js"></script>

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



        </script>


        <script src="ckeditor/ckeditor.js"></script>

    </head>



    <body>
    <center><a href="http://localhost:8080/Buffet/index.jsp"> <img src="images/12-1.jpg" alt="head"></a></center> 

    <jsp:include page="WEB-INF/include/pageHeader.jsp"/> 

    <!----##########################################################################################--->





    <%User u = (User) request.getSession().getAttribute("user");
        if (u != null) {
    %>
    <%=u.getUserId()%>
    <%}%>
    <div class="container">

        <div class="blog-header">
            <h2><%=t.getHeader()%></h2>
            <div class="stripe-line">

            </div>
            <div class="clearfix"></div>
            <div class="nav-tell">
                <a href="#">Food</a> >> <a href="#"><%=t.getHeader()%></a>
            </div>

            <hr>

        </div>

        <div class="content-grid">

            <%=t.getThreadBody()%>

        </div>

        <div class="comment">
            <h2>C O M M E N T</h2>


            <%}%>
            <%if (comments != null) {
                    for (Comment c : comments) {

            %>




            <div class="stripe-line"></div>
            <div class="content-coment">
                <div class="img-user">
                    <img style="width: 79px;" src="<%=c.getImage()%>"/>
                </div>
                <div class="name-user">
                    <%=c.getUserName()%> <span><%=c.getCommentTime()%></span>
                </div>
                <div class="commented">
                    <%=c.getCommentBody()%>
                </div>
            </div>




            <%}%>
            <%}%>


            <div class="clearfix"></div>  
            <div class="addComment">
                <form method="post" action="#" enctype="MULTIPART/FORM-DATA">
                    <u><h3>ADD YOUR COMMENT</h3></u>

                    <textarea name="editor1" id="editor1" rows="15" cols="40">
              
                    </textarea>
                    <script>
            // Replace the <textarea id="editor1"> with a CKEditor
            // instance, using default configuration.
            CKEDITOR.replace('editor1');
                    </script>


                    <div class="sended">
                        <input type="submit">
                    </div>


                </form>

            </div>  


        </div>

    </div>     





    <!----##########################################################################################--->  

    <jsp:include page="WEB-INF/include/pageFooter.jsp"/> 



</body>
</html>