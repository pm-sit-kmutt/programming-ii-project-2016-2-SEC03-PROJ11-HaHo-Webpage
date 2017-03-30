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

        <!--tiny MCE-->

        <script language="javascript" type="text/javascript" src="tinymce/jscripts/tiny_mce/tiny_mce.js"></script>
        <script language="javascript" type="text/javascript">
            tinyMCE.init({
                // General options
                mode: "textareas",
                theme: "advanced",
                plugins: "autolink,lists,spellchecker,pagebreak,style,layer,table,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template",
                // Theme options
                theme_advanced_buttons1: "save,newdocument,|,bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,|,styleselect,formatselect,fontselect,fontsizeselect",
                theme_advanced_buttons2: "cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,anchor,image,cleanup,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor",
                theme_advanced_buttons3: "",
                theme_advanced_buttons4: "insertlayer,moveforward,movebackward,absolute,|,styleprops,spellchecker,|,cite,abbr,acronym,del,ins,attribs,|,visualchars,nonbreaking,template,blockquote,pagebreak,|,insertfile,insertimage",
                theme_advanced_toolbar_location: "top",
                theme_advanced_toolbar_align: "left",
                theme_advanced_statusbar_location: "bottom",
                theme_advanced_resizing: true,
                extended_valid_elements: "a[name | href | target | title | onclick] img[class | src | border = 0 | alt | title | hspace | vspace | width | height | align | onmouseover | onmouseout | name] hr[class | width | size | noshade], font[face | size | color | style], span[class | align | style]",
                // Skin options
                skin: "o2k7",
                skin_variant: "silver",
                // Example content CSS (should be your site CSS)
                content_css: "css/example.css",
                // Drop lists for link/image/media/template dialogs
                template_external_list_url: "js/template_list.js",
                external_link_list_url: "js/link_list.js",
                external_image_list_url: "js/image_list.js",
                media_external_list_url: "js/media_list.js",
                // Replace values for the template plugin
                template_replace_values: {
                    username: "Some User",
                    staffid: "991234"
                }
            });
        </script>


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




    </head>



    <body>
    <center><a href="http://localhost:8080/Buffet/index.jsp"> <img src="images/12-1.jpg" alt="head"></a></center> 

    <jsp:include page="WEB-INF/include/pageHeader.jsp"/> 

    <!----##########################################################################################--->





    <%User u = (User) request.getSession().getAttribute("user");
    if(u != null){
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
            <h3>comment</h3>


            <%}%>
            <%if (comments != null) {
                    for (Comment c : comments) {

            %>




            <div class="stripe-line"></div>

            <div class="content-coment">
                <%=c.getCommentBody()%><br>
                <%=c.getCommentTime()%><br>
                <hr>
            </div>

            <%}%>
            <%}%>


            <form method="post" action="Comment">
                <textarea name="body" cols="80" rows="15" placeholder="This is some content that comment">
                    
                </textarea><br>
                <input type = "hidden" value = "<%=id%>" name = "ttid">
                <input type = "submit" value = "POST !">
            </form>


        </div>

    </div>     





    <!----##########################################################################################--->  

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