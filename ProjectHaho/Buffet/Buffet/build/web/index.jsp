<%-- 
    Document   : index
    Created on : Nov 9, 2015, 4:02:21 PM
    Author     : User!
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
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



    <!----##########################################################################################--->

    <!------nav head2------>
    
    

    <nav class="navbar navbar-default2">   
        <div class="navbar-header" id="nav02">
            <ul>
                <div class="hover" style="display:block; width:120px;"></div>
                <li class="dropdown">
                    <a href="http://localhost:8080/Buffet/index.jsp" class="dropdown-toggle"
                       data-toggle="dropdown" role="button" aria-expanded="false">H O M E </span></a> </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu2</a>
                    <ul class="dropdown-menu" role="menu">
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu3</a></li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu4</a>    </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu5 </a></li>

  
                    <%User u = null;
                        if(request.getSession().getAttribute("user") != null){
                         u = (User) request.getSession().getAttribute("user");}%>
                <%if(u == null){%>
                    
                       <li class="login">
                            &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        </li>
                         <li class="login">
                            &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        </li>
                        <li class="login"><a href="http://localhost:8080/Buffet/Login.jsp" class="login" 
                                             data-toggle="modal" data-target="#basicModal" >Log in</a>
                        </li>
                  
                 <!--- /*<--%}else if(u.getIsAdmin(u)){%>
                    <li class="login"><a class="edit" href="#" >Add Thread</a></li>
                    <li class="login"><a class="edit" href="#" >Edit</a></li>
                    <li class="login"><a class="logout" href="logout" >Log out</a></li> -->
                
                    <%}else{%>
                    <%if(u.getIsAdmin().equalsIgnoreCase("y")){%>
                        <li ><a href = "addThread.jsp">AddThread</a></li>
                        <%}%>
                     <li class="login">
                            ${user.getUserId()}
                        </li>
                        <li class="login"><a class="edit" href="#" >Edit Profile</a></li>
                       <li class="login"><a class="logout" href="logout" >Log out</a></li>
                                           
                    <%}%>
                

            </ul>




        </div>
    </nav><!---nav bar--->	


    <!----##########################################################################################--->





    <div class="wrapper row3">
        <div id="slider" class="clear"> 
            <!-- ################################################################################################ -->
            <div class="flexslider basicslider">
                <ul class="slides">
                    <li><a href="#"><img class="radius-10" src="images/sl01.jpg" alt=""></a></li>
                    <li><a href="#"><img class="radius-10" src="images/sl02.jpg" alt=""></a></li>
                    <li><a href="#"><img class="radius-10" src="images/sl03.jpg" alt=""></a></li>
                </ul>
            </div>
            <!-- ################################################################################################ --> 
        </div>
    </div>

    <br><br>    

    <!----##########################################################################################--->   


    <div class="container">
        <div class="row">
            <!----##########################################################################################--->
            <div class="col-md-8 top-heading">     
                <h1>F o o D </h1><br>  


            </div>
            <!----##########################################################################################--->               
            <div class="clearfix"> </div>
            <div class="col-md-4 top-post">
                <div class="post">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic01.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] MEAT BAR 31 DESTINATION OF BEEF LOVERS</a></h4><p>
                            วันนี้ทางเราได้มีโอกาสมาทานที่ร้าน Meat Bar 31 ครับ เป็นร้าน Steak House 
                            อยู่ในซอยสุขมวิท 31 สำหรับร้านนี้ต้องบอกว่าเราจะได้สนุกเพลิดเพลินกับการทานเนื้อดีๆ 
                            ในแบบที่ชอบ
                        </p>
                        <span>NOVEMBER 08, 2015</span>
                        <a href="#" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!---book--->  



                <br>
                <div class="post2">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic02.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] กินเจเยี่ยงราชาในราคาประหยัด ที่ CENTRALPLAZA WESTGATE</a></h4>
                        <p>  รีวิวนี้มาที่ The Cockle เป็นร้านอาหารทะเลแบบตามสั่งอยู่ใจกลางเมืองกรุง
                            ตกแต่งน่ารักๆ ถ่ายรูปสวย ที่แจ่มแมวคือมีให้เลือกแบบบุฟเฟ่ต์ด้วย 
                            สายกินดุน่าจะชอบกัน</p>
                        <span>NOVEMBER 01, 2015</span>
                        <a href="#" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!--good2-->                    






            </div><!--top book-->

            <!------------------------------------------------------------------------------------------------------------------------------->

            <div class="col-md-4 top-post">
                <div class="post">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic03.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] ชุดบาร์เบคอน ราคา 499 บาท ที่ BAR BQ PLAZA</a></h4><p>
                            เมนูเด่นของร้าน Bar BQ Plaza ที่หลายๆคนชอบ
                            ต้องเป็นเบคอนแน่นอน ซึ่งทางร้านก็เอาใจลูกค้า ด้วยการออกเมนูสุดคุ้ม ชุดแบบเน้นเบคอน 
                            ชื่อชุด “บาร์เบคอน” ในราคา 499 บาท คุ้มขนาดไหน
                        </p>
                        <span>NOVEMBER 05, 2015</span>
                        <a href="#" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!---book--->  
                <br>
                
                 <div class="post">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic04.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] KATSUYA (คัตสึยะ) ร้านหมูทอดสไตล์ญี่ปุ่นต้นตำหรับ</a></h4><p>
                            รีวิวนี้ยกพวกสี่คนมาที่ร้าน Katsuya (คัตสึยะ) กันครับ คัตสึยะเป็นร้านอาหารญี่ปุ่นแบบต้นตำหรับ 
                            คือเป็นร้านที่เริ่มเปิดในประเทศญี่ปุ่นเลย จนมีสาขาอยู่ที่ญี่ปุ่นแล้วกว่า 300 สาขา 
                            เมนูหลักของร้านจะเป็นทงคัตสึ หรือหมูทอดชุบเกล็ดขนมปัง
                        </p>
                        <span>OCTOBER 30, 2015</span>
                        <a href="#" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!---book---> 
                

            </div><!--top book-->

            <!------------------------------------------------------------------------------------------------------------------------------------>

            <div class="col-md-4 top-post">
                <div class="post">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic05.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] THE COCKLE บุฟเฟ่ต์อาหารทะเล สดๆ เน้นๆ 550 NET</a></h4>
                        <p>วันนี้มารีวิวงานเทศกาลอาหารเจที่ทาง Central จัดขึ้น โดยงานนี้จะมีจัดที่ 
                            CentralPlaza CentralFestival ทุกสาขา และ CentralWorld
                            ชื่องาน J Food Festival อิ่มบุญใหญ่มาก
                          
                        </p>
                        <span>NOVEMBER 02, 2015</span>
                        <a href="#" class="view">VIEW</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!---book---> 
                <br>    
                <div class="post">
                    <div class="post-top">
                        <a href="#"><img class="img-responsive" src="images/pic06.jpg" alt=""></a>	
                    </div>
                    <div class="title">
                        <h4><a href="#">[REVIEW] มาลองเมนูใหม่ ย่างถ่านหอมๆ ที่ โอโตยะ OOTOYA</a></h4>
                        <p>
                            สวัสดีคร้าบ วันนี้มาที่ร้านอาหารญี่ปุ่น Ootoya (โอโตยะ) สาขา
                            Central World เพื่อที่จะมาลองเมนูเซ็ตข้าวของร้านนี้ที่เพิ่งออกใหม
                            โดยเฉพาะเลยครับ
                        </p>
                        <span>OCTOBER 27, 2015</span>
                        <a href="#" class="view">read</a>
                        <div class="clearfix"> </div>
                    </div>
                </div><!---book--->  


            </div><!--top book-->
            <br>
            <div class="more-theme">
                <a href="#"> see more >> </a>
            </div>



        </div>


        <!----##########################################################################################--->  



        <div class="clearfix"> </div>

    </div>

    <hr> 
    <div class="container">


        <div class="col-md-8 top-heading">     
            <h1>D R i N K </h1><br> 
        </div>

        <div class="clearfix"> </div>
        <div class="col-md-4 top-post">
            <div class="post">
                <div class="post-top">
                    <a href="#"><img class="img-responsive" src="images/dri01.jpg" alt=""></a>	
                </div>
                <div class="title">
                    <h4><a href="#">ชื่อเรื่อง</a></h4><p>
                        รายละเอียด
                    </p>
                    <span>วัน/เดือน/ปี</span>
                    <a href="#" class="view">VIEW</a>
                    <div class="clearfix"> </div>
                </div>
            </div><!---book--->  

        </div><!--top book-->

        <!------------------------------------------------------------------------------------------------------------------------------------>

        <div class="col-md-4 top-post">
            <div class="post">
                <div class="post-top">
                    <a href="#"><img class="img-responsive" src="images/dri02.jpg" alt=""></a>	
                </div>
                <div class="title">
                    <h4><a href="#">ชื่อเรื่อง</a></h4><p>
                        รายละเอียด
                    </p>
                    <span>08 October.2014</span>
                    <a href="#" class="view">VIEW</a>
                    <div class="clearfix"> </div>
                </div>
            </div><!---book--->  
        </div><!--top book-->

    </div>
    <div class="clearfix"> </div>
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