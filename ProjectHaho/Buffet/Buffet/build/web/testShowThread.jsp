<%-- 
    Document   : showTread
    Created on : Nov 7, 2015, 12:55:22 AM
    Author     : Matus
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Comment"%>
<%@page import="Model.Tread"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sfgggggg</title>

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

        <link rel="stylesheet" type="text/css" href="css/mystyletestShow.css">
    </head>



    <body>

    <center><a href="http://localhost:8080/Buffet/index.jsp"> <img src="images/12-1.jpg" alt="head"></a></center> 

    <jsp:include page="WEB-INF/include/pageHeader.jsp"/> 

    <!----##########################################################################################--->






    <div class="container">

        <div class="blog-header">
            <h2>[REVIEW] มาลองเมนูใหม่ ย่างถ่านหอมๆ ที่ โอโตยะ OOTOYA</h2>
            <div class="stripe-line">

            </div>
            <div class="clearfix"></div>
            <div class="nav-tell">
                <a href="#">Food</a> >> <a href="#">[REVIEW] มาลองเมนูใหม่ ย่างถ่านหอมๆ ที่ โอโตยะ OOTOYA</a>
            </div>

            <hr>

        </div>
        
        <div class="content-grid">

            สวัสดีคร้าบ วันนี้มาที่ร้านอาหารญี่ปุ่น Ootoya (โอโตยะ) สาขา Central World เพื่อที่จะมาลองเมนูเซ็ตข้าวของร้านนี้ที่เพิ่งออกใหม่โดยเฉพาะเลยครับ<br>


            เป็นงานที่ทาง Ootoya Thailand และ CRG จัดเพื่อเชิญมาลองชิมเมนูใหม่ของร้านครับ<br>

            โอโตยะ เป็นร้านอาหารญี่ปุ่นแบบดั้งเดิม ในคอนเซปต์ Japanese Homemade Cooking Style ต้นกำเนิดอยู่ที่ญี่ปุ่นเลย<br>
            มีสาขาอยู่ที่นู่น 300 กว่าสาขา แล้วก็คลอดสาขามาที่ประเทศไทย ตอนนี้มี 47 สาขาล่ะ แต่เมนูใหม่ที่จะมารีวิวนี้ เค้าจะเริ่มขายที่<br>
            Ootoya 17 สาขาบนห้างเซ็นทรัลก่อนนะ<br>

            <center><img src="images/test01.jpg"></center> <br>
            เมนูหลักของร้านนี้จะเป็นเมนูเซ็ต (Teishoku) ตามวัฒนธรรมการกินของญี่ปุ่น ที่มีจานหลัก เครื่องเคียง ซุป  และข้าว ซึ่งเติมได้เรื่อยๆ <br>
            ด้วย ซึ่งเมนูเซ็ตของร้านนี้คือเยอะมากๆๆๆครับ มาหลายครั้งแล้ว แต่ยังลองไม่ครบสักที เมนูใหม่ก็ออกมาเรื่อยๆอีก ฮ่าๆ<br>

            และที่จะมารีวิววันนี้เป็นเมนูใหม่ของร้านสามเมนูนี้เลยคร้าบบบบบบ<br>
            <center><img src="images/test02.jpg"></center><br>

            เมนูนี้ใช้ปลากะพงแดงหมักกับซอสโชยุโคจิ(Shoyu Koji) เป็นซอสที่ทำจากถั่วเหลืองหมัก ก็เป็นซอสถั่วเหลืองชนิดหนึ่งคล้ายๆโชยุหน่ะแหละ <br>
            แล้วนำไปย่างเตาถ่าน เครื่องเคียงจัดเต็มมาก set เดียวคืออิ่มแน่นอน เหอๆ<br>
            <center><img src="images/test03.jpg"></center><br>
            ไก่ย่างซอสเบซิล (389 บาท)<br>

            เมนูนี้เสริฟมาเป็นชามเบ่อเร่อเลยครับ คล้ายเป็นสลัดไก่ย่าง ผักเยอะหลากมีมะเขือเทศ เห็ดออรินจิ คินพิระ โกโบ บรอกโคลี ผักกาดแก้ว มิซูน่า <br>
            ดูสดน่าทานมาก<br>

        </div>
 
<hr>
        
        <div class="comment">
            <h2>C O M M E N T</h2>




            <div class="stripe-line"></div>

            <div class="content-coment">
                <div class="img-user">
                    <img style="width: 79px;" src="images/pro02.jpg">
                </div>
                <div class="name-user">
                    JEt N' Somchai
                </div>
                <div class="commented">
                     อร่อยมากครับ  ชอบครับ ดูแล้วคุ้มมากๆๆอ่ะ  งืออออออ
                </div>

            </div>

            <div class="content-coment">
                <div class="img-user">
                    <img style="width: 79px;" src="images/pro03.jpg">
                </div>
                <div class="name-user">
                    ฝรั่งหล่อบอกต่อด้วย02
                </div>
                <div class="commented">
                    น่ากินมากๆเลยค่ะ อยากกินอ่ะ  ดูแล้วรุ้สึกอยากไปกินเลยค่ะ ราคาเท่าไรค่ะ และจะมีโปรโมชั่นไป4 จ่าย 1หรือป่าวค่ะ
                    รู้สึกสนใจมากๆๆเลยค่ะ ถ้ามีโปรโมชั่นรบกวนเมลมากที่ zzz@hotmail.com ด้วยนะค่ะ ขอเป็นโปรโมชั่นลดราคา 99%
                    จะดีมากๆเลยค่ะ อิอิ 
                </div>

            </div>

            <div class="content-coment">
                <div class="img-user">
                    <img style="width: 79px;" src="images/pro01.jpg">
                </div>
                <div class="name-user">
                    John P' Somchai
                </div>
                <div class="commented">
                    อยากไปกินกับคอมเม้นข้างบนนะครับได้หรือป่าววว  เดี๋ยวเลี้ยงครับ ทักไลน์มานะครับถ้าอยากกินฟรี line: John P' Somchai
                </div>

            </div>

       
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